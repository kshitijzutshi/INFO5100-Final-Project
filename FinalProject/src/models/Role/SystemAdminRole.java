/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Role;

import models.EcoSystem;

import javax.swing.JPanel;
import models.User.UserAccount;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return null;
    }
    
}
