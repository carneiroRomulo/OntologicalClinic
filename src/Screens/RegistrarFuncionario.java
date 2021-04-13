package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrarFuncionario extends JFrame{
    JLabel pageLabel;
    
    JTextField nomeTextField = new JTextField(20);
    JLabel nomeLabel = new JLabel("Nome");
    
    JTextField lastnomeTextField = new JTextField(20);
    JLabel sobrenomeLabel = new JLabel("Sobrenome");
    
    JTextField enderecoTextField = new JTextField(20);
    JLabel enderecoLabel = new JLabel("Endereço");
    
    JTextField emailTextField = new JTextField(20);
    JLabel emailLabel = new JLabel("E-mail");
    
    JTextField cpfTextField = new JTextField(20);
    JLabel cpfLabel = new JLabel("CPF");
    
    JTextField rgTextField = new JTextField(20);
    JLabel rgLabel = new JLabel("RG");
    
    JTextField telefoneTextField = new JTextField(20);
    JLabel telefoneLabel = new JLabel("Telefone");
    
    String[] idades = {"","18", "19", "20", "21", "22", "23","24","25","26","27","28","30",
        "31", "32", "33", "34", "35", "36","37","38","39","40","41","42", "43", "44",
        "45", "46", "47", "48","49","50","51","52","53","54", "55", "56", "57", "58",
        "59", "60","61","62","63","64","65","66", "67", "68", "69", "70", "71", "72",
        "73","74","75","76","77","78", "79", "80"};
    JComboBox idadeButton = new JComboBox(idades);
    JLabel idadeLabel = new JLabel("Idade");
    
    JTextField salaryTextField = new JTextField(20);
    JLabel salaryLabel = new JLabel("Salário");
    
    String[] workload = {"","6", "7", "8", "9", "10", "11", "12"};
    JComboBox workloadButton = new JComboBox(workload);
    JLabel workloadLabel = new JLabel("Regime de Trabalho");
    
    String[] roles = {"","Administrador", "Assistente Administrativo", "Dentista", "Assistente de Dentista",
        "Recepcionista"};
    JComboBox roleButton = new JComboBox(roles);
    JLabel roleLabel = new JLabel("Cargo");
    
    JTextField userTextField = new JTextField(20);
    JLabel userLabel = new JLabel("Usuário");
    
    JPasswordField passwordField = new JPasswordField(20);
    JLabel passwordLabel = new JLabel("Senha");
    
    JPasswordField confirmPasswordField = new JPasswordField(20);
    JLabel confirmPasswordLabel = new JLabel("Confirmar Senha");
    
    JButton registerButton = new JButton("Registrar");
    JButton backButton = new JButton("Voltar");
    
    public RegistrarFuncionario() {
        pageLabel = new JLabel("REGISTRAR FUNCIONARIO"); // titulo da tela
        pageLabel.setBounds(250, 40, 200, 20);
        add(pageLabel); // adiciona o pageLabel ao JFrame
        
        nomeTextField.setBounds(250, 100, 150, 20);
        add(nomeTextField);
        nomeLabel.setToolTipText("Insira o nome");
        nomeLabel.setBounds(250, 80, 300, 20);
        add(nomeLabel); // adiciona o nomeao JFrame
        
        lastnomeTextField.setBounds(400, 100, 150, 20);
        add(lastnomeTextField);
        sobrenomeLabel.setToolTipText("Insira o sobrenome");
        sobrenomeLabel.setBounds(400, 80, 150, 20);
        add(sobrenomeLabel); // adiciona o sobrenome ao JFrame
        
        enderecoTextField.setBounds(250, 140, 300, 20);
        add(enderecoTextField);
        enderecoLabel.setToolTipText("Insira o endereço");
        enderecoLabel.setBounds(250, 120, 300, 20);
        add(enderecoLabel); // adiciona o enderecoao JFrame
        
        emailTextField.setBounds(250, 180, 300, 20);
        add(emailTextField);
        emailLabel.setToolTipText("Insira o e-mail");
        emailLabel.setBounds(250, 160, 300, 20);
        add(emailLabel); // adiciona o emailLabel ao JFrame
        
        cpfTextField.setBounds(250, 220, 150, 20);
        add(cpfTextField);
        cpfLabel.setToolTipText("Insira o CPF");
        cpfLabel.setBounds(250, 200, 150, 20);
        add(cpfLabel); // adiciona o cpfLabel ao JFrame
        
        rgTextField.setBounds(400, 220, 150, 20);
        add(rgTextField);
        rgLabel.setToolTipText("Insira o RG");
        rgLabel.setBounds(400, 200, 150, 20);
        add(rgLabel); // adiciona o rgLabel ao JFrame
        
        telefoneTextField.setBounds(250, 260, 150, 20);
        add(telefoneTextField);
        telefoneLabel.setToolTipText("Insira o telefone");
        telefoneLabel.setBounds(250, 240, 150, 20);
        add(telefoneLabel); // adiciona o telefoneao JFrame
        
        idadeButton.setBounds(400, 260, 150, 20);
        add(idadeButton);
        idadeLabel.setToolTipText("Insira a idade");
        idadeLabel.setBounds(400, 240, 150, 20);
        add(idadeLabel); // adiciona o idadeao JFrame
        
        salaryTextField.setBounds(250, 300, 150, 20);
        add(salaryTextField);
        salaryLabel.setToolTipText("Insira o salário");
        salaryLabel.setBounds(250, 280, 150, 20);
        add(salaryLabel); // adiciona o salaryLabel ao JFrame
        
        workloadButton.setBounds(400, 300, 150, 20);
        add(workloadButton);
        workloadLabel.setToolTipText("Insira o regime de trabalho");
        workloadLabel.setBounds(400, 280, 150, 20);
        add(workloadLabel); // adiciona o workloadLabel ao JFrame
        
        roleButton.setBounds(250, 340, 300, 20);
        add(roleButton);
        roleLabel.setToolTipText("Insira o cargo");
        roleLabel.setBounds(250, 320, 300, 20);
        add(roleLabel); // adiciona o roleLabel ao JFrame
        
        userTextField.setBounds(250, 380, 300, 20);
        add(userTextField);
        userLabel.setToolTipText("Insira o ID do usuário");
        userLabel.setBounds(250, 360, 300, 20);
        add(userLabel); // adiciona o userLabel ao JFrame
        
        passwordField.setBounds(250, 420, 150, 20);
        add(passwordField);
        passwordLabel.setToolTipText("Insira a senha");
        passwordLabel.setBounds(250, 400, 150, 20);
        add(passwordLabel); // adiciona o passwordLabel ao JFrame
        
        confirmPasswordField.setBounds(400, 420, 150, 20);
        add(confirmPasswordField);
        confirmPasswordLabel.setToolTipText("Confirme a senha");
        confirmPasswordLabel.setBounds(400, 400, 150, 20);
        add(confirmPasswordLabel); // adiciona o confirmPasswordLabel ao JFrame
        
        ValidateRegister handler = new ValidateRegister();
        registerButton.setBounds(400, 460, 150, 20);
        registerButton.setFocusable(false);
        registerButton.addActionListener(handler);
        add(registerButton);
        
        backButton.setBounds(250, 460, 150, 20);
        backButton.setFocusable(false);
        backButton.addActionListener(handler);
        add(backButton);
        
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajust the size of the frame
        setLayout(null);
        setVisible(true); // show the frame
    }
   
    private class ValidateRegister implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String password = String.copyValueOf(passwordField.getPassword());
            String confirmPassword = String.copyValueOf(confirmPasswordField.getPassword());
            if(event.getSource() == registerButton){
                // Valida a senha
                if(confirmPassword.equals(password) && !(confirmPassword.length() < 6)){
                    pageLabel.setText("Deu certo");
                }
                else{
                    pageLabel.setText("Deu errado");
                }
                
                // Valida a idade
                if(idadeButton.getSelectedItem() == "") {
                    pageLabel.setText("Selecione uma idade válida");
                }
                else {
                }
            }
                
            if(event.getSource() == backButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
