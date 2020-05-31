package edu.wctc;


public class Main {

    public static void main(String[] args) {

        Terminal in = new CheckInTerminal();
        Terminal out = new CheckOutTerminal();
        boolean exit = false;

       do {
           in.startTerminal();
           out.startTerminal();
       } while(!exit);



    }

}
