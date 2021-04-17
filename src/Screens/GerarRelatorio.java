package Screens;

import javax.swing.JFrame;

public class GerarRelatorio {
    JFrame frame = new JFrame();
    
    public GerarRelatorio() {
        
        frame.setTitle("CLINICA CURRAL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600); // ajusta o tamanho da tela
        frame.setLayout(null);
        frame.setVisible(true); // mostra a tela
    }
}
