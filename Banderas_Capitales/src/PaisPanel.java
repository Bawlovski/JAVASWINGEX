import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PaisPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public PaisPanel(String country, String countryCode, String capital) {
        // Use BorderLayout for main panel
        setLayout(new BorderLayout(10, 0));
        
        // Load flag image
        ImageIcon flagIcon = new ImageIcon(getClass().getClassLoader().getResource("capitales/img/banderas/"+countryCode+".png"));
        JLabel flagLabel = new JLabel(flagIcon);
        flagLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Create panel for text (country and capital)
        JPanel textPanel = new JPanel(new GridLayout(2, 1));
        
        // Country label (uppercase)
        JLabel countryLabel = new JLabel(country.toUpperCase());
        countryLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        // Capital label (uppercase)
        JLabel capitalLabel = new JLabel(capital.toUpperCase());
        capitalLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        // Add components to text panel
        textPanel.add(countryLabel);
        textPanel.add(capitalLabel);
        
        // Add components to main panel
        add(flagLabel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
        
        // Add some padding
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
}