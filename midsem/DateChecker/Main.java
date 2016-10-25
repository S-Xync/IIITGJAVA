public class Main {

    public static void main(String[] args) {
        try {
            //String m="01/01/1900";
            String m=args[0];
            if (m.length()>10){
                throw new OutOfRangeException();
            }
            if (m.length()<10){
                throw new FormatNotFoundException();
            }
            String[] dateArray=m.split("[/]");
            if ((dateArray[0].length()!=2)||(dateArray[1].length()!=2)||(dateArray[2].length()!=4)){
                throw new FormatNotFoundException();
            }
            int day=Integer.parseInt(dateArray[0]);
            int month=Integer.parseInt(dateArray[1]);
            int year=Integer.parseInt(dateArray[2]);
            if (day>31||day<1||month<1||month>12||year<1900||year>2016){
                System.out.println("Please give a valid date!");
                System.out.println("The range of the fields are: DD: 01 – 31, MM: 01 -12, YYYY: 1900 – 2016");
                return;
            }
            System.out.println("The Date : "+m+" passed the Format check!");
            if (year%400==0){
                System.out.println("The year : "+year+" is a Leap Year!");
            }else if(year%100==0){
                System.out.println("The year : "+year+" is not a Leap Year!");
            }else if(year%4==0){
                System.out.println("The year : "+year+" is a Leap Year!");
            }else{
                System.out.println("The year : "+year+" is not a Leap Year!");
            }
        } catch (OutOfRangeException|FormatNotFoundException e) {
            System.out.println(e);
        }
    }
}
