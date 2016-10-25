import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fr =new FileReader("test.txt");
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("output.txt");
            String dummyname="";
            String s="";
            String[] dummy;
            ArrayList<String> names=new ArrayList<>();
            ArrayList<Integer> nameFreq=new ArrayList<>();
            ArrayList<String> repeatedNames=new ArrayList<>();
            while ((s = br.readLine()) != null){
                dummy=s.split(" ");
                dummyname=dummy[0];
                names.add(dummyname);
            }
            for(String name:names){
                if (!repeatedNames.contains(name)){
                    repeatedNames.add(name);
                    nameFreq.add(1);
                }else if (repeatedNames.contains(name)){
                    int x=nameFreq.get(repeatedNames.indexOf(name))+1;
                    nameFreq.set(repeatedNames.indexOf(name),x);
                }
            }
            for (int i=0;i<repeatedNames.size();i++){
                fw.write(repeatedNames.get(i)+" : "+nameFreq.get(i)+"\n");
            }
            fr.close();
            br.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
