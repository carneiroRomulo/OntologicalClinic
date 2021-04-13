package Screens;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterEmployee extends JFrame{
    JLabel pageLabel;
    
    JTextField nameTextField;
    JLabel nameLabel;
    
    JTextField lastNameTextField;
    JLabel lastNameLabel;
    
    JTextField adressTextField;
    JLabel adressLabel;
    
    JTextField emailTextField;
    JLabel emailLabel;
    
    JTextField cpfTextField;
    JLabel cpfLabel;
    
    JTextField rgTextField;
    JLabel rgLabel;
    
    JTextField phoneTextField;
    JLabel phoneLabel;
    
    JTextField ageTextField;
    JLabel ageLabel;
    
    JTextField salaryTextField;
    JLabel salaryLabel;
    
    JTextField workloadTextField;
    JLabel workloadLabel;
    
    JTextField roleTextField;
    JLabel roleLabel;
    
    JTextField userTextField;
    JLabel userLabel;
    
    JTextField passwordTextField;
    JLabel passwordLabel;
    
    JButton registerButton;
    
    public RegisterEmployee() {
        pageLabel = new JLabel("REGISTER EMPLOYEE");
        pageLabel.setBounds(330, 40, 150, 20);
        add(pageLabel); // adiciona o pageLabel ao JFrame
        
        nameTextField = new JTextField(20);
        nameTextField.setBounds(250, 100, 150, 20);
        add(nameTextField);
        nameLabel = new JLabel("Name");
        nameLabel.setToolTipText("Enter the name id");
        nameLabel.setBounds(250, 80, 300, 20);
        add(nameLabel); // adiciona o nameLabel ao JFrame
        
        lastNameTextField = new JTextField(20);
        lastNameTextField.setBounds(400, 100, 150, 20);
        add(lastNameTextField);
        lastNameLabel = new JLabel("Lastname");
        lastNameLabel.setToolTipText("Enter the lastName id");
        lastNameLabel.setBounds(400, 80, 150, 20);
        add(lastNameLabel); // adiciona o lastNameLabel ao JFrame
        
        adressTextField = new JTextField(20);
        adressTextField.setBounds(250, 140, 300, 20);
        add(adressTextField);
        adressLabel = new JLabel("Adress");
        adressLabel.setToolTipText("Enter the adress id");
        adressLabel.setBounds(250, 120, 300, 20);
        add(adressLabel); // adiciona o adressLabel ao JFrame
        
        emailTextField = new JTextField(20);
        emailTextField.setBounds(250, 180, 300, 20);
        add(emailTextField);
        emailLabel = new JLabel("E-mail");
        emailLabel.setToolTipText("Enter the email id");
        emailLabel.setBounds(250, 160, 300, 20);
        add(emailLabel); // adiciona o emailLabel ao JFrame
        
        cpfTextField = new JTextField(20);
        cpfTextField.setBounds(250, 220, 150, 20);
        add(cpfTextField);
        cpfLabel = new JLabel("CPF");
        cpfLabel.setToolTipText("Enter the cpf id");
        cpfLabel.setBounds(250, 200, 150, 20);
        add(cpfLabel); // adiciona o cpfLabel ao JFrame
        
        rgTextField = new JTextField(20);
        rgTextField.setBounds(400, 220, 150, 20);
        add(rgTextField);
        rgLabel = new JLabel("RG");
        rgLabel.setToolTipText("Enter the rg id");
        rgLabel.setBounds(400, 200, 150, 20);
        add(rgLabel); // adiciona o rgLabel ao JFrame
        
        phoneTextField = new JTextField(20);
        phoneTextField.setBounds(250, 260, 150, 20);
        add(phoneTextField);
        phoneLabel = new JLabel("Phone");
        phoneLabel.setToolTipText("Enter the phone id");
        phoneLabel.setBounds(250, 240, 150, 20);
        add(phoneLabel); // adiciona o phoneLabel ao JFrame
        
        ageTextField = new JTextField(20);
        ageTextField.setBounds(400, 260, 150, 20);
        add(ageTextField);
        ageLabel = new JLabel("Age");
        ageLabel.setToolTipText("Enter the age id");
        ageLabel.setBounds(400, 240, 150, 20);
        add(ageLabel); // adiciona o ageLabel ao JFrame
        
        salaryTextField = new JTextField(20);
        salaryTextField.setBounds(250, 300, 150, 20);
        add(salaryTextField);
        salaryLabel = new JLabel("Salary");
        salaryLabel.setToolTipText("Enter the salary id");
        salaryLabel.setBounds(250, 280, 150, 20);
        add(salaryLabel); // adiciona o salaryLabel ao JFrame
        
        workloadTextField = new JTextField(20);
        workloadTextField.setBounds(400, 300, 150, 20);
        add(workloadTextField);
        workloadLabel = new JLabel("Workload");
        workloadLabel.setToolTipText("Enter the workload id");
        workloadLabel.setBounds(400, 280, 150, 20);
        add(workloadLabel); // adiciona o workloadLabel ao JFrame
        
        roleTextField = new JTextField(20);
        roleTextField.setBounds(250, 340, 300, 20);
        add(roleTextField);
        roleLabel = new JLabel("Role");
        roleLabel.setToolTipText("Enter the role id");
        roleLabel.setBounds(250, 320, 300, 20);
        add(roleLabel); // adiciona o roleLabel ao JFrame
        
        userTextField = new JTextField(20);
        userTextField.setBounds(250, 380, 150, 20);
        add(userTextField);
        userLabel = new JLabel("User");
        userLabel.setToolTipText("Enter the user id");
        userLabel.setBounds(250, 360, 150, 20);
        add(userLabel); // adiciona o userLabel ao JFrame
        
        passwordTextField = new JTextField(20);
        passwordTextField.setBounds(400, 380, 150, 20);
        add(passwordTextField);
        passwordLabel = new JLabel("Password");
        passwordLabel.setToolTipText("Enter the password id");
        passwordLabel.setBounds(400, 360, 150, 20);
        add(passwordLabel); // adiciona o passwordLabel ao JFrame
        
        registerButton = new JButton("Register");
        registerButton.setBounds(400, 420, 150, 20);
        registerButton.setFocusable(false);
        add(registerButton);
        
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajust the size of the frame
        setLayout(null);
        setVisible(true); // show the frame
    }
   
}
