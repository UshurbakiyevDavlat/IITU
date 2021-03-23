public class Product {
    private int id;
    private String name;
    private double price;
    private int amountlnStock;

    public Product(int id, String name, double price, int amountlnStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amountlnStock = amountlnStock;
    }

    public  Product(){}

    public  Product(int id){
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountlnStock() {
        return amountlnStock;
    }

    public void setAmountlnStock(int amountlnStock) {
        this.amountlnStock = amountlnStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amountlnStock=" + amountlnStock +
                '}';
    }
}
