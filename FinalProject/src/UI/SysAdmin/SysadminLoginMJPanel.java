/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysAdmin;

import UI.MainJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;

/**
 *
 * @author shrey
 */
public class SysadminLoginMJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysadminLoginMJPanel
     */
    
    JPanel jpanel21;
     EcoSystem ecosystem;
    public SysadminLoginMJPanel(JPanel sysadmin, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.SysadminMainLoginJPanel = sysadmin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SysadminMainLoginJPanel = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnManageQCIns = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnmanagetechnician = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnLogisticsLogout = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnLogisticsDiv = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnManageIndi = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnmanagemanagement = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnmanageretailers = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sysadmindynamicjpanel = new javax.swing.JPanel();
        changepanel = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        SysadminMainLoginJPanel.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 1460));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ReQube Operations");

        btnManageQCIns.setBackground(new java.awt.Color(167, 190, 211));
        btnManageQCIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageQCInsMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/policeman_female_24px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Manage QC Inspection");

        javax.swing.GroupLayout btnManageQCInsLayout = new javax.swing.GroupLayout(btnManageQCIns);
        btnManageQCIns.setLayout(btnManageQCInsLayout);
        btnManageQCInsLayout.setHorizontalGroup(
            btnManageQCInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageQCInsLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageQCInsLayout.setVerticalGroup(
            btnManageQCInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnManageQCInsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageQCInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        btnmanagetechnician.setBackground(new java.awt.Color(167, 190, 211));
        btnmanagetechnician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmanagetechnicianMouseClicked(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/technician_24px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Manage Technicians");

        javax.swing.GroupLayout btnmanagetechnicianLayout = new javax.swing.GroupLayout(btnmanagetechnician);
        btnmanagetechnician.setLayout(btnmanagetechnicianLayout);
        btnmanagetechnicianLayout.setHorizontalGroup(
            btnmanagetechnicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnmanagetechnicianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnmanagetechnicianLayout.setVerticalGroup(
            btnmanagetechnicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnmanagetechnicianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnmanagetechnicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnLogisticsLogout.setBackground(new java.awt.Color(167, 190, 211));
        btnLogisticsLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogisticsLogoutMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_30px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Logout");

        javax.swing.GroupLayout btnLogisticsLogoutLayout = new javax.swing.GroupLayout(btnLogisticsLogout);
        btnLogisticsLogout.setLayout(btnLogisticsLogoutLayout);
        btnLogisticsLogoutLayout.setHorizontalGroup(
            btnLogisticsLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogisticsLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLogisticsLogoutLayout.setVerticalGroup(
            btnLogisticsLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogisticsLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLogisticsLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnLogisticsDiv.setBackground(new java.awt.Color(167, 190, 211));
        btnLogisticsDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogisticsDivMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/truck_24px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Manage Logistics Division");

        javax.swing.GroupLayout btnLogisticsDivLayout = new javax.swing.GroupLayout(btnLogisticsDiv);
        btnLogisticsDiv.setLayout(btnLogisticsDivLayout);
        btnLogisticsDivLayout.setHorizontalGroup(
            btnLogisticsDivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogisticsDivLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        btnLogisticsDivLayout.setVerticalGroup(
            btnLogisticsDivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogisticsDivLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLogisticsDivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnManageIndi.setBackground(new java.awt.Color(167, 190, 211));
        btnManageIndi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageIndiMouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_24px.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Manage Individual");

        javax.swing.GroupLayout btnManageIndiLayout = new javax.swing.GroupLayout(btnManageIndi);
        btnManageIndi.setLayout(btnManageIndiLayout);
        btnManageIndiLayout.setHorizontalGroup(
            btnManageIndiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageIndiLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageIndiLayout.setVerticalGroup(
            btnManageIndiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnManageIndiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageIndiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnmanagemanagement.setBackground(new java.awt.Color(167, 190, 211));
        btnmanagemanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmanagemanagementMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/management_24px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Manage Management Division");

        javax.swing.GroupLayout btnmanagemanagementLayout = new javax.swing.GroupLayout(btnmanagemanagement);
        btnmanagemanagement.setLayout(btnmanagemanagementLayout);
        btnmanagemanagementLayout.setHorizontalGroup(
            btnmanagemanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnmanagemanagementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );
        btnmanagemanagementLayout.setVerticalGroup(
            btnmanagemanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnmanagemanagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnmanagemanagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnmanageretailers.setBackground(new java.awt.Color(167, 190, 211));
        btnmanageretailers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmanageretailersMouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retailers_24px.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Manage Retailers");

        javax.swing.GroupLayout btnmanageretailersLayout = new javax.swing.GroupLayout(btnmanageretailers);
        btnmanageretailers.setLayout(btnmanageretailersLayout);
        btnmanageretailersLayout.setHorizontalGroup(
            btnmanageretailersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnmanageretailersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(29, 29, 29)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnmanageretailersLayout.setVerticalGroup(
            btnmanageretailersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnmanageretailersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnmanageretailersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnManageQCIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageIndi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanagemanagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanageretailers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanagetechnician, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogisticsLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnLogisticsDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(201, 201, 201)
                .addComponent(btnManageQCIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageIndi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmanagemanagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmanageretailers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmanagetechnician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogisticsLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(766, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addComponent(btnLogisticsDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1150, Short.MAX_VALUE)))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel2.setkGradientFocus(800);
        kGradientPanel2.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Welcome to ReQube,");

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Sysadmin");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
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

        sysadmindynamicjpanel.setLayout(new java.awt.CardLayout());

        changepanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout changepanelLayout = new javax.swing.GroupLayout(changepanel);
        changepanel.setLayout(changepanelLayout);
        changepanelLayout.setHorizontalGroup(
            changepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1367, Short.MAX_VALUE)
        );
        changepanelLayout.setVerticalGroup(
            changepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
        );

        sysadmindynamicjpanel.add(changepanel, "card2");

        javax.swing.GroupLayout SysadminMainLoginJPanelLayout = new javax.swing.GroupLayout(SysadminMainLoginJPanel);
        SysadminMainLoginJPanel.setLayout(SysadminMainLoginJPanelLayout);
        SysadminMainLoginJPanelLayout.setHorizontalGroup(
            SysadminMainLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysadminMainLoginJPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(SysadminMainLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sysadmindynamicjpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SysadminMainLoginJPanelLayout.setVerticalGroup(
            SysadminMainLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysadminMainLoginJPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SysadminMainLoginJPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sysadmindynamicjpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(SysadminMainLoginJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageQCInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageQCInsMouseClicked

        
        ManageQCSysAdminJPanel qcinspector = new ManageQCSysAdminJPanel(sysadmindynamicjpanel, ecosystem);
        CardLayout layout = (CardLayout) sysadmindynamicjpanel.getLayout();
        sysadmindynamicjpanel.add("Logistics",qcinspector);
        
        layout.next(sysadmindynamicjpanel);
    }//GEN-LAST:event_btnManageQCInsMouseClicked

    private void btnmanagetechnicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanagetechnicianMouseClicked

        
        ManageTechnicianSysAdminJPanel technician = new ManageTechnicianSysAdminJPanel(sysadmindynamicjpanel, ecosystem);
        CardLayout layout = (CardLayout) sysadmindynamicjpanel.getLayout();
        sysadmindynamicjpanel.add("Logistics",technician);
        
        layout.next(sysadmindynamicjpanel);
        
    }//GEN-LAST:event_btnmanagetechnicianMouseClicked

    private void btnLogisticsLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogisticsLogoutMouseClicked
        // TODO add your handling code here:

         DB4OUtil.getInstance().storeSystem(this.ecosystem);
        MainJPanel main = new MainJPanel(SysadminMainLoginJPanel);
        CardLayout layout = (CardLayout) SysadminMainLoginJPanel.getLayout();
        SysadminMainLoginJPanel.add("Home", main);

        layout.next(SysadminMainLoginJPanel);

    }//GEN-LAST:event_btnLogisticsLogoutMouseClicked

    private void btnLogisticsDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogisticsDivMouseClicked
        // TODO add your handling code here:
        
        ManageSysAdminLogisticsJPanel logistics = new ManageSysAdminLogisticsJPanel(sysadmindynamicjpanel, ecosystem);
        CardLayout layout = (CardLayout) sysadmindynamicjpanel.getLayout();
        sysadmindynamicjpanel.add("Logistics",logistics);
        
        layout.next(sysadmindynamicjpanel);
        
    }//GEN-LAST:event_btnLogisticsDivMouseClicked

    private void btnManageIndiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageIndiMouseClicked
        // TODO add your handling code here:
        ManageIndividualSysAdminJPanel manageindi = new ManageIndividualSysAdminJPanel(sysadmindynamicjpanel, ecosystem);
        CardLayout layout = (CardLayout) sysadmindynamicjpanel.getLayout();
        sysadmindynamicjpanel.add("Logistics",manageindi);
        
        layout.next(sysadmindynamicjpanel);
         
    }//GEN-LAST:event_btnManageIndiMouseClicked

    private void btnmanagemanagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanagemanagementMouseClicked
        // TODO add your handling code here:
        
        ManageMgmtDivSysAdminJPanel management = new ManageMgmtDivSysAdminJPanel(sysadmindynamicjpanel, ecosystem);
         CardLayout layout = (CardLayout) sysadmindynamicjpanel.getLayout();
        sysadmindynamicjpanel.add("Logistics",management);
        
        layout.next(sysadmindynamicjpanel);
    }//GEN-LAST:event_btnmanagemanagementMouseClicked

    private void btnmanageretailersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanageretailersMouseClicked
        // TODO add your handling code here:
        ManageRetailerSysAdminJPanel retailer = new ManageRetailerSysAdminJPanel(sysadmindynamicjpanel, ecosystem);
        CardLayout layout = (CardLayout) sysadmindynamicjpanel.getLayout();
        sysadmindynamicjpanel.add("Logistics",retailer);
        
        layout.next(sysadmindynamicjpanel);
    }//GEN-LAST:event_btnmanageretailersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SysadminMainLoginJPanel;
    private javax.swing.JPanel btnLogisticsDiv;
    private javax.swing.JPanel btnLogisticsLogout;
    private javax.swing.JPanel btnManageIndi;
    private javax.swing.JPanel btnManageQCIns;
    private javax.swing.JPanel btnmanagemanagement;
    private javax.swing.JPanel btnmanageretailers;
    private javax.swing.JPanel btnmanagetechnician;
    private javax.swing.JPanel changepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel sysadmindynamicjpanel;
    // End of variables declaration//GEN-END:variables
}
