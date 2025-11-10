package controller;
import controller.action.roomsRelated.*;
import controller.action.visitorsRelated.*;
import services.*;

public class Builder {
    private Menu rootMenu;
    public Builder(Menu rootMenu){
        this.rootMenu = rootMenu;
    }
    public void buildMenu(HotelService hotel){
        MenuItem getFreeRoomsByCapacity = new MenuItem("1. Посмотреть свободные номера по вместимости", new GetFreeRoomsByCapacity(hotel), null);
        MenuItem getFreeRoomsByPrice = new MenuItem("2. Посмотреть свободные номера по цене", new GetFreeRoomsByPrice(hotel), null);
        MenuItem getFreeRoomsByRating = new MenuItem("3. Посмотреть свободные номера по рейтингу", new GetFreeRoomsByRating(hotel), null);
        MenuItem getNumOfFreeRooms = new MenuItem("4. Посмотреть количество свободных номеров", new GetNumOfFreeRooms(hotel), null);
        MenuItem getRoomsByDate = new MenuItem("5. Посмотреть номера свободные к дате", new GetRoomsByDate(hotel), null);
        MenuItem getRoomsAndServices = new MenuItem("6. Посмотреть номера и услуги по цене", new GetRoomsAndServices(hotel), null);
        MenuItem sortRoomsByCapacity = new MenuItem("7. Отсортировать комнаты по вместительности ",  new SortRoomsByCapacity(hotel), null);
        MenuItem sortRoomsByPrice = new MenuItem("8. Отсортировать комнаты по цене",   new SortRoomsByPrice(hotel), null);
        MenuItem sortRoomsByRating = new MenuItem("9. Отсортировать комнаты по рейтингу", new  SortRoomsByRating(hotel), null);
        MenuItem getSummaryVisitors = new MenuItem("10. Посмотреть общее количество гостей", new GetSummaryVisitors(hotel), null);
        MenuItem sortVisByAlphabet = new MenuItem("11. Отсортировать гостей по алфавиту", new SortVisitorsByAlphabet(hotel), null);
        MenuItem sortVisByDate = new MenuItem("12. Отсортировать гостей по дате выселения", new SortVisitorsByDate(hotel), null);
        MenuItem moveIn = new MenuItem("13. Заселить", new MoveIn(hotel), null);
        MenuItem moveOut = new MenuItem("14. Выселить", new MoveOut(hotel), null);
        MenuItem onRepair = new MenuItem("15. Поставить номер на ремонт",  new OnRepair(hotel), null);
        MenuItem offRepair = new MenuItem("16. Убрать номер с ремонта", new OffRepair(hotel), null);
        MenuItem onService = new MenuItem("17. Поставить номер на обслуживание",  new OnService(hotel), null);
        MenuItem offService = new MenuItem("18. Убрать номер с обслуживания", new OffService(hotel), null);
        MenuItem showDetails = new MenuItem("19. Показать детали номера", new ShowDetails(hotel), null);
        MenuItem getPayment = new MenuItem("20. Посмотреть сумму оплаты за номер",  new GetPayment(hotel), null);
        rootMenu.setMenuItems(getFreeRoomsByCapacity);
        rootMenu.setMenuItems(getFreeRoomsByPrice);
        rootMenu.setMenuItems(getFreeRoomsByRating);
        rootMenu.setMenuItems(getNumOfFreeRooms);
        rootMenu.setMenuItems(getRoomsByDate);
        rootMenu.setMenuItems(getRoomsAndServices);
        rootMenu.setMenuItems(sortRoomsByCapacity);
        rootMenu.setMenuItems(sortRoomsByPrice);
        rootMenu.setMenuItems(sortRoomsByRating);
        rootMenu.setMenuItems(getSummaryVisitors);
        rootMenu.setMenuItems(sortVisByAlphabet);
        rootMenu.setMenuItems(sortVisByDate);
        rootMenu.setMenuItems(moveIn);
        rootMenu.setMenuItems(moveOut);
        rootMenu.setMenuItems(onRepair);
        rootMenu.setMenuItems(offRepair);
        rootMenu.setMenuItems(onService);
        rootMenu.setMenuItems(offService);
        rootMenu.setMenuItems(showDetails);
        rootMenu.setMenuItems(getPayment);
    }
    public Menu getRootMenu(){
        return rootMenu;
    }
}
