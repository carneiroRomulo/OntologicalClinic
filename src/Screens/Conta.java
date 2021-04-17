package Screens;

import Program.Contas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Conta extends Contas{
    JFrame frame = new JFrame();
    JLabel paginaLabel = new JLabel("PAGAMENTO DE CONTAS");
    
    JLabel ValorLabel = new JLabel("VALOR"); // legenda que mostra o valor das contas
    JLabel DataVencimentoLabel = new JLabel("VENCIMENTO"); // legenda que mostra a data de vencimento das contas
    JLabel DataPagamentoLabel = new JLabel("PAGAMENTO"); // legenda que mostra a data de pagamento das contas
    JLabel ContaLabel = new JLabel("CONTA"); // legenda que mostra o nome das contas
    
    String nomeConta;
    String vencimentoConta;
    String pagamentoConta;
    double valorConta;
    
    List<Contas> contas = new ArrayList<>();
    
    JButton voltarButton = new JButton("Voltar");
    JButton editarButton = new JButton("Editar");

    public Conta() {
        paginaLabel.setBounds(320, 40, 200, 20);
        frame.add(paginaLabel); // adiciona o paginaLabel ao JFrame
        ContaLabel.setBounds(140, 100, 100, 20);
        frame.add(ContaLabel);
        DataVencimentoLabel.setBounds(290, 100, 100, 20);
        frame.add(DataVencimentoLabel);
        DataPagamentoLabel.setBounds(440, 100, 100, 20);
        frame.add(DataPagamentoLabel);
        ValorLabel.setBounds(590, 100, 100, 20);
        frame.add(ValorLabel);
        
//        for(String i : nomeConta) {
//            Contas aux = new Contas();
//            aux.setTipo(nomeConta);
//            aux.setDataPagamento(pagamentoConta);
//            aux.setDataVencimento(vencimentoConta);
//            aux.setValor(valorConta);
//            contas.add(aux);
//        }
//        
//        JList conta = new JList(contas); 
//        conta.setLayoutOrientation(JList.HORIZONTAL_WRAP);
//        conta.setVisibleRowCount(1);
//        conta.setFixedCellWidth(150);
//        conta.setBounds(140, 120, 550, 100);
//        frame.add(conta);
        
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

