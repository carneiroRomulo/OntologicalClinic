package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Contas extends JFrame{
    JLabel paginaLabel = new JLabel("PAGAMENTO DE CONTAS");
    JButton voltar = new JButton("Voltar");

    public Contas() {
        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        ValidarPagamento handler = new ValidarPagamento();
        voltar.setBounds(250, 460, 150, 20);
        voltar.setFocusable(false);
        voltar.addActionListener(handler);
        add(voltar);
        
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajusta o tamanho da tela
        setLayout(null);
        setVisible(true); // mostra a tela
    }
    
    private class ValidarPagamento implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == voltar) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
   
}

