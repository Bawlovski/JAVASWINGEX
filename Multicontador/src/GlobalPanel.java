import java.awt.BorderLayout;
import javax.swing.JPanel;

public class GlobalPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    private GlobalButton reset;
    private GlobalNumber number;
    
    public GlobalPanel() {
        // Key fix: Set the layout manager explicitly
        setLayout(new BorderLayout());
        
        // Add components
        add(reset = new GlobalButton(), BorderLayout.NORTH);
        add(number = new GlobalNumber(), BorderLayout.SOUTH);
        
        
    }

	public GlobalButton getReset() {
		return reset;
	}

	public void setReset(GlobalButton reset) {
		this.reset = reset;
	}

	public GlobalNumber getNumber() {
		return number;
	}

	public void setNumber(GlobalNumber number) {
		this.number = number;
	}
    
    

}