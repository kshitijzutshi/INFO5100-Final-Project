/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User.Employee;

import java.util.UUID;
import models.User.Person;
import models.Role.InventoryManagerRole;
import models.User.UserAccount;

/**
 *
 * @author phaniginjupalli
 */
public class OperationsManager extends Person{
    
    final String eid;
    final UserAccount userAccount; 
    
    public OperationsManager(String username, String password) {
        this.userAccount = new UserAccount(username, password, new InventoryManagerRole());
        this.eid = UUID.randomUUID().toString().substring(0,5);
    }

    public String getEid() {
        return eid;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }
    
    
}
