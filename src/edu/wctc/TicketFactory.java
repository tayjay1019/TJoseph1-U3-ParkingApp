package edu.wctc;

public enum TicketFactory {
    /**
     * This is the factory that will create different types of tickets based on a user choice
     */
    INSTANCE;
    public Ticket makeTicket(String newTicketType){
        Ticket newTicket = null;
        switch (newTicketType) {
            case "1":
                return new RegularTicket();
            case "2":
                return new SpecialEventTicket();
            case "5":
                return new LostTicket();
            default:
                return null;
        }
    }

}
