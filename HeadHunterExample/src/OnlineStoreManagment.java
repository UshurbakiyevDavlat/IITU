import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OnlineStoreManagment {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Order>ordersHist = new ArrayList<>();
    ArrayList<OrderProducts>ordersPr = new ArrayList<>();

    public OnlineStoreManagment(ArrayList<Product> products) {
        this.products = products;
    }

    public OnlineStoreManagment() {
    }

    public void baseProducts() {
        products.add(new Product(1, "Water", 250.0, 100));
        products.add(new Product(2, "Wine", 2300.0, 100));
        products.add(new Product(3, "FuseTea", 350.0, 100));
        products.add(new Product(4, "TesTea", 180.0, 100));
        products.add(new Product(5, "Coca-Cola", 200.0, 100));
        products.add(new Product(6, "Borjomi", 800.0, 100));
        products.add(new Product(7, "Fanta", 190.0, 100));
        products.add(new Product(8, "Sprite", 200.0, 100));
        products.add(new Product(9, "Maxi-tea", 150.0, 100));
        products.add(new Product(10, "GazdalmaganSu", 150.0, 100));
    }

    public void CreateProd() {
        Scanner sc = new Scanner(System.in);
            products.add(new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
    }
    public void CreateClients(int typeCli) {
        int id = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your surname:");
        String surname = sc.next();
        if(typeCli ==1) {
            OrdinaryClient ordinaryClient = new OrdinaryClient(id, name, surname,"Ordinary",ordersHist);
            clients.add(new Client(id,name,surname,"Ordinary",ordersHist));
        } else if(typeCli == 2) {
            PrimeClient primeClient = new PrimeClient(id, name, surname,"Prime",ordersHist);
            clients.add(new Client(id,name,surname,"Prime",ordersHist));
        }
        else if(typeCli == 3) {
            LoyalClient loyalClient = new LoyalClient(id, name, surname,"Loyal", ordersHist);
            clients.add(new Client(id,name,surname,"Loyal",ordersHist));
        }

    }
    public void CreateOrders() {

        int id =0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter orderProd:int productId, double priceOfProduct, int quantity:");
        ordersPr.add(new OrderProducts(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        System.out.println("Enter order id,client id,totalPrice");
            orders.add(new Order(sc.nextInt(),sc.nextInt(),ordersPr,sc.nextInt()));
            ordersHist = orders;
            for(Client c :clients){
                c.setOrderHistory(ordersHist);
            }

    }

    public void UpdateProd(int id, String n, double p, int am) {
        for (Product a : products) {
            if (a.getId() == id) {
                a.setId(id);
                a.setName(n);
                a.setAmountlnStock(am);
                a.setPrice(p);
            }
        }
    }

    public void UpdateClient(int id, String n) {
        for (Client b : clients) {
            if (b.getId() == id) {
                b.setId(id);
                b.setName(n);

            }
        }
    }

    public void UpdateOrders(int id, int idC ) {
        for (Order z : orders) {
            if (z.getId() == id) {
                z.setId(id);
                z.setClientId(idC);

            }
        }
    }

    public  void Delete(int id){
        products.removeIf(a -> a.getId() == id);
    }
    public  void DeleteCl(int id){
        clients.removeIf(a -> a.getId() == id);
    }
    public  void DeleteOrd(int id){
        orders.removeIf(a -> a.getId() == id);
    }

    public boolean checkOrder(int amountOfBuy){// for right query
                for(Product a : products){
                    if(amountOfBuy>a.getAmountlnStock())return false;
                }
                return true;
    }

    public int Cashback(int chType){
        int discount;
        int cashback;
        int ctr = 0;
        for(Client c:clients){
//                if(c.getOrderHistory().)c.setTypeOfAccout("Prime");
//                if (c.getOrderHistory() != null && c.getOrderHistory().size() > 10) c.setTypeOfAccout("Loyal");
            for(Order o :ordersHist){
                    if(c.getId() == o.getClientId()){
                        ctr++;
                            if(ctr>=1)c.setTypeOfAccout("Prime");
                            if(ctr>10)c.setTypeOfAccout("Loyal");


                    }
            }
        }
            if(chType==1){
                discount = 5;
                return 5/100;
            }
            else if(chType==2){
                discount = 10;
                cashback = 10;
                return 10/100;

            }
            return 0;
    }

    public void writeToFile(ArrayList<Order> order) throws IOException {
        FileWriter fileWriter = new FileWriter("receipt.txt");
            for(Order o :order){
                fileWriter.write(String.valueOf(o.toString()));
                fileWriter.append('\n');
                fileWriter.flush();
            }
    }

    public void deliver(int ch) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        if(ch == 1){
            System.out.println("Enter the information about place to deliver like:\n" +
                    "String city, String streetName, int houseNumber, int flatNumber\n");
            DirectDelivery directDelivery = new DirectDelivery(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
            System.out.println("\n Ok, Thank you ,we will deliver it to the adress:");
            System.out.println(directDelivery.toString());
        }
        else{
            int chAd;
            System.out.println("Enter you can choose from theese adreses");
            Scanner reader = new Scanner(new FileReader("C:\\Users\\Admin\\IdeaProjects\\MirasFinalOOP\\src\\Tastamat.txt"));
                ArrayList<String>tastamats = new ArrayList<>();
                String []arr = new String[7];
                int i =1;
                while(reader.hasNextLine()){
                    arr[i] = Arrays.toString(reader.nextLine().split(";"));
                    i++;
                }
                for(String a: arr){
                    System.out.println(a);
                }
            System.out.println("Please choose number of address that you want to deliver:\n");
                chAd = sc.nextInt();
            System.out.println("Ok,we deliver to " + arr[chAd]);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }



}
