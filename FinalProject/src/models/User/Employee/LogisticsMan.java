/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User.Employee;

import java.util.UUID;
import models.User.Person;
import models.Role.LogisticsManRole;
import models.User.UserAccount;

/**
 *
 * @author phaniginjupalli
 */
public class LogisticsMan extends Person{
    
    final String eid;
    final UserAccount userAccount;
    private boolean available;
    
    public LogisticsMan(String username, String password) {
        this.userAccount = new UserAccount(username, password, new LogisticsManRole());
        this.eid = UUID.randomUUID().toString().substring(0,5);
        this.available = true;
    }

    public String getEid() {
        return eid;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
}
