import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Request implements Serializable {
    private String typeOfReq;



//    public void serWrite(){
//        try (FileWriter fileWriter = new FileWriter("products.txt")) {
//            fileWriter.write("Domestos/1234/1000/\n" +
//                    "Aqua/1114/2500/\n" +
//                    "DirtyDuck/14124/1870/");
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public  Request(){
//        serWrite();
    }
    ArrayList<Product>products = new ArrayList<>();

    public Request(String typeOfReq,ArrayList<Product>products){
        this.typeOfReq = typeOfReq;
        this.products = products;
    }
    public Request(ArrayList<Product>products){
        this.products = products;
    }
    public Request(String typeOfReq){
        this.typeOfReq = typeOfReq;
    }

    public String getTypeOfReq() {
        return typeOfReq;
    }

    public void setTypeOfReq(String typeOfReq) {
        this.typeOfReq = typeOfReq;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        return String.valueOf(products);
    }
}
