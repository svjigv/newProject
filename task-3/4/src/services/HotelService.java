package services;
import entity.*;

import java.util.Date;

public class HotelService extends Hotel{
    public HotelService(String name){
        super(name);
    }
    public int getNumOfFreeRooms(){
        int freeRooms = 0;
        for (Room room : rooms) {
            if(room.getIsAvailable()){
                freeRooms++;
            }
        }
        return freeRooms;
    }
    public int getSummaryVisitors(){
        int sumVisitors = 0;
        for(Room room : rooms){
            sumVisitors += room.getNumberOfVisitors();
        }
        return sumVisitors;
    }
    public void sortByPrice(){
        int[] sortedPrices = new int[rooms.size()];
        int[] sortedRooms = new int[rooms.size()];
        int previousPrice = 0;
        int previousRoom = 0;
        int i = 0;
        for(Room room : rooms){
            if(room.getPrice() >= previousPrice && i > 0){
                sortedRooms[i-1] = room.getRoomNumber();
                sortedRooms[i] = previousRoom;
                sortedPrices[i-1] = room.getPrice();
                sortedPrices[i] = previousPrice;
            }else if(i == 0){
                sortedRooms[i]= room.getRoomNumber();
                previousRoom = room.getRoomNumber();
                sortedPrices[i] = room.getPrice();
                previousPrice = room.getPrice();
            }else if(room.getPrice() < previousPrice){
                sortedPrices[i] = room.getPrice();
                sortedRooms[i] = room.getRoomNumber();
                previousRoom = room.getRoomNumber();
                sortedPrices[i] = room.getPrice();
            }
            i++;
        }
        for(int x = 0; x < sortedPrices.length; x++){
            System.out.println("Комната номер " + sortedRooms[x] + " Цена: " + sortedPrices[x]);
        }
    }
    public void sortByRating(){
        int[] sortedRatings = new int[rooms.size()];
        int[] sortedRooms = new int[rooms.size()];
        int previousRating = 0;
        int previousRoom = 0;
        int i = 0;
        for(Room room : rooms){
            if(room.getRating() >= previousRating && i > 0){
                sortedRatings[i-1] = room.getRating();
                sortedRatings[i] = previousRating;
                sortedRooms[i-1] = room.getRoomNumber();
                sortedRooms[i] = previousRoom;
            }else if(i == 0){
                sortedRatings[i] = room.getRating();
                sortedRooms[i] = room.getRoomNumber();
                previousRating = room.getRating();
                previousRoom = room.getRoomNumber();
            }else if(room.getRating() < previousRating){
                sortedRatings[i] = room.getRating();
                sortedRooms[i] = room.getRoomNumber();
                previousRating = room.getRating();
                previousRoom = room.getRoomNumber();
            }
            i++;
        }
        for(int x = 0; x < sortedRatings.length; x++){
            System.out.println("Номер комнаты " + sortedRooms[x] + ": Количество звезд: " + sortedRatings[x]);
        }
    }
    public void sortByCapacity(){
        int[] sortedCapacity = new int[rooms.size()];
        int[] sortedRooms = new int[rooms.size()];
        int previousRoom = 0;
        int previousCapacity = 0;
        int i = 0;
        for(Room room : rooms){
            if(room.getCapacity() >= previousCapacity && i > 0){
                sortedCapacity[i-1] = room.getCapacity();
                sortedCapacity[i] = previousCapacity;
                sortedRooms[i-1] = room.getRoomNumber();
                sortedRooms[i] = previousRoom;
            }else if(i == 0){
                sortedCapacity[i] = room.getCapacity();
                sortedRooms[i] = room.getRoomNumber();
                previousCapacity = room.getCapacity();
                previousRoom = room.getRoomNumber();
            }else if(room.getCapacity() < previousCapacity){
                sortedCapacity[i] = room.getCapacity();
                sortedRooms[i] = room.getRoomNumber();
                previousCapacity = room.getCapacity();
                previousRoom = room.getRoomNumber();
            }
            i++;
        }
        for(int x = 0; x < sortedCapacity.length; x++){
            System.out.println("Номер комнаты " + sortedRooms[x]  + ": Вместительность: " +  sortedCapacity[x] );
        }
    }

    public void sortVisitorsByAlphabet(){
        String[] sortedAlphabet = new String[visitors.size()];
        int[] sortedRooms = new int[rooms.size()];
        int x = 0;
        for(Visitor visitor : visitors){
                sortedAlphabet[x] = visitor.getName();
                sortedRooms[x] = visitor.getRoom().getRoomNumber();
                x++;
        }
        for(int i = 0; i < sortedAlphabet.length - 1; i++){
            for(int j = 0; j < sortedAlphabet.length - i - 1; j++ ){
                if(sortedAlphabet[j].compareTo(sortedAlphabet[j+1]) > 0){
                    String temp = sortedAlphabet[j];
                    int tempRoom = sortedRooms[j];
                    sortedAlphabet[j] = sortedAlphabet[j+1];
                    sortedAlphabet[j+1] = temp;
                    sortedRooms[j] = sortedRooms[j+1];
                    sortedRooms[j+1] = tempRoom;
                }
            }
        }
        for(int i = 0; i < sortedAlphabet.length; i++){
            System.out.println(sortedAlphabet[i] + ": " + sortedRooms[i]);
        }
    }
    public void getRoomsAndServices() {
        System.out.println("Комнаты: ");
        sortByPrice();
        System.out.println("Услуги: ");
        int[] sortedPrices = new int[services.size()];
        String[] sortedNames = new String[services.size()];
        int previousPrice = 0;
        String previousName = "";
        int i = 0;
        for(Services service : services){
            if(service.getPrice() >= previousPrice && i > 0){
                sortedPrices[i-1] = service.getPrice();
                sortedPrices[i] = previousPrice;
                sortedNames[i-1] = service.getName();
                sortedNames[i] = previousName;
                previousPrice = service.getPrice();
                previousName = service.getName();
            }else if(i == 0){
                sortedPrices[i] =  service.getPrice();
                previousPrice = service.getPrice();
                sortedNames[i]= service.getName();
                previousName = service.getName();
            }else if(service.getPrice() < previousPrice){
                sortedPrices[i] = service.getPrice();
                sortedNames[i] = service.getName();
                previousPrice = service.getPrice();
                previousName = service.getName();
            }
            i++;
        }
        for(int x = 0; x < sortedPrices.length; x++){
            System.out.println("Название услуги: " + sortedNames[x] + " Цена: " + sortedPrices[x]);
        }
    }
    public void getFreeRoomsByPrice(){
        int[] sortedPrices = new int[getNumOfFreeRooms()];
        int[] sortedRooms = new int[getNumOfFreeRooms()];
        int previousPrice = 0;
        int previousRoom = 0;
        int i = 0;
        for(Room room : rooms){
            if(room.getIsAvailable()){
                if(room.getPrice() >= previousPrice && i > 0){
                    sortedRooms[i-1] = room.getRoomNumber();
                    sortedRooms[i] = previousRoom;
                    sortedPrices[i-1] = room.getPrice();
                    sortedPrices[i] = previousPrice;
                }else if(i == 0){
                    sortedRooms[i]= room.getRoomNumber();
                    previousRoom = room.getRoomNumber();
                    sortedPrices[i] = room.getPrice();
                    previousPrice = room.getPrice();
                }else if(room.getPrice() < previousPrice){
                    sortedPrices[i] = room.getPrice();
                    sortedRooms[i] = room.getRoomNumber();
                    previousRoom = room.getRoomNumber();
                    sortedPrices[i] = room.getPrice();
                }
                i++;
            }else continue;
        }
        for(int x = 0; x < sortedPrices.length; x++){
            System.out.println("Комната номер " + sortedRooms[x] + " Цена: " + sortedPrices[x]);
        }
    }
    public void getFreeRoomsByCapacity(){
        int[] sortedCapacity = new int[getNumOfFreeRooms()];
        int[] sortedRooms = new int[getNumOfFreeRooms()];
        int previousRoom = 0;
        int previousCapacity = 0;
        int i = 0;
        for(Room room : rooms) {
            if (room.getIsAvailable()) {
                if (room.getCapacity() >= previousCapacity && i > 0) {
                    sortedCapacity[i - 1] = room.getCapacity();
                    sortedCapacity[i] = previousCapacity;
                    sortedRooms[i - 1] = room.getRoomNumber();
                    sortedRooms[i] = previousRoom;
                } else if (i == 0) {
                    sortedCapacity[i] = room.getCapacity();
                    sortedRooms[i] = room.getRoomNumber();
                    previousCapacity = room.getCapacity();
                    previousRoom = room.getRoomNumber();
                } else if (room.getCapacity() < previousCapacity) {
                    sortedCapacity[i] = room.getCapacity();
                    sortedRooms[i] = room.getRoomNumber();
                    previousCapacity = room.getCapacity();
                    previousRoom = room.getRoomNumber();
                }
                i++;
            }else continue;
        }
        for(int x = 0; x < sortedCapacity.length; x++){
            System.out.println("Номер комнаты " + sortedRooms[x]  + ": Вместительность: " +  sortedCapacity[x] );
        }
    }
    public void getFreeRoomsByRating(){
        int[] sortedRatings = new int[getNumOfFreeRooms()];
        int[] sortedRooms = new int[getNumOfFreeRooms()];
        int previousRating = 0;
        int previousRoom = 0;
        int i = 0;
        for(Room room : rooms){
            if (room.getIsAvailable()) {
                if(room.getRating() >= previousRating && i > 0){
                    sortedRatings[i-1] = room.getRating();
                    sortedRatings[i] = previousRating;
                    sortedRooms[i-1] = room.getRoomNumber();
                    sortedRooms[i] = previousRoom;
                }else if(i == 0){
                    sortedRatings[i] = room.getRating();
                    sortedRooms[i] = room.getRoomNumber();
                    previousRating = room.getRating();
                    previousRoom = room.getRoomNumber();
                }else if(room.getRating() < previousRating){
                    sortedRatings[i] = room.getRating();
                    sortedRooms[i] = room.getRoomNumber();
                    previousRating = room.getRating();
                    previousRoom = room.getRoomNumber();
                }
                i++;
            }
        }
        for(int x = 0; x < sortedRatings.length; x++){
            System.out.println("Номер комнаты " + sortedRooms[x] + ": Количество звезд: " + sortedRatings[x]);
        }
    }
    public void sortVisitorsByDate(){
        Date[] sortedDate = new Date[visitors.size()];
        String[] sortedNames = new String[visitors.size()];
        int n = 0;
        for(Visitor visitor: visitors){
            sortedDate[n] = visitor.getRoom().getDateOfMovingOut();
            sortedNames[n] = visitor.getName();
            n++;
        }
        for(int i = 0; i < sortedDate.length - 1; i++){
            for(int j = 0; j < sortedDate.length - i - 1; j++){
                if(sortedDate[j].compareTo(sortedDate[j+1]) < 0){
                    Date temp = sortedDate[j];
                    String tempName = sortedNames[j];
                    sortedDate[j] = sortedDate[j+1];
                    sortedDate[j+1] = temp;
                    sortedNames[j] = sortedNames[j+1];
                    sortedNames[j+1] = tempName;
                }
            }
        }
        for(int x = 0; x < sortedDate.length; x++){
            System.out.println(sortedNames[x] + ": " + sortedDate[x]);
        }
    }
    public void getRoomsByDate(Date dateOfMovingIn){
        int[] roomNumbers = new int[rooms.size()];
        int n = 0;
        for(Room room : rooms){
            if(room.getDateOfMovingOut().compareTo(dateOfMovingIn) <= 0){
                roomNumbers[n] = room.getRoomNumber();
                n++;
            }
        }

        for(int i = 0; i < roomNumbers.length; i++){
            if(roomNumbers[i] != 0){
                System.out.println("Комната номер " + roomNumbers[i] + " будет свободна");
            }else break;
        }
    }
}
