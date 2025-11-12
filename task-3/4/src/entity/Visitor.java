package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Visitor {
    protected String name;
    protected static Set<Services> services;
    protected Room room;
    protected Date dateOfMovingOut, dateOfMovingIn;
    public Visitor(String name, Room room) {
        this.name = name;
        this.services = new HashSet<Services>();
        this.room = room;
    }
    public void addService(Services service, Date dateOfStart) {
        services.add(service);
        service.setDate(dateOfStart);
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
    public Date getDateOfMovingOut() {
        return dateOfMovingOut;
    }
    public void setDateOfMovingOut(Date dateOfMovingOut) {
        this.dateOfMovingOut = dateOfMovingOut;
    }
    public Date getDateOfMovingIn() {
        return dateOfMovingIn;
    }
    public void setDateOfMovingIn(Date dateOfMovingIn) {
        this.dateOfMovingIn = dateOfMovingIn;
    }

}
