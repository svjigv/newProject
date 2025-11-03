package onlineAdministation;

public class Services{
    protected int price;
    private String name;
    public Services(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void changePrice(int newPrice) {
        this.price = newPrice;
    }
}
