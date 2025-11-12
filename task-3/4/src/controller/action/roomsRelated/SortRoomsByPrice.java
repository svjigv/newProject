package controller.action.roomsRelated;

import controller.IAction;
import services.*;

public class SortRoomsByPrice implements IAction {
    private HotelService hotel;
    public SortRoomsByPrice(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute(){
        System.out.println("Отсортированный список комнат:");
        hotel.sortByPrice();
    }
}
