import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by saikumar on 19/10/16 at 12:00 PM.
 */
public class EchoServer {
    public static void main(String[] args) {
        int port=5000;
        try {
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("Server started at port : "+port);
            boolean flag=true;
            while (flag){
                Socket clientSocket=serverSocket.accept();
                BufferedReader serIn=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter serOut=new PrintWriter(clientSocket.getOutputStream(),true);
                String line=null;
                serOut.println("Welcome to Echo Server.");
                while ((line=serIn.readLine())!=null){
                    System.out.println("server got  : "+line);
                    serOut.println(line);
                    serOut.flush();
                    if ("bye".equalsIgnoreCase(line.trim())){
                        flag=false;
                        serOut.write("Bye from Echo Server.");
                        serOut.flush();
                        System.out.println("Shutting down Server");
                        break;
                    }
                }
                serIn.close();
                serOut.close();
                serverSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
