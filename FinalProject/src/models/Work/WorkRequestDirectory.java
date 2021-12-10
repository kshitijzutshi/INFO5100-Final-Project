/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;

import java.util.ArrayList;
import models.User.Employee.LogisticsMan;

/**
 *
 * @author phaniginjupalli
 */
public class WorkRequestDirectory {
    
    ArrayList<ClientDropoff> dropOffs;
    ArrayList<InventoryPickup> inventoryPickups;
    ArrayList<QCInspection> qcInspections;
    ArrayList<RefurbAssignment> refurbAssignments;
    
    public WorkRequestDirectory() {
        this.dropOffs = new ArrayList<>();
        this.inventoryPickups = new ArrayList<>();
        this.qcInspections = new ArrayList<>();
        this.refurbAssignments = new ArrayList<>();
    }

    public ArrayList<ClientDropoff> getRetailOrders() {
        return dropOffs;
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
    
    public ClientDropoff addClientDropoff(ClientDropoff retailOrder) {
        this.dropOffs.add(retailOrder);
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
    
    
    public ArrayList<InventoryPickup> getPickupsByLogisticMan(LogisticsMan logisticsMan) {
        ArrayList<InventoryPickup> pickups = new ArrayList<>();
        for (InventoryPickup pickup: this.inventoryPickups) {
            if (pickup.getLogisticsMan() == logisticsMan) pickups.add(pickup);
        }
        return pickups;
    }
    
    public ArrayList<ClientDropoff> getDropoffByLogisticMan(LogisticsMan logisticsMan) {
        ArrayList<ClientDropoff> dropoffs = new ArrayList<>();
        for (ClientDropoff dropoff: this.dropOffs) {
            if (dropoff.getLogisticsMan()== logisticsMan) dropoffs.add(dropoff);
        }
        return dropoffs;
    }
}
