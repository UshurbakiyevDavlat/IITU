import java.util.ArrayList;

public class PrimeClient extends Client{
private int discount;

    public PrimeClient(int id, String name, String surname, String typeOfAccout, ArrayList<Order> orderHistory) {
        super(id, name, surname, typeOfAccout, orderHistory);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
