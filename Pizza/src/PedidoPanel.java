import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PedidoPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private String local = "local";
	private String recoger = "recoger";
	
	private Masa m;
	private Pedido pedido;
	private Ingredientes i;
	private Tamaño t;
	
	private JRadioButton recogerButton;
	private JRadioButton localButton;
	public PedidoPanel (Masa m,Pedido pedido, Ingredientes i, Tamaño t) {
		this.m = m;
		this.pedido = pedido;
		this.i = i;
		this.t = t;
		
		FlowLayout f =  new FlowLayout();
		GridLayout layout =  new GridLayout(0,1);
		setLayout(f);
		
		JPanel p =  new JPanel();
		p.setLayout(layout);
		
		JButton submit =  new JButton("REALIZAR PEDIDO");
		
		localButton = new JRadioButton(local);
		localButton.setMnemonic(KeyEvent.VK_L);
		localButton.setActionCommand(local);
		localButton.setSelected(true);
	    
		recogerButton = new JRadioButton(recoger);	
	    recogerButton.setMnemonic(KeyEvent.VK_R);
	    recogerButton.setActionCommand(recoger);
	    recogerButton.setSelected(true);
	    

	    
	    ButtonGroup group =  new ButtonGroup();
	    
	    group.add(localButton);
	    group.add(recogerButton);
	    
	    
	    p.add(localButton);
	    p.add(recogerButton);
	    
	    add(p);
	    add(submit);
	    
	    
	    
	    submit.addActionListener(e -> {
	    	pedido.setText("");
	    	StringBuilder masa = new StringBuilder("Masa: ");
	    	StringBuilder tamaño = new StringBuilder("Tamaño: ");
	    	StringBuilder ingredientes = new StringBuilder("Ingredientes: ");
	    	StringBuilder recogida = new StringBuilder("\nTipo de pedido: ");
	    	
	    	
	    	if(t.getPequeñaButton().isSelected()) {
	    		tamaño.append("pequeña").append("\n");
	    		pedido.append(tamaño.toString());
	    	}
	    	
	    	if(t.getMedianaButton().isSelected()) {
	    		tamaño.append("mediana").append("\n");
	    		pedido.append(tamaño.toString());
	    	}
	    	
	    	if(t.getFamiliarButton().isSelected()) {
	    		tamaño.append("familiar").append("\n");
	    		pedido.append(tamaño.toString());
	    	}
	    	
	    	
	    	if(m.getFinaButton().isSelected()) {
	    		masa.append("fina").append("\n");
	    		pedido.append(masa.toString());
	    	}
	    	if(m.getGruesaButton().isSelected()) {
	    		masa.append("gruesa").append("\n");
	    		pedido.append(masa.toString());
	    	}
	    	
	    	
	    	if(i.getPepperoni().isSelected()) {
	    		ingredientes.append("peperroni ");
	    	}
	    	if(i.getChampiñones().isSelected()) {
	    		ingredientes.append("champiñones ");
	    	}
	    	if(i.getAnchoas().isSelected()) {
	    		ingredientes.append("anchoas ");
	    	}
	    	if(i.getCebolla().isSelected()) {
	    		ingredientes.append("cebolla ");
	    	}
	    	if(i.getPiña().isSelected()) {
	    		ingredientes.append("piña ");
	    	}
	    	if(i.getPimientos().isSelected()) {
	    		ingredientes.append("pimientos ");
	    	}
	    	pedido.append(ingredientes.toString());
	    	
	    	if(localButton.isSelected()) {
	    		recogida.append("local ");
	    	}
	    	if(recogerButton.isSelected()) {
	    		recogida.append("recoger ");
	    	}
	    	pedido.append(recogida.toString());
	    	
	    	
	    	if(!i.getPepperoni().isSelected() && !i.getChampiñones().isSelected() && !i.getAnchoas().isSelected() && !i.getCebolla().isSelected() && !i.getPiña().isSelected() && !i.getPimientos().isSelected() ) {
	    		pedido.setText("");
	    		JOptionPane.showMessageDialog(PedidoPanel.this, "No has selecionado ningun ingrediente");
	    		
	    	}
	    } );
	}
}
