package controller;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<MenuItem> menuItems;
    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<MenuItem>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }
    public void setMenuItems(MenuItem menuItem){
        menuItems.add(menuItem);
    }
}
