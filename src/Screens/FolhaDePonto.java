package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FolhaDePonto extends JFrame{
    JLabel paginaLabel = new JLabel("FOLHA DE PONTO");
    
    JComboBox funcionarioButton = new JComboBox();
    JLabel funcionarioLabel = new JLabel();
    
    JButton editarButton = new JButton("Editar");
    JButton voltarButton = new JButton("Voltar");

    public FolhaDePonto() {
        ValidaFolhaDePonto handler = new ValidaFolhaDePonto();

        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        String[] funcionarios = {"", "Joao", "Maria", "Fernando", "Luis"};
        funcionarioButton = new JComboBox(funcionarios);
        funcionarioLabel = new JLabel("Funcionario");
        funcionarioButton.setBounds(250, 100, 300, 20);
        funcionarioButton.addActionListener(handler);
        add(funcionarioButton);
        funcionarioLabel.setToolTipText("Funcionario");
        funcionarioLabel.setBounds(250, 80, 300, 20);
        add(funcionarioLabel); // adiciona o funcionarioLabel ao JFrame
        
        editarButton = new JButton("Editar");
        editarButton.setBounds(400, 460, 150, 20);
        editarButton.setFocusable(false);
        editarButton.addActionListener(handler);
        add(editarButton);
        
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
 
    private class ValidaFolhaDePonto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == editarButton) {
                if(funcionarioButton.getSelectedItem() == "") {
                    paginaLabel.setText("Selecione um funcionario");
                }
                else {
                    paginaLabel.setText("EDITAR");
                }
            }
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
