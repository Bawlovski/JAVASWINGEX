import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class NormalPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private GlobalNumber globalnum;
	private NormalNumber number =  new NormalNumber();
	private NormalAdd adder ;
	
	public NormalPanel(Color a,GlobalNumber x) {
		this.globalnum = x;
		NormalReset reset =  new NormalReset(a, this);
		adder = new NormalAdd(a, this);
		
		
		setLayout(new BorderLayout());
		
		setBackground(a);
		
		add(reset,BorderLayout.NORTH);
		add(number,BorderLayout.CENTER);
		add(adder,BorderLayout.SOUTH);
		
	}
	
	public NormalNumber getNumber() {
		return number;
	}
	
	public NormalAdd getNumberAdd() {
		return adder;
	}

	public GlobalNumber getGlobalnum() {
		return globalnum;
	}

	public void setGlobalnum(GlobalNumber globalnum) {
		this.globalnum = globalnum;
	}
	
	
}
