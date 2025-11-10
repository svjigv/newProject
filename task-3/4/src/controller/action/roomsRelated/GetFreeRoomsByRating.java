package controller.action.roomsRelated;
import controller.IAction;
import services.*;

public class GetFreeRoomsByRating implements IAction {
    private HotelService hotel;
    public GetFreeRoomsByRating(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Свободные комнаты, отсортированные по рейтингу: ");
        hotel.getFreeRoomsByRating();
    }
}
