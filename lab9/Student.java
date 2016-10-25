public class Student {
    String name;
    String dept;
    int roll;
    int marks;

    public Student(String name, String dept, int roll, int marks) {
        this.name = name;
        this.dept = dept;
        this.roll = roll;
        this.marks = marks;
    }

    public String getDept() {
        return dept;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }
}

