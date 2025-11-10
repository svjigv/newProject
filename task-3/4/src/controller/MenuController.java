package controller;

import services.*;

import java.text.ParseException;
import java.util.Scanner;

public class MenuController {
    private Builder builder;
    private HotelService hotel;
    Navigator navigator;
    public MenuController(Builder builder, Navigator navigator) {
        this.builder = builder;
        this.navigator = navigator;
    }
    public void run() throws ParseException {
        Scanner input = new Scanner(System.in);
        while (true) {
            navigator.printMenu();
            System.out.println("Выберите пункт: ");
            int choice = input.nextInt();
            navigator.navigate(choice-1);

        }
    }
}
