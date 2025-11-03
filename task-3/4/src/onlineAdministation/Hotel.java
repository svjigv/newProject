package onlineAdministation;

import java.util.HashSet;
import java.util.Set;

public class Hotel {
    protected String name;
    protected Set<Room> rooms;
    protected Set<Services> services;
    protected Set<Visitor> visitors;
    protected VisitorService visitorService;
    public Hotel(String name) {
        this.name = name;
        this.rooms = new HashSet<Room>();
        this.services = new HashSet<Services>();
        this.visitors = new HashSet<Visitor>();
    }
    public Set<Room> getRooms() {
        return rooms;
    }
    public void addRooms(Room newRoom) {
        rooms.add(newRoom);
    }
    public Set<Services> getServices() {
        return services;
    }
    public void addServices(Services newService) {
        services.add(newService);
    }
    public Set<Visitor> getVisitors() {
        return visitors;
    }
    public void addVisitor(Visitor newVisitor) {
        visitors.add(newVisitor);
    }

}
