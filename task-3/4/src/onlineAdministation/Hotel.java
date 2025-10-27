package onlineAdministation;

import java.util.HashSet;
import java.util.Set;

public class Hotel {
    String name;
    private Set<Room> rooms;
    private Set<Service> services;
    public Hotel(String name) {
        this.name = name;
        this.rooms = new HashSet<Room>();
        this.services = new HashSet<Service>();
    }
    public Set<Room> getRooms() {
         return rooms;
    }
    public void addRooms(Room newRoom) {
        rooms.add(newRoom);
    }
    public Set<Service> getServices() {
        return services;
    }
    public void addServices(Service newService) {
        services.add(newService);
    }
}
