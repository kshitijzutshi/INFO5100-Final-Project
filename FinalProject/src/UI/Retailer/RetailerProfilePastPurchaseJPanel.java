/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Retailer;

import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.ClientOrder.ClientOrder;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Client.Client;

/**
 *
 * @author kshitij
 */
public class RetailerProfilePastPurchaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetailerProfilePastPurchaseJPanel
     */
    JPanel jpanel9;
    EcoSystem ecosystem;
    private Client client;
    
    public RetailerProfilePastPurchaseJPanel(JPanel RetailerProfilePastPurchase, EcoSystem ecosystem, Client client) {
        initComponents();
        this.retailProfilePastPurchase = RetailerProfilePastPurchase;
        this.ecosystem = ecosystem;
        this.client = client;
        this.populateTable();
    }
    
    
    private void populateTable() {
      
        DefaultTableModel model = (DefaultTableModel) PastOrderTable.getModel();
        model.setRowCount(0);
        for (ClientOrder clientorder : ecosystem.getClientOrderDirectory().getOrdersByClient(client)){
            for(Item itemtoPopulate : clientorder.getOrderedItems()){
                if(itemtoPopulate.getType() != Item.ItemType.REFURB){
                JOptionPane.showMessageDialog(null, "No Past orders!");
                continue;
            }
            System.out.println(itemtoPopulate.getStatus());
            System.out.println(itemtoPopulate.getType());
            Object[] data = new Object[8];
            data[0] = itemtoPopulate;
            data[1] = itemtoPopulate.getCategory();
            data[2] = itemtoPopulate.getSubCategory();
            data[3] = itemtoPopulate.getMake();
            data[4] = itemtoPopulate.getModel();
            data[5] = itemtoPopulate.getPrice();
            data[6] = clientorder.getOrderTime().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            data[7] = itemtoPopulate.getStatus();
            model.addRow(data);
            }
            
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

        retailProfilePastPurchase = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PastOrderTable = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        retailProfilePastPurchase.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel1.setText("Past Order Summary");

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(51, 51, 51)));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/price_tag_18px.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jScrollPane1.setOpaque(false);

        PastOrderTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PastOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Appliance Category", "Applicance Type", "Make", "Model", "Price", "Order Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PastOrderTable.setGridColor(new java.awt.Color(255, 255, 255));
        PastOrderTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        PastOrderTable.setSelectionBackground(new java.awt.Color(167, 190, 211));
        jScrollPane1.setViewportView(PastOrderTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout retailProfilePastPurchaseLayout = new javax.swing.GroupLayout(retailProfilePastPurchase);
        retailProfilePastPurchase.setLayout(retailProfilePastPurchaseLayout);
        retailProfilePastPurchaseLayout.setHorizontalGroup(
            retailProfilePastPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retailProfilePastPurchaseLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        retailProfilePastPurchaseLayout.setVerticalGroup(
            retailProfilePastPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retailProfilePastPurchaseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        add(retailProfilePastPurchase, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PastOrderTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel retailProfilePastPurchase;
    // End of variables declaration//GEN-END:variables
}
