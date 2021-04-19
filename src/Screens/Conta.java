package Screens;

import Program.Contas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Conta extends Contas{
    JFrame frame = new JFrame();
    JLabel paginaLabel = new JLabel("PAGAMENTO DE CONTAS");
    
    JLabel tipoLabel = new JLabel("CONTA"); // legenda que mostra o nome das contas
    JTextField tipoTextField = new JTextField();

    JLabel dataLabel = new JLabel("DATA"); // legenda que mostra a data de vencimento das contas
    JTextField dataTextField = new JTextField();
    
    JLabel valorLabel = new JLabel("VALOR"); // legenda que mostra o valor das contas
    JTextField valorTextField = new JTextField();
    
    JButton voltarButton = new JButton("Voltar"); // volta para o menu
    JButton pagarButton = new JButton("Pagar"); // arquiva a conta paga
    
    JTable tabela;
    public Conta() {
        paginaLabel.setBounds(320, 40, 200, 20);
        frame.add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        tipoLabel.setBounds(200, 100, 150, 20);
        tipoLabel.setToolTipText("Somente dígitos A-Z e tamanho maior que 0 e menor que 20");
        frame.add(tipoLabel);
        tipoTextField.setBounds(200, 120, 150, 20);
        frame.add(tipoTextField);
        valorLabel.setBounds(360, 100, 100, 20);
        valorLabel.setToolTipText("Formato ###.##");
        frame.add(valorLabel);
        valorTextField.setBounds(360, 120, 100, 20);
        frame.add(valorTextField);
        dataLabel.setBounds(470, 100, 100, 20);
        dataLabel.setToolTipText("Formato ##/##/##");
        frame.add(dataLabel);
        dataTextField.setBounds(470, 120, 100, 20);
        frame.add(dataTextField);
        
        
        
        ValidarPagamento handler = new ValidarPagamento();
        voltarButton.setBounds(250, 460, 150, 20);
        voltarButton.setFocusable(false);
        voltarButton.addActionListener(handler);
        frame.add(voltarButton);
        
        pagarButton.setBounds(400, 460, 150, 20);
        pagarButton.setFocusable(false);
        pagarButton.addActionListener(handler);
        frame.add(pagarButton);
        
                            
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
                Menu menu = new Menu();
                frame.dispose();
            }
            if(event.getSource() == pagarButton) {
                boolean valid = false;
                // valida o tipo de conta inserido
                if(tipoTextField.getText().length() > 2 && tipoTextField.getText().length() < 30 
                        && tipoTextField.getText().matches("[a-zA-Z]*")) {
                    tipoLabel.setForeground(Color.DARK_GRAY);
                    valid = true;
                }
                else {
                    tipoLabel.setForeground(Color.RED);
                    valid = false;
                }
                // valida o valor da conta
                if(valorTextField.getText().length() > 3 && valorTextField.getText().matches("[0-9.]*")) {
                    valorLabel.setForeground(Color.DARK_GRAY);
                    valid = true;
                }
                else {
                    valorLabel.setForeground(Color.RED);
                    valid = false;
                }
                // valida a data inserida
                if(dataTextField.getText().length() == 8 && dataTextField.getText().matches("[0-9/]*")) {
                    dataLabel.setForeground(Color.DARK_GRAY);
                    valid = true;
                }
                else {
                    dataLabel.setForeground(Color.RED);
                    valid = false;
                }
                if (valid == true){
                    Conta conta = new Conta();
                    conta.jogaEmArquivo(tipoTextField.getText(), valorTextField.getText(), 
                            dataTextField.getText());
                    frame.dispose();
                    JOptionPane.showMessageDialog(frame, "Pagamento registrado");
                }
            }
        }
    }
   
}

