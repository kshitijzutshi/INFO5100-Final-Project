/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Recycle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import models.Inventory.Item;
import models.User.Client.Client;

/**
 *
 * @author phaniginjupalli
 */
public class RecycleBatch {
    
    private ArrayList<Item> items;
    private int price;
    private Client soldTo;
    private LocalDateTime soldAt;
    
    public RecycleBatch() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item addItem(Item item) {
        this.items.add(item);
        return item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Client getSoldTo() {
        return soldTo;
    }

    public void setSoldTo(Client soldTo) {
        this.soldTo = soldTo;
    }

    public LocalDateTime getSoldAt() {
        return soldAt;
    }

    public void setSoldAt(LocalDateTime soldAt) {
        this.soldAt = soldAt;
    }
    
    
}
