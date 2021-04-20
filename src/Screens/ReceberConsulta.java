package Screens;

import Program.Agendas;
import Program.Consultas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ReceberConsulta extends JFrame {
    JLabel paginaLabel;
    
    JButton pagarButton;
    JButton voltarButton;

    Consultas consulta = new Consultas();
    List<String> cpf = new ArrayList<>();
    List<String> valor = new ArrayList<>();
    List<String> status = new ArrayList<>();
    List<String> agendado = new ArrayList<>();
    String aux = "";
    JLabel cpfLabel;
    JTextField cpfTextField = new JTextField();
    
    JLabel valorLabel;
    JTextField valorTextField = new JTextField();
    
    JLabel cpfMostradoLabel = new JLabel("Identificação");
    JLabel valorMostradoLabel = new JLabel("Valor");
    JLabel statusMostradoLabel = new JLabel("Status");
    
    DefaultListModel<String> l1 = new DefaultListModel<>();
    JList<String> list = new JList<>(l1);
    JScrollPane scroll = new JScrollPane(list);
    
    public ReceberConsulta(){
        ValidateConsulta handler = new ValidateConsulta();
        
        cpfLabel = new JLabel("Identificação");
        cpfLabel.setToolTipText("O número digitado deve ser igual a algum dos CPFs mostrados");
        cpfLabel.setBounds(250, 80, 150, 20);
        add(cpfLabel); // adiciona o cpfLabel JFrame
        cpfTextField.setBounds(250, 100, 150, 20);
        cpfTextField.addActionListener(handler);
        add(cpfTextField);
        
        valorLabel = new JLabel("Preço");
        valorLabel.setToolTipText("Preço da conta");
        valorLabel.setBounds(400, 80, 150, 20);
        add(valorLabel); // adiciona o valorsLabelao JFrame
        valorTextField.setBounds(400, 100, 150, 20);
        valorTextField.addActionListener(handler);
        add(valorTextField);
        
        cpfMostradoLabel.setBounds(200, 130, 100, 20);
        add(cpfMostradoLabel);
        valorMostradoLabel.setBounds(360, 130, 100, 20);
        add(valorMostradoLabel);
        statusMostradoLabel.setBounds(490, 130, 100, 20);
        add(statusMostradoLabel);
        
        paginaLabel = new JLabel("RECEBER CONSULTA");
        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        consulta.lerConsultas(cpf, valor, status);
        for(int i = 0; i < cpf.size(); i++) {
            String spaces = "";
            for (int k = 0; k < 25; k++) {
                spaces += " ";
            }
            aux = cpf.get(i) + spaces + valor.get(i) + spaces + status.get(i);
            agendado.add(aux);
        }
        for(String i : agendado) {
            l1.addElement(i);
        }
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(200, 150, 400, 200);
        add(scroll);

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
                String cpfInput = cpfTextField.getText();
                String valorInput = valorTextField.getText();
                
                l1.removeAllElements();
                agendado.clear();
                cpf.clear();
                consulta.lerConsultas(cpf, valor, status);
                for (int i = 0; i < cpf.size(); i++) {
                    String spaces = "";
                    for (int k = 0; k < 25; k++) {
                        spaces += " ";
                    }
                    
                    if (cpf.get(i).equals(cpfInput) && valor.get(i).equals(valorInput)
                            && status.get(i).equals("pendente")) {
                        aux = cpf.get(i) + spaces + valor.get(i) + spaces + "pago";
                        agendado.add(aux);
                    }
                    else {
                        aux = cpf.get(i) + spaces + valor.get(i) + spaces + status.get(i);
                        agendado.add(aux);
                    }
                }
                for (String i : agendado) {
                    l1.addElement(i);
                }
            }
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu();
                dispose();
            }
        }
    }
}
