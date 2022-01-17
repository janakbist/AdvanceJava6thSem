package np.edu.scst;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;

public class DifferentShapes extends JFrame{
    DifferentShapes() {
        JPanel jp = new JPanel() {
           
            public void paint(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                Color c = new Color(0,0,0);
                g2.setPaint(c.red);
                
                g2.drawLine(10, 10, 10, 40);
                           // (x-axis,y-axis,width,height)  
                g2.drawRect(50, 50, 50, 50);
                g2.draw3DRect(200, 200, 200, 200, true);
                int[] x ={200,400,800};
                int[] y ={200,500,300};
                // (x-axis,y-axis,no.of sides)

                g2.drawPolygon(x,y,3);
                //(x-axis,y-axis,width,height)
                g2.drawOval(200, 300, 50,60);
                //          x  x  x
                int[] a = {20,20,40};
                //          y  y  y
                int[] b = {10,30,30};
                g2.fillPolygon( a,b , 3);
                
           
            }
            
        };
        add(jp);
        setVisible(true);
        setSize(450,450);
        setTitle("2D Objects");
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        DifferentShapes ds = new DifferentShapes();
    }
    
}
