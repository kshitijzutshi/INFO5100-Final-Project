/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;

import java.util.ArrayList;

/**
 *
 * @author phaniginjupalli
 */
public class WorkRequestDirectory {
    
    ArrayList<RetailOrder> retailOrders;
    ArrayList<InventoryPickup> inventoryPickups;
    ArrayList<QCInspection> qcInspections;
    ArrayList<RefurbAssignment> refurbAssignments;
    
    public WorkRequestDirectory() {
        this.retailOrders = new ArrayList<>();
        this.inventoryPickups = new ArrayList<>();
        this.qcInspections = new ArrayList<>();
        this.refurbAssignments = new ArrayList<>();
    }

    public ArrayList<RetailOrder> getRetailOrders() {
        return retailOrders;
    }

    public ArrayList<InventoryPickup> getInventoryPickups() {
        return inventoryPickups;
    }

    public ArrayList<QCInspection> getQcInspections() {
        return qcInspections;
    }

    public ArrayList<RefurbAssignment> getRefurbAssignments() {
        return refurbAssignments;
    }
    
    public RetailOrder addRetailOrder(RetailOrder retailOrder) {
        this.retailOrders.add(retailOrder);
        return retailOrder;
    }
    
    public InventoryPickup addInventoryPickup(InventoryPickup inventoryPickup) {
        this.inventoryPickups.add(inventoryPickup);
        return inventoryPickup;
    }
    
    public QCInspection addQCInspection(QCInspection qcInspleciton) {
        this.qcInspections.add(qcInspleciton);
        return qcInspleciton;
    }
    
    public RefurbAssignment addRefurbAssignment(RefurbAssignment retailOrder) {
        this.refurbAssignments.add(retailOrder);
        return retailOrder;
    }
    
        
}
