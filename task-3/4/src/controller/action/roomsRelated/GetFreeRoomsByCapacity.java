package controller.action.roomsRelated;
import controller.IAction;
import services.*;

public class GetFreeRoomsByCapacity implements IAction {
    private HotelService hotel;
    public GetFreeRoomsByCapacity(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Свободные комнаты, отсортированные по вместительности: ");
        hotel.getFreeRoomsByCapacity();
    }

}
