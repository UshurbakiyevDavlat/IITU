import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientListener extends Thread {
    private Socket socket ;


    ClientListener(){

    }

    ClientListener(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String message = "";
        String name = "";

        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            name = (String)in.readObject();
            System.out.println("User:"+name+" connected!");
            while (!(message = (String) in.readObject()).equalsIgnoreCase("Bye!")){
                System.out.println(name+":"+message);
            }
        } catch (IOException | ClassNotFoundException exc){
            System.out.println("Some trouble"+exc);
        }
    }
}
