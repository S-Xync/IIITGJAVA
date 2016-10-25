import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an integer : \n");
        int exInt=scanner.nextInt();
        System.out.println("Please enter a double : \n");
        double exDouble=scanner.nextDouble();
        System.out.println("Please enter a string : \n");
        String exString=scanner.next();
        System.out.println("The integer you have entered is : "+exInt);
        System.out.println("The double you have entered is : "+exDouble);
        System.out.println("The string you have entered is : "+exString);
    }
}
