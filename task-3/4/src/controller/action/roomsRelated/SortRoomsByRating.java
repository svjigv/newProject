package controller.action.roomsRelated;
import controller.IAction;
import services.*;

public class SortRoomsByRating implements IAction {
    private HotelService hotel;
    public SortRoomsByRating(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Отсортированные комнаты по рейтингу: ");
        hotel.sortByRating();
    }
}
