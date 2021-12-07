/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User.Employee;

import java.util.UUID;
import models.Role.LogisticsManRole;
import models.User.UserAccount;

/**
 *
 * @author phaniginjupalli
 */
public class LogisticsMan extends UserAccount{
    
    final String eid;
    
    public LogisticsMan(String username, String password) {
        super(username, password, new LogisticsManRole());
        this.eid = UUID.randomUUID().toString().substring(0,5);
    }
}
