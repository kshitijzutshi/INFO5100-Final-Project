/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.Resident.IndiInfoJPanel;
import java.awt.CardLayout;
import javax.swing.BorderFactory;

/**
 *
 * @author kshitij
 */
public class CommercialProfileLoginMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommercialProfileLoginMainJPanel
     */
    public CommercialProfileLoginMainJPanel() {
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

        JPanelCommerciallLogin = new javax.swing.JPanel();
        JPanelCommercialLoginMain = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelCommerciallLogin.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCommerciallLogin.setLayout(new java.awt.CardLayout());

        JPanelCommercialLoginMain.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCommercialLoginMain.setPreferredSize(new java.awt.Dimension(1460, 850));

        kGradientPanel1.setkEndColor(new java.awt.Color(65, 118, 102));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(221, 228, 186));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome to ReQube,");

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");

        jButton7.setBackground(new java.awt.Color(65, 118, 102));
        jButton7.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_50px.png"))); // NOI18N
        jButton7.setText("Logout");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        btnviewdashboard.setBackground(new java.awt.Color(232, 243, 228));
        btnviewdashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard_127px.png"))); // NOI18N
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

        btnviewinfo.setBackground(new java.awt.Color(232, 243, 228));
        btnviewinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info_127px.png"))); // NOI18N
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

        btnviewbookingdetails.setBackground(new java.awt.Color(232, 243, 228));
        btnviewbookingdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details_127px.png"))); // NOI18N
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

        btnviewprofile.setBackground(new java.awt.Color(232, 243, 228));
        btnviewprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/person_127px.png"))); // NOI18N
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

        btnviewpickup.setBackground(new java.awt.Color(232, 243, 228));
        btnviewpickup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedule_127px.png"))); // NOI18N
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

        btnviewdropoff.setBackground(new java.awt.Color(232, 243, 228));
        btnviewdropoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/truck_127px.png"))); // NOI18N
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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");

        txtprofile.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        txtprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtprofile.setText("My Profile");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("E Waste FAQ");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Drop-off booking");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("View Booking Details");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create Pick-up booking");

        javax.swing.GroupLayout JPanelCommercialLoginMainLayout = new javax.swing.GroupLayout(JPanelCommercialLoginMain);
        JPanelCommercialLoginMain.setLayout(JPanelCommercialLoginMainLayout);
        JPanelCommercialLoginMainLayout.setHorizontalGroup(
            JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE)
            .addGroup(JPanelCommercialLoginMainLayout.createSequentialGroup()
                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCommercialLoginMainLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPanelCommercialLoginMainLayout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCommercialLoginMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCommercialLoginMainLayout.createSequentialGroup()
                                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelCommercialLoginMainLayout.createSequentialGroup()
                                        .addComponent(btnviewpickup, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113)
                                        .addComponent(btnviewdropoff, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelCommercialLoginMainLayout.createSequentialGroup()
                                        .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnviewprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(JPanelCommercialLoginMainLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(txtprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(btnviewinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(136, 136, 136)
                                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnviewdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(JPanelCommercialLoginMainLayout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnviewbookingdetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(320, 320, 320))
        );
        JPanelCommercialLoginMainLayout.setVerticalGroup(
            JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCommercialLoginMainLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnviewprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnviewinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnviewpickup, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btnviewbookingdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewdropoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(JPanelCommercialLoginMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        JPanelCommerciallLogin.add(JPanelCommercialLoginMain, "card2");

        add(JPanelCommerciallLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnviewdashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdashboardMouseEntered
        // TODO add your handling code here:
        btnviewdashboard.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewdashboardMouseEntered

    private void btnviewdashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdashboardMouseExited
        // TODO add your handling code here:
        btnviewdashboard.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewdashboardMouseExited

    private void btnviewdashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnviewdashboardActionPerformed

    private void btnviewinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewinfoMouseEntered
        // TODO add your handling code here:
        btnviewinfo.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewinfoMouseEntered

    private void btnviewinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewinfoMouseExited
        // TODO add your handling code here:
        btnviewinfo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewinfoMouseExited

    private void btnviewinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinfoActionPerformed
        // TODO add your handling code here:

        IndiInfoJPanel indiinfoJPanel = new IndiInfoJPanel(JPanelCommerciallLogin);
        CardLayout layout = (CardLayout) JPanelCommerciallLogin.getLayout();
        JPanelCommerciallLogin.add("individualpickupbooking", indiinfoJPanel);

        layout.next(JPanelCommerciallLogin);
    }//GEN-LAST:event_btnviewinfoActionPerformed

    private void btnviewbookingdetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewbookingdetailsMouseEntered
        // TODO add your handling code here:
        btnviewbookingdetails.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewbookingdetailsMouseEntered

    private void btnviewbookingdetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewbookingdetailsMouseExited
        // TODO add your handling code here:
        btnviewbookingdetails.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewbookingdetailsMouseExited

    private void btnviewbookingdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewbookingdetailsActionPerformed
        // TODO add your handling code here:

//        IndiBookingHistoryJPanel indibookingdetails = new IndiBookingHistoryJPanel(JPanelCommerciallLogin);
//        CardLayout layout = (CardLayout) JPanelCommerciallLogin.getLayout();
//        JPanelCommerciallLogin.add("individualBookingDetails", indibookingdetails);
//
//        layout.next(JPanelCommerciallLogin);
    }//GEN-LAST:event_btnviewbookingdetailsActionPerformed

    private void btnviewprofileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewprofileMouseEntered
        // TODO add your handling code here:
        btnviewprofile.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewprofileMouseEntered

    private void btnviewprofileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewprofileMouseExited
        // TODO add your handling code here:
        btnviewprofile.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewprofileMouseExited

    private void btnviewprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewprofileActionPerformed
        // TODO add your handling code here:

//        IndiProfileDetailsJPanel indiprofiledetails = new IndiProfileDetailsJPanel(JPanelCommerciallLogin);
//        CardLayout layout = (CardLayout) JPanelCommerciallLogin.getLayout();
//        JPanelCommerciallLogin.add("individualProfileDetails", indiprofiledetails);
//
//        layout.next(JPanelCommerciallLogin);
    }//GEN-LAST:event_btnviewprofileActionPerformed

    private void btnviewpickupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewpickupMouseEntered
        // TODO add your handling code here:
        btnviewpickup.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewpickupMouseEntered

    private void btnviewpickupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewpickupMouseExited
        // TODO add your handling code here:
        btnviewpickup.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewpickupMouseExited

    private void btnviewpickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewpickupActionPerformed
        // TODO add your handling code here:
//        IndiProfilePickUpJPanel indipickupJPanel = new IndiProfilePickUpJPanel(JPanelCommerciallLogin, ecosystem, resident);
//        CardLayout layout = (CardLayout) JPanelCommerciallLogin.getLayout();
//        JPanelCommerciallLogin.add("individualpickupbooking", indipickupJPanel);
//
//        layout.next(JPanelCommerciallLogin);
    }//GEN-LAST:event_btnviewpickupActionPerformed

    private void btnviewdropoffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdropoffMouseEntered
        // TODO add your handling code here:
        btnviewdropoff.setBorder(BorderFactory.createEtchedBorder(0));
    }//GEN-LAST:event_btnviewdropoffMouseEntered

    private void btnviewdropoffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewdropoffMouseExited
        // TODO add your handling code here:
        btnviewdropoff.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }//GEN-LAST:event_btnviewdropoffMouseExited

    private void btnviewdropoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdropoffActionPerformed
        // TODO add your handling code here:
//        IndiProfileDropOffJPanel indidropOffJPanel = new IndiProfileDropOffJPanel(JPanelCommerciallLogin);
//        CardLayout layout = (CardLayout) JPanelCommerciallLogin.getLayout();
//        JPanelCommerciallLogin.add("individualdropoffbooking", indidropOffJPanel);
//
//        layout.next(JPanelCommerciallLogin);
    }//GEN-LAST:event_btnviewdropoffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelCommercialLoginMain;
    private javax.swing.JPanel JPanelCommerciallLogin;
    private javax.swing.JButton btnviewbookingdetails;
    private javax.swing.JButton btnviewdashboard;
    private javax.swing.JButton btnviewdropoff;
    private javax.swing.JButton btnviewinfo;
    private javax.swing.JButton btnviewpickup;
    private javax.swing.JButton btnviewprofile;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel txtprofile;
    // End of variables declaration//GEN-END:variables
}
