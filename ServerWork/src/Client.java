import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[]args) throws IOException {
        Socket socket = new Socket("localhost",9090);
        Scanner sc = new Scanner(System.in);

        try (ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
            int ch;
            String name= "";
            System.out.println("Enter your name:");
            name = sc.next();
            out.writeObject(name);
                boolean check = true;
            while(check){
                System.out.println("You can choose one variant from menu\n" +
                        "Please choose carefully\n" +
                        "Enter 1 to Say Hi to the Server\n" +
                        "Enter 2 to ask How is it going to the Server\n" +
                        "Enter 3 to Say bye and exit from the program");
                ch = sc.nextInt();
                switch (ch) {
                    case 1 -> out.writeObject("HiThere!");
                    case 2 -> out.writeObject("HowIsItGoing?");
                    case 3 ->  check = false ;
                    default -> System.out.println("Incorrect input, Please try again!");
                }
            }System.out.println("Ok,bye!");
        }
    }
}
