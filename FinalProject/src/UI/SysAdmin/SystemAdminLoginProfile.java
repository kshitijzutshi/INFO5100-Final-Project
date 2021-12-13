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
        btnManageManagemnt = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnManageRetailers1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnManageRetailer = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnManageTechnician = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sysadminDynamicJPanel = new javax.swing.JPanel();
        sysadminDynamicMainJPanel = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 1460));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        jLabel1.setText("ReQube Operations");

        btnManageQCInspector.setBackground(new java.awt.Color(167, 190, 211));
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
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageQCInspectorLayout.setVerticalGroup(
            btnManageQCInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageQCInspectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageQCInspectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnManageLogisticsSysadmin.setBackground(new java.awt.Color(167, 190, 211));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnManageIndividual.setBackground(new java.awt.Color(167, 190, 211));
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
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageIndividualLayout.setVerticalGroup(
            btnManageIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnManageIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(51, 51, 51)));

        btnManageManagemnt.setBackground(new java.awt.Color(167, 190, 211));
        btnManageManagemnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageManagemntMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/management_24px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Manage Managment Div.");

        javax.swing.GroupLayout btnManageManagemntLayout = new javax.swing.GroupLayout(btnManageManagemnt);
        btnManageManagemnt.setLayout(btnManageManagemntLayout);
        btnManageManagemntLayout.setHorizontalGroup(
            btnManageManagemntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageManagemntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageManagemntLayout.setVerticalGroup(
            btnManageManagemntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageManagemntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnManageRetailers1.setBackground(new java.awt.Color(167, 190, 211));
        btnManageRetailers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageRetailers1MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/building_24px.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Manage Commercial");

        javax.swing.GroupLayout btnManageRetailers1Layout = new javax.swing.GroupLayout(btnManageRetailers1);
        btnManageRetailers1.setLayout(btnManageRetailers1Layout);
        btnManageRetailers1Layout.setHorizontalGroup(
            btnManageRetailers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageRetailers1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageRetailers1Layout.setVerticalGroup(
            btnManageRetailers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageRetailers1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnManageRetailer.setBackground(new java.awt.Color(167, 190, 211));
        btnManageRetailer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageRetailerMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retailers_24px.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Manage Clients");

        javax.swing.GroupLayout btnManageRetailerLayout = new javax.swing.GroupLayout(btnManageRetailer);
        btnManageRetailer.setLayout(btnManageRetailerLayout);
        btnManageRetailerLayout.setHorizontalGroup(
            btnManageRetailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageRetailerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnManageRetailerLayout.setVerticalGroup(
            btnManageRetailerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageRetailerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnManageTechnician.setBackground(new java.awt.Color(167, 190, 211));
        btnManageTechnician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageTechnicianMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/technician_24px.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Manage Technicians");

        javax.swing.GroupLayout btnManageTechnicianLayout = new javax.swing.GroupLayout(btnManageTechnician);
        btnManageTechnician.setLayout(btnManageTechnicianLayout);
        btnManageTechnicianLayout.setHorizontalGroup(
            btnManageTechnicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageTechnicianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        btnManageTechnicianLayout.setVerticalGroup(
            btnManageTechnicianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnManageTechnicianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnlogout.setBackground(new java.awt.Color(167, 190, 211));
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_30px.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Logout");

        javax.swing.GroupLayout btnlogoutLayout = new javax.swing.GroupLayout(btnlogout);
        btnlogout.setLayout(btnlogoutLayout);
        btnlogoutLayout.setHorizontalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnlogoutLayout.setVerticalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageTechnician, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageRetailer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageRetailers1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageManagemnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageIndividual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageLogisticsSysadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageQCInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
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
                .addComponent(btnManageRetailers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnManageManagemnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageRetailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(665, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel2.setkGradientFocus(800);
        kGradientPanel2.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Welcome to ReQube,");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Sys_Admin");
        jLabel14.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        sysadminDynamicJPanel.setLayout(new java.awt.CardLayout());

        sysadminDynamicMainJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sysadminDynamicMainJPanelLayout = new javax.swing.GroupLayout(sysadminDynamicMainJPanel);
        sysadminDynamicMainJPanel.setLayout(sysadminDynamicMainJPanelLayout);
        sysadminDynamicMainJPanelLayout.setHorizontalGroup(
            sysadminDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
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
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)))
            .addGroup(sysadminLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sysadminLoginJPanelLayout.createSequentialGroup()
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 986, Short.MAX_VALUE)))
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

    private void btnManageManagemntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageManagemntMouseClicked
        // TODO add your handling code here:
        ManageMgmtDivSysAdminJPanel manageSysadminMgmt = new ManageMgmtDivSysAdminJPanel(sysadminDynamicJPanel, ecosystem);
        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
        sysadminDynamicJPanel.add("ManageMgmtLogin", manageSysadminMgmt);
        layout.next(sysadminDynamicJPanel);
    }//GEN-LAST:event_btnManageManagemntMouseClicked

    private void btnManageRetailers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageRetailers1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageRetailers1MouseClicked

    private void btnManageRetailerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageRetailerMouseClicked
        // TODO add your handling code here:
        ManageRetailerSysAdminJPanel manageSysadminRetailer = new ManageRetailerSysAdminJPanel(sysadminDynamicJPanel, ecosystem);
        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
        sysadminDynamicJPanel.add("ManageRetailerLogin", manageSysadminRetailer);
        layout.next(sysadminDynamicJPanel);
    }//GEN-LAST:event_btnManageRetailerMouseClicked

    private void btnManageTechnicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageTechnicianMouseClicked
        // TODO add your handling code here:
        ManageTechnicianSysAdminJPanel manageSysadminTechnician = new ManageTechnicianSysAdminJPanel(sysadminDynamicJPanel, ecosystem);
        CardLayout layout = (CardLayout) sysadminDynamicJPanel.getLayout();
        sysadminDynamicJPanel.add("ManageRetailerLogin", manageSysadminTechnician);
        layout.next(sysadminDynamicJPanel);
    }//GEN-LAST:event_btnManageTechnicianMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        // TODO add your handling code here:
       
        DB4OUtil.getInstance().storeSystem(this.ecosystem);  
         MainJPanel main = new MainJPanel(sysadminLoginJPanel);
        CardLayout layout = (CardLayout) sysadminLoginJPanel.getLayout();
        sysadminLoginJPanel.add("Home", main);

        layout.next(sysadminLoginJPanel);
    }//GEN-LAST:event_btnlogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnManageIndividual;
    private javax.swing.JPanel btnManageLogisticsSysadmin;
    private javax.swing.JPanel btnManageManagemnt;
    private javax.swing.JPanel btnManageQCInspector;
    private javax.swing.JPanel btnManageRetailer;
    private javax.swing.JPanel btnManageRetailers1;
    private javax.swing.JPanel btnManageTechnician;
    private javax.swing.JPanel btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel sysadminDynamicJPanel;
    private javax.swing.JPanel sysadminDynamicMainJPanel;
    private javax.swing.JPanel sysadminLoginJPanel;
    // End of variables declaration//GEN-END:variables
}
