/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User.Customer;

import java.util.ArrayList;
import models.User.UserAccount;

/**
 *
 * @author phaniginjupalli
 */
public class CustomerDirectory {
    
    private ArrayList<Resident> residents;
    private ArrayList<Commercial> commercialCustomers;
    
    public Resident addResidents(Resident resident) {
        this.residents.add(resident);
        return resident;
    }
    
    public Commercial addCommercialCustomers(Commercial commercial) {
        this.commercialCustomers.add(commercial);
        return commercial;
    }

    public ArrayList<Resident> getResidents() {
        return residents;
    }


    public ArrayList<Commercial> getCommercialCustomers() {
        return commercialCustomers;
    }
    
    public Resident getResidentByUserAccount(UserAccount userAccount) {
        for (Resident resident: this.residents) {
            if (resident.getUserAccount() == userAccount) return resident;
        }
        return null;
    }
    
    public Resident getCommercialByUserAccount(UserAccount userAccount) {
//        for (Commercial commercial: this.commercialCustomers) {
//            if (resident.getUserAccount() == userAccount) return resident;
//        }
        return null;
    }
    
}
