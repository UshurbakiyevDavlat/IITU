package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String name = "@libek";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("127.0.0.1", 9090);

            ObjectOutputStream request = new ObjectOutputStream(socket.getOutputStream());
            request.writeObject(name);

            ObjectInputStream response = new ObjectInputStream(socket.getInputStream());
            String text;
            String line;
            while (!(text = scanner.next()).equalsIgnoreCase("exit")){
                request.writeObject(new Message(name,text));
                if ((line = (String)response.readObject())!=null)
                    System.out.println("Server "+line);
            }
            request.writeObject(name);
            request.close();
            socket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
