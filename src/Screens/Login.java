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
    private JLabel userLable;
    private JTextField userTextField;
    
    //password variables
    private JLabel passwordLable;
    private JTextField userPasswordField;
    
    private JButton loginButton;
    
    private JLabel warningLabel;
    
    // o construtor adiciona JLabels ao JFrame
    public Login(){
        Clinica clinica = new Clinica();
        setTitle(clinica.getNomeEmpresa()); // set the title of the frame
        
        userTextField = new JTextField(20);
        userTextField.setBounds(300, 200, 200, 20);
        add(userTextField);
        userLable = new JLabel("User");
        userLable.setToolTipText("Enter the user id");
        userLable.setBounds(300, 180, 150, 20);
        add(userLable); // adiciona o userLable ao JFrame
        
        userPasswordField = new JPasswordField(20);
        userPasswordField.setBounds(300, 250, 200, 20);
        add(userPasswordField);
        passwordLable = new JLabel("Password");
        passwordLable.setToolTipText("Enter the password login");
        passwordLable.setBounds(300, 230, 150, 20);
        add(passwordLable); // adiciona o passwordLable ao JFrame
        
        ValidateAcess see = new ValidateAcess();
        loginButton = new JButton("Login");
        loginButton.setBounds(419, 280, 80, 20);
        loginButton.setFocusable(false);
        loginButton.addActionListener(see);
        add(loginButton);
        
        warningLabel = new JLabel();
        warningLabel.setBounds(300, 280, 200, 20);
        warningLabel.setFont(new Font(null, Font.ITALIC, 12));
        add(warningLabel);
        
        
        TextFieldHandler handler = new TextFieldHandler();
        userTextField.addActionListener(handler);
        userPasswordField.addActionListener(handler);

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
                String passwordID = String.valueOf(userPasswordField);
                if(userID.equals("admin") || passwordID.equals("admin")){
                    Menu menu = new Menu(userID);
                    warningLabel.setText("");
                    dispose();
                }
                else {
                    warningLabel.setForeground(Color.red);
                    warningLabel.setText("Acess Denied");
                }
            }
        }
    }
    // Classe interna para manipulação de eventos
    private class TextFieldHandler implements ActionListener {
        // processa os eventos dos campo texto
        public void actionPerformed(ActionEvent event) {
            String string = ""; // declara a string a ser exibida

            // o usuário pressionou ENTER no JTextField loginTextField
            if(event.getSource() == userTextField)
                string = String.format("Login: %s", event.getActionCommand());
            // o usuário pressionou ENTER no JTextField userPasswordField
            else if(event.getSource()== userPasswordField)
                string = String.format("Password: %s", event.getActionCommand());

            // exibe o conteúdo do campo de texto
            JOptionPane.showMessageDialog(null, string);
        }
    } 
}

