import javax.swing.JFrame;

public class PosGUI extends JFrame {

    public PosGUI(){
        super("Point of Sales System");
        makeFrame();
    }

    public void makeFrame(){
        setLayout(null);
        setSize(700,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
