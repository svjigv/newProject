package controller.action.visitorsRelated;
import controller.IAction;
import services.*;

public class SortVisitorsByDate implements IAction {
    private HotelService hotel;
    public SortVisitorsByDate(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Список гостей по дате освобождения номера: ");
        hotel.sortVisitorsByDate();
    }
}
