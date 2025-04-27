import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class NormalAdd extends JButton {

	private static final long serialVersionUID = 1L;

	private int x = 0;
	
	NormalPanel p ;
	
	public NormalAdd(Color r,NormalPanel p) {
		this.p = p;
		setLayout(new BorderLayout());
	    ImageIcon originalIcon = new ImageIcon(GlobalButton.class.getResource("/multicontador/add.png"));
	    Image originalImage = originalIcon.getImage();
	    
	    // Calculate scaled dimensions maintaining aspect ratio
	    int maxWidth = 50;
	    int maxHeight = 50;
	    int newWidth = originalIcon.getIconWidth();
	    int newHeight = originalIcon.getIconHeight();
	    
	    if (newWidth > maxWidth) {
	        newHeight = (newHeight * maxWidth) / newWidth;
	        newWidth = maxWidth;
	    }
	    if (newHeight > maxHeight) {
	        newWidth = (newWidth * maxHeight) / newHeight;
	        newHeight = maxHeight;
	    }
	    
	    Image scaledImage = originalImage.getScaledInstance(
	        newWidth, newHeight, Image.SCALE_SMOOTH);
	    
	    
	    JLabel l1 = new JLabel(new ImageIcon(scaledImage));
	    addActionListener(e -> {
            x++; // Increment local counter
            NormalNumber m = p.getNumber();
            m.setText(String.valueOf(x));
            
            // Update global counter
            GlobalNumber globalNum = p.getGlobalnum();
            globalNum.setX(globalNum.getX() + 1); // Add 1 to global count
            globalNum.setText(String.valueOf(globalNum.getX()));
        });
	    setBackground(r);
	    
	    add(l1,BorderLayout.SOUTH);
	   
	}
	
	public int getNumber() {
		return x;
	}
	
	public void resetNumber() {
		this.x = 0;
	}

		

}
