import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class NormalNumber extends JLabel {
    private static final long serialVersionUID = 1L;

    NormalNumber() {
        super("0");
        
        setHorizontalAlignment(SwingConstants.CENTER); 
        setVerticalAlignment(SwingConstants.CENTER);
        
        setBackground(Color.BLACK);
        
        setOpaque(true);
        
        setForeground(Color.white);
    }
}