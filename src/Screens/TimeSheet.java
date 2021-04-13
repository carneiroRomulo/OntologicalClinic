package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeSheet extends JFrame{
    JLabel pageLabel = new JLabel("FOLHA DE PONTO");
    
    JButton backButton = new JButton("Voltar");

    public TimeSheet() {
        pageLabel.setBounds(250, 40, 200, 20);
        add(pageLabel); // adiciona o pageLabel ao JFrame
        
        
        ValidateTimeSheet handler = new ValidateTimeSheet();
        backButton.setBounds(250, 460, 150, 20);
        backButton.setFocusable(false);
        backButton.addActionListener(handler);
        add(backButton);
        
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajust the size of the frame
        setLayout(null);
        setVisible(true); // show the frame
    }
 
    private class ValidateTimeSheet implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == backButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
