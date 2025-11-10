package services;
import entity.*;

import java.util.Date;

public class RoomService extends Room{
    private Room room;
    public RoomService(int roomNumber, boolean isAvailable, String status, int price, int numberOfVisitors,  int capacity, int rating) {
        super(roomNumber, isAvailable, status, price,  numberOfVisitors, capacity, rating);
        this.room = this;
    }
    public void moveIn() {
        setIsAvailable(false);
        setStatus("Номер занят");
    }
    public void moveOut() {
        setIsAvailable(true);
        setStatus("Номер свободен");
        setVisitor(null);
    }
    public void onRepair(){
        setIsAvailable(false);
        setStatus("Номер ремонтируется");
    }
    public void offRepair(){
        setIsAvailable(true);
        setStatus("Номер свободен");
    }
    public void onService(){
        setIsAvailable(false);
        setStatus("Номер обслуживается");
    }
    public void offService(){
        setIsAvailable(true);
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
    public void getLastVisitors(){
        int n = 0;
        for(Visitor visitor : visitors){
            if(n == 3) break;
            System.out.println(visitor.getName() + "\n" + visitor.getDateOfMovingIn() + "\t" + visitor.getDateOfMovingOut());
            n++;
        }
    }
}
