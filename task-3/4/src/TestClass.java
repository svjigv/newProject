import onlineAdministation.*;

public class TestClass {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Transelvania");
        Room r101 = new Room(101, true, "Номер свободен", 15000);
        Room r102 = new Room(102, false, "Номер занят", 25000);
        Service cleaning = new Service(1000, "Cleaning");
        Service gym = new Service(2000, "Gym");

        r101.moveIn();
        System.out.println(r101.GetIsAvailable() + " " + r101.getStatus());
        r101.moveOut();
        System.out.println(r101.GetIsAvailable() + " " + r101.getStatus());
        r101.onRepair();
        System.out.println(r101.GetIsAvailable() + " " + r101.getStatus());
        r101.offRepair();
        System.out.println(r101.GetIsAvailable() + " " + r101.getStatus());
        r101.onService();
        System.out.println(r101.GetIsAvailable() + " " + r101.getStatus());
        r101.offService();
        System.out.println(r101.GetIsAvailable() + " " + r101.getStatus());

        r101.changePrice(10000);
        gym.changePrice(2500);
        System.out.println(r101.getPrice() + " " + gym.getPrice());

        hotel.addRooms(r101);
        hotel.addRooms(r102);
        hotel.addServices(cleaning);
        hotel.addServices(gym);
        System.out.println(hotel.getRooms() + "\n" + hotel.getServices());

    }
}
