import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            String name;
            System.out.println("Server has started!");

            while (true) {
                Socket socket = serverSocket.accept();
                ClientListener clientListener = new ClientListener(socket);
                clientListener.start();
            }
        } catch (IOException exc){
            System.out.println("Some trouble:"+exc);
        }
    }
}
