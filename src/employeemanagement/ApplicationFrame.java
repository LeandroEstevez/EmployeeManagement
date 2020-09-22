/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author leandroestevez
 */
public class ApplicationFrame extends JFrame {
    
    private JPanel generalContainer;
    private JPanel addEmployeeSection;
    
    public ApplicationFrame() {
        
        this.setSize(800, 800); 
        this.createContent();
        
    }
    
    private void createContent() {
        
        generalContainer = new JPanel(new BorderLayout());
        generalContainer.setBackground(Color.DARK_GRAY);
        
        addEmployeeSection = new AddEmployee();
        
        generalContainer.add(addEmployeeSection, BorderLayout.NORTH);
        
        add(generalContainer);
        
    }
    
}
