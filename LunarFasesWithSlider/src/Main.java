import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main () {
		
		
		super("Fases de la luna");
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		LunaPanel l = new LunaPanel();
		Slider s =  new Slider(l);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		getContentPane().setBackground(Color.black);
		
		
		add(l,BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		panel.add(panel1,BorderLayout.NORTH);
		panel1.add(s);
		panel.setBackground(Color.black);
		panel1.setBackground(Color.black);
		
		setAlwaysOnTop(true);
		setResizable(false);
		
		pack();
		setSize(new Dimension(400,400));
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));

	}
}
