import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String surname;
    private String typeOfAccout;
    private ArrayList<Order> orderHistory;

    public Client(int id, String name, String surname,String typeOfAccout, ArrayList<Order> orderHistory) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.orderHistory = orderHistory;
        this.typeOfAccout = typeOfAccout;

    }

    public String getTypeOfAccout() {
        return typeOfAccout;
    }

    public void setTypeOfAccout(String typeOfAccout) {
        this.typeOfAccout = typeOfAccout;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", type of account'" + typeOfAccout +
                ", orderHistory=" + orderHistory +
                '}';
    }
}
