import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientListen extends Thread{
    private Socket socket;
    private static final Scanner sc  = new Scanner(System.in);
    private ObjectOutputStream out;
    public  ClientListen(){}

    public ClientListen(Socket socket,ObjectOutputStream out){
        this.socket = socket;
        this.out = out;
    }

    @Override
   public void run(){
        try {
//            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            Request  request = null;
            Client client = new Client();
            ArrayList<Product>arrayList = new ArrayList<>();
            while((request = (Request) in.readObject()) != null){
                if(request.getTypeOfReq().equalsIgnoreCase("LIST_PROD")) {
                    arrayList = client.ListProd();
                    for (Product a : arrayList) {
                        out.writeObject(a);
                    }
                    out.writeObject(null);
                    out.flush();
                }
//                } else if(request.getTypeOfReq().equalsIgnoreCase("ADD_PROD")){
//
//                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
