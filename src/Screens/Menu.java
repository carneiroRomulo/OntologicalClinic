package Screens;

import javax.swing.JFrame;

public class Menu extends JFrame{
    public Menu(String userID) {
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajusta o tamanho do frame
        setLayout(null);
        setVisible( true ); // exibe o frame
    }
}
