import java.awt.Dimension;
import javax.swing.*;

public class Main extends JFrame {
    

	private static final long serialVersionUID = 1L;

	public Main() {
    	super("Banderas y Capitales del Mundo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(500, 500));
        
        // Create panels
        JTabbedPane tabbedPanel = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPanel.add(new AprenderPanel());
        tabbedPanel.add(new JPanel());
        
        // Set icon - simplified approach
        setTabIcon(tabbedPanel, 0, "capitales/ico/estudio.png");
        setTabIcon(tabbedPanel, 1, "capitales/ico/test.png");
        
        tabbedPanel.setPreferredSize(new Dimension(150, 500));
        add(tabbedPanel);
        pack();
    }
    
  
	


    
    // Simplified icon loading method
    private void setTabIcon(JTabbedPane pane, int index, String path) {
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(path));
        if (icon.getImage() != null) {
            pane.setIconAt(index, icon);
        } else {
            System.out.println("Icon not found: " + path);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}