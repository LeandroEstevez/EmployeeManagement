/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author leandroestevez
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int socialSecurityNumber;
    private String gender;
    
    public Employee(String firstName, String lastName, String dateOfBirth, 
            int socialSecurityNumber, String gender) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
        this.gender = gender;
        
    }
    
    /**
     * Return the first name of the employee
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Return the last name of the employee
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Return the date of birth of the employee
     * @return date of birth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Return the social security number of the employee
     * @return social security number
     */
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Return the gender of the employee
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the first name of the employee
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set the last name of the employee
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Set the date of birth of the employee
     * @param dateOfBirth 
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Set the social security number of the employee
     * @param socialSecurityNumber 
     */
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Set the gender of the employee
     * @param gender 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
