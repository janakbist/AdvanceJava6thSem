package np.edu.scst;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.*;

public class Fonts extends JFrame{
    Fonts() {
        //1.make a components
        JButton serif =  new JButton("Serif");
        JButton sansSerif =  new JButton("SansSerif");
        JButton dialog =  new JButton("Dialog");
        JButton dialogInput =  new JButton("DialogInput");
        JButton monospace =  new JButton("Monospace");
        
        //2.make object of fonts
         Font serifFont = new Font(Font.SERIF,Font.BOLD|Font.ITALIC,12);
         Font sansSerifFont = new Font(Font.SANS_SERIF,Font.BOLD|Font.ITALIC,12);
         Font dialogFont = new Font(Font.DIALOG,Font.BOLD|Font.ITALIC,12);
         Font dialogInputFont = new Font(Font.DIALOG_INPUT,Font.BOLD|Font.ITALIC,12);
         Font monospaceFont = new Font(Font.MONOSPACED,Font.BOLD|Font.ITALIC,12);

         //3.add fonts in button
         serif.setFont(serifFont);
         sansSerif.setFont(sansSerifFont);
          dialog .setFont(dialogFont);
         dialogInput.setFont(dialogInputFont);
         monospace.setFont(monospaceFont);
         
         //4.add button on Jframe         
         add(serif); add(sansSerif);add(dialog);add(dialogInput);add(monospace);

        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setTitle("Fonts ");
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        Fonts f = new Fonts();
    }
    
}
