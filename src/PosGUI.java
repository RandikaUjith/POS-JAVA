import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PosGUI extends JFrame {
    private GUIComponents element = new GUIComponents();
    private JPanel numPanel = new JPanel();
    private JButton btn1;

    public PosGUI(){
        super("Point of Sales System");
        makeFrame();
    }

    public void makeFrame(){
        btn1 = element.makeBtn("1");
        numPanel.add(btn1);
        numPanel.setBounds(0, 0, 525, 90);
        add(numPanel);
        
        setLayout(null);
        setSize(700,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

    }
    
}
