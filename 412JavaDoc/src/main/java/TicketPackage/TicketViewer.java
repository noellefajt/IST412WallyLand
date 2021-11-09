/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketPackage;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TicketViewer {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JScrollPane scrollPane;
    
    public TicketViewer(ArrayList<Ticket> purchasedTickets) {      
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setSize(400,400);

       
       panel = new JPanel();
       JLabel label = new JLabel("Displaying all purchased tickets:");
 
       //ArrayList<Ticket> dummy = new ArrayList<>();
       JScrollPane scrollPane = new JScrollPane(populatePurchasedTicketsArray(purchasedTickets));
       panel.add(label);
       panel.add(scrollPane);
       frame.add(panel);
       
    }
    
    public JList<Object> populatePurchasedTicketsArray(ArrayList<Ticket> list){
        String[] tickets = new String[list.size()];
        for(int i = 0; i<list.size(); i++){
            tickets[i] = list.get(i).getType() + " for " + list.get(i).getRide();
        }
        JList<Object> displayList = new JList<>();
        displayList.setListData(tickets);
        return displayList;
    }
    
    public void setVisible(boolean flag){
        frame.setVisible(flag);
    }
}
