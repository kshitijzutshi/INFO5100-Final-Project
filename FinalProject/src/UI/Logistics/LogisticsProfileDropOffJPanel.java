/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Logistics;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Employee.LogisticsMan;
import models.Work.ClientDropoff;
import models.Work.WorkRequest;

/**
 *
 * @author shrey
 */
public class LogisticsProfileDropOffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsProfileDropOffJPanel
     */
    
    JPanel jpanel17;
    EcoSystem ecosystem;
    LogisticsMan logisticsMan;
    ClientDropoff activeCLienDropOff;
    public LogisticsProfileDropOffJPanel(JPanel ScheduleDropOff, EcoSystem ecosystem, LogisticsMan logisticsMan) {
        initComponents();
        
        this.LogisticsDropOffProfileJPanel = ScheduleDropOff;
        this.ecosystem = ecosystem;
        this.logisticsMan = logisticsMan;
        this.activeCLienDropOff = ecosystem.getWorkRequestDirectory().getActiveDropOff(logisticsMan);
        if(this.activeCLienDropOff == null){
            JOptionPane.showMessageDialog(null, "No Acive Drop Off at present!");
        }
        if (this.activeCLienDropOff.getStatus() == ClientDropoff.RequestStatus.ONGOING) btnpickup.setEnabled(false);
        this.populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblscheddropoffs.getModel();
        model.setRowCount(0);
        for(Item itemDropOffPopulateTable : this.activeCLienDropOff.getClientOrder().getOrderedItems()){
            Object[] data = new Object[9];
            data[0] = itemDropOffPopulateTable;
            data[1] = itemDropOffPopulateTable.getCategory();
            data[2] = itemDropOffPopulateTable.getSubCategory();
            data[3] = itemDropOffPopulateTable.getMake();
            data[4] = itemDropOffPopulateTable.getModel();
            data[5] = itemDropOffPopulateTable.getManufactureYear();
            data[6] = itemDropOffPopulateTable.getWeightApprox();
            data[7] = itemDropOffPopulateTable.getCondition();
            data[8] = itemDropOffPopulateTable.getStatus();
            
        }
       
        dropOffUsername.setText(String.valueOf(activeCLienDropOff.getClientOrder().getClient().getFullName()));
        dropOffUsername.setText(String.valueOf(activeCLienDropOff.getClientOrder().getClient().getAddress()));
        dropOffUsername.setText(String.valueOf(activeCLienDropOff.getClientOrder().getClient().getPhone()));
       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogisticsDropOffProfileJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dropOffUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dropOffUserAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dropOffUserMobile = new javax.swing.JTextField();
        btnMarkedDelivered = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnpickup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblscheddropoffs = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        LogisticsDropOffProfileJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Scheduled Drop-off Orders");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setText("Client details");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("Name:");

        dropOffUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Address:");

        dropOffUserAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setText("Mobile:");

        dropOffUserMobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        btnMarkedDelivered.setBackground(new java.awt.Color(205, 223, 245));
        btnMarkedDelivered.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnMarkedDelivered.setForeground(new java.awt.Color(51, 51, 51));
        btnMarkedDelivered.setText("Marked Delivered");
        btnMarkedDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkedDeliveredActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open_parcel_127px.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel16.setText("Order details");

        btnpickup.setBackground(new java.awt.Color(205, 223, 245));
        btnpickup.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnpickup.setForeground(new java.awt.Color(51, 51, 51));
        btnpickup.setText("Pick-Up");
        btnpickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpickupActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblscheddropoffs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "E-Waste Category", "Appliance Type", "Item Make", "Item Model", "Year of Manufacture", "Weight", "Condition", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblscheddropoffs.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblscheddropoffs);

        javax.swing.GroupLayout LogisticsDropOffProfileJPanelLayout = new javax.swing.GroupLayout(LogisticsDropOffProfileJPanel);
        LogisticsDropOffProfileJPanel.setLayout(LogisticsDropOffProfileJPanelLayout);
        LogisticsDropOffProfileJPanelLayout.setHorizontalGroup(
            LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                                .addComponent(btnpickup, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnMarkedDelivered))
                            .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dropOffUserMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dropOffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(82, 82, 82))
                                    .addComponent(dropOffUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel16))
                    .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        LogisticsDropOffProfileJPanelLayout.setVerticalGroup(
            LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogisticsDropOffProfileJPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropOffUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropOffUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropOffUserMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(LogisticsDropOffProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpickup)
                    .addComponent(btnMarkedDelivered))
                .addGap(83, 83, 83))
        );

        add(LogisticsDropOffProfileJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnpickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpickupActionPerformed
        // TODO add your handling code here:
        activeCLienDropOff.setStatus(WorkRequest.RequestStatus.ONGOING);
        JOptionPane.showConfirmDialog(null, "Drop Off Order Picked-Up!");
        
    }//GEN-LAST:event_btnpickupActionPerformed

    private void btnMarkedDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkedDeliveredActionPerformed
        // TODO add your handling code here:
        for(Item itemsStatusChange : this.activeCLienDropOff.getClientOrder().getOrderedItems()){
            itemsStatusChange.setStatus(Item.ItemStatus.SOLD);
        }
        activeCLienDropOff.setResolveDate(LocalDateTime.now());
        activeCLienDropOff.getLogisticsMan().setAvailable(true);
        JOptionPane.showConfirmDialog(null, "Drop Off Order delivered!");
        
    }//GEN-LAST:event_btnMarkedDeliveredActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogisticsDropOffProfileJPanel;
    private javax.swing.JButton btnMarkedDelivered;
    private javax.swing.JButton btnpickup;
    private javax.swing.JTextField dropOffUserAddress;
    private javax.swing.JTextField dropOffUserMobile;
    private javax.swing.JTextField dropOffUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblscheddropoffs;
    // End of variables declaration//GEN-END:variables
}
