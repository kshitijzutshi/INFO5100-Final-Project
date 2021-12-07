/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.User.Customer.CustomerDirectory;
import models.User.Employee.EmployeeDirectory;
import models.User.UserAccountDirectory;


/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerDirectory;
    

    public Organization(String name) {
        this.name = name;
        this.userAccountDirectory = new UserAccountDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.customerDirectory = new CustomerDirectory();
        
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
