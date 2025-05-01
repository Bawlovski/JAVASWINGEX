import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Masa extends JPanel {

	private static final long serialVersionUID = 1L;
	
	static String fina = "fina";
	static String gruesa = "gruesa";
	
	private JRadioButton gruesaButton;
	private JRadioButton finaButton ;
	


	public Masa () {
		
		GridLayout layout =  new GridLayout(0,1);
		setLayout(layout);
		
		
		finaButton = new JRadioButton(fina);
		finaButton.setMnemonic(KeyEvent.VK_N);
		finaButton.setActionCommand(fina);
		finaButton.setSelected(true);
	    
		gruesaButton= new JRadioButton(gruesa);	
	    gruesaButton.setMnemonic(KeyEvent.VK_G);
	    gruesaButton.setActionCommand(gruesa);
	    gruesaButton.setSelected(true);
	    

	    
	    ButtonGroup group =  new ButtonGroup();
	    
	    group.add(finaButton);
	    group.add(gruesaButton);
	    
	    
	    add(finaButton);
	    add(gruesaButton);
	}
	
	public JRadioButton getGruesaButton() {
		return gruesaButton;
	}

	public void setGruesaButton(JRadioButton gruesaButton) {
		this.gruesaButton = gruesaButton;
	}

	public JRadioButton getFinaButton() {
		return finaButton;
	}

	public void setFinaButton(JRadioButton finaButton) {
		this.finaButton = finaButton;
	}
}
