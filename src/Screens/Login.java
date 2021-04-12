package Screens;
import Program.Clinica;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Login extends JFrame{

    public Login(){
        Clinica clinica = new Clinica();
        ImageIcon image = new ImageIcon("flamengo.png");

        JLabel label = new JLabel(); // create a label
        label.setText("UFOP"); // set text of label
        label.setVerticalAlignment(JLabel.TOP); // change y-position relative to the image
        label.setHorizontalAlignment(JLabel.CENTER); // change x-position relative to the image
        label.setForeground(new Color(38, 38, 38)); // change font color of text
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20)); // set font of text
        label.setBackground(Color.yellow);
        label.setOpaque(false);
        
        this.setTitle(clinica.getNomeEmpresa()); // set the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from being resized
        this.setSize(800,600); //sets the x-dimesion and y-dimesion of frame
        this.setVisible(true); // make frame visible
        
        this.getContentPane().setBackground(new Color(240, 240, 247)); // change background color
        


        this.add(label);
        
       
        
    }
}
