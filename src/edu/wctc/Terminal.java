package edu.wctc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Terminal {
    Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Ticket> checked = new ArrayList<>();
    private static ArrayList<Ticket> checkedOut = new ArrayList<>();
    private static ArrayList<Ticket> special = new ArrayList<>();
    private static ArrayList<Ticket> lost = new ArrayList<>();
    public TicketFactory factory = TicketFactory.INSTANCE;
    public Ticket ticket = null;


    public Terminal(){

    }

    /**
     * This method starts the menu() and then the choice() methods
     */

    public void startTerminal() {
        menu();
        String choice = keyboard.nextLine();
        choice(choice, checked, special, lost, checkedOut);
    }

    public void menu(){

    }

    /**
     * This method processes the menu choice
     * @param choice
     * @param checked
     * @param special
     * @param lost
     * @param checkedOut
     */

    public void choice(String choice, ArrayList<Ticket> checked, ArrayList<Ticket> special, ArrayList<Ticket> lost, ArrayList<Ticket> checkedOut) {

        if (choice.equals("3")){
            closeGarage();
        }
        else if(choice.equals("4")){
            Random test = new Random();
            int i = test.nextInt(checked.size());
          checked.get(i).printTicket();
        }

        else {
            ticket = factory.makeTicket(choice);
            switch (choice) {
                case "1":
                    checked.add(ticket);
                    checkedOut.add(ticket);
                    break;
                case "2":
                    special.add(ticket);
                    ticket.printTicket();
                    break;
                case "5":
                    lost.add(ticket);
                    ticket.printTicket();
                    break;
                default:
                        System.out.println("Please enter 1, 2, or 3");
                    break;
            }
        }


    }

    /**
     * This method calculates all the tickets and prints out their number, type, and total cost
     */

    public void closeGarage() {
        double checkTotal = 0.0;
        for (Ticket value : checkedOut) {
            checkTotal += value.getCost();
        }
        double specialTotal = 0.0;
        for (Ticket specialT : special) {
            specialTotal += specialT.getCost();
        }
        double totalLost = 0.0;
        for (Ticket lostTemp : lost){
            totalLost += lostTemp.getCost();
        }

        System.out.println("Best Value Parking Garage\n--------------------");
        System.out.println("Activity to Date\n\n");
        System.out.println("$" + checkTotal + " was collected from " + checkedOut.size() + " Check Ins"  );
        System.out.println("$" + specialTotal + " was collected from " + special.size() + " Special Events"  );
        System.out.println("$" + totalLost + " was collected from " + lost.size() + " Lost Tickets"  );

        System.exit(0);

    }

}
