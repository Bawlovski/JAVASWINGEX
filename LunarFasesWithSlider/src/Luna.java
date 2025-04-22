import javax.swing.ImageIcon;

public class Luna {
	private String fase;
	private ImageIcon IMG;
	
	Luna(String fase){
		this.fase =  fase;
		this.IMG = getImageIcon(fase);
	}
	
	public String getFase() {
		return this.fase;
	}
	
	public ImageIcon getIMG() {
		return this.IMG;
	}
	
	

	private ImageIcon getImageIcon(String fase) {
		return new ImageIcon(Luna.class.getResource("/luna/"+fase+".png"));
	}
}
