package TicketPackage;

import java.awt.*;
import javax.swing.*;

public class mainPanel extends JPanel{
    
    private centerPanel cp;
    private NorthPanel np;

    public mainPanel()
    {
        super();
        setBackground(Color.yellow);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        cp = new centerPanel();
        np = new NorthPanel();
        add(cp, BorderLayout.CENTER);
        add(np, BorderLayout.NORTH);

    }

    public centerPanel getCp()
    {
        return cp;
    }

    public void setCp(centerPanel cp)
    {
        this.cp = cp;
    }
    public NorthPanel getNp(){
        return np;
    }
    public void setNp(NorthPanel np){
        this.np = np;
    }
}
