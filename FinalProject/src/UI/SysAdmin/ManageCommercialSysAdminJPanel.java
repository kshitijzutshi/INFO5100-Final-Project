/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class ManageCommercialSysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCommercialSysAdminJPanel
     */
    JPanel jpanel8;
    public ManageCommercialSysAdminJPanel(JPanel ManageCommercialSysAdmin) {
        this.manageCommercialSysAdmin = ManageCommercialSysAdmin;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageCommercialSysAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        manageCommercialSysAdmin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Commercial Login");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel2.setText("Name");

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel4.setText("Username");

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel3.setText("Password");

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

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
        jLabel5.setText("View Commercial Users");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        javax.swing.GroupLayout manageCommercialSysAdminLayout = new javax.swing.GroupLayout(manageCommercialSysAdmin);
        manageCommercialSysAdmin.setLayout(manageCommercialSysAdminLayout);
        manageCommercialSysAdminLayout.setHorizontalGroup(
            manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageCommercialSysAdminLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                                    .addGap(172, 172, 172)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                                    .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(80, 80, 80)
                                    .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField3)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageCommercialSysAdminLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        manageCommercialSysAdminLayout.setVerticalGroup(
            manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageCommercialSysAdminLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageCommercialSysAdminLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(manageCommercialSysAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addGap(109, 109, 109))
        );

        add(manageCommercialSysAdmin, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //        String usernameValue = jTextField2.getText();
        //        String name = jTextField1.getText();
        //        String password = jTextField3.getText();
        //        Customer c = ecosystem.getCustomerDirectory().getCustomerByUserName(usernameValue);
        //        UserAccount uA = ecosystem.getUserAccountDirectory().findUserByUsername(usernameValue);
        //        uA.setPassword(password);
        //        c.setPassword(password);
        //        //        System.out.println((String) jTable1.getValueAt(selectedRow, 0));
        //        c.setName(name);
        //        viewCustomerTable();
        //        jTextField1.setText("");
        //        jTextField2.setText("");
        //        jTextField3.setText("");
        //        jTextField2.setEnabled(true);
        //        JOptionPane.showMessageDialog(null, "Updated details");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //        if (jTextField1.getText().equals("")) {
            //            JOptionPane.showMessageDialog(null, "Name Missing");
            //            return;
            //        }
        //        if (jTextField2.getText().equals("")) {
            //            JOptionPane.showMessageDialog(null, "Username Missing");
            //            return;
            //        }
        //        if (jTextField3.getText().equals("")) {
            //            JOptionPane.showMessageDialog(null, "Password Missing");
            //            return;
            //        }
        //        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(jTextField2.getText()) == true) {
            //            UserAccount createUserAccount = ecosystem.getUserAccountDirectory().createUserAccount(jTextField2.getText(), jTextField3.getText(), null, new CustomerRole());
            //            Customer customer = ecosystem.getCustomerDirectory().setCustomer(new Customer(jTextField2.getText(), jTextField3.getText(), jTextField1.getText()));
            //
            //            jTextField1.setText("");
            //            jTextField2.setText("");
            //            jTextField3.setText("");
            //            viewCustomerTable();
            //            JOptionPane.showMessageDialog(null, "Added new user");
            //        } else {
            //            JOptionPane.showMessageDialog(null, jTextField2.getText() + "exists. Enter a new user name");
            //        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //        int selectedRow = jTable1.getSelectedRow();
        //
        //        if (selectedRow >= 0) {
            //            int selectionButton = JOptionPane.YES_NO_OPTION;
            //            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            //            if (selectionResult == JOptionPane.YES_OPTION) {
                //                String usernameValue = (String) jTable1.getValueAt(selectedRow, 1);
                //                String output = ecosystem.getUserAccountDirectory().deleteUserAccountByName(usernameValue);
                //                ecosystem.getCustomerDirectory().removeCustomerByName(usernameValue);
                //                viewCustomerTable();
                //                JOptionPane.showMessageDialog(null, output);
                //            }
            //        } else {
            //            JOptionPane.showMessageDialog(null, "No row selected");
            //        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        String name = (String) jTable1.getValueAt(selectedRow, 0);
        String usernameValue = (String) jTable1.getValueAt(selectedRow, 1);
        String password = (String) jTable1.getValueAt(selectedRow, 2);
        jTextField1.setText(name);
        jTextField2.setText(usernameValue);
        jTextField3.setText(password);
        jTextField2.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel manageCommercialSysAdmin;
    // End of variables declaration//GEN-END:variables
}
