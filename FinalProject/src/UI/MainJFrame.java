/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.ManagementDivision.ManagementDivisionProfileMainJPanel;
import UI.SysAdmin.SystemAdminLoginProfile;
import UI.Logistics.LogisticsProfileMainJPanel;
import UI.QCInspector.QCMainLoginJPanel;
import UI.Resident.IndiProfileLoginJPanel;
import UI.Retailer.RecyclerLoginJPanel;
import UI.Retailer.RetailerProfileLoginJPanel;
import UI.Retailer.RetailerLoginMainJPanel;
import UI.Technician.TechnicianLoginJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;
import models.Role.ClientRole;
import models.Role.InventoryManagerRole;
import models.Role.LogisticsManRole;
import models.Role.QCInspectorRole;
import models.Role.ResidentRole;
import models.Role.Role;
import models.Role.SystemAdminRole;
import models.Role.TechnicianRole;
import models.User.Customer.Resident;
import models.User.Employee.LogisticsMan;
import models.User.Employee.OperationsManager;
import models.User.UserAccount;
import UI.SysAdmin.SysadminLoginMJPanel;
import models.User.Client.Client;
import models.User.Employee.QCInspector;
import models.User.Employee.Technician;


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
        btn_login = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblsignup1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSignUpRetailer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
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

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(80);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));

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

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Are you a Client?");

        btnSignUpRetailer.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUpRetailer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        btnSignUpRetailer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpRetailerMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reatiler_signup_48px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SIGN UP");

        javax.swing.GroupLayout btnSignUpRetailerLayout = new javax.swing.GroupLayout(btnSignUpRetailer);
        btnSignUpRetailer.setLayout(btnSignUpRetailerLayout);
        btnSignUpRetailerLayout.setHorizontalGroup(
            btnSignUpRetailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSignUpRetailerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btnSignUpRetailerLayout.setVerticalGroup(
            btnSignUpRetailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSignUpRetailerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSignUpRetailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSignup)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblsignup1)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnSignUpRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblsignup1)
                .addGap(80, 80, 80)
                .addComponent(jLabel7)
                .addGap(91, 91, 91)
                .addComponent(btnSignup)
                .addGap(49, 49, 49)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnSignUpRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1335, Short.MAX_VALUE))
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

        PasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(65, 118, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(usernameTxtField)
                        .addComponent(jLabel4)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_login)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1862, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btn_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainJpanel.add(jPanel2, "card2");

        getContentPane().add(mainJpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1460, 850));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bluelight.jpg"))); // NOI18N
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
            IndiProfileLoginJPanel indivProfileLoginJpanel = new IndiProfileLoginJPanel(mainJpanel, this.ecosystem, resident);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
            mainJpanel.add("profileIndividual", indivProfileLoginJpanel);
            layout.next(mainJpanel);
        } else if (role instanceof SystemAdminRole) {
            SysadminLoginMJPanel systemAdminLogin = new SysadminLoginMJPanel(mainJpanel, this.ecosystem);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
            mainJpanel.add("Sysadmin", systemAdminLogin);
            layout.next(mainJpanel);
        } else if (role instanceof LogisticsManRole) {
            LogisticsMan logMan = this.ecosystem.getEmployeeDirectory().getLogisticsManByUserAccount(userAccount);
            LogisticsProfileMainJPanel logisticsprofilemain = new LogisticsProfileMainJPanel(mainJpanel, this.ecosystem, logMan);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
            mainJpanel.add("LogisticsPanel", logisticsprofilemain);
            layout.next(mainJpanel);
            layout.next(mainJpanel);
        } else if (role instanceof InventoryManagerRole) {
            OperationsManager manager = this.ecosystem.getEmployeeDirectory().getManagerByUserAccount(userAccount);
            ManagementDivisionProfileMainJPanel managementDivisionprofilemain = new ManagementDivisionProfileMainJPanel(mainJpanel, this.ecosystem, manager);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
            mainJpanel.add("OperationsManagerPanel", managementDivisionprofilemain);
            layout.next(mainJpanel);
        } else if (role instanceof QCInspectorRole) {
            QCInspector qcinspector = this.ecosystem.getEmployeeDirectory().getQCInspectorByUserAccount(userAccount);
            QCMainLoginJPanel qcAdminMainPanel = new QCMainLoginJPanel(mainJpanel, ecosystem, qcinspector);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
            mainJpanel.add("SysadminQCMain", qcAdminMainPanel);
            layout.next(mainJpanel);
        } else if (role instanceof TechnicianRole) {
            Technician technician = this.ecosystem.getEmployeeDirectory().getTechnicanByUserAccount(userAccount);
            TechnicianLoginJPanel systemAdminLogin = new TechnicianLoginJPanel(mainJpanel, ecosystem, technician);
            CardLayout layout = (CardLayout) mainJpanel.getLayout();
            mainJpanel.add("SysadminTechnician", systemAdminLogin);
            layout.next(mainJpanel);
        } else if (role instanceof ClientRole) {
            Client client = this.ecosystem.getClientDirectory().getClientByUserAccount(userAccount);
            
            if(client.getClienttype() == Client.clientType.RETAILER){
                RetailerLoginMainJPanel systemAdminRetailClient = new RetailerLoginMainJPanel(mainJpanel, ecosystem, client);
                CardLayout layout = (CardLayout) mainJpanel.getLayout();
                mainJpanel.add("SysadminRetailClient", systemAdminRetailClient);
                layout.next(mainJpanel);
            }
            else if(client.getClienttype() == Client.clientType.RECYCLER){
                RecyclerLoginJPanel systemAdminRecycler = new RecyclerLoginJPanel(mainJpanel, ecosystem, client);
                CardLayout layout = (CardLayout) mainJpanel.getLayout();
                mainJpanel.add("systemAdminRecycler", systemAdminRecycler);
                layout.next(mainJpanel);
            }
            
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btnSignUpRetailerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpRetailerMouseClicked
        // TODO add your handling code here:
         SignUpRetailerJPanel clientSignUp = new SignUpRetailerJPanel(mainJpanel, ecosystem);
         CardLayout layout = (CardLayout) mainJpanel.getLayout();
         mainJpanel.add("ClientSignUp", clientSignUp);
         layout.next(mainJpanel);
        
    }//GEN-LAST:event_btnSignUpRetailerMouseClicked

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
    private javax.swing.JPanel btnSignUpRetailer;
    private javax.swing.JLabel btnSignup;
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblsignup1;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
