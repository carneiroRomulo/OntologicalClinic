package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Menu extends JFrame{
    // variable that shows the logged user
    JLabel userLabel;
    
    JButton acessAgendaButton;
    JButton appointmentButton;
    JButton billPaymentButton;
    JButton timeSheetButton;
    JButton registerEmployeeButton;
    JButton closeSystemButton;

    public Menu(String userID) {
        userLabel = new JLabel(userID);
        userLabel.setBounds(250, 60, 150, 20);
        add(userLabel); // add the userLabel to JFrame
        
        GoTo go = new GoTo();
        acessAgendaButton = new JButton("Acess Agenda");
        acessAgendaButton.setBounds(250, 100, 300, 50);
        acessAgendaButton.setFocusable(false);
        acessAgendaButton.addActionListener(go);
        add(acessAgendaButton);
        
        appointmentButton = new JButton("Schedule an Appointment");
        appointmentButton.setBounds(250, 160, 300, 50);
        appointmentButton.setFocusable(false);
        appointmentButton.addActionListener(go);
        add(appointmentButton);
        
        billPaymentButton = new JButton("Bill Payment");
        billPaymentButton.setBounds(250, 220, 300, 50);
        billPaymentButton.setFocusable(false);
        billPaymentButton.addActionListener(go);
        add(billPaymentButton);
        
        timeSheetButton = new JButton("Time Sheet");
        timeSheetButton.setBounds(250, 280, 300, 50);
        timeSheetButton.setFocusable(false);
        timeSheetButton.addActionListener(go);
        add(timeSheetButton);
        
        registerEmployeeButton = new JButton("Register Employee");
        registerEmployeeButton.setBounds(250, 340, 300, 50);
        registerEmployeeButton.setFocusable(false);
        registerEmployeeButton.addActionListener(go);
        add(registerEmployeeButton);
        
        closeSystemButton = new JButton("Close System");
        closeSystemButton.setBounds(250, 400, 300, 50);
        closeSystemButton.setFocusable(false);
        closeSystemButton.addActionListener(go);
        add(closeSystemButton);
        
        setTitle("CLINICA CURRAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // ajust the size of the frame
        setLayout(null);
        setVisible(true); // show the frame
    }
    
    private class GoTo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == acessAgendaButton) {
                Agenda agenda = new Agenda();
            }
            else if(event.getSource() == appointmentButton) {
                Appointment appointment = new Appointment();
            }
            else if(event.getSource() == billPaymentButton) {
                PayBills payBills = new PayBills();
            }
            else if(event.getSource() == timeSheetButton) {
                TimeSheet timeSheet = new TimeSheet();
            }
            else if(event.getSource() == registerEmployeeButton) {
                RegisterEmployee registerEmployee = new RegisterEmployee();
            }
            else if(event.getSource() == closeSystemButton) {
                dispose();
            }
            dispose();
        }
    }
}
