import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> stdntArr=new ArrayList<>();
        ArrayList<Student> stdnt50=new ArrayList<>();
        ArrayList<Student> stdntCSE=new ArrayList<>();
        stdntArr.add(new Student("Amar","CSE",111,90));
        stdntArr.add(new Student("Ajit","ECE",222,67));
        stdntArr.add(new Student("Bipul","HS",1111,30));
        stdntArr.add(new Student("Bidyut","CSE",23,34));
        stdntArr.add(new Student("Pradyut","ECE",567,78));
        Iterator stdntItr;
        int totalMarks=0;
        double avgMarks=0;
        int totalStdnt=0;
        stdntItr = stdntArr.iterator();
        while (stdntItr.hasNext()){
            Student procStdnt=(Student) stdntItr.next();
            totalMarks+=procStdnt.getMarks();
            totalStdnt+=1;
            if (procStdnt.getMarks()>50){
                stdnt50.add(procStdnt);
            }
            if (procStdnt.getDept().equalsIgnoreCase("CSE")){
                stdntCSE.add(procStdnt);
            }

        }
        System.out.println("\n****************************\n");
        System.out.println("Student Records with marks above 50.\n");
        for (Student student:stdnt50) {
            System.out.println(student);
        }
        System.out.println("\n****************************\n");
//        System.out.println("\n****************************\n");
        System.out.println("Students in CSE Department.\n");
        for (Student student:stdntCSE) {
            System.out.println(student.getName());
        }
        System.out.println("\n****************************\n");
        avgMarks=((double) totalMarks)/((double)totalStdnt);
//        System.out.println("\n****************************\n");
        System.out.println("Average Marks of Students : "+avgMarks);
        System.out.println("\n****************************\n");

    }
}
