/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class TicketView {
    private MainFrame mf;
    /**
    *constructor for the ticket view class
    *takes a ticket controller object
    *@param contr ticketController object
    */
<<<<<<< Updated upstream
    public TicketView(){
        this.mf = new MainFrame();
=======
    public TicketView(ArrayList<ArrayList<String>> arr){
        this.mf = new MainFrame(arr);
>>>>>>> Stashed changes
    }
    public MainFrame getMf(){
        return this.mf;
    }
<<<<<<< Updated upstream
    public void initialsetup(int col, int lin){
        mf.getMjp().getCp().createMoreButtons(col, lin);
        
    }
    public void displayButtons(ArrayList<Ticket> tickets, ArrayList<String> headers)
    {
        mf.getMjp().getCp().displayDataOnButtons(tickets, headers);
    }
=======
    public void initialsetup(){
        this.mf.getMjp().getCp();
        
    }
    public void updateCp(ArrayList<ArrayList<String>> arr){
        this.mf.getMjp().getCp().updateScreen(arr);
    }
    // public void initialsetup(int col, int lin){
    //     mf.getMjp().getCp().createMoreButtons(col, lin);
        
    // }
    // public void displayButtons(ArrayList<Ticket> tickets, ArrayList<String> headers)
    // {
    //     mf.getMjp().getCp().displayDataOnButtons(tickets, headers);
    // }
    // public void displayTestLayout(){
    //     new testFrame();
    // }
>>>>>>> Stashed changes

}
