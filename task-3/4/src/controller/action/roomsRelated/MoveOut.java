package controller.action.roomsRelated;

import controller.IAction;
import entity.Room;
import services.*;

import java.util.Scanner;

public class MoveOut implements IAction {
    private Room room;
    private HotelService hotel;
    public MoveOut(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер комнаты: ");
        int choice = input.nextInt();
        for(Room room: hotel.getRooms()) {
            if(choice == room.getRoomNumber()){
                this.room = room;
            }
        }
        RoomService roomService = new RoomService(room.getRoomNumber(), room.getIsAvailable(), room.getStatus(), room.getPrice(), room.getNumberOfVisitors(), room.getCapacity(), room.getRating());
        roomService.moveOut();
        System.out.println("Выселение прошло успешно");
    }
}
