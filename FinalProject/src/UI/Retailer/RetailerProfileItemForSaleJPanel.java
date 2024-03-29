/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Retailer;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.ClientOrder.ClientOrder;
import models.ClientOrder.ClientOrderDirectory;
import models.EcoSystem;
import models.Inventory.InventoryDirectory;
import models.Inventory.Item;
import models.User.Client.Client;
import models.User.Customer.Resident;

/**
 *
 * @author kshitij
 */
public class RetailerProfileItemForSaleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetailerProfileItemForSaleJPanel
     */
    JPanel jpanel9;
    private EcoSystem ecosystem;
    private Client client;
    private ArrayList<Item> itemsAddedToCart;
    public RetailerProfileItemForSaleJPanel(JPanel RetailerProfileItemForSale, EcoSystem ecosystem, Client client) {
        initComponents();
        this.ecosystem = ecosystem;
        this.client = client;
//        welcomeLabel.setText(this.resident.getFullName());
        this.RetailerItemsForSaleJPanel = RetailerProfileItemForSale;
        this.itemsAddedToCart = new ArrayList<>();
        this.populateTable();
    }
    
    
    
    private void populateTable() {
      
        DefaultTableModel model = (DefaultTableModel) retailtableData.getModel();
        model.setRowCount(0);
        for (Item itemsToPopulate : ecosystem.getInventoryDirectory().getInventoryByStatus(Item.ItemStatus.READY_FOR_SALE)){
            if(itemsToPopulate.getType() != Item.ItemType.REFURB){
                continue;
            }
            Object[] data = new Object[6];
            data[0] = itemsToPopulate;
            data[1] = itemsToPopulate.getCategory();
            data[2] = itemsToPopulate.getSubCategory();
            data[3] = itemsToPopulate.getMake();
            data[4] = itemsToPopulate.getModel();
            data[5] = itemsToPopulate.getPrice();
            model.addRow(data);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RetailerItemsForSaleJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        retailtableData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderSummaryTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnPurchaseOrder = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        radioBtnCash = new javax.swing.JRadioButton();
        radioBtnBankTransfer = new javax.swing.JRadioButton();
        radioBtnPayPal = new javax.swing.JRadioButton();

        setLayout(new java.awt.CardLayout());

        RetailerItemsForSaleJPanel.setBackground(new java.awt.Color(255, 255, 255));

        retailtableData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        retailtableData.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        retailtableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Appliance Category", "Applicance Type", "Make", "Model", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        retailtableData.setGridColor(new java.awt.Color(255, 255, 255));
        retailtableData.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(retailtableData);

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(51, 51, 51)));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel9.setText("Select an Item");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel1.setText("Order Summary");

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(51, 51, 51)));

        OrderSummaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrderSummaryTable);

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/us_dollar_24px.png"))); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/price_tag_18px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalField)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel4.setText("Select Payment Type");

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(51, 51, 51)));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash_48px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel7.setText("Cash on Delivery");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bank_transfer_48px.png"))); // NOI18N

        jLabel10.setText("Bank Transfer");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paypal_48px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel12.setText("PayPal");

        btnPurchaseOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnPurchaseOrder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 3, true));
        btnPurchaseOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseOrderMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PURCHASE NOW");

        javax.swing.GroupLayout btnPurchaseOrderLayout = new javax.swing.GroupLayout(btnPurchaseOrder);
        btnPurchaseOrder.setLayout(btnPurchaseOrderLayout);
        btnPurchaseOrderLayout.setHorizontalGroup(
            btnPurchaseOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPurchaseOrderLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        btnPurchaseOrderLayout.setVerticalGroup(
            btnPurchaseOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPurchaseOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAddToCart.setBackground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnAddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToCartMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_shopping_cart_24px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel18.setText("Add to Cart");

        javax.swing.GroupLayout btnAddToCartLayout = new javax.swing.GroupLayout(btnAddToCart);
        btnAddToCart.setLayout(btnAddToCartLayout);
        btnAddToCartLayout.setHorizontalGroup(
            btnAddToCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddToCartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAddToCartLayout.setVerticalGroup(
            btnAddToCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddToCartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAddToCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        radioBtnCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RetailerItemsForSaleJPanelLayout = new javax.swing.GroupLayout(RetailerItemsForSaleJPanel);
        RetailerItemsForSaleJPanel.setLayout(RetailerItemsForSaleJPanelLayout);
        RetailerItemsForSaleJPanelLayout.setHorizontalGroup(
            RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                        .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                        .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                .addComponent(radioBtnCash)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnBankTransfer)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnPayPal)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(btnPurchaseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        RetailerItemsForSaleJPanelLayout.setVerticalGroup(
            RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPurchaseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioBtnBankTransfer)
                                            .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radioBtnCash)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(radioBtnPayPal)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(RetailerItemsForSaleJPanelLayout.createSequentialGroup()
                                .addGroup(RetailerItemsForSaleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        add(RetailerItemsForSaleJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToCartMouseClicked
        // TODO add your handling code here:
        Item itemSelected = (Item) retailtableData.getValueAt(retailtableData.getSelectedRow(), 0);
        DefaultTableModel table = (DefaultTableModel) OrderSummaryTable.getModel();
        table.setRowCount(0);
        this.itemsAddedToCart.add(itemSelected);
        int totalPriceInCart = 0;
        for(Item item : this.itemsAddedToCart){
                Object[] data = new Object[2];
                data[0] = item.getSubCategory();
                data[1] = item.getPrice();
                System.out.println("Price cart:"+item.getPrice());
                table.addRow(data);
                table.setRowCount(table.getRowCount());
                totalPriceInCart+=item.getPrice();
        }
        
        totalField.setText(String.valueOf(totalPriceInCart));
        
       
    }//GEN-LAST:event_btnAddToCartMouseClicked

    private void btnPurchaseOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseOrderMouseClicked
        // TODO add your handling code here:
        ClientOrder newOrder = new ClientOrder(this.client);
        for(Item item : this.itemsAddedToCart){
            item.setStatus(Item.ItemStatus.BLOCKED_FOR_ORDER);
            System.out.println("Item Type"+item.getType());
            newOrder.addItem(item);
            if(radioBtnCash.isSelected()){
                newOrder.getClient().setPaymenttype(Client.paymentType.CASH_ON_DELIVERY);
            }
            else if(radioBtnBankTransfer.isSelected()){
                newOrder.getClient().setPaymenttype(Client.paymentType.BANK_TRANSFER);
            }
            else if(radioBtnPayPal.isSelected()){
                newOrder.getClient().setPaymenttype(Client.paymentType.PAYPAL);
            }
            
        }
        // Add ClientOrder to client order directory
        this.ecosystem.getClientOrderDirectory().addBooking(newOrder);
        totalField.setText("");
        radioBtnCash.setSelected(false);
        radioBtnBankTransfer.setSelected(false);
        radioBtnPayPal.setSelected(false);
        JOptionPane.showMessageDialog(null, "Order Placed Successfully!");
        this.itemsAddedToCart = new ArrayList<>();
        this.populateTable();
        totalField.setText("");
        DefaultTableModel table = (DefaultTableModel) OrderSummaryTable.getModel();
        table.setRowCount(0);
        radioBtnBankTransfer.setSelected(false);
        radioBtnCash.setSelected(false);
        radioBtnPayPal.setSelected(false);
    }//GEN-LAST:event_btnPurchaseOrderMouseClicked

    private void radioBtnCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnCashActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderSummaryTable;
    private javax.swing.JPanel RetailerItemsForSaleJPanel;
    private javax.swing.JPanel btnAddToCart;
    private javax.swing.JPanel btnPurchaseOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioBtnBankTransfer;
    private javax.swing.JRadioButton radioBtnCash;
    private javax.swing.JRadioButton radioBtnPayPal;
    private javax.swing.JTable retailtableData;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
