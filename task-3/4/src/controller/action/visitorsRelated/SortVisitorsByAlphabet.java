package controller.action.visitorsRelated;
import controller.IAction;
import services.*;

public class SortVisitorsByAlphabet implements IAction {
    private HotelService hotel;
    public SortVisitorsByAlphabet(HotelService hotel) {
        this.hotel = hotel;
    }
    @Override
    public void execute() {
        System.out.println("Отсортированный по алфавиту спиок гостей: ");
        hotel.sortVisitorsByAlphabet();
    }
}
