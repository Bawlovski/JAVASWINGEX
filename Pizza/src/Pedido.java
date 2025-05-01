import java.awt.Font;

import javax.swing.JTextArea;

public class Pedido extends JTextArea{

	private static final long serialVersionUID = 1L;

	public Pedido () {
		super();
		setFont(new Font("Serif", Font.ITALIC, 16));
		setLineWrap(true);
		setWrapStyleWord(true);
	}
}
