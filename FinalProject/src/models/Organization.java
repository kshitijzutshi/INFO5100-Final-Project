/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.User.UserAccountDirectory;


/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    

    public Organization(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
