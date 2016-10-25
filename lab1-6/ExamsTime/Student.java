public class Student {
 private String name;
    private int marks1;
    private int marks2;
    private double percentage;
    private String grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public String getName() {
        return name;
    }

    public void findPercentage(){
        this.percentage=((double) (this.marks1+this.marks2))/2;
    }
    public void findGrade(){
        if (this.percentage>=90.0){
            this.grade="A";
        }else if (this.percentage>=80.0){
            this.grade="B";
        }else if (this.percentage>=70.0){
            this.grade="C";
        }else if (this.percentage>=60.0){
            this.grade="D";
        }else if (this.percentage>=50.0){
            this.grade="E";
        } else {
            this.grade="F";
        }
    }
    public void displayRecords(){
        System.out.println("Name : "+this.name);
        System.out.println("Marks 1 : "+this.marks1);
        System.out.println("Marks 2 : "+this.marks2);
        System.out.println("Percentage : "+this.percentage);
        System.out.println("Grade : "+this.grade);
    }
}
