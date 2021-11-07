/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.*;
/**
 *
 * @author Dylan
 */
public class TicketController {
    private TicketModel md;
    private TicketView vw;
    ArrayList<ArrayList<String>> ticketArray;
    /**
    *Constructor for ticket controller, takes in a ticket model object
    *@param model TicketModel object
    */
    public TicketController(TicketModel model){
        this.md = model;
        makeTickets();
        this.ticketArray = createTicketToString();
        this.vw = new TicketView(ticketArray);
        addActionListener();
        vw.initialsetup();

    }
    /**
    *depending on the input from ticketPrompt method in ticket view
    *creates a ticket and passes it to the addTicketMethdo in model to be added to the ticket array
    *@param selection the specific selection integer returned from ticketView.ticketPrompt
    */
    public void makeTickets(){
        concreteFactory factory = new concreteFactory(md);
        factory.makeTicket("single", 15, "ride 1", LocalDate.now(), "12345");
        factory.makeTicket("three", 45, "ride 1", LocalDate.now(), "12345");
        factory.makeTicket("five", 75, "ride 1", LocalDate.now(), "12345");
    }
    public ArrayList<Ticket> getTickets(){
        return md.getTickets();
    }
    public ArrayList<String> addSingleTickets(){
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < md.getTickets().size(); i++){
            if(md.getTickets().get(i).getPeople() == 1){
                arr.add(String.valueOf(md.getTickets().get(i).getPrice()));
                arr.add(md.getTickets().get(i).getRide());
                arr.add(md.getTickets().get(i).getTime());
                arr.add(md.getTickets().get(i).getType());
            }
        }
        return arr;
    }
    public ArrayList<String> addThreePersonTickets(){
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < md.getTickets().size(); i++){
            if(md.getTickets().get(i).getPeople() == 3){
                arr.add(String.valueOf(md.getTickets().get(i).getPrice()));
                arr.add(md.getTickets().get(i).getRide());
                arr.add(md.getTickets().get(i).getTime());
                arr.add(md.getTickets().get(i).getType());
            }
        }
        return arr;
    }
    public ArrayList<String> addFivePersonTickets(){
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < md.getTickets().size(); i++){
            if(md.getTickets().get(i).getPeople() == 5){
                arr.add(String.valueOf(md.getTickets().get(i).getPrice()));
                arr.add(md.getTickets().get(i).getRide());
                arr.add(md.getTickets().get(i).getTime());
                arr.add(md.getTickets().get(i).getType());
            }
        }
        return arr;
    }
    public ArrayList<ArrayList<String>> createTicketToString(){
        ArrayList<ArrayList<String>> ticketArray = new ArrayList<ArrayList<String>>();
        ticketArray.add(addSingleTickets());
        ticketArray.add(addThreePersonTickets());
        ticketArray.add(addFivePersonTickets());
        return ticketArray;
    }
    private void addActionListener(){
        vw.getMf().getMjp().getSp().getPurchaseButton().addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                int selectedRow = vw.getMf().getMjp().getCp().getSelectedRow();
                md.getTickets().get(selectedRow).setPurchased(true);
                md.addPurchasedTicket(md.getTickets().get(selectedRow));
            } 
        });
    }
  
}
