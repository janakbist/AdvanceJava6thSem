package np.edu.scst;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hello extends JFrame{
    
   public  Hello() {
       JPanel jp = new JPanel(); 
       jp.setBackground(Color.red);
       add(jp);
       
       
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
       setTitle("Hello");
    }
    public static void main(String[] args) {
        
        Hello h = new Hello();
    }
    
}
