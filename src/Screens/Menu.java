package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Menu extends JFrame{
    // variavel que mostra o usuario logado
    JLabel userLabel;
    
    JButton acessarAgendaButton;
    JButton marcarConsultaButton;
    JButton pagarContasButton;
    JButton folhaDePontoButton;
    JButton registrarFuncionarioButton;
    JButton fecharSistemaButton;

    public Menu(String userID) {
        userLabel = new JLabel(userID);
        userLabel.setBounds(250, 60, 150, 20);
        add(userLabel); // add the userLabel to JFrame
        
        GoTo go = new GoTo();
        acessarAgendaButton = new JButton("Acessar Agenda");
        acessarAgendaButton.setBounds(250, 100, 300, 50);
        acessarAgendaButton.setFocusable(false);
        acessarAgendaButton.addActionListener(go);
        add(acessarAgendaButton);
        
        marcarConsultaButton = new JButton("Marcar Consulta");
        marcarConsultaButton.setBounds(250, 160, 300, 50);
        marcarConsultaButton.setFocusable(false);
        marcarConsultaButton.addActionListener(go);
        add(marcarConsultaButton);
        
        pagarContasButton = new JButton("Pagamento de Contas");
        pagarContasButton.setBounds(250, 220, 300, 50);
        pagarContasButton.setFocusable(false);
        pagarContasButton.addActionListener(go);
        add(pagarContasButton);
        
        folhaDePontoButton = new JButton("Folha de Ponto");
        folhaDePontoButton.setBounds(250, 280, 300, 50);
        folhaDePontoButton.setFocusable(false);
        folhaDePontoButton.addActionListener(go);
        add(folhaDePontoButton);
        
        registrarFuncionarioButton = new JButton("Registrar Funcionário");
        registrarFuncionarioButton.setBounds(250, 340, 300, 50);
        registrarFuncionarioButton.setFocusable(false);
        registrarFuncionarioButton.addActionListener(go);
        add(registrarFuncionarioButton);
        
        fecharSistemaButton = new JButton("Fechar Sistema");
        fecharSistemaButton.setBounds(250, 400, 300, 50);
        fecharSistemaButton.setFocusable(false);
        fecharSistemaButton.addActionListener(go);
        add(fecharSistemaButton);
        
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajusta o tamanho da tela
        setLayout(null);
        setVisible(true); // mostra a tela
    }

    private class GoTo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == acessarAgendaButton) {
                Agenda agenda = new Agenda();
            }
            else if(event.getSource() == marcarConsultaButton) {
                Consulta appointment = new Consulta();
            }
            else if(event.getSource() == pagarContasButton) {
                Contas payBills = new Contas();
            }
            else if(event.getSource() == folhaDePontoButton) {
                FolhaDePonto timeSheet = new FolhaDePonto();
            }
            else if(event.getSource() == registrarFuncionarioButton) {
                RegistrarFuncionario registerEmployee = new RegistrarFuncionario();
            }
            else if(event.getSource() == fecharSistemaButton) {
                dispose();
            }
            dispose();
        }
    }
}
