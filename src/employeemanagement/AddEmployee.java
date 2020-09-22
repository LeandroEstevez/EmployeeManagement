/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author leandroestevez
 */
public class AddEmployee extends JPanel {
    
    private final String firstNameLabelText = "First name";
    private final String lastNameLabelText = "Last name";
    private final String genderLabelText = "Gender";
    
    private final int firstNameFieldWidth = 10;
    private final int lastNameFieldWidth = 10;
    private final int genderFieldWidth = 10;
    
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField genderField;
    
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel genderLabel;
    
    private JPanel addButtonPanel;
    
    public AddEmployee() {
    
        this.createComponents();
        
    }
   
    
    private void createFields() {
        
        firstNameField = new JTextField(firstNameFieldWidth);
        lastNameField = new JTextField(lastNameFieldWidth);
        genderField = new JTextField(genderFieldWidth);
        
    }
    
    private void createLabels() {
        
        firstNameLabel = new JLabel(firstNameLabelText);
        lastNameLabel = new JLabel(lastNameLabelText);
        genderLabel = new JLabel(genderLabelText);
        
    }
    
    private void createButton() {
        
        JButton addButton = new JButton("Add employee");
        addButtonPanel = new JPanel(new BorderLayout());
        addButtonPanel.add(addButton, BorderLayout.CENTER);
        
    }
    
    private void createComponents() {
        
        createLabels();
        createFields();
        createButton();
        
        JPanel fieldPanel1 = new JPanel(new BorderLayout());
        fieldPanel1.add(firstNameLabel, BorderLayout.NORTH);
        fieldPanel1.add(firstNameField, BorderLayout.SOUTH);
        
        JPanel fieldPanel2 = new JPanel(new BorderLayout());
        fieldPanel2.add(lastNameLabel, BorderLayout.NORTH);
        fieldPanel2.add(lastNameField, BorderLayout.SOUTH);
        
        JPanel fieldPanel3 = new JPanel(new BorderLayout());
        fieldPanel3.add(genderLabel, BorderLayout.NORTH);
        fieldPanel3.add(genderField, BorderLayout.SOUTH);
        
        add(addButtonPanel);
        add(fieldPanel1);
        add(fieldPanel2);
        add(fieldPanel3);
        
    }
    
}
