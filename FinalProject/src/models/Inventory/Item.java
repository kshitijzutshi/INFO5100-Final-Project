/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Inventory;

import java.time.LocalDateTime;
import java.util.UUID;
import models.User.Customer.Resident;

/**
 *
 * @author phaniginjupalli
 */
public class Item {
    
    private final String id;
    private final Resident recievedFrom;
    private final String category;
    private final String subCategory;
    private ItemCondition condition;
    private final LocalDateTime recievedOn;
    private LocalDateTime soldOn;
    private ItemStatus status;
    private ItemType type;
    
    
    private String make;
    private String model;
    private int manufactureYear;
    
    public Item(Resident recievedFrom, String category, String subCategory) {
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.recievedFrom = recievedFrom;
        this.category = category;
        this.subCategory = category;
        this.recievedOn = LocalDateTime.now();
        this.type = ItemType.TBD;
    }
    
    public enum ItemCondition {
        GOOD,
        REPAIRABLE,
        BROKEN,
    }
    
    public enum ItemStatus {
        AWAITING,
        PROCURED,
        IN_QC,
        IN_REPAIR,
        READY_FOR_SALE,
        SOLD
    }
    
    
    public enum ItemType {
        TBD,
        RECYCLE,
        REFURB
    }
    
    public int getRewardPoints() {
        return 0;
    }

    public String getId() {
        return id;
    }

    public Resident getRecievedFrom() {
        return recievedFrom;
    }
    

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public ItemCondition getCondition() {
        return condition;
    }

    public void setCondition(ItemCondition condition) {
        this.condition = condition;
    }

    public LocalDateTime getRecievedOn() {
        return this.recievedOn;
    }

    public LocalDateTime getSoldOn() {
        return soldOn;
    }

    public void setSoldOn(LocalDateTime soldOn) {
        this.soldOn = soldOn;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    
}
