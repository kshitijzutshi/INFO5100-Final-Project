/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Role;

import javax.swing.JPanel;
import models.EcoSystem;
import models.User.UserAccount;

/**
 *
 * @author phaniginjupalli
 */
public class ClientRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return null;
    }
}