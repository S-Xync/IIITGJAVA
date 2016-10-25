import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copier {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("./test.txt");
            FileWriter fw = new FileWriter("./copier.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = "";
            while ((str = br.readLine()) != null) {
                fw.write(str);
                fw.write("\n");
            }
            br.close();
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

