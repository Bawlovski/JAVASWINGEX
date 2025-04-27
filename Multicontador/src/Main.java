import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private GlobalPanel x = new GlobalPanel();
    private NormalPanel p1;
    private NormalPanel p2;
    private NormalPanel p3;
    
    Main() {
        super("Multicontador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        // Add components without constraints
        p.add(p1 = new NormalPanel(Color.green, x.getNumber()));
        p.add(p2 = new NormalPanel(Color.blue,x.getNumber()));
        p.add(p3 = new NormalPanel(Color.yellow,x.getNumber()));
        
        add(x, BorderLayout.NORTH);
        add(p, BorderLayout.SOUTH);
        
        pack();
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }

	public NormalPanel getP1() {
		return p1;
	}

	public void setP1(NormalPanel p1) {
		this.p1 = p1;
	}

	public NormalPanel getP2() {
		return p2;
	}

	public void setP2(NormalPanel p2) {
		this.p2 = p2;
	}

	public NormalPanel getP3() {
		return p3; 
	}

	public void setP3(NormalPanel p3) {
		this.p3 = p3;
	}
    
    
}