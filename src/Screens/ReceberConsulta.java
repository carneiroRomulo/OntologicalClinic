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

public class ReceberConsulta extends JFrame {
    JLabel paginaLabel;
    
    JButton pagarButton;
    JButton voltarButton;

    Agendas agenda = new Agendas();
    List<String> consultas = new ArrayList<>();
    
    JLabel consultasLabel;
    JComboBox consultaButton;
    
    public ReceberConsulta(){
        ValidateConsulta handler = new ValidateConsulta();
        
        paginaLabel = new JLabel("RECEBER CONSULTA");
        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        consultaButton = new JComboBox(consultas.toArray());
        
        consultasLabel = new JLabel("Consultas Pendentes");
        consultaButton.setBounds(250, 100, 300, 20);
        consultaButton.addActionListener(handler);
        add(consultaButton);
        consultasLabel.setToolTipText("Consultas Pendentes");
        consultasLabel.setBounds(250, 80, 300, 20);
        add(consultasLabel); // adiciona o consultasLabel ao JFrame
        
        pagarButton = new JButton("Receber");
        pagarButton.setBounds(400, 460, 150, 20);
        pagarButton.setFocusable(false);
        pagarButton.addActionListener(handler);
        add(pagarButton);
        
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
    
    private class ValidateConsulta implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == pagarButton) {

                EditarAgenda editar = new EditarAgenda();
                dispose();
            }
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu();
                dispose();
            }
        }
    }
}
