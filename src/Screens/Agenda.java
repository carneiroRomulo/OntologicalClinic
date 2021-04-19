package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Agenda extends JFrame{
    JLabel paginaLabel; // titulo da tela
    
    JComboBox dentistasButton; // botao para escolher qual dentista deve ser selecionado
    JLabel dentistasLabel;
    
    JLabel clienteLabel1 = new JLabel("Carlos");
    JLabel dataLabel1 = new JLabel("20/10/15");
    JLabel horarioLabel1 = new JLabel("14:00");
    
    JLabel clienteLabel2 = new JLabel("Francisco");
    JLabel dataLabel2 = new JLabel("07/02/22");
    JLabel tempoLabel2 = new JLabel("16:30");
    
    JLabel clientLabel3 = new JLabel("Paula");
    JLabel dataLabel3 = new JLabel("31/12/22");
    JLabel timeLabel3 = new JLabel("09:00");
    
    JButton editarButton;
    JButton voltarButton;

    public Agenda() {
        ValidateSchedule handler = new ValidateSchedule();

        paginaLabel = new JLabel("CONSULTAR AGENDA");
        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        String[] dentists = {"", "Joao", "Maria", "Fernando", "Luis"};
        dentistasButton = new JComboBox(dentists);
        dentistasLabel = new JLabel("Dentistas");
        dentistasButton.setBounds(250, 100, 300, 20);
        dentistasButton.addActionListener(handler);
        add(dentistasButton);
        dentistasLabel.setToolTipText("Dentistas");
        dentistasLabel.setBounds(250, 80, 300, 20);
        add(dentistasLabel); // adiciona o dentistasLabel ao JFrame
        
        clienteLabel1.setBounds(250, 140, 150, 20);
        dataLabel1.setBounds(495, 140, 100, 20);
        horarioLabel1.setBounds(440, 140, 100, 20);
        
        clientLabel3.setBounds(250, 140, 150, 20);
        dataLabel3.setBounds(495, 140, 100, 20);
        timeLabel3.setBounds(440, 140, 100, 20);
        
        clienteLabel2.setBounds(250, 140, 150, 20);
        dataLabel2.setBounds(495, 140, 100, 20);
        tempoLabel2.setBounds(440, 140, 100, 20);
        
        editarButton = new JButton("Editar");
        editarButton.setBounds(400, 460, 150, 20);
        editarButton.setFocusable(false);
        editarButton.addActionListener(handler);
        add(editarButton);
        
        voltarButton = new JButton("Voltar");
        voltarButton.setBounds(250, 460, 150, 20);
        voltarButton.setFocusable(false);
        voltarButton.addActionListener(handler);
        add(voltarButton);
        
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
            if(event.getSource() == dentistasButton) {
                if(dentistasButton.getSelectedItem().equals("Luis")){
                    
                    add(clientLabel3);
                    add(dataLabel3);
                    add(timeLabel3);
                    
                    clienteLabel1.setVisible(false);
                    dataLabel1.setVisible(false);
                    horarioLabel1.setVisible(false);
                    
                    clienteLabel2.setVisible(false);
                    dataLabel2.setVisible(false);
                    tempoLabel2.setVisible(false);
                    
                    clientLabel3.setVisible(true);
                    dataLabel3.setVisible(true);
                    timeLabel3.setVisible(true);
                }
                else if(dentistasButton.getSelectedItem().equals("Maria")){

                    add(clienteLabel1);
                    add(dataLabel1);
                    add(horarioLabel1);
                    
                    clienteLabel1.setVisible(true);
                    dataLabel1.setVisible(true);
                    horarioLabel1.setVisible(true);
                    
                    clientLabel3.setVisible(false);
                    dataLabel3.setVisible(false);
                    timeLabel3.setVisible(false);
                    
                    clienteLabel2.setVisible(false);
                    dataLabel2.setVisible(false);
                    tempoLabel2.setVisible(false);
                }
                else if(dentistasButton.getSelectedItem().equals("Joao")){
                    
                    add(clienteLabel2);
                    add(dataLabel2);
                    add(tempoLabel2);
                    
                    clienteLabel1.setVisible(false);
                    dataLabel1.setVisible(false);
                    horarioLabel1.setVisible(false);
                    
                    clienteLabel2.setVisible(true);
                    dataLabel2.setVisible(true);
                    tempoLabel2.setVisible(true);
                    
                    clientLabel3.setVisible(false);
                    dataLabel3.setVisible(false);
                    timeLabel3.setVisible(false);
                }
                else {
                    clienteLabel1.setVisible(false);
                    dataLabel1.setVisible(false);
                    horarioLabel1.setVisible(false);
                    
                    clienteLabel2.setVisible(false);
                    dataLabel2.setVisible(false);
                    tempoLabel2.setVisible(false);
                    
                    clientLabel3.setVisible(false);
                    dataLabel3.setVisible(false);
                    timeLabel3.setVisible(false);
                }
            }
            if(event.getSource() == editarButton) {
                if(dentistasButton.getSelectedItem() == "") {
                    paginaLabel.setText("Selecione um dentista");
                }
                else {
                    dentistasButton.getSelectedItem();
                }
            }
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu();
                dispose();
            }
        }
    }
}
