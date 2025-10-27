package onlineAdministation;

public class Service {
    private int price;
    private String name;
    public Service(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void changePrice(int newPrice) {
        this.price = newPrice;
    }
}
