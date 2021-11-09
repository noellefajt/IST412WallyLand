package TicketPackage;

import javax.swing.JPanel;
import javax.swing.JButton;

public class southPanel extends JPanel{
   
    private JButton purchase;
    private JButton showTickets;

    public southPanel(){
        this.purchase = new JButton();
        this.purchase.setText("Purhcase");
        add(this.purchase);
        
        this.showTickets = new JButton();
        this.showTickets.setText("Show Tickets");
        add(this.showTickets);
    }

    public JButton getPurchaseButton(){
        return this.purchase;
    }
    
    public JButton getShowTicketsButton(){
        return this.showTickets;
    }

}
