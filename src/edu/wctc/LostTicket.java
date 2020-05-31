package edu.wctc;

public class LostTicket extends Ticket{

    /**
     * This is the constructor for a LostTicket type of Ticket
     */
    public LostTicket(){
        counter++;
        setTicketID(counter);
        setCheckIn();
        setCheckOut();
        setCost(25.0);
    }

}
