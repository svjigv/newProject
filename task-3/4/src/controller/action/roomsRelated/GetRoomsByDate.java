package controller.action.roomsRelated;
import controller.IAction;
import services.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class GetRoomsByDate implements IAction {
    private HotelService hotel;
    public GetRoomsByDate(HotelService hotel) {
        this.hotel = hotel;
    }

    @Override
    public void execute() throws ParseException {
        System.out.println("Введите дату в формате dd-MM-yyyy:");
        String dateString = new Scanner(System.in).nextLine();
        System.out.println("Список свободных номеров к дате: ");
        hotel.getRoomsByDate(new SimpleDateFormat("dd-MM-yyyy").parse(dateString));
    }
}
