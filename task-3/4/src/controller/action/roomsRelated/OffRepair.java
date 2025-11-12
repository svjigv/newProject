package controller.action.roomsRelated;

import controller.IAction;
import entity.Room;
import services.*;

import java.util.Scanner;

public class OffRepair implements IAction {
    private Room room;
    private HotelService hotel;
    public OffRepair(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер комнаты: ");
        int choice = input.nextInt();
        for(Room room: hotel.getRooms()) {
            if(choice == room.getRoomNumber()){
                this.room = room;
            }
        }
        RoomService roomService = new RoomService(room.getRoomNumber(), room.getIsAvailable(), room.getStatus(), room.getPrice(), room.getNumberOfVisitors(), room.getCapacity(), room.getRating());
        roomService.offRepair();
        System.out.println("Комната снята с ремонта");
    }
}
