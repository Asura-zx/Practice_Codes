package SOCKET;

import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main(String[] args) throws IOException{
        System.out.println("waiting for client...");
        ServerSocket servSock=new ServerSocket(9115);
        Socket clientSocket1=servSock.accept();
        System.out.println("client socket verified !");
        Scanner scanner=new Scanner(clientSocket1.getInputStream());
        String str=scanner.nextLine();
        PrintWriter outgoing=new PrintWriter(clientSocket1.getOutputStream(),true);
        System.out.println("transfer caught !");
        outgoing.println("server got "+str+" !");
        System.out.println(".\n.\n.\ntransfer resent !");
        System.out.println("connection terminated !");
        scanner.close();
    }
}
