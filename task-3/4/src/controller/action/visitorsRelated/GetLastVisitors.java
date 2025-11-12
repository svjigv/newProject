package controller.action.visitorsRelated;

import controller.IAction;
import services.*;

public class GetLastVisitors implements IAction {
    private RoomService room;
    public GetLastVisitors(RoomService room) {
        this.room = room;
    }
    @Override
    public void execute() {
        System.out.println("Последние 3 посетителя: ");
        room.getLastVisitors();
    }
}
