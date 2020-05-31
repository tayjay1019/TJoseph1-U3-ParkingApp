package edu.wctc;

import java.util.ArrayList;

public class CheckInTerminal extends Terminal {


    /**
     * This method overrides the menu() to display the check in options
     */
    @Override
    public void menu() {
        System.out.println("\nBest Value Parking Garage\n-------------------------");
        System.out.print("1 - Check-In\n2 - Special Event\n3 - Close Garage\n\n>");
    }


}
