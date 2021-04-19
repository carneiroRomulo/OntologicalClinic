package Screens;

import Program.Agendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
    
    JButton editarButton;
    JButton voltarButton;
    
    Agendas agenda = new Agendas();
    List<String> dentistas = new ArrayList<>();
    List<String> clientes = new ArrayList<>();

    public Agenda() {
        ValidateSchedule handler = new ValidateSchedule();
        
        paginaLabel = new JLabel("CONSULTAR AGENDA");
        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        agenda.lerDentistas(dentistas);
        dentistasButton = new JComboBox(dentistas.toArray());
        
        dentistasLabel = new JLabel("Dentistas");
        dentistasButton.setBounds(250, 100, 300, 20);
        dentistasButton.addActionListener(handler);
        add(dentistasButton);
        dentistasLabel.setToolTipText("Dentistas");
        dentistasLabel.setBounds(250, 80, 300, 20);
        add(dentistasLabel); // adiciona o dentistasLabel ao JFrame
        
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

    Agenda(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private class ValidateSchedule implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == dentistasButton) {
                if(dentistasButton.getSelectedItem().equals("Maria")){

                    add(clienteLabel1);
                    add(dataLabel1);
                    add(horarioLabel1);
                    
                    clienteLabel1.setVisible(true);
                    dataLabel1.setVisible(true);
                    horarioLabel1.setVisible(true);
                }
            }
            if(event.getSource() == editarButton) {
                if(dentistasButton.getSelectedItem() == "") {
                    paginaLabel.setText("Selecione um dentista");
                }
                else {
                    EditarAgenda editar = new EditarAgenda(dentistasButton.getSelectedItem().toString());
                    dispose();
                }
            }
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu();
                dispose();
            }
        }
    }
}
