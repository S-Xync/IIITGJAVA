import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br=null;
        FileWriter fw;
        String[] dummy;
        String dummyName="";
        String s = "";
        boolean containsName;
        boolean containsRepeatedName;
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> repeatedNames=new ArrayList<>();
        try {
            fr = new FileReader("test.txt");
            br = new BufferedReader(fr);
            fw=new FileWriter("output.txt");
            while ((s = br.readLine()) != null){
                containsName=false;
                containsRepeatedName=false;
                dummy=s.split(" ");
                dummyName=dummy[0];
                names.contains("d");
                for (String name:names) {
                    if (name.equalsIgnoreCase(dummyName)){
                        containsName=true;
                        break;
                    }
                }
                if (!containsName){
                    names.add(dummyName);
                }else if (containsName){
                    for (String repeatedName:repeatedNames) {
                        if (repeatedName.equalsIgnoreCase(dummyName)){
                            containsRepeatedName=true;
                            break;
                        }
                    }
                    if (!containsRepeatedName){
                        repeatedNames.add(dummyName);
                    }
                }
            }
            for (String name:repeatedNames) {
                fw.write(name+"\n");
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
