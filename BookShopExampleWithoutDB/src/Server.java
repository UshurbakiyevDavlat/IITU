import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

    public  static void main(String[]args){
        try {
            ServerSocket socketServ = new ServerSocket(9090);
            System.out.println("Waiting for the server.....");
            System.out.println("Server is on!");
            while(true){
                Socket socket = socketServ.accept();
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                Client client = new Client(socket,out);
                ClientListen clientListen = new ClientListen(socket,out);
                clientListen.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


