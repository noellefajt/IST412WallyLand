package TicketPackage;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
//import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NorthPanel extends JPanel {
    private JCheckBox singleTickets;
    private JCheckBox threePersonTickets;
    private JCheckBox fivePersonTickets;
    private JButton search;
    private ButtonGroup radioButtonGroup;
    
    public NorthPanel(){
        this.singleTickets = new JCheckBox();
        this.threePersonTickets = new JCheckBox();
        this.fivePersonTickets = new JCheckBox();
        this.radioButtonGroup = new ButtonGroup();
        this.search = new JButton();
        this.search.setText("Search");
        this.singleTickets.setText("Single Ticket");
        this.threePersonTickets.setText("Three Person Ticket");
        this.fivePersonTickets.setText("fivePersonTickets");
        add(this.singleTickets);
        add(this.threePersonTickets);
        add(this.fivePersonTickets);
        add(this.search);
        // this.radioButtonGroup.add(this.singleTickets);
        // this.radioButtonGroup.add(this.threePersonTickets);
        // this.radioButtonGroup.add(this.fivePersonTickets);
    }

    public JButton getSearchButton(){
        return this.search;
    }
    public ButtonGroup getButtonGroup(){
        return this.radioButtonGroup;
    }
    
}
