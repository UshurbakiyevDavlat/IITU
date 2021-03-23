import com.sun.source.tree.CaseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[]args) throws IOException {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello,Welcome to our online-Shop" +
                        "Please choose function from the list Below");
                System.out.println("Enter 1 if your type is OrdinaryClient\n" +
                        "Enter 2 if your type is PrimeClient\n" +
                        "Enter 3 if your type is LoyalClient\n" +
                        "Enter 4 to enter to admin mode\n" +
                        "Enter 0 to exit.\n");
                int chTypeclent = sc.nextInt();

                int totalPrice  = 0;
                int id =0;
                int idToBuy=0;
                int amountOfBuy=0;
                double priceOfProd = 0;
                int chDelivery = 0;
                boolean needDeliver = false;

                ArrayList<Order>orderHistory = new ArrayList<>();
                ArrayList<OrderProducts>orderProducts = new ArrayList<>();
                ArrayList<Product>products = new ArrayList<>();
            OnlineStoreManagment ord = new OnlineStoreManagment();
            ord.baseProducts();

            ord.CreateClients(chTypeclent);
                boolean end = true;
                while (end){
                        switch (chTypeclent){
                                case 1:


                                        System.out.println("\nWelcome ,so now you can make an order and after if choose type of delivery!\n" +
                                                "Please choose what you would like to order");
                                        System.out.println("From the list below ,you can see what we have in this period of time\n" +
                                                "You can watch and the choose if you want something\n");


                                        for(Product a: ord.getProducts()){
                                                System.out.println(a.toString());

                                        }
                                        System.out.println("If you want something from the list above\n" +
                                                " Please enter its id and amount for buy and then it will move in your packToBuy,after you will end to choose \n" +
                                                " System will make a transaction from your bank-card.");

                                        idToBuy = sc.nextInt();
                                        amountOfBuy = sc.nextInt();

                                        if(!ord.checkOrder(amountOfBuy)){
                                                System.out.println("Error we do not have that amount!\n");
                                                break;
                                        }
                                        for(Product a :ord.getProducts()){
                                                if(a.getId()==idToBuy){
                                                        priceOfProd = a.getPrice();
                                                        orderProducts.add(new OrderProducts(idToBuy,a.getPrice(),amountOfBuy));
                                                     ord.UpdateProd(a.getId(),a.getName(),a.getPrice(),a.getAmountlnStock()-amountOfBuy);
                                                        //Нужно убирать настроить.
                                                }
                                        }
//                                        orderProducts.add(new OrderProducts(idToBuy,priceOfProd,amountOfBuy));

                                        System.out.println("Your order by now");
                                        for(OrderProducts o:orderProducts){
                                                totalPrice += o.getQuantity()*o.getPriceOfProduct();
                                                System.out.println(o.toString());
                                        }
                                    System.out.println();
                                    System.out.println("Do you want to continue?");
                                    System.out.println("1-yes , 0-no");
                                    if(sc.nextInt()==0) {
                                        end = false;
                                    }
                                    needDeliver = true;
                                        break;
                                case 2:

                                    System.out.println("\nWelcome ,so now you can make an order and after if choose type of delivery!\n" +
                                            "Please choose what you would like to order");
                                    System.out.println("From the list below ,you can see what we have in this period of time\n" +
                                            "You can watch and the choose if you want something\n");



                                    for(Product a: ord.getProducts()){
                                        System.out.println(a.toString());

                                    }
                                    System.out.println("If you want something from the list above\n" +
                                            " Please enter its id and amount for buy and then it will move in your packToBuy,after you will end to choose\n" +
                                            " System will make a transaction from your bank-card.");

                                    idToBuy = sc.nextInt();
                                    amountOfBuy = sc.nextInt();

                                    if(!ord.checkOrder(amountOfBuy)){
                                        System.out.println("Error we do not have that amount!\n");
                                        break;
                                    }
                                    for(Product a :ord.getProducts()){
                                        if(a.getId()==idToBuy){
                                            priceOfProd = a.getPrice();
                                            orderProducts.add(new OrderProducts(idToBuy,a.getPrice(),amountOfBuy));
                                            ord.UpdateProd(a.getId(),a.getName(),a.getPrice()*ord.Cashback(1),a.getAmountlnStock()-amountOfBuy);
                                            //Нужно убирать настроить.
                                        }
                                    }
//                                        orderProducts.add(new OrderProducts(idToBuy,priceOfProd,amountOfBuy));

                                    System.out.println("Your order by now");
                                    for(OrderProducts o:orderProducts){
                                        totalPrice += o.getQuantity()*o.getPriceOfProduct();
                                        System.out.println(o.toString());
                                    }
                                    System.out.println();
                                    System.out.println("Do you want to continue?");
                                    System.out.println("1-yes , 0-no");
                                    if(sc.nextInt()==0) {
                                        end = false;
                                    }
                                    needDeliver = true;
                                        break;
                                case 3:
                                    System.out.println("\nWelcome ,so now you can make an order and after if choose type of delivery!\n" +
                                            "Please choose what you would like to order");
                                    System.out.println("From the list below ,you can see what we have in this period of time\n" +
                                            "You can watch and the choose if you want something\n");





                                    for(Product a: ord.getProducts()){
                                        System.out.println(a.toString());

                                    }
                                    System.out.println("If you want something from the list above\n" +
                                            " Please enter its id and amount for buy and then it will move in your packToBuy,after you will end to choose\n" +
                                            " System will make a transaction from your bank-card.");

                                    idToBuy = sc.nextInt();
                                    amountOfBuy = sc.nextInt();

                                    if(!ord.checkOrder(amountOfBuy)){
                                        System.out.println("Error we do not have that amount!");
                                        break;
                                    }
                                    for(Product a :ord.getProducts()){
                                        if(a.getId()==idToBuy){
                                            priceOfProd = a.getPrice();
                                            orderProducts.add(new OrderProducts(idToBuy,a.getPrice(),amountOfBuy));
                                            ord.UpdateProd(a.getId(),a.getName(),a.getPrice() *ord.Cashback(2),a.getAmountlnStock()-amountOfBuy);
                                            //Нужно убирать настроить.
                                        }
                                    }
//                                        orderProducts.add(new OrderProducts(idToBuy,priceOfProd,amountOfBuy));

                                    System.out.println("Your order by now");

                                    for(OrderProducts o:orderProducts){
                                        totalPrice += o.getQuantity()*o.getPriceOfProduct();
                                        System.out.println(o.toString());
                                    }
                                    System.out.println();
                                    System.out.println("Do you want to continue?");
                                    System.out.println("1-yes , 0-no");
                                    if(sc.nextInt()==0) {
                                        end = false;
                                    }
                                    needDeliver = true;
                                        break;
                            case 4 :
                                System.out.println("Hello, you are in admin mode");
                                System.out.println("Now you can get an access to admins function" +
                                        "\nEnter  1 to Create\n" +
                                        "Enter 2 to Update\n" +
                                        "Enter 3 to Delete\n" +
                                        "Enter 4 to List\n" +
                                        "Also choose wich Data you want to work with:Products,Clients,Orders");
                                int chAdmin = sc.nextInt();
                                int chData ;
                                switch (chAdmin){
                                    case 1:
                                        System.out.println("Products-1,Clients-2,Orders-3");
                                        chData =sc.nextInt();
                                        if( chData == 1){
                                            ord.CreateProd();
                                        } else if(chData == 2){
                                            System.out.println("1-ordinary,2-prime,3-loyal");
                                            ord.CreateClients(sc.nextInt());
                                        } else  if(chData == 3){
                                            ord.CreateOrders();
                                            ord.Cashback(2);
                                        }
                                        break;
                                    case 2:

                                        System.out.println("Products-1,Clients-2,Orders-3");
                                        chData =sc.nextInt();
                                        if( chData == 1){
                                            System.out.println("Enter 4 parameters");
                                            ord.UpdateProd(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
                                        } else if(chData == 2){
                                            System.out.println("Enter 2 parameters");
                                            ord.UpdateClient(sc.nextInt(),sc.next());

                                        } else  if(chData == 3){
                                            System.out.println("Enter 3 parameters");
                                            ord.UpdateOrders(sc.nextInt(),sc.nextInt());
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Products-1,Clients-2,Orders-3");
                                        chData =sc.nextInt();
                                        if( chData == 1){
                                            System.out.println("Enter id to delete:");
                                            int idToDeleteProd = sc.nextInt();
                                            ord.Delete(idToDeleteProd);
                                        } else if(chData == 2){
                                            System.out.println("Enter id to delete:");
                                            ord.DeleteCl(sc.nextInt());
                                        } else  if(chData == 3){
                                            System.out.println("Enter id to delete:");
                                            ord.DeleteOrd(sc.nextInt());
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Products-1,Clients-2,Orders-3");
                                        chData =sc.nextInt();

                                        if( chData == 1){

                                            for(Product a:ord.getProducts()){
                                                System.out.println(a);
                                            }
                                        } else if(chData == 2){
                                            for(Client a:ord.getClients()){
                                                System.out.println(a);
                                            }
                                        } else  if(chData == 3){
                                            for (Order a:ord.getOrders()){
                                                System.out.println(a);
                                            }
                                        }
                                        break;
                                }
                                System.out.println("1-yes , 0-no");
                                if(sc.nextInt()==0) {
                                    end = false;
                                }

                                break;
                                case 0:
                                        System.out.println("Well good bye then.");
                                        break;
                                default:
                                        System.out.println("Incorrect input please try again!");
                                        break;
                        }


                       orderHistory.add(new Order(idToBuy,id,orderProducts,totalPrice));
                        ord.writeToFile(orderHistory);

                }
                if(needDeliver) {
                    System.out.println("Enter kind of delivery that you want \n" +
                            "You can choose Direct and Tastamat delivery\n" +
                            "Enter 1 to choose Direct and other to Tastamat");
                    chDelivery = sc.nextInt();
                    ord.deliver(chDelivery);
                }
        }
}
