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
import models.User.Client.Client;

/**
 *
 * @author kshitij
 */
public class ManageRetailerSysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRetailerSysAdminJPanel
     */
    JPanel jpanel8;
    EcoSystem ecosystem;
    Client selectedClient;
    public ManageRetailerSysAdminJPanel(JPanel ManageRetailerSysAdminPanelArea, EcoSystem ecosystem) {
        this.manageRetailerSysadminPanel = ManageRetailerSysAdminPanelArea;
        this.ecosystem = ecosystem;
        initComponents();
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

        manageRetailerSysadminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameTextFied = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientsJTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        checkboxVerified = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btnRecyclerRadio = new javax.swing.JRadioButton();
        btnRetailerRadio = new javax.swing.JRadioButton();

        setLayout(new java.awt.CardLayout());

        manageRetailerSysadminPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Retailer Login");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel2.setText("Name");

        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel4.setText("Username");

        usernameTextFied.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel3.setText("Password");

        passwordTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

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
        jLabel5.setText("View Retailer Users");

        clientsJTable.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        clientsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password", "Client type", "Verified"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(clientsJTable);

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

        checkboxVerified.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        jLabel6.setText("Verified:");

        btnRecyclerRadio.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnRecyclerRadio.setText("Recycler");

        btnRetailerRadio.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        btnRetailerRadio.setText("Retailer");

        javax.swing.GroupLayout manageRetailerSysadminPanelLayout = new javax.swing.GroupLayout(manageRetailerSysadminPanel);
        manageRetailerSysadminPanel.setLayout(manageRetailerSysadminPanelLayout);
        manageRetailerSysadminPanelLayout.setHorizontalGroup(
            manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                        .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                                .addComponent(btnRecyclerRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnRetailerRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                        .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkboxVerified)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTextFied, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 209, Short.MAX_VALUE))))
            .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        manageRetailerSysadminPanelLayout.setVerticalGroup(
            manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRetailerSysadminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameTextFied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkboxVerified))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecyclerRadio)
                    .addComponent(btnRetailerRadio))
                .addGap(18, 18, 18)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageRetailerSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        add(manageRetailerSysadminPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String password = passwordTextField.getText();
        if (!this.hasSelectedClient()) return;
        this.selectedClient.getUserAccount().setPassword(password);
        this.selectedClient.setFullName(name);
        
        populateTable();
        nameTextField.setText("");
        usernameTextFied.setText("");
        passwordTextField.setText("");
        usernameTextFied.setText("");
        JOptionPane.showMessageDialog(null, "Updated details");
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
        
        if(username.length()<3 || password.length()<5){
            JOptionPane.showMessageDialog(this, "Username minimum lenght should be 3 and Password minimum lenght should be 5!!");
            return;
        }
        if (this.ecosystem.getUserAccountDirectory().userNameExists(username)) {
            JOptionPane.showMessageDialog(this, "Username already taken!");
            return;
        }
        if(btnRecyclerRadio.isSelected()){
            Client client = new Client(username, password, true);
            client.setFullName(name);
            client.setClienttype(Client.clientType.RECYCLER);
            if(checkboxVerified.isSelected()){
                client.setVerified(true);
            }
            this.ecosystem.getUserAccountDirectory().addUserAccount(client.getUserAccount());
            this.ecosystem.getClientDirectory().addClient(client);
            JOptionPane.showMessageDialog(null, "Client added successfully");
            this.populateTable();
        }
        else if(btnRetailerRadio.isSelected()){
            Client client = new Client(username, password, true);
            client.setFullName(name);
            client.setClienttype(Client.clientType.RETAILER);
            if(checkboxVerified.isSelected()){
                client.setVerified(true);
            }
            this.ecosystem.getUserAccountDirectory().addUserAccount(client.getUserAccount());
            this.ecosystem.getClientDirectory().addClient(client);
            JOptionPane.showMessageDialog(null, "Client added successfully");
            this.populateTable();
        }
        
        nameTextField.setText("");
        usernameTextFied.setText("");
        passwordTextField.setText("");
        checkboxVerified.setSelected(false);
        btnRecyclerRadio.setSelected(false);
        btnRetailerRadio.setSelected(false);
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedClient()) return;
        this.ecosystem.getClientDirectory().removeClient(this.selectedClient);
        this.ecosystem.getUserAccountDirectory().removeUserAccount(this.selectedClient.getUserAccount());
        JOptionPane.showMessageDialog(this, "Client entry deleted");
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if (!this.hasSelectedClient()) return;
        nameTextField.setText(this.selectedClient.getFullName());
        usernameTextFied.setText(this.selectedClient.getUserAccount().getUsername());
        passwordTextField.setText(this.selectedClient.getUserAccount().getPassword());
    }//GEN-LAST:event_btnModifyActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed
    
    private boolean hasSelectedClient() {
        int selectedRowIndex = clientsJTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a client");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) clientsJTable.getModel();
        this.selectedClient = (Client) model.getValueAt(selectedRowIndex, 0);
        return true;
    }
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) clientsJTable.getModel();
        model.setRowCount(0);
        for (Client client: this.ecosystem.getClientDirectory().getClients()) {
            Object[] row = new Object[5];
            row[0] = client;
            row[1] = client.getUserAccount().getUsername();
            row[2] = client.getUserAccount().getPassword();
            row[3] = client.getClienttype();
            row[4] = client.isVerified() ? "Verified" : "Not Verified";
             model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JRadioButton btnRecyclerRadio;
    private javax.swing.JRadioButton btnRetailerRadio;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkboxVerified;
    private javax.swing.JTable clientsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel manageRetailerSysadminPanel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField usernameTextFied;
    // End of variables declaration//GEN-END:variables
}
