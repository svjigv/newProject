package controller.action.visitorsRelated;
import controller.IAction;
import services.*;

public class GetSummaryVisitors implements IAction {
    private HotelService hotel;
    public GetSummaryVisitors(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Количество гостей: " + hotel.getSummaryVisitors());
    }
}
