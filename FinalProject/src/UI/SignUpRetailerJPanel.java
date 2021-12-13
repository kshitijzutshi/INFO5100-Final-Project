/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;
import models.User.Client.Client;
import models.User.Customer.Resident;

/**
 *
 * @author kshitij
 */
public class SignUpRetailerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpRetailerJPanel
     */
    EcoSystem ecosystem;
    JPanel jpanel6;
    public SignUpRetailerJPanel(JPanel SignUpRetailer, EcoSystem ecosystem) {
        initComponents();
        this.JPanelSignup = SignUpRetailer;
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

        JPanelSignup = new javax.swing.JPanel();
        lblSignUpHeader = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtmobnumber = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        btnSubmitsignup = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblsignup1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbrrecycler = new javax.swing.JRadioButton();
        rbretailer = new javax.swing.JRadioButton();
        btnhome = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelSignup.setBackground(new java.awt.Color(255, 255, 255));
        JPanelSignup.setPreferredSize(new java.awt.Dimension(1460, 850));

        lblSignUpHeader.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        lblSignUpHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUpHeader.setText("Sign Up");

        lblEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblEmail.setText("Email ID");

        txtemailid.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtemailid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblMobile.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblMobile.setText("Mobile Number");

        txtmobnumber.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtmobnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblAddress.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        txtaddress.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblName.setText("Name");

        txtname.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblUserName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblUserName.setText("Username");

        txtusername.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblPassword.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblPassword.setText("Password");

        txtpassword.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        btnSubmitsignup.setBackground(new java.awt.Color(205, 223, 245));
        btnSubmitsignup.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSubmitsignup.setText("Submit");
        btnSubmitsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitsignupActionPerformed(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 1460));

        lblsignup1.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        lblsignup1.setText("Join the E-waste movement.");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel7.setText("Contribute towards a sustainable tommorow.");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblsignup1)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblsignup1)
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addContainerGap(1246, Short.MAX_VALUE))
        );

        rbrrecycler.setBackground(new java.awt.Color(255, 255, 255));
        rbrrecycler.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        rbrrecycler.setText("Recycler");

        rbretailer.setBackground(new java.awt.Color(255, 255, 255));
        rbretailer.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        rbretailer.setText("Retailer");

        btnhome.setBackground(new java.awt.Color(205, 223, 245));
        btnhome.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_24px.png"))); // NOI18N
        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelSignupLayout = new javax.swing.GroupLayout(JPanelSignup);
        JPanelSignup.setLayout(JPanelSignupLayout);
        JPanelSignupLayout.setHorizontalGroup(
            JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSignupLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelSignupLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSignUpHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelSignupLayout.createSequentialGroup()
                                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName)
                                    .addGroup(JPanelSignupLayout.createSequentialGroup()
                                        .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAddress)
                                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtmobnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(JPanelSignupLayout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(btnSubmitsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelSignupLayout.createSequentialGroup()
                                        .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUserName))
                                        .addGap(49, 49, 49)
                                        .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPassword)
                                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(JPanelSignupLayout.createSequentialGroup()
                                        .addComponent(rbrrecycler, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(rbretailer, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)))
                        .addGap(211, 211, 211))
                    .addGroup(JPanelSignupLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPanelSignupLayout.setVerticalGroup(
            JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSignupLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPanelSignupLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnhome)
                .addGap(11, 11, 11)
                .addComponent(lblSignUpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbrrecycler)
                    .addComponent(rbretailer))
                .addGap(28, 28, 28)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmobnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpassword)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(btnSubmitsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(JPanelSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnSubmitsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitsignupActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String email = txtemailid.getText();
        String mobile = txtmobnumber.getText();
        String address = txtaddress.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();

        if (username.equals("") || password.equals("") || email.equals("") || mobile.equals("") || name.equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }else if (!mobile.matches("[1-9]\\d{2}\\d{3}\\d{4}")){
            JOptionPane.showMessageDialog(this, "Invalid Mobile Number");
            return;
        }else if(!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
            JOptionPane.showMessageDialog(this, "Invalid Email ID");
            return;
        }
            
        
        if (this.ecosystem.getUserAccountDirectory().userNameExists(username)) {
            JOptionPane.showMessageDialog(this, "Username already taken");
            return;
        }
        if(rbrrecycler.isSelected()){
            // new client added and is unverified
            Client newclient = new Client(username, password, false);
            newclient.setFullName(name);
            newclient.setEmail(email);
            newclient.setPhone(mobile);
            newclient.setAddress(address);
            newclient.setVerified(false);
            newclient.setClienttype(Client.clientType.RECYCLER);
            this.ecosystem.getUserAccountDirectory().addUserAccount(newclient.getUserAccount());
            this.ecosystem.getClientDirectory().addClient(newclient);
            DB4OUtil.getInstance().storeSystem(this.ecosystem);
            JOptionPane.showMessageDialog(this, "You are all set!");
            txtname.setText("");
            txtaddress.setText("");
            txtemailid.setText("");
            txtmobnumber.setText("");
            txtusername.setText("");
            txtpassword.setText("");
            rbretailer.setSelected(false);
            rbrrecycler.setSelected(false);
            MainJPanel main = new MainJPanel(JPanelSignup);
            CardLayout layout = (CardLayout) JPanelSignup.getLayout();
            JPanelSignup.add("HomeMainPanel", main);

            layout.next(JPanelSignup);
        }
        else if(rbretailer.isSelected()){
            // new client added and is unverified
            Client newclient = new Client(username, password, false);
            newclient.setFullName(name);
            newclient.setEmail(email);
            newclient.setPhone(mobile);
            newclient.setAddress(address);
            newclient.setVerified(false);
            newclient.setClienttype(Client.clientType.RETAILER);
            this.ecosystem.getUserAccountDirectory().addUserAccount(newclient.getUserAccount());
            this.ecosystem.getClientDirectory().addClient(newclient);
            DB4OUtil.getInstance().storeSystem(this.ecosystem);
            JOptionPane.showMessageDialog(this, "You are all set!");
            txtname.setText("");
            txtaddress.setText("");
            txtemailid.setText("");
            txtmobnumber.setText("");
            txtusername.setText("");
            txtpassword.setText("");
            rbretailer.setSelected(false);
            rbrrecycler.setSelected(false);
            MainJPanel main = new MainJPanel(JPanelSignup);
            CardLayout layout = (CardLayout) JPanelSignup.getLayout();
            JPanelSignup.add("HomeMainPanel", main);

            layout.next(JPanelSignup);
        }
        
        
    }//GEN-LAST:event_btnSubmitsignupActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
        
         DB4OUtil.getInstance().storeSystem(this.ecosystem);
         MainJPanel main = new MainJPanel(JPanelSignup);
        CardLayout layout = (CardLayout) JPanelSignup.getLayout();
        JPanelSignup.add("Home", main);

        layout.next(JPanelSignup);
    }//GEN-LAST:event_btnhomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelSignup;
    private javax.swing.JButton btnSubmitsignup;
    private javax.swing.JButton btnhome;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUpHeader;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblsignup1;
    private javax.swing.JRadioButton rbretailer;
    private javax.swing.JRadioButton rbrrecycler;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtmobnumber;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
