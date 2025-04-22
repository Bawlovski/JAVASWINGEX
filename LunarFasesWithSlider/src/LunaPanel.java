import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LunaPanel extends JButton implements ActionListener{


	private static final long serialVersionUID = 1L;
	
	private static  Luna [] LUNAS = new Luna[8];
	
	private volatile boolean isAnimating = false;
	private volatile boolean stopAnimation = false;
	
	private int n = 0;

	static {
		LUNAS[0] = new Luna("Luna Nueva");
		LUNAS[1] = new Luna("Luna Creciente");
		LUNAS[2] = new Luna("Cuarto Creciente");
		LUNAS[3] = new Luna("Quinto Octante");
		LUNAS[4] = new Luna("Luna Llena");
		LUNAS[5] = new Luna("Tercer Octante");
		LUNAS[6] = new Luna("Cuarto Menguante");
		LUNAS[7] = new Luna("Luna Menguante");
	}
	
	public LunaPanel() {
		
        this.setText(LUNAS[n].getFase());  
        this.setIcon(LUNAS[n].getIMG());   
        
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.BOTTOM);
        
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
        this.setOpaque(false);
        this.setForeground(Color.white);
        this.addActionListener(this);
	}
	
	public int nextnumber() {
		if(this.n >= 7 ) {
			this.n = 0;
			return this.n;
		}
		else {
			this.n++;
		}
		return n;
		
	}
	
	public int backnumber() {
		if(this.n <= 0) {
			this.n = 7;
			return this.n;
		}
		else {
			this.n--;
		}
		return n;
		
	}
	
	public void setLuna(int n) {
		this.setIcon(LUNAS[n].getIMG());
		this.setText(LUNAS[n].getFase());
	}
	
	public Luna getLuna(int n) {
		return this.LUNAS[n];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// If animation is running, stop it
	    if (isAnimating) {
	        stopAnimation = true;
	        return;
	    }
	    
	    // Start new animation
	    isAnimating = true;
	    stopAnimation = false;
	    
	    new Thread(() -> {
	        while (!stopAnimation) {
	            try {
	                // Update moon phase
	                SwingUtilities.invokeLater(() -> {
	                    this.n = nextnumber();
	                    setIcon(getLuna(n).getIMG());
	                    setText(getLuna(n).getFase());
	                });
	                
	                // Wait 500ms
	                Thread.sleep(500);
	                
	            } catch (InterruptedException ex) {
	                Thread.currentThread().interrupt();
	                break;
	            }
	        }
	        isAnimating = false;
	    }).start();		
		
	}
	
	public static void sleep(long milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt(); 
	        System.err.println("Sleep was interrupted");
	    }
	}

	
	
	
	
}
