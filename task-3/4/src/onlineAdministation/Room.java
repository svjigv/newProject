package onlineAdministation;
public class Room{
    private int roomNumber, price;
    private boolean isAvailable;
    private String status;
    public Room(int roomNumber, boolean isAvaivable, String status, int price) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvaivable;
        this.status = status;
        this.price = price;
    }
    public boolean GetIsAvailable() {
        return isAvailable;
    }
    private void setIsAvaivable(boolean isAvaivable) {
        this.isAvailable = isAvaivable;
    }
    public String getStatus() {
        return status;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    private void setStatus(String status) {
        this.status = status;
    }
    public int getPrice() {
        return price;
    }
    public void changePrice(int newPrice) {
        this.price = newPrice;
    }
    public void moveIn() {
        setIsAvaivable(false);
        setStatus("Номер занят");
    }
    public void moveOut() {
        setIsAvaivable(true);
        setStatus("Номер свободен");
    }
    public void onRepair(){
        setIsAvaivable(false);
        setStatus("Номер ремонтируется");
    }
    public void offRepair(){
        setIsAvaivable(true);
        setStatus("Номер свободен");
    }
    public void onService(){
        setIsAvaivable(false);
        setStatus("Номер обслуживается");
    }
    public void offService(){
        setIsAvaivable(true);
        setStatus("Номер свободен");
    }
}
