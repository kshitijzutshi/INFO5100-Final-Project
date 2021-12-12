/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Logistics;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.CustomerBooking.InventoryBooking;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Employee.LogisticsMan;
import models.User.Employee.QCInspector;
import models.Work.InventoryPickup;
import models.Work.QCInspection;
import models.Work.WorkRequest;

/**
 *
 * @author kshitij
 */
public class LogisticsProfileSchedulePickupJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsProfileSchedulePickupJPanel
     */
    JPanel jpanel77;
    EcoSystem ecosystem;
    LogisticsMan logisticsMan;
    InventoryPickup activePickup;
    public LogisticsProfileSchedulePickupJPanel(JPanel LogisticsSchedulePickupJPanel, EcoSystem ecosystem, LogisticsMan logisticsMan) {
        initComponents();
        this.LogisticsSchedulePickUpMain = LogisticsSchedulePickupJPanel;
        this.ecosystem = ecosystem;
        this.logisticsMan = logisticsMan;
        this.activePickup = this.ecosystem.getWorkRequestDirectory().getActivePickup(logisticsMan);
        if (this.activePickup == null) {
            JOptionPane.showMessageDialog(null, "No active pickup at this point of time");
        }
        this.populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogisticsSchedulePickUpMain = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        residentName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        residentAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        residentContactInfo = new javax.swing.JTextField();
        pickUpJButton = new javax.swing.JButton();
        markDeliveredJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblscheddropoffs = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        LogisticsSchedulePickUpMain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel4.setText("Schedule Pickup");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setText("Pending Order");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setText("Resident");

        residentName.setEditable(false);
        residentName.setBackground(new java.awt.Color(255, 255, 255));
        residentName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        residentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setText("Resident Address");

        residentAddress.setEditable(false);
        residentAddress.setBackground(new java.awt.Color(255, 255, 255));
        residentAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel9.setText("Contact Info");

        residentContactInfo.setEditable(false);
        residentContactInfo.setBackground(new java.awt.Color(255, 255, 255));
        residentContactInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        pickUpJButton.setBackground(new java.awt.Color(205, 223, 245));
        pickUpJButton.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        pickUpJButton.setText("Pick-Up");
        pickUpJButton.setBorderPainted(false);
        pickUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpJButtonActionPerformed(evt);
            }
        });

        markDeliveredJButton.setBackground(new java.awt.Color(205, 223, 245));
        markDeliveredJButton.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        markDeliveredJButton.setText("Mark Delivered");
        markDeliveredJButton.setBorderPainted(false);
        markDeliveredJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markDeliveredJButtonActionPerformed(evt);
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
        jScrollPane1.setViewportView(tblscheddropoffs);

        javax.swing.GroupLayout LogisticsSchedulePickUpMainLayout = new javax.swing.GroupLayout(LogisticsSchedulePickUpMain);
        LogisticsSchedulePickUpMain.setLayout(LogisticsSchedulePickUpMainLayout);
        LogisticsSchedulePickUpMainLayout.setHorizontalGroup(
            LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel4))
                    .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel6))
                    .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(pickUpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(residentContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markDeliveredJButton)
                            .addComponent(residentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        LogisticsSchedulePickUpMainLayout.setVerticalGroup(
            LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogisticsSchedulePickUpMainLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(LogisticsSchedulePickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickUpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markDeliveredJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        add(LogisticsSchedulePickUpMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void pickUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickUpJButtonActionPerformed
        this.activePickup.setStatus(WorkRequest.RequestStatus.ONGOING);
        JOptionPane.showMessageDialog(null, "Booking marked as pickedup");
    }//GEN-LAST:event_pickUpJButtonActionPerformed

    private void markDeliveredJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markDeliveredJButtonActionPerformed
        this.activePickup.setStatus(WorkRequest.RequestStatus.COMPLETED);
        
        // assign items to QC
        for (Item item: this.activePickup.getInventoryBooking().getItems()) {
            QCInspector qc = this.ecosystem.getWorkRequestDirectory().getQCtoAssign();
            QCInspection inpection = new QCInspection(item, qc);
            this.ecosystem.getWorkRequestDirectory().addQCInspection(inpection);
            item.setStatus(Item.ItemStatus.IN_QC);
            this.ecosystem.getWorkRequestDirectory().increaseqcInspectionAssignmentCount(qc);
        }
        
        this.activePickup.getLogisticsMan().setAvailable(true);
        InventoryBooking booking = this.ecosystem.getBookingDirectory().getNextPendingBooking();
        if (booking != null) {
            InventoryPickup pickup = new InventoryPickup(booking);
            pickup.setLogisticsMan(this.logisticsMan);
            this.logisticsMan.setAvailable(false);
            booking.setAssigned(true);
            this.ecosystem.getWorkRequestDirectory().addInventoryPickup(pickup);
            JOptionPane.showMessageDialog(null, "Booking successfully delivered, new booking assigned");
            return;
        }
        
        
        JOptionPane.showMessageDialog(null, "Booking successfully delivered");
    }//GEN-LAST:event_markDeliveredJButtonActionPerformed

    private void residentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residentNameActionPerformed
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblscheddropoffs.getModel();
        model.setRowCount(0);
        if (this.activePickup == null) return;
        
        residentName.setText(this.activePickup.getInventoryBooking().getResident().getFullName());
        residentAddress.setText(this.activePickup.getInventoryBooking().getResident().getAddress());
        residentContactInfo.setText(this.activePickup.getInventoryBooking().getResident().getPhone());
        
        for (Item item: this.activePickup.getInventoryBooking().getItems()) {
            Object[] row = new Object[8];
            row[0] = item.getCategory();
            row[1] = item.getSubCategory();
            row[2] = item.getMake();
            row[3] = item.getModel();
            row[4] = item.getManufactureYear();
            row[5] = item.getWeightApprox();
            row[6] = item.getCondition();
            row[7] = item.getStatus();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogisticsSchedulePickUpMain;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton markDeliveredJButton;
    private javax.swing.JButton pickUpJButton;
    private javax.swing.JTextField residentAddress;
    private javax.swing.JTextField residentContactInfo;
    private javax.swing.JTextField residentName;
    private javax.swing.JTable tblscheddropoffs;
    // End of variables declaration//GEN-END:variables
}
