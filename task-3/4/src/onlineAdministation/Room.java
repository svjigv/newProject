package onlineAdministation;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Room{
    protected int roomNumber, price, numberOfVisitors, capacity, rating;
    protected boolean isAvailable;
    protected String status;
    protected Date dateOfMovingOut, dateOfMovingIn;
    protected Set<Visitor> visitors;
    protected Visitor visitor;

    public Room(int roomNumber, boolean isAvaivable, String status, int price,  int numberOfVisitors, int capacity, int rating) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvaivable;
        this.status = status;
        this.price = price;
        this.numberOfVisitors = numberOfVisitors;
        this.capacity = capacity;
        this.rating = rating;
        this.visitors = new LinkedHashSet<>();
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    protected void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String getStatus() {
        return status;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    protected void setStatus(String status) {
        this.status = status;
    }
    public int getPrice() {
        return price;
    }
    public void changePrice(int newPrice) {
        this.price = newPrice;
    }
    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }
    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }
    public void setDateOfMovingOut(Date dateOfMovingOut) {
        this.dateOfMovingOut = dateOfMovingOut;
    }
    public Date getDateOfMovingOut() {
        return dateOfMovingOut;
    }
    public void setDateOfMovingIn(Date dateOfMovingIn) {
        this.dateOfMovingIn = dateOfMovingIn;
    }
    public Date getDateOfMovingIn() {
        return dateOfMovingIn;
    }
    public void setVisitors(Visitor visitor) {
        LinkedHashSet<Visitor> Visitors = new LinkedHashSet<>();
        Visitors.add(visitor);
        Visitors.addAll(this.visitors);
        this.visitors = Visitors;
        setVisitor(visitor);
    }
    public Set<Visitor> getVisitors() {
        return visitors;
    }
    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
    public Visitor getVisitor() {
        return visitor;
    }
}
