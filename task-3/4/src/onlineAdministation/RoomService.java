package onlineAdministation;

public class RoomService extends Room{
    private Room room;
    public RoomService(int roomNumber, boolean isAvailable, String status, int price, int numberOfVisitors,  int capacity, int rating) {
        super(roomNumber, isAvailable, status, price,  numberOfVisitors, capacity, rating);
        this.room = this;
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
    public void showDetails(){
        System.out.println("Номер: " + room.getRoomNumber());
        System.out.println("Доступность: " +  room.getIsAvailable());
        System.out.println("Статус: " + room.getStatus());
        System.out.println("Цена: " + room.getPrice());
        System.out.println("Количество гостей: " +  room.getNumberOfVisitors());
        System.out.println("Вместимость: " + room.getCapacity());
    }
    public int getPayment(){
        return getPrice();
    }
}
