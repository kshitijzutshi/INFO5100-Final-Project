/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Technician;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Employee.Technician;
import models.Work.RefurbAssignment;
import models.Work.WorkRequest;

/**
 *
 * @author shrey
 */
public class TechnicanReviewItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TechnicanReviewItemsJPanel
     */
    
    JPanel jpanel25;
    EcoSystem ecosystem;
    Technician technician;
    RefurbAssignment selectedAssignment;
    public TechnicanReviewItemsJPanel(JPanel TechReview, EcoSystem ecosystem, Technician technician) {
        initComponents();
        this.ecosystem = ecosystem;
        this.technician = technician;
        this.TechnicianReviewJPanel = TechReview;
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

        TechnicianReviewJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltechreview = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtitemid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtewastecat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtappliancetype = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmake = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        markRefurbishedBtn = new javax.swing.JButton();
        markForRecycleBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        TechnicianReviewJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Items to Review");

        tbltechreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Category", "Sub Category", "Make", "Model", "Assigned Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltechreview);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Item ID:");

        txtitemid.setEditable(false);
        txtitemid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtitemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("E-Waste Category:");

        txtewastecat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Appliance Type:");

        txtappliancetype.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Make:");

        txtmake.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Model");

        txtmodel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        btnview.setBackground(new java.awt.Color(205, 223, 245));
        btnview.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(51, 51, 51));
        btnview.setText("View Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        markRefurbishedBtn.setBackground(new java.awt.Color(205, 223, 245));
        markRefurbishedBtn.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        markRefurbishedBtn.setForeground(new java.awt.Color(51, 51, 51));
        markRefurbishedBtn.setText("Mark as Refurbished");
        markRefurbishedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markRefurbishedBtnActionPerformed(evt);
            }
        });

        markForRecycleBtn.setBackground(new java.awt.Color(205, 223, 245));
        markForRecycleBtn.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        markForRecycleBtn.setText("Mark for Recycle");
        markForRecycleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markForRecycleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TechnicianReviewJPanelLayout = new javax.swing.GroupLayout(TechnicianReviewJPanel);
        TechnicianReviewJPanel.setLayout(TechnicianReviewJPanelLayout);
        TechnicianReviewJPanelLayout.setHorizontalGroup(
            TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TechnicianReviewJPanelLayout.createSequentialGroup()
                                .addComponent(markRefurbishedBtn)
                                .addGap(18, 18, 18)
                                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmodel)
                                    .addComponent(markForRecycleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TechnicianReviewJPanelLayout.createSequentialGroup()
                                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TechnicianReviewJPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45))
                                        .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(19, 19, 19)))
                                    .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtewastecat, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtitemid)
                                    .addComponent(txtappliancetype)
                                    .addComponent(txtmake))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        TechnicianReviewJPanelLayout.setVerticalGroup(
            TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtewastecat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtappliancetype, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmake, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markRefurbishedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markForRecycleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        add(TechnicianReviewJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtitemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemidActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        if (!this.hasSelectedItem()) return;
        txtitemid.setText(this.selectedAssignment.getItem().getId());
        txtewastecat.setText(this.selectedAssignment.getItem().getCategory());
        txtappliancetype.setText(this.selectedAssignment.getItem().getSubCategory());
        txtmake.setText(String.valueOf(this.selectedAssignment.getItem().getMake()));
        txtmodel.setText(this.selectedAssignment.getItem().getModel());
    }//GEN-LAST:event_btnviewActionPerformed

    private void markRefurbishedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markRefurbishedBtnActionPerformed
        // TODO add your handling code here:
        
        this.selectedAssignment.getItem().setStatus(Item.ItemStatus.READY_FOR_PRICING);
        this.selectedAssignment.getItem().setType(Item.ItemType.REFURB);
        this.selectedAssignment.setStatus(WorkRequest.RequestStatus.COMPLETED);
        
        this.ecosystem.getWorkRequestDirectory().decreaserefurbAssignmentMapCount(this.technician);
        JOptionPane.showMessageDialog(this, "Item marked as refurbed");
        
        this.selectedAssignment = null;
        this.populateTable();

    }//GEN-LAST:event_markRefurbishedBtnActionPerformed

    private void markForRecycleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markForRecycleBtnActionPerformed
        // TODO add your handling code here:
        
       this.selectedAssignment.getItem().setStatus(Item.ItemStatus.READY_FOR_PRICING);
        this.selectedAssignment.getItem().setType(Item.ItemType.RECYCLE);
        this.selectedAssignment.setStatus(WorkRequest.RequestStatus.COMPLETED);
        
        this.ecosystem.getWorkRequestDirectory().decreaserefurbAssignmentMapCount(this.technician);
        JOptionPane.showMessageDialog(this, "Item sent for recycling");
        
        this.selectedAssignment = null;
        this.populateTable();
    }//GEN-LAST:event_markForRecycleBtnActionPerformed
    
    private boolean hasSelectedItem() {
        int selectedRowIndex = tbltechreview.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select an entry");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) tbltechreview.getModel();
        this.selectedAssignment = (RefurbAssignment) model.getValueAt(selectedRowIndex, 0);
        return true;
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tbltechreview.getModel();
        model.setRowCount(0);
        for (RefurbAssignment assignment: this.ecosystem.getWorkRequestDirectory().getRefurbAssignmentsByTechnician(this.technician)) {
            if (assignment.getStatus() == WorkRequest.RequestStatus.ASSIGNED){
                Object[] row = new Object[6];
                row[0] = assignment;
                row[1] = assignment.getItem().getCategory();
                row[2] = assignment.getItem().getSubCategory();
                row[3] = assignment.getItem().getMake();
                row[4] = assignment.getItem().getModel();
                row[5] = assignment.getRequestDate();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TechnicianReviewJPanel;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton markForRecycleBtn;
    private javax.swing.JButton markRefurbishedBtn;
    private javax.swing.JTable tbltechreview;
    private javax.swing.JTextField txtappliancetype;
    private javax.swing.JTextField txtewastecat;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtmake;
    private javax.swing.JTextField txtmodel;
    // End of variables declaration//GEN-END:variables
}
