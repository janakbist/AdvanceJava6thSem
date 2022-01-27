package np.edu.scst;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane; 
import javax.swing.*;


public class Hello extends JFrame{
    
   public  Hello() {
       
       String[] header = {"Name","Class","Age"};
       String[][] body = {{"Ram","7","12"},{"Hari","7","15"}};
       JTable tbl = new JTable(body,header);
       JScrollPane jsp = new JScrollPane(tbl);
       add(jsp);
       
       JPanel jp = new JPanel(); 
       jp.setBackground(Color.green);
       add(jp);
       
       
       JLabel jl = new JLabel("Full Name : ");
       add(jl);
       JTextField jtf =new JTextField("Enter your Name",20);
       add(jtf);
            
       JLabel jl2 = new JLabel("Description");
       add(jl2);
       JTextArea jta = new JTextArea(5,20);
       add(jta);
       
       JLabel jl3 = new JLabel("Gender : ");
       add(jl3);
       JRadioButton male = new JRadioButton("Male");
       JRadioButton female = new JRadioButton("Female");
       JRadioButton others = new JRadioButton();
       others.setText("others");
       ButtonGroup btngrp = new ButtonGroup();
       btngrp.add(male);
       btngrp.add(female);
       btngrp.add(others);
       
       add(male);
       add(female);
       add(others);
       
       
       JLabel jl1 = new JLabel("Password\n\t");
       add(jl1);
       JPasswordField jpf = new JPasswordField(10);
       add(jpf);
       
       String[] country = {"Nepal","India","China","Srilanka","Bangladesh"};
       JComboBox jcb = new JComboBox();
       jcb.setModel(new DefaultComboBoxModel(country));
       add(jcb);
       
       
       JButton jb = new JButton("Submit");
       add(jb);
       
       setLayout(new FlowLayout());
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
       setTitle("GUI Programming");
    }
    public static void main(String[] args) {
        
        Hello h = new Hello();
        system.out.println("Basic java swing important components added");
    }
    
}
