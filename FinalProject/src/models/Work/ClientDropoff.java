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
    
    private ClientOrder clientOrder;
    private LogisticsMan logisticsMan;

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(ClientOrder client) {
        this.clientOrder = client;
    }    

    public LogisticsMan getLogisticsMan() {
        return logisticsMan;
    }

    public void setLogisticsMan(LogisticsMan assignedTo) {
        this.logisticsMan = assignedTo;
    }
    
    
}
