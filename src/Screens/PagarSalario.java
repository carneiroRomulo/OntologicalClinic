package Screens;

import Program.Contas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PagarSalario extends Contas{
    JFrame frame = new JFrame();
    JLabel paginaLabel = new JLabel("PAGAR SALÁRIO");
    
    JLabel NomeLabel = new JLabel("NOME"); // legenda que mostra o nome dos funcionarios
    JLabel ValorLabel = new JLabel("SALÁRIO"); // legenda que mostra o salario dos funcionarios
    JLabel CargoLabel = new JLabel("CARGO"); // legenda que mostra o cargo dos funcionarios
    
    String nomeConta;
    String vencimentoConta;
    String pagamentoConta;
    double valorConta;
    
    List<Contas> contas = new ArrayList<>();
    
    JButton voltarButton = new JButton("Voltar");
    JButton editarButton = new JButton("Editar");

    public PagarSalario() {
        paginaLabel.setBounds(345, 40, 300, 20);
        frame.add(paginaLabel); // adiciona o paginaLabel ao JFrame
        NomeLabel.setBounds(140, 100, 100, 20);
        frame.add(NomeLabel);
        CargoLabel.setBounds(290, 100, 100, 20);
        frame.add(CargoLabel);
        ValorLabel.setBounds(440, 100, 100, 20);
        frame.add(ValorLabel);
        
        ValidarPagamento handler = new ValidarPagamento();
        voltarButton.setBounds(250, 460, 150, 20);
        voltarButton.setFocusable(false);
        voltarButton.addActionListener(handler);
        frame.add(voltarButton);
        
        editarButton.setBounds(400, 460, 150, 20);
        editarButton.setFocusable(false);
        editarButton.addActionListener(handler);
        frame.add(editarButton);
        
        frame.setTitle("CLINICA CURRAL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600); // ajusta o tamanho da tela
        frame.setLayout(null);
        frame.setVisible(true); // mostra a tela
    }
    
    private class ValidarPagamento implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu("admin");
                frame.dispose();
            }
        }
    }
   
}

