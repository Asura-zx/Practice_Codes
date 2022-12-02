package SOCKET;

import java.net.*;
import java.util.*;
import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException{
        System.out.println("client initiated !");
        Socket clientSocket1=new Socket("localhost",9115);
        Scanner scanner=new Scanner(System.in);
        System.out.println("type a string :");
        String str=scanner.nextLine();
        PrintWriter outgoing=new PrintWriter(clientSocket1.getOutputStream(),true);
        outgoing.println(str);
        Scanner scanner2=new Scanner(clientSocket1.getInputStream());
        System.out.println(scanner2.nextLine());
        scanner.close();
    }
}
