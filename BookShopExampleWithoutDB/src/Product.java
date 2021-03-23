import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int article;
    private int cost;

    public Product(String name, int article, int cost) {
        this.name = name;
        this.article = article;
        this.cost = cost;
    }

    public Product(String[] split) {
    }
    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return
                  name + '/' +
                + article +'/' + cost
                ;
    }
}
