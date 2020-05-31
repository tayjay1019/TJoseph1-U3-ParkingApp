package edu.wctc;

import java.time.Duration;
import java.time.LocalTime;

public abstract class Ticket {
    private int ticketID;
    public static int counter = 0;
    private LocalTime checkIn;
    private LocalTime checkOut;
    private double cost;
    private RandomTime tester = new RandomTime();


    /**
     * This method calculates the hours between the check-in and check-out times
     * @return
     */
    public double getHoursBetween(){
        Duration duration = Duration.between(getCheckIn(), getCheckOut());
       double hoursBetween = duration.toHoursPart();
       return hoursBetween;
    }

    /**
     * This method will calculate the cost based on hours for a RegularTicket
     */
    public void calcTime() {

        if(getHoursBetween() <= 3){
            setCost(5.0);
        } else if ( getHoursBetween() > 3.0 && getHoursBetween() < 13) {
            setCost((getHoursBetween() - 3.0) + 5.0);
        }
        else {
            setCost(15.0);
        }
    }

    /**
     * This method prints out the basic values of a Ticket
     */
    public void printTicket(){
        System.out.println("Best Value Parking Garage\n---------------------");
        System.out.println("Receipt for ticket: " + ticketID);
        System.out.println("\n\n" + getHoursBetween() + " hours parked " + checkIn + " - " + checkOut);
        System.out.printf("$%.2f\n\n\n", cost);
    }


    public int getTicketID(){ return ticketID;}

    public void setTicketID(int newTicketID){ this.ticketID = newTicketID;}

    public LocalTime getCheckIn() { return checkIn; }

    public void setCheckIn() {  this.checkIn = LocalTime.of(tester.checkInHour(), tester.checkMinute()); }

    public LocalTime getCheckOut() {   return checkOut; }

    public void setCheckOut() {
        this.checkOut = LocalTime.of(tester.checkOUtHour(), tester.checkMinute()); }

    public double getCost() { return cost; }

    public void setCost(double cost) { this.cost = cost; }
}
