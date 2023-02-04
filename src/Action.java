import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Action{
    
    private String bcDisplay;
    int sNo = 1;
    String item;
    double uPrice;
    int qty = 1;
    double price;

    String[] columnNames = {"S/No", "Item", "U/Price", "Qty", "Price"};
    Object[][] data = {};
    Object[] newData;
    ArrayList<Double> priceList = new ArrayList<>();

    public Action(){
    }

    public void getResponse(String s, String bar){
        if(s == "1" || s == "2" || s == "3" || s == "4" || s == "5" || s == "6" || s == "7" || s == "8" || s == "9" || s == "0" || s == "00" || s == "000"){
            bcDisplay = s;
            newData = null;
        } else if(s == "Slush" || s == "Milk Shake" || s == "Snow Shock" || s == "HotChocolate" || s == "Ice Cream" || s == "Grocery" || s == "Alcohol" || s == "Lottery" || s == "PayPoint" || s == "VAPE" || s == "NEWS" || s == "Fruit/Veg"){
            if(bar != null){
                uPrice = Double.parseDouble(bar)/100;
                price = uPrice * qty;
                newData = new Object[]{String.valueOf(sNo), s, String.format("%.2f", uPrice), String.valueOf(qty), String.format("%.2f", price)};
                priceList.add(price);
                bcDisplay = null;
                qty = 1;
                sNo = sNo + 1;
            }  
        } else if(s == "10p Bag"){
            newData = new Object[]{String.valueOf(sNo), s, "0.10", String.valueOf(qty), Double.toString(0.1*qty)};
            bcDisplay = null;
            priceList.add(0.10);
            qty = 1;
            sNo = sNo + 1;
        } else if(s == "20p Bag"){
            newData = new Object[]{String.valueOf(sNo), s, "0.20", String.valueOf(qty), Double.toString(0.2*qty)};
            bcDisplay = null;
            priceList.add(0.20);
            qty = 1;
            sNo = sNo + 1;
        } else if(s == "Qty"){
            qty = Integer.parseInt(bar);
            bcDisplay = null;
        } else if(s == "£1" || s == "£2" || s == "£5" || s == "£10" || s == "£20" || s == "£50"){
            bcDisplay = s.substring(1) + "00";
        }
    }

    public String returnPrice(){
        double sum = 0.0;
        for (Double price : priceList) {
        sum += price;
        }
        return String.valueOf(sum);
    }

    public String returnQty(){
        return String.valueOf(qty);
    }

    public String bcDisplay(){
        return bcDisplay;
    }

    public JTable updateTable(){
        if(newData != null){
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = newData;
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();
            }
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);        
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
