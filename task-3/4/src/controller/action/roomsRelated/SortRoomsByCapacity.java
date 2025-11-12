package controller.action.roomsRelated;

import controller.IAction;
import services.*;

public class SortRoomsByCapacity implements IAction {
    private HotelService hotel;
    public SortRoomsByCapacity(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Отсортированные комнаты по рейтингу: ");
        hotel.sortByRating();
    }
}
