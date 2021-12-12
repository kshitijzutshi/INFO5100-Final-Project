/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.ClientOrder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import models.Inventory.Item;
import models.User.Client.Client;

/**
 *
 * @author phaniginjupalli
 */
public class ClientOrder {
    
    private String id;
    private Client client;
    private ArrayList<Item> orderedItems;
    private LocalDateTime orderTime;
    
    public ClientOrder(Client client) {
        this.client = client;
        this.orderedItems = new ArrayList<>();
        this.id = UUID.randomUUID().toString().substring(0,5);
        this.orderTime = LocalDateTime.now();
    }

    public Client getClient() {
        return client;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    
    public ArrayList<Item> getOrderedItems() {
        return orderedItems;
    }
    
    public Item addItem(Item item) {
        this.orderedItems.add(item);
        return item;
    }
    
    
}
