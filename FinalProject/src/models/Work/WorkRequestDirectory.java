/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import models.User.Employee.LogisticsMan;
import models.User.Employee.QCInspector;
import models.User.Employee.Technician;

/**
 *
 * @author phaniginjupalli
 */
public class WorkRequestDirectory {
    
    ArrayList<ClientDropoff> dropOffs;
    ArrayList<InventoryPickup> inventoryPickups;
    ArrayList<QCInspection> qcInspections;
    ArrayList<RefurbAssignment> refurbAssignments;
    
    private HashMap<QCInspector, Integer> qcInspectionAssignmentMap;
    private HashMap<Technician, Integer> refurbAssignmentMap;
    
    public WorkRequestDirectory() {
        this.dropOffs = new ArrayList<>();
        this.inventoryPickups = new ArrayList<>();
        this.qcInspections = new ArrayList<>();
        this.refurbAssignments = new ArrayList<>();
        this.qcInspectionAssignmentMap = new HashMap<>();
        this.refurbAssignmentMap = new HashMap<>();
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
    
    public InventoryPickup getActivePickup(LogisticsMan logisticsMan) {
        for (InventoryPickup pickup: this.getPickupsByLogisticMan(logisticsMan)) {
            if (pickup.getStatus() == InventoryPickup.RequestStatus.ASSIGNED || pickup.getStatus() == InventoryPickup.RequestStatus.ONGOING) return pickup;
            return pickup;
        }
        return null;
    }
    
    public void increaseqcInspectionAssignmentCount(QCInspector qcInspector) {
        Integer x = this.qcInspectionAssignmentMap.get(qcInspector);
        this.qcInspectionAssignmentMap.replace(qcInspector, ++x);
    }
    
    public void decreaseqcInspectionAssignmentCount(QCInspector qcInspector) {
        Integer x = this.qcInspectionAssignmentMap.get(qcInspector);
        this.qcInspectionAssignmentMap.replace(qcInspector, --x);
    }
    
    public void increaserefurbAssignmentMapCount(Technician technician) {
        Integer x = this.refurbAssignmentMap.get(technician);
        this.refurbAssignmentMap.replace(technician, ++x);
    }
    
    public void decreaserefurbAssignmentMapCount(Technician technician) {
        Integer x = this.refurbAssignmentMap.get(technician);
        this.refurbAssignmentMap.replace(technician, --x);
    }
    
    public QCInspector getQCtoAssign() {
        // round robin to assign for QC
        return Collections.min(this.qcInspectionAssignmentMap.entrySet(), HashMap.Entry.comparingByValue()).getKey();
    }
    
    public Technician getTechniciantoAssign() {
        // round robin to assign for Technician
        return Collections.min(this.refurbAssignmentMap.entrySet(), HashMap.Entry.comparingByValue()).getKey();
    }
}
