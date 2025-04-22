import java.awt.Color;

import javax.swing.JSlider;

public class Slider extends JSlider{

	private static final long serialVersionUID = 1L;
	
	private LunaPanel l;
	
	static final int min = 0;
	static final int max = 7;
	static final int ini = 0;
	Slider (LunaPanel l) {
		
		super(min,max,ini);
		this.l = l;
		
		addChangeListener(e -> {
            JSlider source = (JSlider)e.getSource();
            
            int partition = source.getValue();
            l.setLuna(partition);
            
        });
		
		setBackground(Color.black);
		}

	
}
