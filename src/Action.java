import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.*;

public class Action{
    
    private String bcDisplay;
    int sNo = 1;
    String item;
    int uPrice;
    int qty = 1;
    int price;

    String[] columnNames = {"S/No", "Item", "U/Price", "Qty", "Price"};
        Object[][] data = {
            {"1", "Ice Cream", "2.00", "2", "4.00"},
            {"2", "Alcohol", "20.00", "1", "20.00"}
        };

        Object[] newData;


    public Action(){
    }

    public void getResponse(String s, String bar){
        if(s == "1" || s == "2" || s == "3" || s == "4" || s == "5" || s == "6" || s == "7" || s == "8" || s == "9" || s == "0" || s == "00" || s == "000"){
            bcDisplay = s;
        } else if(s == "Slush" || s == "Milk Shake" || s == "Snow Shock" || s == "HotChocolate" || s == "Ice Cream" || s == "Grocery" || s == "Alcohol" || s == "Lottery" || s == "PayPoint" || s == "VAPE" || s == "NEWS" || s == "Fruit/Veg"){
            if(bar != null){
                System.out.println(bar);
                uPrice = Integer.valueOf(bar)/100;
                price = uPrice * qty;
                newData = new Object[]{String.valueOf(sNo), s, String.valueOf(uPrice), String.valueOf(qty), String.valueOf(price)};
                bcDisplay = null;
            }
            
        }
    }

    public String bcDisplay(){
        return bcDisplay;
    }

    public void addToBill(){
               
    }

    public JTable updateTable(){
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        if(newData != null){
            model.addRow(newData);
        }
        JTable table = new JTable(model);
        table.setFont(new Font("Arial", Font.PLAIN, 18));
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(390);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(100);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        return table;
    }
    
}
