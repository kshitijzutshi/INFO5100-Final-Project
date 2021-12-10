/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;

import models.CustomerBooking.InventoryBooking;
import models.User.Employee.LogisticsMan;

/**
 *
 * @author phaniginjupalli
 */
public class InventoryPickup extends WorkRequest{
    
    private LogisticsMan logisticsMan;
    private final InventoryBooking inventoryBooking;
    
    public InventoryPickup(InventoryBooking inventoryBooking) {
        this.inventoryBooking = inventoryBooking;
    }
    
        
    public LogisticsMan getLogisticsMan() {
        return logisticsMan;
    }

    public void setLogisticsMan(LogisticsMan logisticsMan) {
        this.logisticsMan = logisticsMan;
    }

    public InventoryBooking getInventoryBooking() {
        return inventoryBooking;
    }
    
    
    
}
