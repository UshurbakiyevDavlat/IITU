import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private ObjectOutputStream out;
    public Client(Socket socket,ObjectOutputStream out){
        this.socket = socket;
        this.out = out;
    }
    public  Client(){}
    public static void main(String[]args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for client......");
        System.out.println("Please enter your name:");
        String name = sc.next();
        Socket socket = new Socket("localhost",9090);
        System.out.println("Hello "+name +" you are in!");
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

        boolean ch = true;
        int choice = 0;
        Request req = new Request();
        Product productz = null;

        while (ch){
            System.out.println("Choose from the list:\n" +
                    "Enter 1 to Show products\n" +
                    "Enter 2 to Add product\n" +
                    "Enter 3 to exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    req = new Request("LIST_PROD");
                    out.writeObject(req);

                    while((productz = (Product)in.readObject())!=null){
                        System.out.println(productz);
                    }
                    //function in Request to list.
                    break;
                case 2:

                    req = new Request("ADD_PROD");
                    out.writeObject(req);
                    out.flush();

                    System.out.println("Enter name,article,cost:");
                    String nameProd = sc.next();
                    int article = sc.nextInt();
                    int cost = sc.nextInt();
                    AddProd(nameProd,article,cost);
                    //function in Request to add.
                    break;

                case 3:
                    System.out.println("Ok,goodbye!");
                    ch = false;
                    break;

                default:
                    System.out.println("Incorrect input,please enter again");
                    break;
            }
        }
//            out.flush();

    }
    public ArrayList<Product> ListProd() throws IOException {

        Scanner scanner = new Scanner(new FileReader("products.txt"));
        Product pr = new Product();
        Request req = new Request();
        Client client = new Client();
        while(scanner.hasNextLine()) {
            String[] text;
            text = scanner.nextLine().split("/");
            String lpname = text[0];
            int art = Integer.parseInt(text[1]);
            int cos = Integer.parseInt(text[2]);
            pr = new Product(lpname, art, cos);
            req.products.add(pr);
        }
       return req.products;
    }
    public static void AddProd(String nameProd, int article, int cost){


        Product product = new Product(nameProd,article,cost);
        Request req = new Request();
        req.products.add(product);
        try{
            FileWriter fileWriter = new FileWriter("products.txt",true);
            for(Product p:req.products) {
                fileWriter.write(p+"/\n");
                fileWriter.flush();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
