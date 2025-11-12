package controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Navigator {
    private Menu currentMenu;
    public Navigator(Menu currentMenu){
        this.currentMenu = currentMenu;
    }
    public void printMenu(){
        System.out.println(currentMenu.getName());
        ArrayList<MenuItem> menuItems = currentMenu.getMenuItems();
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i).getTitle());
        }
    }
    public void navigate(Integer index) throws ParseException {
        ArrayList<MenuItem> menuItems = currentMenu.getMenuItems();
        if(index > 0 && menuItems.size() >= index){
            MenuItem menuItem = menuItems.get(index);
            menuItem.doAction();
            if(menuItem.getNextMenu() != null){
                currentMenu = menuItem.getNextMenu();
            }
        }
    }
}
