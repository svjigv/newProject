package controller.action.roomsRelated;
import controller.IAction;
import services.*;

public class GetRoomsAndServices implements IAction {
    private HotelService hotel;
    public GetRoomsAndServices(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Отсортированный по цене список комнат и услуг: ");
        hotel.getRoomsAndServices();
    }

}
