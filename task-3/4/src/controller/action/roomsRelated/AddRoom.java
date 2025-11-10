package controller.action.roomsRelated;
import controller.IAction;
import services.*;
import entity.*;

import java.util.Scanner;

public class AddRoom implements IAction {
    HotelService hotel;
    public AddRoom(HotelService hotel, Room room){
        this.hotel = hotel;
        hotel.addRooms(room);
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер комнаты: ");
        int roomNumber = input.nextInt();

    }
}
