/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User;

import models.Role.Role;


/**
 *
 * @author phaniginjupalli
 */
public class UserAccount {
    
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private Role role;
    private String username;
    private String password;
    
    public UserAccount(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
