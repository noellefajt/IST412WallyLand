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
    
    public TicketViewer() {      
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setSize(400,400);

       
       panel = new JPanel();
       JLabel label = new JLabel("Displaying all purchased tickets:");
 
       ArrayList<Ticket> dummy = new ArrayList<>();
       
       
       JScrollPane scrollPane = new JScrollPane(populatePurchasedTicketsArray(dummy));
       panel.add(label);
       panel.add(scrollPane);
       
       frame.add(panel);
       
    }
    
    public JList<String> populatePurchasedTicketsArray(ArrayList<Ticket> list){
        JList<String> displayList = new JList<>(list.toArray(new String[0]));
        return displayList;
    }
    
    public void setVisible(boolean flag){
        frame.setVisible(flag);
    }
}
