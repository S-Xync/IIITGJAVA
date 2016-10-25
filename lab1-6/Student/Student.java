import java.util.Scanner;
import java.util.ArrayList;

public class Student{

  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the Name of the Student : ");
    String name=scanner.next();
    ArrayList<Integer> marks=new ArrayList<Integer>();
    int x;
    for(int i=0;i<3;i++){
    System.out.println("Enter the marks of "+name+" in subject "+(i+1)+" : ");
    x=scanner.nextInt();
    marks.add(x);
    }
    int total=0;
    int n=0;
    for (int i=0;i<marks.size() ;i++ ) {
      total+=marks.get(i);
      n++;
    }
    double percentage=((double) total)/(n);
    boolean pass=false;
    for (int i=0;i<marks.size();i++) {
      if (marks.get(i)>40) {
        pass=true;
      }else if (marks.get(i)<40) {
        pass=false;
      }
    }
    if (percentage<50) {
      pass=false;
    }
    System.out.println("Name : "+name+"\n"+"Total : "+total+"\n"+"Percentage : "+percentage+"\n"+(pass?"Pass":"Not Pass"));

  }
}
