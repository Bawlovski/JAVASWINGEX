import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GlobalNumber extends JLabel {

	private static final long serialVersionUID = 1L;

	public GlobalNumber() {
		super("0");
        
        setHorizontalAlignment(SwingConstants.CENTER); 
        setVerticalAlignment(SwingConstants.CENTER);
        
        setBackground(Color.BLACK);
        
        setOpaque(true);
        
        setForeground(Color.white);
	}
}
