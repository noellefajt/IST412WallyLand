package TicketPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;

public class centerPanel extends JPanel {
    private ArrayList<ArrayList<JButton>> jbs;
    private ArrayList<JButton> headers;

    public centerPanel()
    {
        this.jbs = new ArrayList<>();
        this.headers = new ArrayList<>();
        //rows by columns
    }
    void displayDataOnButtons(ArrayList<Ticket> tickets, ArrayList<String> headers)
    {
        for (int i = 0; i < headers.size(); i++)
        {
            this.headers.get(i).setText(headers.get(i));
        }
        for (int i = 0; i < tickets.size(); i++)
        {

            this.jbs.get(i).get(0).setText(tickets.get(i).getType());
            this.jbs.get(i).get(1).setText(String.valueOf(tickets.get(i).getPrice()));
            this.jbs.get(i).get(2).setText(tickets.get(i).getID());
            this.jbs.get(i).get(3).setText(tickets.get(i).getRide());
            this.jbs.get(i).get(4).setText(tickets.get(i).getTime());
        }
    }
    void createMoreButtons(int col, int lin){
        this.setLayout(new GridLayout(0, col));
        for (int i = 0; i < col; i++)
        {
            JButton b = new JButton(i + "");
            this.headers.add(b);     //adds the button to the array
            b.setBackground(Color.pink);
            this.add(b);  //add the button to the screen
        }
        for (int i = 0; i < lin; i++)
        {
            ArrayList<JButton> row = new ArrayList<JButton>();
            for (int k = 0; k < col; k++){
                JButton b = new JButton(i + "" + k);
                row.add(b);     //adds the button to the array
                b.setBackground(Color.cyan);
                
                this.add(b);  //add the button to the screen
            }
            this.jbs.add(row);
        }
        this.validate();  //asks Java to recalculate the layout
        this.repaint();//asks Java to refresh the screen
    }

}
