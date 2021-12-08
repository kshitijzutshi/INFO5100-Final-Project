/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;

/**
 *
 * @author kshitij
 */
public class SystemAdminLoginProfile extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminLoginProfile
     */
    JPanel jpanel9;
    EcoSystem ecosystem;
    public SystemAdminLoginProfile(JPanel sysadminJPanel, EcoSystem ecosystem) {
        this.sysadminLoginJPanel = sysadminJPanel;
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

        sysadminLoginJPanel = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManageQCInspector = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnManageLogisticsSysadmin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnManageIndividual = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        logoutSysadminPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnManageRetailers = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sysadminDynamicJPanel = new javax.swing.JPanel();
        sysadminDynamicMainJPanel = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(65, 118, 102));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(221, 228, 186));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 1460));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        jLabel1.setText("ReQube Operations");

        btnManageQCInspector.setBackground(new java.awt.Color(221, 228, 186));
        btnManageQCInspector.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 228, 186)));
        btnManageQCInspector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageQCInspectorMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/policeman_female_24px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage QC Inspection ");

        javax.swing.GroupLayout btnManageQCInspectorLayout = new javax.swing.GroupLayout(btnManageQCInspector);
        btnManageQCInspector.setLayout(btnManageQCInspectorLayout);
        btnManageQCInspectorLayout.setHorizontalGroup(
            btnManageQCInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageQCInspectorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageQCInspectorLayout.setVerticalGroup(
            btnManageQCInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageQCInspectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageQCInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnManageLogisticsSysadmin.setBackground(new java.awt.Color(221, 228, 186));
        btnManageLogisticsSysadmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 228, 186)));
        btnManageLogisticsSysadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageLogisticsSysadminMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/truck_24px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Logistics Div.");

        javax.swing.GroupLayout btnManageLogisticsSysadminLayout = new javax.swing.GroupLayout(btnManageLogisticsSysadmin);
        btnManageLogisticsSysadmin.setLayout(btnManageLogisticsSysadminLayout);
        btnManageLogisticsSysadminLayout.setHorizontalGroup(
            btnManageLogisticsSysadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageLogisticsSysadminLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnManageLogisticsSysadminLayout.setVerticalGroup(
            btnManageLogisticsSysadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnManageLogisticsSysadminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageLogisticsSysadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnManageIndividual.setBackground(new java.awt.Color(221, 228, 186));
        btnManageIndividual.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 228, 186)));
        btnManageIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageIndividualMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_24px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel9.setText("Manage Individual");

        javax.swing.GroupLayout btnManageIndividualLayout = new javax.swing.GroupLayout(btnManageIndividual);
        btnManageIndividual.setLayout(btnManageIndividualLayout);
        btnManageIndividualLayout.setHorizontalGroup(
            btnManageIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageIndividualLayout.setVerticalGroup(
            btnManageIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(102, 204, 0)));

        logoutSysadminPanel.setBackground(new java.awt.Color(221, 228, 186));
        logoutSysadminPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 228, 186)));
        logoutSysadminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutSysadminPanelMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_30px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel16.setText("Logout");

        javax.swing.GroupLayout logoutSysadminPanelLayout = new javax.swing.GroupLayout(logoutSysadminPanel);
        logoutSysadminPanel.setLayout(logoutSysadminPanelLayout);
        logoutSysadminPanelLayout.setHorizontalGroup(
            logoutSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutSysadminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutSysadminPanelLayout.setVerticalGroup(
            logoutSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutSysadminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutSysadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnManageRetailers.setBackground(new java.awt.Color(221, 228, 186));
        btnManageRetailers.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(221, 228, 186)));
        btnManageRetailers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageRetailersMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/building_24px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel18.setText("Manage Commercial");

        javax.swing.GroupLayout btnManageRetailersLayout = new javax.swing.GroupLayout(btnManageRetailers);
        btnManageRetailers.setLayout(btnManageRetailersLayout);
        btnManageRetailersLayout.setHorizontalGroup(
            btnManageRetailersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageRetailersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageRetailersLayout.setVerticalGroup(
            btnManageRetailersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageRetailersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageRetailersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnManageLogisticsSysadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageQCInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageRetailers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutSysadminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(86, 86, 86)
                .addComponent(btnManageLogisticsSysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageQCInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageRetailers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(logoutSysadminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(918, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(65, 118, 102));
        kGradientPanel2.setkGradientFocus(800);
        kGradientPanel2.setkStartColor(new java.awt.Color(221, 228, 186));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Welcome to ReQube,");

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sys_Admin");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        sysadminDynamicJPanel.setLayout(new java.awt.CardLayout());

        sysadminDynamicMainJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sysadminDynamicMainJPanelLayout = new javax.swing.GroupLayout(sysadminDynamicMainJPanel);
        sysadminDynamicMainJPanel.setLayout(sysadminDynamicMainJPanelLayout);
        sysadminDynamicMainJPanelLayout.setHorizontalGroup(
            sysadminDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        sysadminDynamicMainJPanelLayout.setVerticalGroup(
            sysadminDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sysadminDynamicJPanel.add(sysadminDynamicMainJPanel, "card2");

        javax.swing.GroupLayout sysadminLoginJPanelLayout = new javax.swing.GroupLayout(sysadminLoginJPanel);
        sysadminLoginJPanel.setLayout(sysadminLoginJPanelLayout);
        sysadminLoginJPanelLayout.setHorizontalGroup(
            sysadminLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysadminLoginJPanelLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(sysadminLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sysadminDynamicJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sysadminLoginJPanelLayout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 976, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(sysadminLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sysadminLoginJPanelLayout.createSequentialGroup()
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 982, Short.MAX_VALUE)))
        );
        sysadminLoginJPanelLayout.setVerticalGroup(
            sysadminLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysadminLoginJPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sysadminDynamicJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE))
            .addGroup(sysadminLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sysadminLoginJPanelLayout.createSequentialGroup()
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(sysadminLoginJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageQCInspectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageQCInspectorMouseClicked
        // TODO add your handling code here:
        

        ManageQCSysAdminJPanel manageSysadminQCInspector = new ManageQCSysAdminJPanel(sysadminDynamicJPanel, ecosystem);
        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
        sysadminDynamicJPanel.add("ManageQCLogin", manageSysadminQCInspector);
        //
        layout.next(sysadminDynamicJPanel);
    }//GEN-LAST:event_btnManageQCInspectorMouseClicked

    private void btnManageLogisticsSysadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageLogisticsSysadminMouseClicked
        // TODO add your handling code here:
        
        ManageSysAdminLogisticsJPanel manageSysadminLogistics = new ManageSysAdminLogisticsJPanel(sysadminDynamicJPanel, ecosystem);
        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
        sysadminDynamicJPanel.add("ManagelogisticsLogin", manageSysadminLogistics);
        layout.next(sysadminDynamicJPanel);

    }//GEN-LAST:event_btnManageLogisticsSysadminMouseClicked

    private void btnManageIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageIndividualMouseClicked
        // TODO add your handling code here:
        ManageIndividualSysAdminJPanel manageSysadminIndi = new ManageIndividualSysAdminJPanel(sysadminDynamicJPanel, ecosystem);
        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
        sysadminDynamicJPanel.add("ManageIndiLogin", manageSysadminIndi);
        layout.next(sysadminDynamicJPanel);
    }//GEN-LAST:event_btnManageIndividualMouseClicked

    private void btnManageRetailersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageRetailersMouseClicked
        // TODO add your handling code here:
//        ManageCommercialSysAdminJPanel manageSysadminCommercial = new ManageCommercialSysAdminJPanel(sysadminDynamicJPanel, ecosystem);
//        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
//        sysadminDynamicJPanel.add("ManageCommercialLogin", manageSysadminCommercial);
//        layout.next(sysadminDynamicJPanel);
    }//GEN-LAST:event_btnManageRetailersMouseClicked

    private void logoutSysadminPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutSysadminPanelMouseClicked
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
    }//GEN-LAST:event_logoutSysadminPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnManageIndividual;
    private javax.swing.JPanel btnManageLogisticsSysadmin;
    private javax.swing.JPanel btnManageQCInspector;
    private javax.swing.JPanel btnManageRetailers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel logoutSysadminPanel;
    private javax.swing.JPanel sysadminDynamicJPanel;
    private javax.swing.JPanel sysadminDynamicMainJPanel;
    private javax.swing.JPanel sysadminLoginJPanel;
    // End of variables declaration//GEN-END:variables
}
