/**
 * Created by saikumar on 27/10/16 at 2:17 PM.
 */
public class Student {
    private int id;
    private String  department;
    private int marks;

    public Student(int id, String department, int marks) {
        this.id = id;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return marks;
    }
}
