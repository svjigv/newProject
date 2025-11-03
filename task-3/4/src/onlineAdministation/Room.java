package onlineAdministation;
public class Room{
    protected int roomNumber, price, numberOfVisitors, capacity, rating;
    protected boolean isAvailable;
    protected String status;
    public Room(int roomNumber, boolean isAvaivable, String status, int price,  int numberOfVisitors, int capacity, int rating) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvaivable;
        this.status = status;
        this.price = price;
        this.numberOfVisitors = numberOfVisitors;
        this.capacity = capacity;
        this.rating = rating;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    protected void setIsAvaivable(boolean isAvaivable) {
        this.isAvailable = isAvaivable;
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
}
