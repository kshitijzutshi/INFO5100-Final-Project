/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author kshitij
 */
public class SignUpRetailerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpRetailerJPanel
     */
    public SignUpRetailerJPanel() {
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

        JPanelSignup = new javax.swing.JPanel();
        lblSignUpHeader = new javax.swing.JLabel();
        lblTypeOfUser = new javax.swing.JLabel();
        typeofuserdropdown = new javax.swing.JComboBox<>();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelSignup.setBackground(new java.awt.Color(255, 255, 255));
        JPanelSignup.setPreferredSize(new java.awt.Dimension(1460, 850));

        lblSignUpHeader.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        lblSignUpHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUpHeader.setText("Sign Up");

        lblTypeOfUser.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblTypeOfUser.setText("Type of User");

        typeofuserdropdown.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        typeofuserdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Community", "Organization" }));

        lblEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblEmail.setText("Email ID");

        txtemailid.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtemailid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 153)));

        lblMobile.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblMobile.setText("Mobile Number");

        txtmobnumber.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtmobnumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 153)));

        lblAddress.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblAddress.setText("Address");

        txtaddress.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtaddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 153)));

        lblName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblName.setText("Name");

        txtname.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 153)));

        lblUserName.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblUserName.setText("Username");

        txtusername.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 153)));

        lblPassword.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblPassword.setText("Password");

        txtpassword.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 255, 153)));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        btnSubmitsignup.setBackground(new java.awt.Color(153, 255, 153));
        btnSubmitsignup.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btnSubmitsignup.setText("Submit");

        kGradientPanel1.setkEndColor(new java.awt.Color(128, 193, 115));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(221, 228, 186));
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

        javax.swing.GroupLayout JPanelSignupLayout = new javax.swing.GroupLayout(JPanelSignup);
        JPanelSignup.setLayout(JPanelSignupLayout);
        JPanelSignupLayout.setHorizontalGroup(
            JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSignupLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignUpHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelSignupLayout.createSequentialGroup()
                        .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtname)
                                .addComponent(typeofuserdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTypeOfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)))
                .addGap(211, 211, 211))
        );
        JPanelSignupLayout.setVerticalGroup(
            JPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSignupLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPanelSignupLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblSignUpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTypeOfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(typeofuserdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelSignup;
    private javax.swing.JButton btnSubmitsignup;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUpHeader;
    private javax.swing.JLabel lblTypeOfUser;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblsignup1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtmobnumber;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JComboBox<String> typeofuserdropdown;
    // End of variables declaration//GEN-END:variables
}