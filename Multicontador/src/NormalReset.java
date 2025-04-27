import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class NormalReset extends JButton{

	private static final long serialVersionUID = 1L;
	
	NormalPanel p ;
	
	NormalReset (Color r, NormalPanel n) {
		this.p = n;
		setLayout(new BorderLayout());
	    ImageIcon originalIcon = new ImageIcon(GlobalButton.class.getResource("/multicontador/reset.png"));
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
	    setBackground(r);
	    
	    addActionListener(e -> {
            GlobalNumber globalNum = n.getGlobalnum();
            int currentValue = n.getNumberAdd().getNumber();
            
            // Subtract this counter's value from global total
            globalNum.setX(globalNum.getX() - currentValue);
            globalNum.setText(String.valueOf(globalNum.getX()));
            
            // Reset local counter
            n.getNumberAdd().resetNumber();
            n.getNumber().setText("0");
        });
	    add(l1,BorderLayout.SOUTH);
	}
}
