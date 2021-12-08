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
import models.Role.ResidentRole;
import models.Role.Role;
import models.User.Customer.Resident;
import models.User.UserAccount;


/**
 *
 * @author phaniginjupalli
 */
public class MainJFrame extends javax.swing.JFrame {
    private static JPanel userProcessContainer;
    
    private EcoSystem ecosystem;
    private DB4OUtil db4oUtil;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        db4oUtil = DB4OUtil.getInstance();
        this.ecosystem = db4oUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJpanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblsignup1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mgmtDivBtn = new javax.swing.JButton();
        btnSystemAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainJpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainJpanel.setPreferredSize(new java.awt.Dimension(1460, 850));
        mainJpanel.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 350));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign In");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ewasteicon_50.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");

        usernameTxtField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(65, 118, 102)));
        usernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");

        PasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(65, 118, 102)));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_login_base.png"))); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 350));

        kGradientPanel1.setkEndColor(new java.awt.Color(65, 118, 102));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(221, 228, 186));

        lblsignup1.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        lblsignup1.setText("Welcome to ReQube!");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel7.setText("Don't have an account?");

        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_signup_base.png"))); // NOI18N
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignupMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSignup)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblsignup1))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblsignup1)
                .addGap(84, 84, 84)
                .addComponent(jLabel7)
                .addGap(87, 87, 87)
                .addComponent(btnSignup)
                .addContainerGap(1454, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("Logistics");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        mgmtDivBtn.setText("Management");
        mgmtDivBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgmtDivBtnActionPerformed(evt);
            }
        });

        btnSystemAdmin.setText("System Admin");
        btnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(usernameTxtField)
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_login)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mgmtDivBtn)
                        .addGap(36, 36, 36)
                        .addComponent(btnSystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1862, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mgmtDivBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnSystemAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btn_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainJpanel.add(jPanel2, "card2");

        getContentPane().add(mainJpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1460, 850));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theme.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1980, 1100));

        setSize(new java.awt.Dimension(1932, 1115));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtFieldActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        // TODO add your handling code here:
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_login_onhover.png")));
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        // TODO add your handling code here:
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_login_base.png")));
    }//GEN-LAST:event_btn_loginMouseExited

    private void btnSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseEntered
        // TODO add your handling code here:
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_signup_onhover.png")));
    }//GEN-LAST:event_btnSignupMouseEntered

    private void btnSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseExited
        // TODO add your handling code here:
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_signup_base.png")));
    }//GEN-LAST:event_btnSignupMouseExited

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        // TODO add your handling code here:
         SignupJPanel signupJPanel = new SignupJPanel(mainJpanel, ecosystem);
         CardLayout layout = (CardLayout) mainJpanel.getLayout();
         mainJpanel.add("signup", signupJPanel);
        
         layout.next(mainJpanel);
        
      
    }//GEN-LAST:event_btnSignupMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        // TODO add your handling code here:
        String username = usernameTxtField.getText();
        String password = new String(PasswordField.getPassword());
        UserAccount userAccount = this.ecosystem.getUserAccountDirectory().authenticateUser(username, password);
        if (userAccount == null) {
            JOptionPane.showMessageDialog(this, "Invalid login credentials!");
            return;
        }
        Role role  = userAccount.getRole();
        if (role instanceof ResidentRole) {
            Resident resident = this.ecosystem.getCustomerDirectory().getResidentByUserAccount(userAccount);
            IndiProfileLoginJPanel indivProfileLoginJpanel = new IndiProfileLoginJPanel(mainJpanel, ecosystem, resident);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
             mainJpanel.add("profileIndividual", indivProfileLoginJpanel);
             layout.next(mainJpanel);
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        LogisticsProfileMainJPanel logisticsprofilemain = new LogisticsProfileMainJPanel(mainJpanel);
        CardLayout layout = (CardLayout) mainJpanel.getLayout();
        mainJpanel.add("LogisticsPanel", logisticsprofilemain);
        layout.next(mainJpanel);
    }//GEN-LAST:event_jButton1MouseClicked

    private void mgmtDivBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgmtDivBtnActionPerformed
        // TODO add your handling code here:
        ManagementDivisionProfileMainJPanel managementDivisionprofilemain = new ManagementDivisionProfileMainJPanel(mainJpanel);
        CardLayout layout = (CardLayout) mainJpanel.getLayout();
        mainJpanel.add("LogisticsPanel", managementDivisionprofilemain);
        layout.next(mainJpanel);
    }//GEN-LAST:event_mgmtDivBtnActionPerformed

    private void btnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminActionPerformed
        // TODO add your handling code here:
        SystemAdminLoginProfile systemAdminLogin = new SystemAdminLoginProfile(mainJpanel);
        CardLayout layout = (CardLayout) mainJpanel.getLayout();
        mainJpanel.add("LogisticsPanel", systemAdminLogin);
        layout.next(mainJpanel);
        
    }//GEN-LAST:event_btnSystemAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame(userProcessContainer).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel btnSignup;
    private javax.swing.JButton btnSystemAdmin;
    private javax.swing.JLabel btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblsignup1;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton mgmtDivBtn;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
