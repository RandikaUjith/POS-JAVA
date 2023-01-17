import javax.swing.JButton;
import java.awt.Dimension;

public class GUIComponents {

    private JButton btn;

    public GUIComponents(){
        
    }

    public JButton makeBtn(String s){
        btn = new JButton(s);
        btn.setPreferredSize(new Dimension(50, 50));
        return btn;

    }
    
}
