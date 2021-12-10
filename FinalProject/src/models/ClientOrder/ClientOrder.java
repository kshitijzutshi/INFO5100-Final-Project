/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.ClientOrder;

import java.util.ArrayList;
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
    
    public ClientOrder(Client client) {
        this.client = client;
    }
}
