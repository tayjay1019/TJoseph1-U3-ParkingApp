package edu.wctc;


public class RegularTicket extends Ticket {

    /**
     * This is the constructor for a RegularTicket type of Ticket
     */
    public RegularTicket(){
        counter++;
        setTicketID(counter);
        setCheckIn();
        setCheckOut();
        calcTime();
    }


}
