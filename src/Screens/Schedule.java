package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Schedule extends JFrame{
    JLabel pageLabel;
    JComboBox dentistsButton;
    JLabel dentistsLabel;
    JButton backButton;

    public Schedule() {
        pageLabel = new JLabel("CONSULTAR AGENDA");
        pageLabel.setBounds(330, 40, 200, 20);
        add(pageLabel); // adiciona o pageLabel ao JFrame
        
        String[] dentists = {"Joao", "Maria", "Fernando", "Luis"};
        dentistsButton = new JComboBox(dentists);
        dentistsLabel = new JLabel("Dentistas");
        dentistsButton.setBounds(250, 100, 300, 20);
        add(dentistsButton);
        dentistsLabel.setToolTipText("Dentistas");
        dentistsLabel.setBounds(250, 80, 300, 20);
        add(dentistsLabel); // adiciona o dentistsLabel ao JFrame
        
        
        ValidateSchedule handler = new ValidateSchedule();
        backButton = new JButton("Voltar");
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
   
    private class ValidateSchedule implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == backButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
