import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class PosGUI extends JFrame {
    private GUIComponents element = new GUIComponents();
    private JPanel westPanel = new JPanel(new BorderLayout());
    private JPanel centerPanel = new JPanel();
    private JPanel westNumPanel = new JPanel(new GridLayout(5, 3));
    private JPanel westPayPanel = new JPanel(new GridLayout(2, 1));
    private JPanel westFixCashPanel = new JPanel(new GridLayout(2, 3));


    private JButton btn1 = element.makeBtn("1");
    private JButton btn2 = element.makeBtn("2");
    private JButton btn3 = element.makeBtn("3");
    private JButton btn4 = element.makeBtn("4");
    private JButton btn5 = element.makeBtn("5");
    private JButton btn6 = element.makeBtn("6");
    private JButton btn7 = element.makeBtn("7");
    private JButton btn8 = element.makeBtn("8");
    private JButton btn9 = element.makeBtn("9");
    private JButton btn0 = element.makeBtn("0");
    private JButton btn00 = element.makeBtn("00");
    private JButton btn000 = element.makeBtn(".");
    private JButton btnDel = element.makeBtn("Del");
    private JButton btnQty = element.makeBtn("Qty");
    private JButton btnCash = element.makeBtn("EC");

    private JButton btnPayCash = element.makeBtn("Pay Cash");
    private JButton btnPayCard = element.makeBtn("Pay Card");
   
    private JButton btnCash1 = element.makeBtn("£1");
    private JButton btnCash2 = element.makeBtn("£2");
    private JButton btnCash5 = element.makeBtn("£5");
    private JButton btnCash10 = element.makeBtn("£10");
    private JButton btnCash20 = element.makeBtn("£20");
    private JButton btnCash50 = element.makeBtn("£50");

    private JButton btnCat1 = element.makeBtn("£50");
    private JButton btnCat2 = element.makeBtn("£50");
    private JButton btnCat3 = element.makeBtn("£50");
    private JButton btnCat4 = element.makeBtn("£50");
    private JButton btnCat5 = element.makeBtn("£50");
    private JButton btnCat6 = element.makeBtn("£50");
    private JButton btnCat7 = element.makeBtn("£50");

    public PosGUI() {
        super("Point of Sales System");
        makeFrame();
    }

    public void makeFrame() {
        setLayout(new BorderLayout());
        // setSize(1550, 800);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        westNumPanel.add(btn7);
        westNumPanel.add(btn8);
        westNumPanel.add(btn9);
        westNumPanel.add(btn4);
        westNumPanel.add(btn5);
        westNumPanel.add(btn6);
        westNumPanel.add(btn1);
        westNumPanel.add(btn2);
        westNumPanel.add(btn3);
        westNumPanel.add(btn00);
        westNumPanel.add(btn0);
        westNumPanel.add(btn000);
        westNumPanel.add(btnDel);
        westNumPanel.add(btnQty);
        westNumPanel.add(btnCash);

        westPayPanel.add(btnPayCash);
        westPayPanel.add(btnPayCard);

        westFixCashPanel.add(btnCash1);
        westFixCashPanel.add(btnCash2);
        westFixCashPanel.add(btnCash5);
        westFixCashPanel.add(btnCash10);
        westFixCashPanel.add(btnCash20);
        westFixCashPanel.add(btnCash50);

        westPanel.add(westNumPanel, BorderLayout.NORTH);
        westPanel.add(westPayPanel, BorderLayout.CENTER);
        westPanel.add(westFixCashPanel, BorderLayout.SOUTH);
        // westPanel.setBounds(0, 0, 300, 500);
        add(westPanel, BorderLayout.WEST);

    }

}
