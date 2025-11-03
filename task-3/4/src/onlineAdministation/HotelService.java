package onlineAdministation;

public class HotelService extends Hotel{
    public HotelService(String name){
        super(name);
    }
    public int getNumOfFreeRooms(){
        int freeRooms = 0;
        for (Room room : rooms) {
            if(room.isAvailable){
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
        VisitorService.sortByPrice();
    }
}
