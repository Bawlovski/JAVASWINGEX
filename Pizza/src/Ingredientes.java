import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ingredientes extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JCheckBox pepperoni;
	private JCheckBox champiñones;
	private JCheckBox anchoas;
	private JCheckBox cebolla;
	private JCheckBox piña;
	private JCheckBox pimientos;
	
	
	
	
    public Ingredientes() {
    	
    	GridLayout g =  new GridLayout(0,3);
    	setLayout(g);
    	
    	pepperoni =  new JCheckBox("pepperoni");
    	pepperoni.setMnemonic(KeyEvent.VK_O);
    	pepperoni.setSelected(false);
    	
    	champiñones =  new JCheckBox("champiñones");
    	champiñones.setMnemonic(KeyEvent.VK_C);
    	champiñones.setSelected(false);
    	
    	anchoas =  new JCheckBox("anchoas");
    	anchoas.setMnemonic(KeyEvent.VK_A);
    	anchoas.setSelected(false);
    	
    	cebolla =  new JCheckBox("cebolla");
    	cebolla.setMnemonic(KeyEvent.VK_B);
    	cebolla.setSelected(false);
    	
    	piña =  new JCheckBox("piña");
    	piña.setMnemonic(KeyEvent.VK_I);
    	piña.setSelected(false);
    	
    	pimientos =  new JCheckBox("pimientos");
    	pimientos.setMnemonic(KeyEvent.VK_T);
    	pimientos.setSelected(false);
    	
    	add(pepperoni);
    	add(champiñones);
    	add(anchoas);
    	add(cebolla);
    	add(piña);
    	add(pimientos);
    }




	public JCheckBox getPepperoni() {
		return pepperoni;
	}




	public void setPepperoni(JCheckBox pepperoni) {
		this.pepperoni = pepperoni;
	}




	public JCheckBox getChampiñones() {
		return champiñones;
	}




	public void setChampiñones(JCheckBox champiñones) {
		this.champiñones = champiñones;
	}




	public JCheckBox getAnchoas() {
		return anchoas;
	}




	public void setAnchoas(JCheckBox anchoas) {
		this.anchoas = anchoas;
	}




	public JCheckBox getCebolla() {
		return cebolla;
	}




	public void setCebolla(JCheckBox cebolla) {
		this.cebolla = cebolla;
	}




	public JCheckBox getPiña() {
		return piña;
	}




	public void setPiña(JCheckBox piña) {
		this.piña = piña;
	}




	public JCheckBox getPimientos() {
		return pimientos;
	}




	public void setPimientos(JCheckBox pimientos) {
		this.pimientos = pimientos;
	}
}
