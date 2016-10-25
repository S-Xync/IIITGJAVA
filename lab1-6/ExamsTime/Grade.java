import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        System.out.println("What is the name of student 1 : " );
        String name=scanner.next();
        student1.setName(name);
        System.out.println("What are the marks in Subject 1 of "+student1.getName());
        int marks=scanner.nextInt();
        student1.setMarks1(marks);
        System.out.println("What are the marks in Subject 2 of "+student1.getName());
        marks=scanner.nextInt();
        student1.setMarks2(marks);

        System.out.println("What is the name of student 2 : " );
        name=scanner.next();
        student2.setName(name);
        System.out.println("What are the marks in Subject 1 of "+student2.getName());
        marks=scanner.nextInt();
        student2.setMarks1(marks);
        System.out.println("What are the marks in Subject 2 of "+student2.getName());
        marks=scanner.nextInt();
        student2.setMarks2(marks);

        System.out.println("What is the name of student 3 : " );
        name=scanner.next();
        student3.setName(name);
        System.out.println("What are the marks in Subject 1 of "+student3.getName());
        marks=scanner.nextInt();
        student3.setMarks1(marks);
        System.out.println("What are the marks in Subject 2 of "+student3.getName());
        marks=scanner.nextInt();
        student3.setMarks2(marks);

        student1.findPercentage();
        student1.findGrade();

        student2.findPercentage();
        student2.findGrade();

        student3.findPercentage();
        student3.findGrade();

        System.out.println("********************************");
        System.out.println("********************************\n");
        student1.displayRecords();
        System.out.println("********************************");
        System.out.println("********************************\n");
        student2.displayRecords();
        System.out.println("********************************");
        System.out.println("********************************\n");
        student3.displayRecords();

    }
}
