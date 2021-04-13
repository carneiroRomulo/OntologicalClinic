package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Consulta extends JFrame{
    JLabel paginaLabel = new JLabel("MARCAR CONSULTA");
    JButton voltarButton = new JButton("Voltar");

    public Consulta() {
        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o pagina ao JFrame
        
        ValidarConsulta handler = new ValidarConsulta();
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
   
    private class ValidarConsulta implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
