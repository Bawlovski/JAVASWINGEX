import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class NormalPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NormalPanel(Color r) {
		
		setLayout(new BorderLayout());
		
		setBackground(r);
		
		add(new NormalReset(r),BorderLayout.NORTH);
		add(new NormalNumber(),BorderLayout.CENTER);
		add(new NormalAdd(r),BorderLayout.SOUTH);
	}
}
