public class StudentRecord {
    private int rollNo;
    private String name;
    private String department;

    public StudentRecord(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }
    public StudentRecord(){
        this(-1,"000","000");
    }
    public StudentRecord(int rollNo) {
        this(rollNo,"000","000");
    }

    public StudentRecord(int rollNo, String name) {
        this(rollNo,name,"000");
    }
    public StudentRecord(StudentRecord studentRecord){
        this(studentRecord.getRollNo(),studentRecord.getName(),studentRecord.getDepartment());
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public void displayRecord(){
        System.out.println("\n\nStudent Name : "+this.getName()+"\n"+"Roll No : "+this.getRollNo()+"\n"+"Dept : "+this.getDepartment()+"\n\n");
    }
}
