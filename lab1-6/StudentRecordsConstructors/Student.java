public class Student {

    public static void main(String[] args) {
        StudentRecord student1=new StudentRecord();
        StudentRecord student2=new StudentRecord(58);
        StudentRecord student3=new StudentRecord(58,"Sai");
        StudentRecord student4=new StudentRecord(58,"Sai","CSE");
        StudentRecord student5=new StudentRecord(student4);
        student1.displayRecord();
        student2.displayRecord();
        student3.displayRecord();
        student4.displayRecord();
        student5.displayRecord();


    }
}
