import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Line testLine=new Line();
        System.out.println("What is the X coordinate of START point : ");
        int x=scanner.nextInt();
        System.out.println("What is the Y coordinate of START point : ");
        int y=scanner.nextInt();
        testLine.setStart(x,y);
        System.out.println("What is the X coordinate of END point : ");
        x=scanner.nextInt();
        System.out.println("What is the Y coordinate of END point : ");
        y=scanner.nextInt();
        testLine.setEnd(x,y);
        testLine.calculateLength();
        testLine.displayLength();
    }
}
