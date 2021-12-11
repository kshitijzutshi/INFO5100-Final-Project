/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;

import models.Inventory.Item;
import models.User.Employee.QCInspector;


/**
 *
 * @author phaniginjupalli
 */
public class QCInspection extends WorkRequest{
    
    private QCInspector inspector;
    private Item item;
    
    public QCInspection(Item item, QCInspector inspector) {
        this.item = item;
        this.inspector = inspector;
    }

    public QCInspector getInspector() {
        return inspector;
    }

    public Item getItem() {
        return item;
    }
    
    
}
