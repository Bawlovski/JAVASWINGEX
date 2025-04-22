import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonL extends JButton implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	LunaPanel l;
	public BotonL (LunaPanel l) {
		this.l = l;
		ImageIcon img = new ImageIcon(BotonR.class.getResource("/luna/anterior.png"));
		this.setIcon(img);
		this.setBorderPainted(false);
		this.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n = l.backnumber();
		l.setIcon(l.getLuna(n).getIMG());
		l.setText(l.getLuna(n).getFase());
	}
}
