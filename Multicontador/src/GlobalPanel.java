import java.awt.BorderLayout;
import javax.swing.JPanel;

public class GlobalPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public GlobalPanel() {
        // Key fix: Set the layout manager explicitly
        setLayout(new BorderLayout());
        
        // Add components
        add(new GlobalButton(), BorderLayout.NORTH);
        add(new GlobalNumber(), BorderLayout.SOUTH);
    }
}