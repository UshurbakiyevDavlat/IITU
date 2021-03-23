package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            while (true) {
                ServerSocket serverSocket = new ServerSocket(9090);
                System.out.println("Server is alive!!!!!");
                Socket socket = serverSocket.accept();
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                System.out.println((String) input.readObject() + " connected");

                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
                Message request;
                while (!(request = (Message) input.readObject()).getText().equalsIgnoreCase("exit")) {
                    System.out.println(request.getName() + ": " + request.getText());
                    if (request.getText().toLowerCase().contains("hello"))
                        output.writeObject("Hello there");
                    else
                        output.writeObject(null);
                }
                System.out.println((String)input.readObject() + " leave chat");
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Message implements Serializable{
    private String name;
    private String text;

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }
    public String getText() {
        return text;
    }
}