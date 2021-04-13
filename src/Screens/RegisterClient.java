package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterClient extends JFrame{
    JLabel pageLabel;
    
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
    
    String[] ages = {"","18", "19", "20", "21", "22", "23","24","25","26","27","28","30",
        "31", "32", "33", "34", "35", "36","37","38","39","40","41","42", "43", "44",
        "45", "46", "47", "48","49","50","51","52","53","54", "55", "56", "57", "58",
        "59", "60","61","62","63","64","65","66", "67", "68", "69", "70", "71", "72",
        "73","74","75","76","77","78", "79", "80"};
    JComboBox ageButton = new JComboBox(ages);
    JLabel ageLabel = new JLabel("Idade");
    
    JButton registerButton = new JButton("Registrar");
    JButton backButton = new JButton("Voltar");
    
    public RegisterClient() {
        pageLabel = new JLabel("REGISTRAR CLIENTE"); // titulo da tela
        pageLabel.setBounds(250, 40, 300, 20);
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
        
        ValidateRegister handler = new ValidateRegister();
        registerButton.setBounds(400, 300, 150, 20);
        registerButton.setFocusable(false);
        registerButton.addActionListener(handler);
        add(registerButton);
        
        backButton.setBounds(250, 300, 150, 20);
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
            if(event.getSource() == backButton) {
                Menu menu = new Menu("admin");
                dispose();
            }
        }
    }
}