package onlineAdministation;

import java.util.Date;

public class Services{
    private int price;
    private String name;
    private Date dateOfStart, dateOfExpire;
    public Services(int price, String name) {
        this.price = price;
        this.name = name;
        this.dateOfStart = new Date();
        this.dateOfExpire = new Date();
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
    public Date getDateOfStart() {
        return dateOfStart;
    }
    public void setDate(Date dateOfStart){
        this.dateOfStart = dateOfStart;
    }
    public Date getDateOfExpire() {
        return dateOfExpire;
    }
    public void setDateOfExpire(Date dateOfExpire) {
        this.dateOfExpire = dateOfExpire;
    }
}
