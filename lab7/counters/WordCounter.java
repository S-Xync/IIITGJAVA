import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class WordCounter implements Runnable{
    private int wordCount=1;
    FileReader fr;
    private String temp="";

    @Override
    public void run() {
        this.count();
        System.out.println("Word Count : "+(this.wordCount));
    }

    public WordCounter(String fileName) {
        try {
            this.fr=new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e);        }
    }
    public void count(){
        try {
            int i;
            while ((i=fr.read())!=-1){
                if ((char) i==' '){
                this.wordCount+=1;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
