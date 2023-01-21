import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;

public class PosGUI extends JFrame {
    private GUIComponents element = new GUIComponents();

    private JPanel eastPanel = new JPanel(new BorderLayout());
    private JPanel centerPanel = new JPanel();

    private JPanel eastNumPanel = new JPanel(new GridLayout(5, 3));
    private JPanel eastPayPanel = new JPanel(new GridLayout(2, 1));
    private JPanel eastFixCashPanel = new JPanel(new GridLayout(2, 3));

    private JPanel centerTopPanel = new JPanel(new GridLayout(3, 3));
    private JPanel centerCenPanel = new JPanel(new GridLayout(3, 3));
    private JPanel centerBotPanel = new JPanel(new GridLayout(1, 2));

    private JPanel westTopPanel = new JPanel(new GridLayout(1, 5));
    private JPanel westBotPanel = new JPanel(new GridLayout(1, 5));

    int numFontSize = 45;
    int letFontSize = 35;
    int cashFontSize = 35;
    int catFontSize = 20;
    private JButton btn1 = element.makeBtn("1", numFontSize);
    private JButton btn2 = element.makeBtn("2", numFontSize);
    private JButton btn3 = element.makeBtn("3", numFontSize);
    private JButton btn4 = element.makeBtn("4",numFontSize);
    private JButton btn5 = element.makeBtn("5", numFontSize);
    private JButton btn6 = element.makeBtn("6", numFontSize);
    private JButton btn7 = element.makeBtn("7", numFontSize);
    private JButton btn8 = element.makeBtn("8", numFontSize);
    private JButton btn9 = element.makeBtn("9", numFontSize);
    private JButton btn0 = element.makeBtn("0", numFontSize);
    private JButton btn00 = element.makeBtn("00", numFontSize);
    private JButton btn000 = element.makeBtn(".", numFontSize);
    private JButton btnDel = element.makeBtn("Del", letFontSize);
    private JButton btnQty = element.makeBtn("Qty", letFontSize);
    private JButton btnCash = element.makeBtn("EC", letFontSize);

    private JButton btnPayCash = element.makeBtn("Pay Cash", letFontSize);
    private JButton btnPayCard = element.makeBtn("Pay Card", letFontSize);
   
    private JButton btnCash1 = element.makeBtn("£1", cashFontSize);
    private JButton btnCash2 = element.makeBtn("£2", cashFontSize);
    private JButton btnCash5 = element.makeBtn("£5", cashFontSize);
    private JButton btnCash10 = element.makeBtn("£10", cashFontSize);
    private JButton btnCash20 = element.makeBtn("£20", cashFontSize);
    private JButton btnCash50 = element.makeBtn("£50", cashFontSize);

    private JButton btnCat1 = element.makeBtn("10p Bag", catFontSize);
    private JButton btnCat2 = element.makeBtn("20p Bag", catFontSize);
    private JButton btnCat3 = element.makeBtn("Slush", catFontSize);
    private JButton btnCat4 = element.makeBtn("Milk Shake", catFontSize);
    private JButton btnCat5 = element.makeBtn("Snow Shock", catFontSize);
    private JButton btnCat6 = element.makeBtn("HotChocolate", catFontSize);
    private JButton btnCat7 = element.makeBtn("Ice Cream", catFontSize);

    private JButton btnCat8 = element.makeBtn("Grocery", catFontSize);
    private JButton btnCat9 = element.makeBtn("Alcohol", catFontSize);
    private JButton btnCat10 = element.makeBtn("Lottery", catFontSize);
    private JButton btnCat11 = element.makeBtn("PayPoint", catFontSize);
    private JButton btnCat12 = element.makeBtn("VAPE", catFontSize);
    private JButton btnCat13 = element.makeBtn("NEWS", catFontSize);
    private JButton btnCat14 = element.makeBtn("Fruit/Veg", catFontSize);

    private JButton btnVoucher = element.makeBtn("VOUCHER", catFontSize);
    private JButton btnPayOut = element.makeBtn("PAY-OUT", catFontSize);

    private JButton btnLogOut = element.makeBtn("Log-Out", catFontSize);
    private JButton btnRefund = element.makeBtn("REFUND", catFontSize);
    private JButton btnReceipt = element.makeBtn("Receipt", catFontSize);
    private JButton btnPrinter = element.makeBtn("Printer", catFontSize);
    private JButton btnFunctions = element.makeBtn("FUNCTIONS", 13);

    private JLabel qtyLabel = new JLabel("Quantity : 1");
    private JLabel inputNameLabel = new JLabel("Barcode");
    private JTextField bcInput = new JTextField();
    private JTextArea billArea = new JTextArea();
    private JLabel totDisplay = new JLabel("Tot: £-250.00");
    private JLabel balDisplay = new JLabel("Bal: £-250.00");

    private JButton btnVoid = element.makeBtn("Void", catFontSize);
    private JButton btnUp = element.makeBtn("UP", catFontSize);
    private JButton btnDown = element.makeBtn("DOWN", catFontSize);
    private JButton btnHold = element.makeBtn("Hold/Recall", catFontSize);
    private JButton btnPriceChk = element.makeBtn("Price check", 16);

    private JLabel shiftStart = new JLabel("Shift Started: 10/01/2023 08:00:00");
    private JLabel user = new JLabel("User: Randika");
    private JLabel tillNo = new JLabel("Till No. 1");
    private JLabel printer = new JLabel("Printer Off");
    private JLabel date = new JLabel("Date: 10/01/2023");
    private JLabel time = new JLabel("Time: 10:00");

    public PosGUI() {
        super("Point of Sales System");
        makeFrame();
    }

    public void makeFrame() {
        setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        eastNumPanel.add(btn7);
        eastNumPanel.add(btn8);
        eastNumPanel.add(btn9);
        eastNumPanel.add(btn4);
        eastNumPanel.add(btn5);
        eastNumPanel.add(btn6);
        eastNumPanel.add(btn1);
        eastNumPanel.add(btn2);
        eastNumPanel.add(btn3);
        eastNumPanel.add(btn00);
        eastNumPanel.add(btn0);
        eastNumPanel.add(btn000);
        eastNumPanel.add(btnDel);
        eastNumPanel.add(btnQty);
        eastNumPanel.add(btnCash);

        eastPayPanel.add(btnPayCash);
        eastPayPanel.add(btnPayCard);

        eastFixCashPanel.add(btnCash1);
        eastFixCashPanel.add(btnCash2);
        eastFixCashPanel.add(btnCash5);
        eastFixCashPanel.add(btnCash10);
        eastFixCashPanel.add(btnCash20);
        eastFixCashPanel.add(btnCash50);

        eastPanel.add(eastNumPanel, BorderLayout.NORTH);
        eastPanel.add(eastPayPanel, BorderLayout.CENTER);
        eastPanel.add(eastFixCashPanel, BorderLayout.SOUTH);

        centerTopPanel.add(btnCat1);
        centerTopPanel.add(btnCat2);
        centerTopPanel.add(btnCat3);
        centerTopPanel.add(btnCat4);
        centerTopPanel.add(btnCat5);
        centerTopPanel.add(btnCat6);
        centerTopPanel.add(btnCat7);
        centerTopPanel.add(btnCat14);
        centerTopPanel.setBounds(790,0,410,300);

        centerCenPanel.add(btnCat8);
        centerCenPanel.add(btnCat9);
        centerCenPanel.add(btnCat10);
        centerCenPanel.add(btnCat11);
        centerCenPanel.add(btnCat12);
        centerCenPanel.add(btnCat13);
        centerCenPanel.setBounds(790,325,410,275);

        centerBotPanel.add(btnVoucher);
        centerBotPanel.add(btnPayOut);
        centerBotPanel.setBounds(790,640,410,120);

        westTopPanel.add(btnLogOut);
        westTopPanel.add(btnRefund);
        westTopPanel.add(btnReceipt);
        westTopPanel.add(btnPrinter);
        westTopPanel.add(btnFunctions);
        westTopPanel.setBounds(0,0,600,100);

        qtyLabel.setBounds(20, 100, 150, 50);
        qtyLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        inputNameLabel.setBounds(200, 100, 125, 50);
        inputNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        bcInput.setBounds(350, 110, 390, 40);
        bcInput.setFont(new Font("Arial", Font.PLAIN, 20));
        billArea.setBounds(20, 170, 720, 385);
        billArea.setFont(new Font("Arial", Font.PLAIN, 18));
        totDisplay.setBounds(20, 505, 360, 200);
        totDisplay.setFont(new Font("Arial", Font.PLAIN, 60));
        balDisplay.setBounds(380, 505, 360, 200);
        balDisplay.setFont(new Font("Arial", Font.PLAIN, 60));

        westBotPanel.add(btnVoid);
        westBotPanel.add(btnUp);
        westBotPanel.add(btnDown);
        westBotPanel.add(btnHold);
        westBotPanel.add(btnPriceChk);
        westBotPanel.setBounds(0, 660, 600,100);

        shiftStart.setBounds(10, 745, 200, 60);
        tillNo.setBounds(215, 745, 150, 60);
        printer.setBounds(370, 745, 150, 60);
        date.setBounds(525, 745, 100, 60);
        time.setBounds(630, 745, 100, 60);
        user.setBounds(735, 745, 200, 60);

        centerPanel.setLayout(null);
        centerPanel.add(centerTopPanel);    
        centerPanel.add(centerCenPanel);    
        centerPanel.add(centerBotPanel);
        centerPanel.add(westTopPanel);
        centerPanel.add(qtyLabel);
        centerPanel.add(inputNameLabel);
        centerPanel.add(bcInput);
        centerPanel.add(billArea);
        centerPanel.add(totDisplay);
        centerPanel.add(balDisplay);
        centerPanel.add(westBotPanel);
        centerPanel.add(shiftStart);
        centerPanel.add(user);
        centerPanel.add(tillNo);
        centerPanel.add(printer);
        centerPanel.add(date);
        centerPanel.add(time);
        
        add(eastPanel, BorderLayout.EAST);
        add(centerPanel, BorderLayout.CENTER);
    }

}
