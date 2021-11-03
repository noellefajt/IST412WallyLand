/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Dylan
 */
public class TicketModel {
    private ArrayList<Ticket> tickets;
    private ArrayList<String> headers;
    /**
    *Constructor for ticket model creates ticket model object initiallized with 2 array lists, one empty array that takes ticket objects
    *and one that holds a list of the rides available for ticket purchase
    */
    public TicketModel(){
        this.tickets = new ArrayList<Ticket>();
        this.headers = new ArrayList<>(Arrays.asList("ticket type","price","ride","time","ID"));

    }
    /**
    *adds ticket to the ticket array list
    * @param ticket Ticket object to be stored in tickets array list 
    */
    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    /**
    returns the rides array list
    */
    public ArrayList<String> getHeaders(){
        return this.headers;
    }
    /**
     returns a the ticket array
     */
    public ArrayList<Ticket> getTickets(){
        return this.tickets;
    }
}
