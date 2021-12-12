/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Technician;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class TechnicanReviewItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TechnicanReviewItemsJPanel
     */
    
    JPanel jpanel25;
    
    public TechnicanReviewItemsJPanel(JPanel TechReview) {
        initComponents();
        
        this.TechnicianReviewJPanel = TechReview;
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
        txtweight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcondition = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        TechnicianReviewJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Items to Review");

        tbltechreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "E-Waste Category", "Appliance Type", "Weight", "Condition"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltechreview);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Item ID:");

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
        jLabel5.setText("Weight:");

        txtweight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Condition");

        txtcondition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        btnview.setBackground(new java.awt.Color(205, 223, 245));
        btnview.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(51, 51, 51));
        btnview.setText("View Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(205, 223, 245));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Mark as Refurbished");

        jButton2.setBackground(new java.awt.Color(205, 223, 245));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jButton2.setText("Mark for Recycle");

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
                                .addGap(207, 207, 207)
                                .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TechnicianReviewJPanelLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcondition)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                    .addComponent(txtweight))))))
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
                            .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcondition, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TechnicianReviewJPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(TechnicianReviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        add(TechnicianReviewJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtitemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemidActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        /* int selectedRow = tblPickUpBooking.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPickUpBooking.getModel();
        
        String ewaste = (String) model.getValueAt(selectedRow, 0);
        String appliancetype = (String) model.getValueAt(selectedRow, 1);
        Float weight = (Float) model.getValueAt(selectedRow, 2);
        
        
        txtewastecat.setText(ewaste);
        txtappliancetype.setText(appliancetype);
        txtweight.setText(String.valueOf(weight));*/
        
        int selectedRow = tbltechreview.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tbltechreview.getModel();
        
        int ItemID = (int) model.getValueAt(selectedRow, 0);
        String ewaste = (String) model.getValueAt(selectedRow, 1);
        String appliancetype = (String) model.getValueAt(selectedRow, 2);
        Float weight = (Float) model.getValueAt(selectedRow, 3);
        String condition = (String) model.getValueAt(selectedRow, 4);
        
        txtitemid.setText(String.valueOf(ItemID));
        txtewastecat.setText(ewaste);
        txtappliancetype.setText(appliancetype);
        txtweight.setText(String.valueOf(weight));
        txtcondition.setText(condition);
        
    }//GEN-LAST:event_btnviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TechnicianReviewJPanel;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbltechreview;
    private javax.swing.JTextField txtappliancetype;
    private javax.swing.JTextField txtcondition;
    private javax.swing.JTextField txtewastecat;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
