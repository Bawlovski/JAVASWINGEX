import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private Tamaño t;
    private Ingredientes i;
    private Masa m;
    private PedidoPanel p;
    private Pedido pedido;
    
    public Main() {
        super("PizzaDAM");
        
        // Initialize Pedido first
        pedido = new Pedido();
        
        GridLayout g = new GridLayout(0,2);
        GridLayout f = new GridLayout(0,1);
        
        setLayout(g);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel();
        p1.setLayout(f);
        JPanel p2 = new JPanel();
        p2.setLayout(f);
        
        p1.add(t = new Tamaño());
        t.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.black), "Tamaño"));
        
        p1.add(m = new Masa());
        m.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.black), "Masa"));

        add(p1);
        
        p2.add(i = new Ingredientes());
        i.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.black), "Ingredientes"));
        
        // Now create PedidoPanel with the initialized pedido
        p2.add(p = new PedidoPanel(m, pedido,i,t));

        add(p2);
        
        pedido.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.black), "Pedido"));
        add(pedido);
        
        pack();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}