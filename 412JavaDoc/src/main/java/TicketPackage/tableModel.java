package TicketPackage;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class tableModel extends AbstractTableModel{
    private String[] columnNames = {"price","ride","time","type"};
    private Object[][] data;
    public tableModel(ArrayList<ArrayList<String>> arr){
        setTicketData(arr);
    }
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    public void setTicketData(ArrayList<ArrayList<String>> arr){
        data = new Object[arr.size()][this.columnNames.length];
        for(int i = 0; i < arr.size(); i++){
            Object[] attributes = arr.get(i).toArray();
            data[i] = attributes;
        }

    }

}
