/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Resident;

import UI.Resident.IndiBookingHistoryJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;
import models.User.Customer.Resident;
import UI.MainJPanel;

/**
 *
 * @author shrey
 */
public class IndiProfileLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndiProfileLoginJPanel
     */
    JPanel jPanel2;
    EcoSystem ecosystem;
    Resident resident;
    public IndiProfileLoginJPanel(JPanel mainJPanel, EcoSystem ecosystem, Resident resident) {
        this.JPanelIndLogin = mainJPanel;
        initComponents();
        this.ecosystem = ecosystem;
        this.resident = resident;
        nameLabel.setText(resident.getFullName());
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
        JPanelIndLoginMain = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        btnviewdashboard = new javax.swing.JButton();
        btnviewinfo = new javax.swing.JButton();
        btnviewbookingdetails = new javax.swing.JButton();
        btnviewprofile = new javax.swing.JButton();
        btnviewpickup = new javax.swing.JButton();
        btnviewdropoff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtprofile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1460, 850));
        setLayout(new java.awt.CardLayout());

        JPanelIndLogin.setBackground(new java.awt.Color(255, 255, 255));
        JPanelIndLogin.setPreferredSize(new java.awt.Dimension(1460, 850));
        JPanelIndLogin.setLayout(new java.awt.CardLayout());

        JPanelIndLoginMain.setBackground(new java.awt.Color(255, 255, 255));
        JPanelIndLoginMain.setPreferredSize(new java.awt.Dimension(1460, 850));

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Welcome to ReQube,");

        nameLabel.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));

        logoutButton.setBackground(new java.awt.Color(205, 223, 245));
        logoutButton.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 51, 51));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_50px.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        btnviewdashboard.setBackground(new java.awt.Color(205, 223, 245));
        btnviewdashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/speed_127px.png"))); // NOI18N
        btnviewdashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnviewdashboard.setBorderPainted(false);
        btnviewdashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewdashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewdashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewdashboardMouseExited(evt);
            }
        });
        btnviewdashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdashboardActionPerformed(evt);
            }
        });

        btnviewinfo.setBackground(new java.awt.Color(167, 190, 211));
        btnviewinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info_127px_1.png"))); // NOI18N
        btnviewinfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnviewinfo.setBorderPainted(false);
        btnviewinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewinfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewinfoMouseExited(evt);
            }
        });
        btnviewinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewinfoActionPerformed(evt);
            }
        });

        btnviewbookingdetails.setBackground(new java.awt.Color(205, 223, 245));
        btnviewbookingdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details_127px_1.png"))); // NOI18N
        btnviewbookingdetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnviewbookingdetails.setBorderPainted(false);
        btnviewbookingdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewbookingdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewbookingdetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewbookingdetailsMouseExited(evt);
            }
        });
        btnviewbookingdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewbookingdetailsActionPerformed(evt);
            }
        });

        btnviewprofile.setBackground(new java.awt.Color(167, 190, 211));
        btnviewprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/person_127px_2.png"))); // NOI18N
        btnviewprofile.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnviewprofile.setBorderPainted(false);
        btnviewprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewprofileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewprofileMouseExited(evt);
            }
        });
        btnviewprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewprofileActionPerformed(evt);
            }
        });

        btnviewpickup.setBackground(new java.awt.Color(205, 223, 245));
        btnviewpickup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedule_127px_1.png"))); // NOI18N
        btnviewpickup.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnviewpickup.setBorderPainted(false);
        btnviewpickup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewpickup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewpickupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewpickupMouseExited(evt);
            }
        });
        btnviewpickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewpickupActionPerformed(evt);
            }
        });

        btnviewdropoff.setBackground(new java.awt.Color(205, 223, 245));
        btnviewdropoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pickup_127px.png"))); // NOI18N
        btnviewdropoff.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnviewdropoff.setBorderPainted(false);
        btnviewdropoff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewdropoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnviewdropoffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnviewdropoffMouseExited(evt);
            }
        });
        btnviewdropoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdropoffActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");

        txtprofile.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        txtprofile.setForeground(new java.awt.Color(51, 51, 51));
        txtprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtprofile.setText("My Profile");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("E Waste FAQ");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Drop-off booking");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("View Booking Details");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create Pick-up booking");

        javax.swing.GroupLayout JPanelIndLoginMainLayout = new javax.swing.GroupLayout(JPanelIndLoginMain);
        JPanelIndLoginMain.setLayout(JPanelIndLoginMainLayout);
        JPanelIndLoginMainLayout.setHorizontalGroup(
            JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1455, Short.MAX_VALUE)
            .addGroup(JPanelIndLoginMainLayout.createSequentialGroup()
                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelIndLoginMainLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPanelIndLoginMainLayout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelIndLoginMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelIndLoginMainLayout.createSequentialGroup()
                                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelIndLoginMainLayout.createSequentialGroup()
                                        .addComponent(btnviewpickup, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)
                                        .addComponent(btnviewdropoff, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelIndLoginMainLayout.createSequentialGroup()
                                        .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnviewprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(JPanelIndLoginMainLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(txtprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(btnviewinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(136, 136, 136)
                                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnviewdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(JPanelIndLoginMainLayout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnviewbookingdetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(320, 320, 320))
        );
        JPanelIndLoginMainLayout.setVerticalGroup(
            JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelIndLoginMainLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnviewprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnviewinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnviewpickup, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnviewbookingdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewdropoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(JPanelIndLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        JPanelIndLogin.add(JPanelIndLoginMain, "card2");

        add(JPanelIndLogin, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        MainJPanel main = new MainJPanel(JPanelIndLogin);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("Home", main);

        layout.next(JPanelIndLogin);
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void btnviewdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdashboardActionPerformed
        // TODO add your handling code here:
        IndiProfileDashboard indidashboard = new IndiProfileDashboard(JPanelIndLogin,ecosystem, resident);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("individualDashboardPanel", indidashboard);

        layout.next(JPanelIndLogin);
    }//GEN-LAST:event_btnviewdashboardActionPerformed

    private void btnviewbookingdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewbookingdetailsActionPerformed
        // TODO add your handling code here:
        
        IndiBookingHistoryJPanel indibookingdetails = new IndiBookingHistoryJPanel(JPanelIndLogin,  ecosystem, resident);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("individualBookingDetails", indibookingdetails);

        layout.next(JPanelIndLogin);
    }//GEN-LAST:event_btnviewbookingdetailsActionPerformed

    private void btnviewprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewprofileActionPerformed
        // TODO add your handling code here:

        IndiProfileDetailsJPanel indiprofiledetails = new IndiProfileDetailsJPanel(JPanelIndLogin,  ecosystem, resident);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("individualProfileDetails", indiprofiledetails);

        layout.next(JPanelIndLogin);
    }//GEN-LAST:event_btnviewprofileActionPerformed

    private void btnviewdropoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdropoffActionPerformed
        // TODO add your handling code here:
        IndiProfileDropOffJPanel indidropOffJPanel = new IndiProfileDropOffJPanel(JPanelIndLogin, ecosystem, resident);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("individualdropoffbooking", indidropOffJPanel);

        layout.next(JPanelIndLogin);
    }//GEN-LAST:event_btnviewdropoffActionPerformed

    private void btnviewprofileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewprofileMouseEntered
        // TODO add your handling code here:
        btnviewprofile.setBorder(BorderFactory.createEtchedBorder(0));  
    }//GEN-LAST:event_btnviewprofileMouseEntered

    private void btnviewprofileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewprofileMouseExited
        // TODO add your handling code here:
        btnviewprofile.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewprofileMouseExited

    private void btnviewinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewinfoMouseEntered
        // TODO add your handling code here:
        btnviewinfo.setBorder(BorderFactory.createEtchedBorder(0));  
    }//GEN-LAST:event_btnviewinfoMouseEntered

    private void btnviewinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewinfoMouseExited
        // TODO add your handling code here:
        btnviewinfo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewinfoMouseExited

    private void btnviewdashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdashboardMouseEntered
        // TODO add your handling code here:
        btnviewdashboard.setBorder(BorderFactory.createEtchedBorder(0));  
    }//GEN-LAST:event_btnviewdashboardMouseEntered

    private void btnviewdashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdashboardMouseExited
        // TODO add your handling code here:
        btnviewdashboard.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewdashboardMouseExited

    private void btnviewpickupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewpickupMouseEntered
        // TODO add your handling code here:
        btnviewpickup.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewpickupMouseEntered

    private void btnviewpickupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewpickupMouseExited
        // TODO add your handling code here:
        btnviewpickup.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewpickupMouseExited

    private void btnviewdropoffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdropoffMouseEntered
        // TODO add your handling code here:
        btnviewdropoff.setBorder(BorderFactory.createEtchedBorder(0));  
    }//GEN-LAST:event_btnviewdropoffMouseEntered

    private void btnviewdropoffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdropoffMouseExited
        // TODO add your handling code here:
        btnviewdropoff.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewdropoffMouseExited

    private void btnviewbookingdetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewbookingdetailsMouseEntered
        // TODO add your handling code here:
        btnviewbookingdetails.setBorder(BorderFactory.createEtchedBorder(0));  
    }//GEN-LAST:event_btnviewbookingdetailsMouseEntered

    private void btnviewbookingdetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewbookingdetailsMouseExited
        // TODO add your handling code here:
        btnviewbookingdetails.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewbookingdetailsMouseExited

    private void btnviewpickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewpickupActionPerformed
        // TODO add your handling code here:
        IndiProfilePickUpJPanel indipickupJPanel = new IndiProfilePickUpJPanel(JPanelIndLogin, ecosystem, resident);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("individualpickupbooking", indipickupJPanel);

        layout.next(JPanelIndLogin);
    }//GEN-LAST:event_btnviewpickupActionPerformed

    private void btnviewinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinfoActionPerformed
        // TODO add your handling code here:
        
        IndiInfoJPanel indiinfoJPanel = new IndiInfoJPanel(JPanelIndLogin);
        CardLayout layout = (CardLayout) JPanelIndLogin.getLayout();
        JPanelIndLogin.add("individualpickupbooking", indiinfoJPanel);

        layout.next(JPanelIndLogin);
    }//GEN-LAST:event_btnviewinfoActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
    }//GEN-LAST:event_logoutButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelIndLogin;
    private javax.swing.JPanel JPanelIndLoginMain;
    private javax.swing.JButton btnviewbookingdetails;
    private javax.swing.JButton btnviewdashboard;
    private javax.swing.JButton btnviewdropoff;
    private javax.swing.JButton btnviewinfo;
    private javax.swing.JButton btnviewpickup;
    private javax.swing.JButton btnviewprofile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel txtprofile;
    // End of variables declaration//GEN-END:variables
}
