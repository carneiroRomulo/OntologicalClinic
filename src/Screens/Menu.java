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
    JButton pagarSalarioButton;
    JButton folhaDePontoButton;
    JButton gerarRelatorioButton;
    JButton registrarFuncionarioButton;
    JButton logoutSistemaButton;

    public Menu(String userID) {
        userLabel = new JLabel(userID);
        userLabel.setBounds(250, 60, 150, 20);
        add(userLabel); // add the userLabel to JFrame
        
        GoTo go = new GoTo();
        acessarAgendaButton = new JButton("Acessar Agenda");
        acessarAgendaButton.setBounds(250, 100, 300, 40);
        acessarAgendaButton.setFocusable(false);
        acessarAgendaButton.addActionListener(go);
        add(acessarAgendaButton);
        
        marcarConsultaButton = new JButton("Marcar Consulta");
        marcarConsultaButton.setBounds(250, 150, 300, 40);
        marcarConsultaButton.setFocusable(false);
        marcarConsultaButton.addActionListener(go);
        add(marcarConsultaButton);
        
        pagarContasButton = new JButton("Pagamento de Contas");
        pagarContasButton.setBounds(250, 200, 300, 40);
        pagarContasButton.setFocusable(false);
        pagarContasButton.addActionListener(go);
        add(pagarContasButton);
        
        pagarSalarioButton = new JButton("Pagamento Salario");
        pagarSalarioButton.setBounds(250, 250, 300, 40);
        pagarSalarioButton.setFocusable(false);
        pagarSalarioButton.addActionListener(go);
        add(pagarSalarioButton);
        
        folhaDePontoButton = new JButton("Folha de Ponto");
        folhaDePontoButton.setBounds(250, 300, 300, 40);
        folhaDePontoButton.setFocusable(false);
        folhaDePontoButton.addActionListener(go);
        add(folhaDePontoButton);
        
        gerarRelatorioButton = new JButton("Gerar Relatório");
        gerarRelatorioButton.setBounds(250, 350, 300, 40);
        gerarRelatorioButton.setFocusable(false);
        gerarRelatorioButton.addActionListener(go);
        add(gerarRelatorioButton);
        
        registrarFuncionarioButton = new JButton("Registrar Funcionário");
        registrarFuncionarioButton.setBounds(250, 400, 300, 40);
        registrarFuncionarioButton.setFocusable(false);
        registrarFuncionarioButton.addActionListener(go);
        add(registrarFuncionarioButton);
        
        logoutSistemaButton = new JButton("Logout");
        logoutSistemaButton.setBounds(250, 450, 300, 40);
        logoutSistemaButton.setFocusable(false);
        logoutSistemaButton.addActionListener(go);
        add(logoutSistemaButton);
    
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajusta o tamanho da tela
        setLayout(null);
        setVisible(true); // mostra a tela
    }

    public Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                Conta payBills = new Conta();
            }
            else if(event.getSource() == pagarSalarioButton) {
                PagarSalario salario = new PagarSalario();
            }
            else if(event.getSource() == folhaDePontoButton) {
                FolhaDePonto timeSheet = new FolhaDePonto();
            }
            else if(event.getSource() == gerarRelatorioButton) {
                GerarRelatorio relatorio = new GerarRelatorio();
            }
            else if(event.getSource() == registrarFuncionarioButton) {
                RegistrarFuncionario registerEmployee = new RegistrarFuncionario();
            }
            else if(event.getSource() == logoutSistemaButton) {
                dispose();
                Login login = new Login();
            }
            dispose();
        }
    }
}
