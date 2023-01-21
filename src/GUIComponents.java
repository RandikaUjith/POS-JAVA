import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;

public class GUIComponents {

    private JButton btn;

    public GUIComponents() {
    }

    public JButton makeBtn(String s, int fontSize) {
        btn = new JButton(s);
        btn.setPreferredSize(new Dimension(105, 80));
        btn.setFont(new Font("Arial", Font.PLAIN, fontSize));
        return btn;
    }

}
