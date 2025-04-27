import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GlobalNumber extends JLabel {

	private static final long serialVersionUID = 1L;
	private int x = 0;
	public GlobalNumber() {
		super("0");
        
        setHorizontalAlignment(SwingConstants.CENTER); 
        setVerticalAlignment(SwingConstants.CENTER);
        
        setBackground(Color.BLACK);
        
        setOpaque(true);
        
        setForeground(Color.white);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
}
