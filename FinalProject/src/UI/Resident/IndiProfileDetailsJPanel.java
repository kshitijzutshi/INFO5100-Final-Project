/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Resident;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;
import models.User.Customer.Resident;

/**
 *
 * @author shrey
 */
public class IndiProfileDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndiProfileDetailsJPanel
     */
    
    JPanel jpanel3;
    EcoSystem ecosystem;
    Resident resident;
    public IndiProfileDetailsJPanel(JPanel JPanelIndiLogin, EcoSystem ecosystem, Resident resident) {
        initComponents();
        
        this.JPanelIndLogin = JPanelIndiLogin;
        this.ecosystem = ecosystem;
        this.resident = resident;
        nameLabel.setText(resident.getFullName());
        this.populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelIndLogin = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        lblSignUpHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        txtmobnumber = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelIndLogin.setBackground(new java.awt.Color(255, 255, 255));
        JPanelIndLogin.setPreferredSize(new java.awt.Dimension(1460, 850));

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Welcome to ReQube,");

        nameLabel.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));

        logoutBtn.setBackground(new java.awt.Color(205, 223, 245));
        logoutBtn.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(51, 51, 51));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_50px.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        lblSignUpHeader.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        lblSignUpHeader.setForeground(new java.awt.Color(51, 51, 51));
        lblSignUpHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUpHeader.setText("Profile Details");

        lblName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 51, 51));
        lblName.setText("Name");

        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 51));
        lblEmail.setText("Email ID");

        txtemailid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblAddress.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(51, 51, 51));
        lblAddress.setText("Address");

        txtaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblUserName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(51, 51, 51));
        lblUserName.setText("Username");

        lblMobile.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblMobile.setForeground(new java.awt.Color(51, 51, 51));
        lblMobile.setText("Mobile Number");

        txtmobnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        txtusername.setEditable(false);
        txtusername.setBackground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblUserName1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblUserName1.setForeground(new java.awt.Color(51, 51, 51));
        lblUserName1.setText("Password");

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/person_127px_2.png"))); // NOI18N

        btnSave.setBackground(new java.awt.Color(205, 223, 245));
        btnSave.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 51, 51));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backarrow.png"))); // NOI18N
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelIndLoginLayout = new javax.swing.GroupLayout(JPanelIndLogin);
        JPanelIndLogin.setLayout(JPanelIndLoginLayout);
        JPanelIndLoginLayout.setHorizontalGroup(
            JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE)
            .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                        .addGap(647, 647, 647)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                            .addGap(262, 262, 262)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(167, 167, 167)
                                            .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblAddress)
                                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                                            .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblUserName)
                                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(103, 103, 103)
                                            .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblUserName1)
                                                .addComponent(txtmobnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSignUpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        JPanelIndLoginLayout.setVerticalGroup(
            JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSignUpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblName))
                    .addGroup(JPanelIndLoginLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmobnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAddress)
                .addGap(18, 18, 18)
                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(lblUserName1))
                .addGap(18, 18, 18)
                .addGroup(JPanelIndLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        add(JPanelIndLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 950));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JPanelIndLogin.remove(this);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        layout.previous(JPanelIndLogin);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String address = txtaddress.getText();
        String mobile = txtmobnumber.getText();
        String name = txtname.getText();
        String password = txtPassword.getText();
        String email = txtemailid.getText();
        
        if (address.equals("") || mobile.equals("") || name.equals("") || mobile.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }
        
        this.resident.setAddress(address);
        this.resident.setFullName(name);
        this.resident.setPhone(mobile);
        this.resident.setEmail(email);
        this.resident.getUserAccount().setPassword(password);
        JOptionPane.showMessageDialog(this, "Profile details updated");
        this.populateFields();
        
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void populateFields() {
        txtname.setText(this.resident.getFullName());
        txtaddress.setText(this.resident.getAddress());
        txtemailid.setText(this.resident.getEmail());
        txtmobnumber.setText(this.resident.getPhone());
        txtusername.setText(this.resident.getUserAccount().getUsername());
        txtPassword.setText(this.resident.getUserAccount().getPassword());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelIndLogin;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSignUpHeader;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtmobnumber;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
