/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User.Customer;

import java.util.UUID;
import models.Person.Person;
import models.Role.ResidentRole;
import models.User.UserAccount;

/**
 *
 * @author phaniginjupalli
 */
public class Resident extends Person{
    
    final String cid;
    final UserAccount userAccount;
    
    public Resident(String username, String password) {
        this.userAccount = new UserAccount(username, password, new ResidentRole());
        this.cid = UUID.randomUUID().toString().substring(0,5);
    }
    
}
