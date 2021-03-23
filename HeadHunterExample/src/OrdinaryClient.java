import java.util.ArrayList;

public class OrdinaryClient extends Client{
    public OrdinaryClient(int id, String name, String surname, String typeOfAccout, ArrayList<Order> orderHistory) {
        super(id, name, surname, typeOfAccout, orderHistory);
    }
}
