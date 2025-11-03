package onlineAdministation;

import java.util.HashSet;
import java.util.Set;

public class Visitor {
    protected String name;
    protected static Set<Services> services;
    protected Room room;
    public Visitor(String name, Room room) {
        this.name = name;
        this.services = new HashSet<Services>();
        this.room = room;
    }
    public void addService(Services service) {
        services.add(service);
    }
    public void addRoom(Room room) {
        this.room = room;
    }
    public Set<Services> getServices() {
        return services;
    }
    public Room getRoom() {
        return room;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
