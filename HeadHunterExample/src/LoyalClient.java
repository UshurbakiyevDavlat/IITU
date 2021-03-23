import java.util.ArrayList;

public class LoyalClient extends Client{
    private int discount;
    private double cashback;

    public LoyalClient(int id, String name, String surname, String typeOfAccout, ArrayList<Order> orderHistory) {
        super(id, name, surname, typeOfAccout, orderHistory);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }
}
