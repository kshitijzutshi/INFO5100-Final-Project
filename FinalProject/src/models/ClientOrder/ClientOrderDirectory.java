/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.ClientOrder;

import java.util.ArrayList;
import models.User.Client.Client;

/**
 *
 * @author phaniginjupalli
 */
public class ClientOrderDirectory {
    
    private ArrayList<ClientOrder> clientOrders;
    
    public ClientOrderDirectory() {
        this.clientOrders = new ArrayList<>();
    }

    public ArrayList<ClientOrder> getBookings() {
        return clientOrders;
    }
    
    public ClientOrder addBooking(ClientOrder clientOrder) {
        this.clientOrders.add(clientOrder);
        return clientOrder;
    }
    
    public ArrayList<ClientOrder> getOrdersByClient(Client client) {
        ArrayList<ClientOrder> orders = new ArrayList<>();
        for (ClientOrder clientOrder: this.clientOrders) {
            if (clientOrder.getClient()== client) {
                orders.add(clientOrder);
            }
        }
        return orders;
    }
}
