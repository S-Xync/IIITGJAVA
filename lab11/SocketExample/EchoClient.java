import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by saikumar on 19/10/16 at 12:00 PM.
 */
public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client1 trying to connect to server.");
            Socket client1=new Socket("localhost",5000);
            BufferedReader cliIn=new BufferedReader(new InputStreamReader(client1.getInputStream()));
            PrintWriter cliOut=new PrintWriter(client1.getOutputStream());
            System.out.println("");
            for (int i=0;i<10;i++){
                cliOut.println(i);
                cliOut.flush();
                System.out.println("Sending to server : "+i);
            }
            cliOut.println("bye");
            cliOut.flush();
            String line=null;
            while ((line=cliIn.readLine())!=null){
                System.out.println("Got : "+line);
            }
            cliIn.close();
            cliOut.close();
            client1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
