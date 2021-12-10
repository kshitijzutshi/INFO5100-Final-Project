/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.CustomerBooking.BookingDirectory;
import models.Inventory.InventoryDirectory;
import models.User.Client.ClientDirectory;
import models.User.Customer.CustomerDirectory;
import models.User.Employee.EmployeeDirectory;
import models.User.UserAccountDirectory;
import models.Work.WorkRequestDirectory;


/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerDirectory;
    private BookingDirectory bookingDirectory;
    private InventoryDirectory inventoryDirectory;
    private WorkRequestDirectory workRequestDirectory;
    private ClientDirectory clientDirectory;

    public Organization(String name) {
        this.name = name;
        this.userAccountDirectory = new UserAccountDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.bookingDirectory = new BookingDirectory();
        this.inventoryDirectory = new InventoryDirectory();
        this.workRequestDirectory = new WorkRequestDirectory();
        this.clientDirectory = new ClientDirectory();
        
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

    public BookingDirectory getBookingDirectory() {
        return bookingDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public WorkRequestDirectory getWorkRequestDirectory() {
        return workRequestDirectory;
    }

    public ClientDirectory getClientDirectory() {
        return clientDirectory;
    }
    
    
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
