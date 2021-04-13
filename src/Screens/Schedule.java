package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Schedule extends JFrame{
    JLabel pageLabel; // titulo da tela
    
    JComboBox dentistsButton; // botao para escolher qual dentista deve ser selecionado
    JLabel dentistsLabel;
    
    JLabel clientLabel1 = new JLabel("Carlos");
    JLabel dataLabel1 = new JLabel("20/10/15");
    JLabel timeLabel1 = new JLabel("14:00");
    
    JLabel clientLabel2 = new JLabel("Francisco");
    JLabel dataLabel2 = new JLabel("07/02/22");
    JLabel timeLabel2 = new JLabel("16:30");
    
    JLabel clientLabel3 = new JLabel("Paula");
    JLabel dataLabel3 = new JLabel("31/12/22");
    JLabel timeLabel3 = new JLabel("09:00");
    
    JButton editButton;
    JButton backButton;

    public Schedule() {
        ValidateSchedule handler = new ValidateSchedule();

        pageLabel = new JLabel("CONSULTAR AGENDA");
        pageLabel.setBounds(330, 40, 200, 20);
        add(pageLabel); // adiciona o pageLabel ao JFrame
        
        String[] dentists = {"Joao", "Maria", "Fernando", "Luis"};
        dentistsButton = new JComboBox(dentists);
        dentistsLabel = new JLabel("Dentistas");
        dentistsButton.setBounds(250, 100, 300, 20);
        dentistsButton.addActionListener(handler);
        add(dentistsButton);
        dentistsLabel.setToolTipText("Dentistas");
        dentistsLabel.setBounds(250, 80, 300, 20);
        add(dentistsLabel); // adiciona o dentistsLabel ao JFrame
        
        clientLabel1.setBounds(250, 140, 150, 20);
        dataLabel1.setBounds(495, 140, 100, 20);
        timeLabel1.setBounds(440, 140, 100, 20);
        
        clientLabel3.setBounds(250, 140, 150, 20);
        dataLabel3.setBounds(495, 140, 100, 20);
        timeLabel3.setBounds(440, 140, 100, 20);
        
        clientLabel2.setBounds(250, 140, 150, 20);
        dataLabel2.setBounds(495, 140, 100, 20);
        timeLabel2.setBounds(440, 140, 100, 20);
        
        editButton = new JButton("Editar");
        editButton.setBounds(400, 460, 150, 20);
        editButton.setFocusable(false);
        editButton.addActionListener(handler);
        add(editButton);
        
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
            if(event.getSource() == dentistsButton) {
                if(dentistsButton.getSelectedItem().equals("Luis")){
                    
                    add(clientLabel3);
                    add(dataLabel3);
                    add(timeLabel3);
                    
                    clientLabel1.setVisible(false);
                    dataLabel1.setVisible(false);
                    timeLabel1.setVisible(false);
                    
                    clientLabel2.setVisible(false);
                    dataLabel2.setVisible(false);
                    timeLabel2.setVisible(false);
                    
                    clientLabel3.setVisible(true);
                    dataLabel3.setVisible(true);
                    timeLabel3.setVisible(true);
                }
                if(dentistsButton.getSelectedItem().equals("Maria")){

                    add(clientLabel1);
                    add(dataLabel1);
                    add(timeLabel1);
                    
                    clientLabel1.setVisible(true);
                    dataLabel1.setVisible(true);
                    timeLabel1.setVisible(true);
                    
                    clientLabel3.setVisible(false);
                    dataLabel3.setVisible(false);
                    timeLabel3.setVisible(false);
                    
                    clientLabel2.setVisible(false);
                    dataLabel2.setVisible(false);
                    timeLabel2.setVisible(false);
                }
                if(dentistsButton.getSelectedItem().equals("Joao")){
                    
                    add(clientLabel2);
                    add(dataLabel2);
                    add(timeLabel2);
                    
                    clientLabel1.setVisible(false);
                    dataLabel1.setVisible(false);
                    timeLabel1.setVisible(false);
                    
                    clientLabel2.setVisible(true);
                    dataLabel2.setVisible(true);
                    timeLabel2.setVisible(true);
                    
                    clientLabel3.setVisible(false);
                    dataLabel3.setVisible(false);
                    timeLabel3.setVisible(false);
                }
            }
            if(event.getSource() == editButton) {
                pageLabel.setText("EDITAR");
            }
            if(event.getSource() == backButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
