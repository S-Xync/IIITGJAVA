import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String dbString="jdbc:mysql://localhost:3306/lab10?user=root&password=mysql&useSSL=false";
        try {
            Connection connection = DriverManager.getConnection(dbString);
            Statement statement = connection.createStatement();
            ResultSet resultSet = null;
            statement.executeUpdate("CREATE TABLE students(id INTEGER,department VARCHAR(10),marks INTEGER)");
            statement.executeUpdate("CREATE TABLE persons(id INTEGER,name VARCHAR(20),address VARCHAR(30))");
            ArrayList<Student> stuArr = new ArrayList<>();
            ArrayList<Person> perArr = new ArrayList<>();
            FileReader fr1 = new FileReader("./Student.txt");
            FileReader fr2 = new FileReader("./Person.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
            String line = "";
            String[] lineArr;
            while ((line = br1.readLine()) != null) {
                lineArr = line.split(" ");
                stuArr.add(new Student(Integer.valueOf(lineArr[0]), lineArr[1], Integer.valueOf(lineArr[2])));
            }
            fr1.close();
            br1.close();
            while ((line = br2.readLine()) != null) {
                lineArr = line.split(" ");
                perArr.add(new Person(Integer.valueOf(lineArr[0]), lineArr[1], lineArr[2]));
            }
            fr2.close();
            br2.close();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("INSERT INTO students VALUES(?,?,?)");
            for (Student student : stuArr) {
                preparedStatement.setInt(1, student.getId());
                preparedStatement.setString(2, student.getDepartment());
                preparedStatement.setInt(3, student.getMarks());
                preparedStatement.executeUpdate();
            }
            preparedStatement = connection.prepareStatement("INSERT INTO persons VALUES(?,?,?)");
            for (Person person : perArr) {
                preparedStatement.setInt(1, person.getId());
                preparedStatement.setString(2, person.getName());
                preparedStatement.setString(3, person.getAddress());
                preparedStatement.executeUpdate();
            }
            System.out.println("Students belonging to Nagpur City : ");
            resultSet = statement.executeQuery("SELECT name FROM persons WHERE address='Nagpur'");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
            System.out.println();
            System.out.println("Students belonging to CSE Department : ");
            resultSet = statement.executeQuery("SELECT persons.name FROM students,persons WHERE students.department='CSE' AND students.id=persons.id");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("persons.name"));
            }
            System.out.println();
            System.out.println("The Student Id with Highest marks is : ");
            resultSet = statement.executeQuery("SELECT id,marks FROM students");
            int highId = 0;
            int highMarks = 0;
            int totalMarks = 0;
            int counter = 0;
            while (resultSet.next()) {
                totalMarks += resultSet.getInt("marks");
                counter++;
                if (resultSet.getInt("marks") > highMarks) {
                    highMarks = resultSet.getInt("marks");
                    highId = resultSet.getInt("id");
                }
            }
            System.out.println("Id : " + highId + " | Marks : " + highMarks);
            System.out.println();
            double avgMarks = ((double) totalMarks) / ((double) counter);
            System.out.println("The Average Marks of Students : " + avgMarks);


        } catch (SQLException | IOException e) {
            System.out.println(e);
        }


    }
}
