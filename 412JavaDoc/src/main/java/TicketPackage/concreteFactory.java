package TicketPackage;

import java.time.LocalDate;

public class concreteFactory {
    
    private ticketFactory factory;
    private TicketModel md;

    public concreteFactory(TicketModel model){
        this.factory =  new ticketFactory();
        this.md = model;
    }
        
    public void makeTicket(String ticketType, int price, String ride, LocalDate time, String ID){
        Ticket ticket = factory.getTicket(ticketType, price, ride, time, ID);
        this.md.addTicket(ticket);
    }
}
