import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private GlobalPanel x = new GlobalPanel();
    
    Main() {
        super("Multicontador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        // Add components without constraints
        p.add(new NormalPanel(Color.green));
        p.add(new NormalPanel(Color.blue));
        p.add(new NormalPanel(Color.yellow));
        
        add(x, BorderLayout.NORTH);
        add(p, BorderLayout.SOUTH);
        
        pack();
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}