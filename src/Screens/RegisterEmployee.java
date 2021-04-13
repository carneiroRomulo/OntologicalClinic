package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterEmployee extends JFrame{
    JLabel pageLabel = new JLabel("REGISTRAR FUNCIONARIO");
    
    JTextField nameTextField = new JTextField(20);
    JLabel nameLabel = new JLabel("Nome");
    
    JTextField lastNameTextField = new JTextField(20);
    JLabel lastNameLabel = new JLabel("Sobrenome");
    
    JTextField adressTextField = new JTextField(20);
    JLabel adressLabel = new JLabel("Endereço");
    
    JTextField emailTextField = new JTextField(20);
    JLabel emailLabel = new JLabel("E-mail");
    
    JTextField cpfTextField = new JTextField(20);
    JLabel cpfLabel = new JLabel("CPF");
    
    JTextField rgTextField = new JTextField(20);
    JLabel rgLabel = new JLabel("RG");
    
    JTextField phoneTextField = new JTextField(20);
    JLabel phoneLabel = new JLabel("Telefone");
    
    String[] ages = {"18", "19", "20", "21", "22", "23","24","25","26","27","28","30",
        "31", "32", "33", "34", "35", "36","37","38","39","40","41","42", "43", "44",
        "45", "46", "47", "48","49","50","51","52","53","54", "55", "56", "57", "58",
        "59", "60","61","62","63","64","65","66", "67", "68", "69", "70", "71", "72",
        "73","74","75","76","77","78", "79", "80"};
    JComboBox ageButton = new JComboBox(ages);
    JLabel ageLabel = new JLabel("Idade");
    
    JTextField salaryTextField = new JTextField(20);
    JLabel salaryLabel = new JLabel("Salário");
    
    String[] workload = {"6", "7", "8", "9", "10", "11", "12"};
    JComboBox workloadButton = new JComboBox(workload);
    JLabel workloadLabel = new JLabel("Regime de Trabalho");
    
    String[] roles = {"Administrador", "Assistente Administrativo", "Dentista", "Assistente de Dentista",
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
    
    public RegisterEmployee() {
        pageLabel.setBounds(320, 40, 200, 20);
        add(pageLabel); // adiciona o pageLabel ao JFrame
        
        nameTextField.setBounds(250, 100, 150, 20);
        add(nameTextField);
        nameLabel.setToolTipText("Insira o nome");
        nameLabel.setBounds(250, 80, 300, 20);
        add(nameLabel); // adiciona o nameLabel ao JFrame
        
        lastNameTextField.setBounds(400, 100, 150, 20);
        add(lastNameTextField);
        lastNameLabel.setToolTipText("Insira o sobrenome");
        lastNameLabel.setBounds(400, 80, 150, 20);
        add(lastNameLabel); // adiciona o lastNameLabel ao JFrame
        
        adressTextField.setBounds(250, 140, 300, 20);
        add(adressTextField);
        adressLabel.setToolTipText("Insira o endereço");
        adressLabel.setBounds(250, 120, 300, 20);
        add(adressLabel); // adiciona o adressLabel ao JFrame
        
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
        
        phoneTextField.setBounds(250, 260, 150, 20);
        add(phoneTextField);
        phoneLabel.setToolTipText("Insira o telefone");
        phoneLabel.setBounds(250, 240, 150, 20);
        add(phoneLabel); // adiciona o phoneLabel ao JFrame
        
        ageButton.setBounds(400, 260, 150, 20);
        add(ageButton);
        ageLabel.setToolTipText("Insira a idade");
        ageLabel.setBounds(400, 240, 150, 20);
        add(ageLabel); // adiciona o ageLabel ao JFrame
        
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
                // Validate password
                if(confirmPassword.equals(password) && confirmPassword.length() != 0){
                    pageLabel.setText("Deu certo");
                }
                else{
                    pageLabel.setText("Deu errado");
                }
                
            }
            if(event.getSource() == backButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}
