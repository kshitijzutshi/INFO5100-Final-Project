/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.User.Employee;

import java.util.ArrayList;

/**
 *
 * @author phaniginjupalli
 */
public class EmployeeDirectory {
    
    private ArrayList<LogisticsMan> logisticsMen;
    private ArrayList<OperationsManager> inventoryManagers;
    private ArrayList<QCInspector> qcInspectors;
    private ArrayList<Technician> technicians;
    
    public EmployeeDirectory() {
        this.logisticsMen = new ArrayList<>();
        this.inventoryManagers = new ArrayList<>();
        this.qcInspectors = new ArrayList<>();
        this.technicians = new ArrayList<>();
    }
    
    public LogisticsMan addLogisticsMen(LogisticsMan logMan) {
        this.logisticsMen.add(logMan);
        return logMan;
    }
    
    public OperationsManager addInventoryManager(OperationsManager invMan) {
        this.inventoryManagers.add(invMan);
        return invMan;
    }
    
    public QCInspector addQCInspector(QCInspector qc) {
        this.qcInspectors.add(qc);
        return qc;
    }
    
    public Technician addTechnician(Technician technician) {
        this.technicians.add(technician);
        return technician;
    }
    
    public void removeLogisticsMan(LogisticsMan logMan) {
        this.logisticsMen.remove(logMan);
    }
    
    public void removeInventoryManager(OperationsManager invMan) {
        this.inventoryManagers.remove(invMan);
    }
    
    public void removeQCInspector(QCInspector qc) {
        this.qcInspectors.remove(qc);
    }
    
    public void removeTechnician(Technician technician) {
        this.technicians.remove(technician);
    }

    public ArrayList<LogisticsMan> getLogisticsMen() {
        return this.logisticsMen;
    }

    public ArrayList<OperationsManager> getInventoryManagers() {
        return this.inventoryManagers;
    }

    public ArrayList<QCInspector> getQcInscpectors() {
        return this.qcInspectors;
    }

    public ArrayList<Technician> getTechnicians() {
        return technicians;
    }
    
    public LogisticsMan getNextAvailableLogisticsMan() {
        for (LogisticsMan logisticsMan: this.logisticsMen) {
            if (logisticsMan.isAvailable()) return logisticsMan;
        }
        return null;
    }
    
    
}
