package controller.action.roomsRelated;

import controller.IAction;
import services.*;

public class GetFreeRoomsByPrice implements IAction {
    private HotelService hotel;
    public GetFreeRoomsByPrice(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Свободные комнаты, отсортированные по цене: ");
        hotel.getFreeRoomsByPrice();
    }
}
