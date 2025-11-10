package controller.action.roomsRelated;
import controller.IAction;
import services.*;
public class GetNumOfFreeRooms implements IAction {
    private HotelService hotel;
    public GetNumOfFreeRooms(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute(){
        System.out.println("Количество свободных комнат: " + hotel.getNumOfFreeRooms());
    }
}
