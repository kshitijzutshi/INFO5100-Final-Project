/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;


import models.ClientOrder.ClientOrder;
import models.User.Employee.LogisticsMan;

/**
 *
 * @author phaniginjupalli
 */
public class ClientDropoff extends WorkRequest{
    
    private ClientOrder client;
    private LogisticsMan logisticsMan;

    public ClientOrder getClient() {
        return client;
    }

    public void setClient(ClientOrder client) {
        this.client = client;
    }    

    public LogisticsMan getLogisticsMan() {
        return logisticsMan;
    }

    public void setLogisticsMan(LogisticsMan assignedTo) {
        this.logisticsMan = assignedTo;
    }
    
    
}
