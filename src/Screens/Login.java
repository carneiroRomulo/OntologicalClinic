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
    private JLabel usuarioLabel;
    private JTextField userTextField;
    
    //password variables
    private JLabel senhaLabel;
    private JPasswordField senhaField;
    
    private JButton loginButton;
    
    private JLabel warningLabel;
    
    // o construtor adiciona JLabels ao JFrame
    public Login(){
        Clinica clinica = new Clinica();
        setTitle(clinica.getNomeEmpresa()); // define o titulo do programa
        
        userTextField = new JTextField(20);
        userTextField.setBounds(300, 200, 200, 20);
        add(userTextField);
        usuarioLabel = new JLabel("User");
        usuarioLabel.setToolTipText("Enter the user id");
        usuarioLabel.setBounds(300, 180, 150, 20);
        add(usuarioLabel); // adiciona o usuario ao JFrame
        
        senhaField = new JPasswordField(20);
        senhaField.setBounds(300, 250, 200, 20);
        add(senhaField);
        senhaLabel = new JLabel("Password");
        senhaLabel.setToolTipText("Enter the password login");
        senhaLabel.setBounds(300, 230, 150, 20);
        add(senhaLabel); // adiciona o senhaao JFrame
        
        ValidarLogin handler = new ValidarLogin();
        loginButton = new JButton("Login");
        loginButton.setBounds(419, 280, 80, 20);
        loginButton.setFocusable(false);
        loginButton.addActionListener(handler);
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
    
    private class ValidarLogin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == loginButton) {
                String userID = userTextField.getText();
                String passwordID = String.copyValueOf(senhaField.getPassword());
                if(userID.equals("admin")) {
                    if(passwordID.equals("admin")) {
                        dispose();
                        Menu menu = new Menu(userID);
                    }
                    else {
                        warningLabel.setForeground(Color.red);
                        warningLabel.setText("Acesso Negado");
                    }
                }
                else {
                    warningLabel.setForeground(Color.red);
                    warningLabel.setText("Acesso Negado");
                }
            }
        }
    }
}

