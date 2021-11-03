package TicketPackage;

import java.time.LocalDate;

public class ticketFactory {
    //public ticketFactory(){}
    public Ticket getTicket(String ticketType, int price, String ride, LocalDate time, String ID){
        if(ticketType==null){
            return null;
        }
        if(ticketType=="single"){
            return new SinglePersonTicket(price, ride, time, ID);
        }else if(ticketType=="three"){
            return new ThreePersonTicket(price, ride, time, ID);
        }else if(ticketType=="five"){
            return new FivePersonTicket(price, ride, time, ID);
        }
        return null;
    }

}
