package edu.wctc;

public class SpecialEventTicket extends Ticket{

    public static int counter = 0;

    /**
     * This is the constructor for a SpecialEventTicket type of Ticket
     */
    public SpecialEventTicket(){
        counter++;
        setTicketID(counter);
        setCheckIn();
        setCheckOut();
        setCost(20.0);
    }

}
