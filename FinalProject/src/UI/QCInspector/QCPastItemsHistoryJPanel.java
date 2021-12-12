/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.QCInspector;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Employee.QCInspector;
import models.Work.QCInspection;
import models.Work.WorkRequest;

/**
 *
 * @author shrey
 */
public class QCPastItemsHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QCPastItemsHistoryJPanel
     */
    
    JPanel jpanel13;
    EcoSystem ecosystem;
    QCInspector qcInspector;
    public QCPastItemsHistoryJPanel(JPanel qcpasthistory, EcoSystem ecosystem, QCInspector qcInspector) {
        initComponents();
    
        this.QCPastItemsHistory = qcpasthistory;
        this.ecosystem = ecosystem;
        this.qcInspector = qcInspector;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QCPastItemsHistory = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtitemcount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        QCPastItemsHistory.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inspected Items");

        itemsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "E-Waste Category", "Appliance", "Assigned Time", "Completed Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemsJTable);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Total Number of Items Inspected:");

        txtitemcount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtitemcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemcountActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order_history_127px_black.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout QCPastItemsHistoryLayout = new javax.swing.GroupLayout(QCPastItemsHistory);
        QCPastItemsHistory.setLayout(QCPastItemsHistoryLayout);
        QCPastItemsHistoryLayout.setHorizontalGroup(
            QCPastItemsHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QCPastItemsHistoryLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(QCPastItemsHistoryLayout.createSequentialGroup()
                .addGroup(QCPastItemsHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QCPastItemsHistoryLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(txtitemcount, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(QCPastItemsHistoryLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        QCPastItemsHistoryLayout.setVerticalGroup(
            QCPastItemsHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QCPastItemsHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QCPastItemsHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QCPastItemsHistoryLayout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(QCPastItemsHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtitemcount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        add(QCPastItemsHistory, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtitemcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemcountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemcountActionPerformed
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) itemsJTable.getModel();
        model.setRowCount(0);
        int count = 0;
        for (QCInspection inspection: this.ecosystem.getWorkRequestDirectory().getInspectionsByInspector(this.qcInspector)) {
            if (inspection.getStatus() == WorkRequest.RequestStatus.COMPLETED){
                Object[] row = new Object[4];
                row[0] = inspection.getItem().getId();
                row[1] = inspection.getItem().getCategory();
                row[2] = inspection.getItem().getSubCategory();
                row[3] = inspection.getRequestDate();
                row[4] = inspection.getResolveDate();
                model.addRow(row);
                count++;
            }
        }
        txtitemcount.setText(String.valueOf(count));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QCPastItemsHistory;
    private javax.swing.JTable itemsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtitemcount;
    // End of variables declaration//GEN-END:variables
}
