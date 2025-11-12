package controller.action.roomsRelated;

import controller.IAction;
import entity.Room;
import services.*;

import java.util.Scanner;

public class MoveIn implements IAction {
    private Room room;
    private HotelService hotel;
    public MoveIn(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Введите номер комнаты:");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        for(Room room: hotel.getRooms()) {
            if(choice == room.getRoomNumber()){
                this.room = room;
            }
        }
        RoomService roomService = new RoomService(room.getRoomNumber(), room.getIsAvailable(), room.getStatus(), room.getPrice(), room.getNumberOfVisitors(), room.getCapacity(), room.getRating());
        roomService.moveIn();
        System.out.println("Заселение прошло успешно");
    }
}
