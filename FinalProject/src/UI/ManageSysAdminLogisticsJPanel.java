/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.EcoSystem;
import models.User.Employee.LogisticsMan;

/**
 *
 * @author kshitij
 */
public class ManageSysAdminLogisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSysAdminLogisticsJPanel
     */
    JPanel jpanel6;
    EcoSystem ecosystem;
    LogisticsMan selectedLogisticsMan;
    public ManageSysAdminLogisticsJPanel(JPanel ManageSysAdminLogistics, EcoSystem ecosystem) {
        this.ManageSysAdminLogisticsMainJPanel = ManageSysAdminLogistics;
        initComponents();
        this.ecosystem = ecosystem;
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

        ManageSysAdminLogisticsMainJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logisticsJTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        ManageSysAdminLogisticsMainJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Logistics Login");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel2.setText("Name");

        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(128, 193, 115)));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel4.setText("Username");

        usernameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(128, 193, 115)));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel3.setText("Password");

        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(128, 193, 115)));

        btnUpdate.setBackground(new java.awt.Color(128, 193, 115));
        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(128, 193, 115));
        btnCreate.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCreate.setBorderPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("View Logistics Users");

        logisticsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(logisticsJTable);

        btnDelete.setBackground(new java.awt.Color(128, 193, 115));
        btnDelete.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(128, 193, 115));
        btnModify.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Modify");
        btnModify.setBorderPainted(false);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageSysAdminLogisticsMainJPanelLayout = new javax.swing.GroupLayout(ManageSysAdminLogisticsMainJPanel);
        ManageSysAdminLogisticsMainJPanel.setLayout(ManageSysAdminLogisticsMainJPanelLayout);
        ManageSysAdminLogisticsMainJPanelLayout.setHorizontalGroup(
            ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(35, 35, 35)
                                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameTextField)
                                        .addComponent(usernameTextField)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                            .addGap(388, 388, 388)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(114, Short.MAX_VALUE)))
        );
        ManageSysAdminLogisticsMainJPanelLayout.setVerticalGroup(
            ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(ManageSysAdminLogisticsMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModify)
                        .addComponent(btnDelete))
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        add(ManageSysAdminLogisticsMainJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String password = passwordTextField.getText();
        if (!this.hasSelectedLogisticsMan()) return;
        if (password.equals("") || name.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }
        this.selectedLogisticsMan.getUserAccount().setPassword(password);
        this.selectedLogisticsMan.setFullName(name);
        populateTable();
        nameTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
        JOptionPane.showMessageDialog(null, "Updated details");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        if (username.equals("") || password.equals("") || name.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }
        if (this.ecosystem.getUserAccountDirectory().userNameExists(username)) {
            JOptionPane.showMessageDialog(this, "Username already taken!");
            return;
        }
        LogisticsMan logMan = new LogisticsMan(username, password);
        logMan.setFullName(name);
        this.ecosystem.getUserAccountDirectory().addUserAccount(logMan.getUserAccount());
        this.ecosystem.getEmployeeDirectory().addLogisticsMen(logMan);
        JOptionPane.showMessageDialog(null, "Logistics employee added successfully");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedLogisticsMan()) return;
        this.ecosystem.getEmployeeDirectory().removeLogisticsMan(this.selectedLogisticsMan);
        JOptionPane.showMessageDialog(this, "Employee entry deleted");
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedLogisticsMan()) return;
        nameTextField.setText(this.selectedLogisticsMan.getFullName());
        usernameTextField.setText(this.selectedLogisticsMan.getUserAccount().getUsername());
        passwordTextField.setText(this.selectedLogisticsMan.getUserAccount().getPassword());
    }//GEN-LAST:event_btnModifyActionPerformed

    
    private boolean hasSelectedLogisticsMan() {
        int selectedRowIndex = logisticsJTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a logistics man");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) logisticsJTable.getModel();
        this.selectedLogisticsMan = (LogisticsMan) model.getValueAt(selectedRowIndex, 0);
        return true;
    }
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) logisticsJTable.getModel();
        model.setRowCount(0);
        for (LogisticsMan logisticsMan: this.ecosystem.getEmployeeDirectory().getLogisticsMen()) {
            Object[] row = new Object[3];
            row[0] = logisticsMan;
            row[1] = logisticsMan.getUserAccount().getUsername();
            row[2] = logisticsMan.getUserAccount().getPassword();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageSysAdminLogisticsMainJPanel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable logisticsJTable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
