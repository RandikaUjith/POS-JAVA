import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GUIComponents {

    private JButton btn;

    public GUIComponents() {
    }

    public JButton makeBtn(String s, int fontSize) {
        btn = new JButton(s);
        btn.setPreferredSize(new Dimension(100, 80));
        btn.setFont(new Font("Arial", Font.PLAIN, fontSize));
        // btn.setBorder(null);
        // btn.setBorder(new LineBorder(Color.BLUE, 3));
        return btn;
    }

}
