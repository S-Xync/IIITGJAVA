public class Main {

    public static void main(String[] args) {
        int i,j;
        Thread t1=new Thread((new WordCounter("./RealTime.txt")));
        Thread t2=new Thread((new VowelCounter("./RealTime.txt")));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

