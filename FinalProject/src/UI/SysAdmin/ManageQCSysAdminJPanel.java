/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.EcoSystem;
import models.User.Employee.QCInspector;

/**
 *
 * @author kshitij
 */
public class ManageQCSysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageQCSysAdminJPanel
     */
    JPanel jpanel2;
    EcoSystem ecosystem;
    QCInspector selectedInspector;
    public ManageQCSysAdminJPanel(JPanel ManageQCSysAdminJPanel, EcoSystem ecosystem) {
        this.ManageQCSysAdminPanel = ManageQCSysAdminJPanel;
        initComponents();
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageQCSysAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        usernameTextFied = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        qcInspectorsJTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        ManageQCSysAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New QC Inspector Login");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel2.setText("Name");

        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        usernameTextFied.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel4.setText("Username");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel3.setText("Password");

        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        btnUpdate.setBackground(new java.awt.Color(205, 223, 245));
        btnUpdate.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(205, 223, 245));
        btnCreate.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(51, 51, 51));
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
        jLabel5.setText("View QC Inspector Users");

        qcInspectorsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(qcInspectorsJTable);

        btnDelete.setBackground(new java.awt.Color(205, 223, 245));
        btnDelete.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(205, 223, 245));
        btnModify.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnModify.setForeground(new java.awt.Color(51, 51, 51));
        btnModify.setText("Modify");
        btnModify.setBorderPainted(false);
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageQCSysAdminPanelLayout = new javax.swing.GroupLayout(ManageQCSysAdminPanel);
        ManageQCSysAdminPanel.setLayout(ManageQCSysAdminPanelLayout);
        ManageQCSysAdminPanelLayout.setHorizontalGroup(
            ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageQCSysAdminPanelLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(43, 43, 43)
                                            .addComponent(passwordTextField))
                                        .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(40, 40, 40)
                                            .addComponent(usernameTextFied))
                                        .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(64, 64, 64)
                                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        ManageQCSysAdminPanelLayout.setVerticalGroup(
            ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageQCSysAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTextFied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ManageQCSysAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        add(ManageQCSysAdminPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String password = passwordTextField.getText();
        if (!this.hasSelectedQCInspector()) return;
        this.selectedInspector.getUserAccount().setPassword(password);
        this.selectedInspector.setFullName(name);
        populateTable();
        nameTextField.setText("");
        usernameTextFied.setText("");
        passwordTextField.setText("");
        usernameTextFied.setText("");
        JOptionPane.showMessageDialog(null, "Updated details");
        this.populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String username = usernameTextFied.getText();
        String password = passwordTextField.getText();
        if (username.equals("") || password.equals("") || name.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }
        if (this.ecosystem.getUserAccountDirectory().userNameExists(username)) {
            JOptionPane.showMessageDialog(this, "Username already taken!");
            return;
        }
        QCInspector qcInspector = new QCInspector(username, password);
        qcInspector.setFullName(name);
        this.ecosystem.getUserAccountDirectory().addUserAccount(qcInspector.getUserAccount());
        this.ecosystem.getEmployeeDirectory().addQCInspector(qcInspector);
        this.ecosystem.getWorkRequestDirectory().increaseqcInspectionAssignmentCount(qcInspector);
        JOptionPane.showMessageDialog(null, "User added successfully");
        this.populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedQCInspector()) return;
        this.ecosystem.getEmployeeDirectory().removeQCInspector(this.selectedInspector);
        this.ecosystem.getUserAccountDirectory().removeUserAccount(this.selectedInspector.getUserAccount());
        JOptionPane.showMessageDialog(this, "Inspector entry deleted");
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedQCInspector()) return;
        nameTextField.setText(this.selectedInspector.getFullName());
        usernameTextFied.setText(this.selectedInspector.getUserAccount().getUsername());
        passwordTextField.setText(this.selectedInspector.getUserAccount().getPassword());
    }//GEN-LAST:event_btnModifyActionPerformed
    
    private boolean hasSelectedQCInspector() {
        int selectedRowIndex = qcInspectorsJTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select an inspector");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) qcInspectorsJTable.getModel();
        this.selectedInspector = (QCInspector) model.getValueAt(selectedRowIndex, 0);
        return true;
    }
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) qcInspectorsJTable.getModel();
        model.setRowCount(0);
        for (QCInspector inspector: this.ecosystem.getEmployeeDirectory().getQcInscpectors()) {
            Object[] row = new Object[3];
            row[0] = inspector;
            row[1] = inspector.getUserAccount().getUsername();
            row[2] = inspector.getUserAccount().getPassword();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageQCSysAdminPanel;
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
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTable qcInspectorsJTable;
    private javax.swing.JTextField usernameTextFied;
    // End of variables declaration//GEN-END:variables
}
