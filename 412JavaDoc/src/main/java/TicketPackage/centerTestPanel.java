package TicketPackage;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;

public class centerTestPanel extends JPanel {
    
    private JScrollPane scrollPane;
    private JTable ticketTable;
    private tableModel tm;
    private ArrayList<ArrayList<String>> attributes;

    public centerTestPanel(ArrayList<ArrayList<String>> arr){
        
        setAttributes(arr);
        setupScreen(attributes);

    }

    public void setAttributes(ArrayList<ArrayList<String>> arr){
        this.attributes = arr;
    }
    public void updateScreen(ArrayList<ArrayList<String>> arr){
        setAttributes(arr);
        setupScreen(attributes);
    }
    public void setupScreen(ArrayList<ArrayList<String>> arr){
        if(this.scrollPane == null){
            this.tm = new tableModel(arr);
            this.ticketTable = new JTable(tm);
            this.scrollPane = new JScrollPane(ticketTable);
            this.add(this.scrollPane);
        }
        else{
            this.remove(scrollPane);
            this.tm = new tableModel(arr);
            this.ticketTable = new JTable(tm);
            this.scrollPane = new JScrollPane(ticketTable);
            this.add(this.scrollPane);
            this.revalidate();
        }
            
    }
    public int getSelectedRow(){
        return this.ticketTable.getSelectedRow();
    }

}
