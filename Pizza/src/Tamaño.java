import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Tamaño extends JPanel{

	private static final long serialVersionUID = 1L;
	
	static String pequeña = "pequeña";
	static String mediana = "mediana";
	static String familiar = "familiar";
	
	private StringBuilder st =  new StringBuilder("Tamaño: ");
	
	private JRadioButton pequeñaButton ;
	private JRadioButton medianaButton;
	private JRadioButton familiarButton;
	
	public Tamaño () {
		
		GridLayout layout =  new GridLayout(0,1);
		setLayout(layout);
		
		
		pequeñaButton = new JRadioButton(pequeña);
		pequeñaButton.setMnemonic(KeyEvent.VK_P);
	    pequeñaButton.setActionCommand(pequeña);
	    pequeñaButton.setSelected(true);
	    
	    medianaButton = new JRadioButton(mediana);	
	    medianaButton.setMnemonic(KeyEvent.VK_M);
	    medianaButton.setActionCommand(mediana);
	    medianaButton.setSelected(true);
	    
	    familiarButton = new JRadioButton(familiar);
	    familiarButton.setMnemonic(KeyEvent.VK_F);
	    familiarButton.setActionCommand(familiar);
	    familiarButton.setSelected(true);
	    
	    ButtonGroup group =  new ButtonGroup();
	    
	    group.add(pequeñaButton);
	    group.add(medianaButton);
	    group.add(familiarButton);
	    
	    
	    add(pequeñaButton);
	    add(medianaButton);
	    add(familiarButton);
	}

	public JRadioButton getPequeñaButton() {
		return pequeñaButton;
	}

	public void setPequeñaButton(JRadioButton pequeñaButton) {
		this.pequeñaButton = pequeñaButton;
	}

	public JRadioButton getMedianaButton() {
		return medianaButton;
	}

	public void setMedianaButton(JRadioButton medianaButton) {
		this.medianaButton = medianaButton;
	}

	public JRadioButton getFamiliarButton() {
		return familiarButton;
	}

	public void setFamiliarButton(JRadioButton familiarButton) {
		this.familiarButton = familiarButton;
	}
}
