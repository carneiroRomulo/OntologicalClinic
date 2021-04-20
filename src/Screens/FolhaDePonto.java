package Screens;

import Program.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FolhaDePonto extends JFrame{
    Administrador admin = new Administrador();

    JLabel paginaLabel = new JLabel("FOLHA DE PONTO");
    
    String[] cargos = {"", "Administrador", "Assistente Administrativo", "Dentista", 
        "Assistente de Dentista", "Recepcionista"};
    JComboBox cargoButton = new JComboBox(cargos);
    JLabel cargoLabel = new JLabel();
    
    List<String> funcionarios = new ArrayList<>();
    JComboBox funcionariosButton = new JComboBox();
    JLabel funcionariosLabel = new JLabel();
    
    JButton editarButton = new JButton("Editar");
    JButton voltarButton = new JButton("Voltar");

    
    public FolhaDePonto() {
        ValidaFolhaDePonto handler = new ValidaFolhaDePonto();

        paginaLabel.setBounds(250, 40, 200, 20);
        add(paginaLabel); // adiciona o paginaLabel ao JFrame
        
        cargoLabel = new JLabel("Cargo");
        cargoButton.setBounds(250, 100, 300, 20);
        cargoButton.addActionListener(handler);
        add(cargoButton);
        cargoLabel.setToolTipText("Cargo");
        cargoLabel.setBounds(250, 80, 300, 20);
        add(cargoLabel); // adiciona o cargoao JFrame
        
        funcionariosLabel = new JLabel("Funcionarios");
        funcionariosButton.setBounds(250, 140, 300, 20);
        funcionariosButton.addActionListener(handler);
        funcionariosButton.setVisible(false);
        add(funcionariosButton);
        funcionariosLabel.setToolTipText("Funcionarios");
        funcionariosLabel.setBounds(250, 120, 300, 20);
        funcionariosLabel.setVisible(false);
        add(funcionariosLabel); // adiciona o funcionariosao JFrame
        
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
            if(event.getSource() == cargoButton) {
                String cargo = cargoButton.getSelectedItem().toString();
                if(funcionariosButton.getItemCount() != 0) {
                    System.out.println("Limpa");
                    funcionarios.clear();
                }
                if (!cargo.equals("")) {
                    funcionariosLabel.setVisible(true);
                    funcionariosButton.setVisible(true);
                }
                else{
                    funcionariosLabel.setVisible(false);
                    funcionariosButton.setVisible(false);
                }
                if (cargo.equals("Administrador")){
                    admin.lerFuncionarios(cargoButton.getSelectedItem().toString(), funcionarios);
                    funcionariosButton.setModel(new DefaultComboBoxModel<String>(funcionarios.toArray(new String[0])));
                }
                else if(cargo.equals("Assistente Administrativo")){
                    admin.lerFuncionarios(cargoButton.getSelectedItem().toString(), funcionarios);
                    funcionariosButton.setModel(new DefaultComboBoxModel<String>(funcionarios.toArray(new String[0])));
                }
                else if(cargo.equals("Dentista")){
                    admin.lerFuncionarios(cargoButton.getSelectedItem().toString(), funcionarios);
                    funcionariosButton.setModel(new DefaultComboBoxModel<String>(funcionarios.toArray(new String[0])));
                }
                else if(cargo.equals("Assistente de Dentista")){
                    admin.lerFuncionarios(cargoButton.getSelectedItem().toString(), funcionarios);
                    funcionariosButton.setModel(new DefaultComboBoxModel<String>(funcionarios.toArray(new String[0])));
                }
                else if(cargo.equals("Recepcionista")){
                    admin.lerFuncionarios(cargoButton.getSelectedItem().toString(), funcionarios);
                    funcionariosButton.setModel(new DefaultComboBoxModel<String>(funcionarios.toArray(new String[0])));
                }
            }
            if(event.getSource() == editarButton) {
                if(cargoButton.getSelectedItem() == "") {
                    paginaLabel.setText("Selecione um funcionario");
                }
                else {
                    paginaLabel.setText("EDITAR");
                }
            }
            if(event.getSource() == voltarButton) {
                Menu menu = new Menu();
                dispose();
            }
        }
    }
}
