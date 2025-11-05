package onlineAdministation;

import java.util.Date;

public class VisitorService extends Visitor {
    public VisitorService(String name, Room room) {
        super(name ,room);
    }
    public static void sortByPrice(){
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
    public void sortByDate(){
        String[] sortedNames = new String[services.size()];
        Date[] sortedDates = new Date[services.size()];
        int n = 0;
        for(Services service : services){
            sortedDates[n]= service.getDateOfStart();
            sortedNames[n]= service.getName();
            n++;
        }
        for(int i = 0; i < sortedDates.length - 1; i++){
            for(int j = 0; j < sortedDates.length - i - 1; j++){
                if(sortedDates[j].compareTo(sortedDates[j + 1]) < 0){
                    Date tempDate = sortedDates[j];
                    String tempName = sortedNames[j];
                    sortedDates[j] = sortedDates[j + 1];
                    sortedDates[j + 1] = tempDate;
                    sortedNames[j] = sortedNames[j + 1];
                    sortedNames[j + 1] = tempName;
                }
            }
        }
        for(int x = 0; x < sortedDates.length; x++){
            System.out.println("Название услуги: " + sortedNames[x] + " Дата активации: " + sortedDates[x]);
        }
    }

}
