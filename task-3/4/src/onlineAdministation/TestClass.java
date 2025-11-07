package onlineAdministation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestClass {
    public static void main(String[] args) throws ParseException {
        HotelService hotel = new HotelService("Transelvania");
        RoomService r101 = new RoomService(101, true, "Номер свободен", 15000, 0, 5, 3);
        RoomService r102 = new RoomService(102, false, "Номер занят", 25000, 3, 4, 5);
        RoomService r103 = new RoomService(103, false, "Занят", 22000, 4, 2, 1);
        ServicesService cleaning = new ServicesService(1000, "Cleaning");
        ServicesService gym = new ServicesService(2000, "Gym");
        VisitorService visitor1 = new VisitorService("Андрей", r102);
        VisitorService visitor2 = new VisitorService("Даниил", r101);
        VisitorService visitor3 = new VisitorService("Александр", r103);
        VisitorService visitor4 = new VisitorService("Дарья", r101);

        r101.moveIn();
        System.out.println(r101.getIsAvailable() + " " + r101.getStatus());
        r101.moveOut();
        System.out.println(r101.getIsAvailable() + " " + r101.getStatus());
        r101.onRepair();
        System.out.println(r101.getIsAvailable() + " " + r101.getStatus());
        r101.offRepair();
        System.out.println(r101.getIsAvailable() + " " + r101.getStatus());
        r101.onService();
        System.out.println(r101.getIsAvailable() + " " + r101.getStatus());
        r101.offService();
        System.out.println(r101.getIsAvailable() + " " + r101.getStatus());

        r101.changePrice(10000);
        gym.changePrice(2500);
        System.out.println(r101.getPrice() + " " + gym.getPrice());

        hotel.addRooms(r101);
        hotel.addRooms(r102);
        hotel.addRooms(r103);
        hotel.addServices(cleaning);
        hotel.addServices(gym);
        System.out.println(hotel.getRooms() + "\n" + hotel.getServices());

        hotel.sortByPrice();
        System.out.println("\n");

        hotel.sortByRating();
        System.out.println("\n");

        hotel.sortByCapacity();
        System.out.println("\n");

        visitor1.addService(gym, new SimpleDateFormat("dd-MM-yyyy").parse("12-02-2025"));
        visitor1.addService(cleaning, new SimpleDateFormat("dd-MM-yyyy").parse("16-03-2024"));
        visitor1.sortByPrice();
        System.out.println("\n");
        visitor1.sortByDate();


        System.out.println(hotel.getNumOfFreeRooms() + "\n");

        r102.showDetails();
        System.out.println("\n");

        hotel.addVisitor(visitor1);
        hotel.addVisitor(visitor2);
        hotel.addVisitor(visitor3);
        hotel.sortVisitorsByAlphabet();
        System.out.println("\n");

        hotel.getRoomsAndServices();

        System.out.println( "\n"+ hotel.getSummaryVisitors() + "\n");


        hotel.getFreeRoomsByPrice();
        System.out.println("\n");

        hotel.getFreeRoomsByCapacity();
        System.out.println("\n");

        hotel.getFreeRoomsByRating();
        System.out.println("\n");

        r102.setDateOfMovingOut(new SimpleDateFormat("dd-MM-yyyy").parse("30-09-2024"));

        r103.setDateOfMovingOut(new SimpleDateFormat("dd-MM-yyyy").parse("28-07-2025"));

        r101.setDateOfMovingOut(new SimpleDateFormat("dd-MM-yyyy").parse("12-09-2023"));

        hotel.sortVisitorsByDate();
        System.out.println("\n");

        hotel.getRoomsByDate(new SimpleDateFormat("dd-MM-yyyy").parse("31-09-2024"));
        System.out.println("\n");

        r102.setVisitors(visitor1);
        visitor1.setDateOfMovingIn((new SimpleDateFormat("dd-MM-yyyy").parse("07-09-2024")));
        visitor1.setDateOfMovingOut((new SimpleDateFormat("dd-MM-yyyy").parse("30-09-2024")));
        r102.moveOut();
        r102.setVisitors(visitor2);
        visitor2.setDateOfMovingIn(new SimpleDateFormat("dd-MM-yyyy").parse("31-09-2024"));
        visitor2.setDateOfMovingOut(new SimpleDateFormat("dd-MM-yyyy").parse("07-10-2024"));
        r102.moveOut();
        r102.setVisitors(visitor3);
        visitor3.setDateOfMovingIn((new SimpleDateFormat("dd-MM-yyyy").parse("08-10-2024")));
        visitor3.setDateOfMovingOut((new SimpleDateFormat("dd-MM-yyyy").parse("13-10-2024")));
        r102.moveOut();
        r102.setVisitors(visitor4);
        visitor4.setDateOfMovingIn((new SimpleDateFormat("dd-MM-yyyy").parse("20-10-2024")));
        visitor4.setDateOfMovingOut((new SimpleDateFormat("dd-MM-yyyy").parse("30-10-2024")));
        r102.getLastVisitors();
        System.out.println("\n" + r101.getPayment());

    }
}
