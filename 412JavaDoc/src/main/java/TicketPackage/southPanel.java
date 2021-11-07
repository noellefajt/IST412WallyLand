package TicketPackage;

import javax.swing.JPanel;
import javax.swing.JButton;

public class southPanel extends JPanel{
   
    private JButton purchase;

    public southPanel(){
        this.purchase = new JButton();
        this.purchase.setText("Purhcase");
        add(this.purchase);
    }

    public JButton getPurchaseButton(){
        return this.purchase;
    }

}
