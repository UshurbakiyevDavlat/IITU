import java.util.ArrayList;

public class Order {
    private int id;
    private int clientId;
    private ArrayList<OrderProducts>productId;
    private double totalPrice;

    public Order(int id, int clientId, ArrayList<OrderProducts> productId, double totalPrice) {
        this.id = id;
        this.clientId = clientId;
        this.productId = productId;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public ArrayList<OrderProducts> getProductId() {
        return productId;
    }

    public void setProductId(ArrayList<OrderProducts> productId) {
        this.productId = productId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +'\n'+
                "id = " + id +'\n'+
                ",clientId = "  + clientId + '\n'+
                ",productId = " + productId +'\n'+
                ",totalPrice = " + totalPrice +'\n'+
                '}';
    }
}
