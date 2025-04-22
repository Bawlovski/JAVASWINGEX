import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonR extends JButton implements ActionListener{

	private static final long serialVersionUID = 1L;
	LunaPanel l;
	public BotonR (LunaPanel l) {
		this.l = l;
		ImageIcon img = new ImageIcon(BotonR.class.getResource("/luna/siguiente.png"));
		this.setIcon(img);
		this.setBorderPainted(false);
		this.setForeground(Color.black);
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n = l.nextnumber();
		l.setIcon(l.getLuna(n).getIMG());
		l.setText(l.getLuna(n).getFase());
	}
}
