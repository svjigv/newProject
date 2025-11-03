import onlineAdministation.*;

public class TestClass {
    public static void main(String[] args) {
        HotelService hotel = new HotelService("Transelvania");
        RoomService r101 = new RoomService(101, true, "Номер свободен", 15000, 0, 5, 3);
        RoomService r102 = new RoomService(102, false, "Номер занят", 25000, 3, 4, 5);
        RoomService r103 = new RoomService(103, false, "Занят", 22000, 4, 2, 1);
        ServicesService cleaning = new ServicesService(1000, "Cleaning");
        ServicesService gym = new ServicesService(2000, "Gym");
        VisitorService visitor1 = new VisitorService("Андрей", r102);
        VisitorService visitor2 = new VisitorService("Даниил", r101);
        VisitorService visitor3 = new VisitorService("Саня", r103);

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
        visitor1.addService(gym);
        visitor1.addService(cleaning);
        visitor1.sortByPrice();
        System.out.println(hotel.getNumOfFreeRooms() + "\n");
        r102.showDetails();
        System.out.println("\n");
        hotel.addVisitor(visitor1);
        hotel.addVisitor(visitor2);
        hotel.addVisitor(visitor3);
        hotel.sortVisitorsByAlphabet();
        System.out.println("\n");
        hotel.getRoomsAndServices();
        System.out.println(hotel.getSummaryVisitors() + "\n");

    }
}
