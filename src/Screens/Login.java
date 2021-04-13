package Screens;
import Program.Clinica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame; // fornece as funcionalidade básicas de janelas
import javax.swing.JLabel; // exibe texto e imagem
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
    // login variables
    private JLabel userLabel;
    private JTextField userTextField;
    
    //password variables
    private JLabel passwordLabel;
    private JPasswordField userPasswordField;
    
    private JButton loginButton;
    
    private JLabel warningLabel;
    
    // o construtor adiciona JLabels ao JFrame
    public Login(){
        Clinica clinica = new Clinica();
        setTitle(clinica.getNomeEmpresa()); // set the title of the frame
        
        userTextField = new JTextField(20);
        userTextField.setBounds(300, 200, 200, 20);
        add(userTextField);
        userLabel = new JLabel("User");
        userLabel.setToolTipText("Enter the user id");
        userLabel.setBounds(300, 180, 150, 20);
        add(userLabel); // adiciona o userLabel ao JFrame
        
        userPasswordField = new JPasswordField(20);
        userPasswordField.setBounds(300, 250, 200, 20);
        add(userPasswordField);
        passwordLabel = new JLabel("Password");
        passwordLabel.setToolTipText("Enter the password login");
        passwordLabel.setBounds(300, 230, 150, 20);
        add(passwordLabel); // adiciona o passwordLabel ao JFrame
        
        ValidateAcess validate = new ValidateAcess();
        loginButton = new JButton("Login");
        loginButton.setBounds(419, 280, 80, 20);
        loginButton.setFocusable(false);
        loginButton.addActionListener(validate);
        add(loginButton);
        
        warningLabel = new JLabel();
        warningLabel.setBounds(300, 280, 200, 20);
        warningLabel.setFont(new Font(null, Font.ITALIC, 12));
        add(warningLabel);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajusta o tamanho do frame
        setLayout(null);
        setVisible(true); // exibe o frame
    }
    
    private class ValidateAcess implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == loginButton) {
                String userID = userTextField.getText();
                String passwordID = String.copyValueOf(userPasswordField.getPassword());
                if(userID.equals("admin")) {
                    if(passwordID.equals("admin")) {
                        dispose();
                        Menu menu = new Menu(userID);
                    }
                    else {
                        warningLabel.setForeground(Color.red);
                        warningLabel.setText("Acess Denied");
                    }
                }
                else {
                    warningLabel.setForeground(Color.red);
                    warningLabel.setText("Acess Denied");
                }
            }
        }
    }
}

