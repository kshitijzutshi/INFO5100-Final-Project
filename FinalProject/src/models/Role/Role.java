/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Role;

import models.EcoSystem;

import models.User.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}