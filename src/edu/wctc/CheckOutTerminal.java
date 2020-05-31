package edu.wctc;

import java.util.ArrayList;
import java.util.Random;

public class CheckOutTerminal extends Terminal {


    /**
     * This method overrides the menu() to display the check-out options
     */
    @Override
    public void menu() {
        System.out.println("\nBest Value Parking Garage\n-------------------------");
        System.out.print("4 - Check-Out\n5 - Lost Ticket\n\n>");

    }

}
