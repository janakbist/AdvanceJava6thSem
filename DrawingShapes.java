package np.edu.scst;
import java.awt.*;
import javax.swing.*;

public class DrawingShapes extends JFrame{
    DrawingShapes() {
        
        //anynomous inner class
        JPanel jp = new JPanel() {
            @Override
            public void paint(Graphics g) {
                //Color c = new Color(255,0,0);
                
                Graphics2D g2 = (Graphics2D)g; //typecaste
                //           x1    y1        x2   y2
              //  g2.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
               // g2.drawLine(20,20,50,50);
               g2.setPaint(Color.red);
               
                g2.drawRect(50, 10, 50, 40);
                g2.drawRect(20,20,20,20);
                g2.drawOval(10,70,50,30);
                g2.drawOval(70,70,50,50);
                g2.drawArc(100, 100, 200, 200, 0, 90);
                int[] x ={200,400,800};
                int[] y ={200,500,300};
                //3 is no of points
                g2.fillPolygon(x,y,3);
            }
            
        };
        add(jp);
        setVisible(true);
        setSize(450,450);
        setTitle("Drawing Shapes");
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        DrawingShapes ds = new DrawingShapes();        
    }
    
}
