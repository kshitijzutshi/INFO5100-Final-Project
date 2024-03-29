/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Retailer;

import UI.MainJPanel;
import UI.Technician.TechnicanReviewItemsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;
import models.User.Client.Client;
import models.User.Customer.Resident;



/**
 *
 * @author kshitij
 */
public class RetailerProfileLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetailerProfileLoginJPanel
     */
    JPanel jpanel7;
    EcoSystem ecosystem;
    Client client;
    public RetailerProfileLoginJPanel(JPanel RetailerProfileLogin, EcoSystem ecosystem, Client client) {
        this.RetailerLoginMainJPanel = RetailerProfileLogin;
        initComponents();
        this.ecosystem = ecosystem;
        this.client = client;
        welcomeLabel.setText(client.getFullName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RetailerLoginMainJPanel = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnItemsForSale = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRetailerHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnViewPastPurchase = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnRetailerLogout = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        RetailerDynamicJPanel = new javax.swing.JPanel();
        RetailerDynamicMainJPanel = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        RetailerLoginMainJPanel.setBackground(new java.awt.Color(255, 255, 255));
        RetailerLoginMainJPanel.setPreferredSize(new java.awt.Dimension(1460, 850));

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(80);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(500, 1460));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ReQube Operations");

        btnItemsForSale.setBackground(new java.awt.Color(167, 190, 211));
        btnItemsForSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItemsForSaleMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ItemsForSale_24px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Items For Sale");

        javax.swing.GroupLayout btnItemsForSaleLayout = new javax.swing.GroupLayout(btnItemsForSale);
        btnItemsForSale.setLayout(btnItemsForSaleLayout);
        btnItemsForSaleLayout.setHorizontalGroup(
            btnItemsForSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnItemsForSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        btnItemsForSaleLayout.setVerticalGroup(
            btnItemsForSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnItemsForSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnItemsForSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnRetailerHome.setBackground(new java.awt.Color(167, 190, 211));
        btnRetailerHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetailerHomeMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_24px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Home");

        javax.swing.GroupLayout btnRetailerHomeLayout = new javax.swing.GroupLayout(btnRetailerHome);
        btnRetailerHome.setLayout(btnRetailerHomeLayout);
        btnRetailerHomeLayout.setHorizontalGroup(
            btnRetailerHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRetailerHomeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        btnRetailerHomeLayout.setVerticalGroup(
            btnRetailerHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRetailerHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRetailerHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(51, 51, 51)));

        btnViewPastPurchase.setBackground(new java.awt.Color(167, 190, 211));
        btnViewPastPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewPastPurchaseMouseClicked(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/past_purchase_24px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("View Past Purchase");

        javax.swing.GroupLayout btnViewPastPurchaseLayout = new javax.swing.GroupLayout(btnViewPastPurchase);
        btnViewPastPurchase.setLayout(btnViewPastPurchaseLayout);
        btnViewPastPurchaseLayout.setHorizontalGroup(
            btnViewPastPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViewPastPurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        btnViewPastPurchaseLayout.setVerticalGroup(
            btnViewPastPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViewPastPurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnViewPastPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnRetailerLogout.setBackground(new java.awt.Color(167, 190, 211));
        btnRetailerLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetailerLogoutMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_30px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel16.setText("Logout");

        javax.swing.GroupLayout btnRetailerLogoutLayout = new javax.swing.GroupLayout(btnRetailerLogout);
        btnRetailerLogout.setLayout(btnRetailerLogoutLayout);
        btnRetailerLogoutLayout.setHorizontalGroup(
            btnRetailerLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRetailerLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        btnRetailerLogoutLayout.setVerticalGroup(
            btnRetailerLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRetailerLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRetailerLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetailerLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewPastPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetailerHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItemsForSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(43, 43, 43)
                .addComponent(btnRetailerHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnItemsForSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewPastPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRetailerLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(995, Short.MAX_VALUE))
        );

        kGradientPanel2.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel2.setkGradientFocus(80);
        kGradientPanel2.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel2.setkTransparentControls(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Welcome to ReQube,");

        welcomeLabel.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(51, 51, 51));
        welcomeLabel.setText("Emp_MGMT_DIV");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        RetailerDynamicJPanel.setBackground(new java.awt.Color(255, 255, 255));
        RetailerDynamicJPanel.setLayout(new java.awt.CardLayout());

        RetailerDynamicMainJPanel.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel4.setkEndColor(new java.awt.Color(167, 190, 211));
        kGradientPanel4.setkGradientFocus(0);
        kGradientPanel4.setkStartColor(new java.awt.Color(167, 190, 211));

        jLabel19.setFont(new java.awt.Font("Lucida Sans", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("800");

        jLabel20.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Number of New Added Items for Sale");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multiple_devices_96px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        kGradientPanel6.setkEndColor(new java.awt.Color(167, 190, 211));
        kGradientPanel6.setkGradientFocus(0);
        kGradientPanel6.setkStartColor(new java.awt.Color(167, 190, 211));

        jLabel24.setFont(new java.awt.Font("Lucida Sans", 1, 28)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("3");

        jLabel25.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Total Number of Items for sale");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sync_settings_96px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        kGradientPanel5.setkEndColor(new java.awt.Color(167, 190, 211));
        kGradientPanel5.setkGradientFocus(0);
        kGradientPanel5.setkStartColor(new java.awt.Color(167, 190, 211));

        jLabel21.setFont(new java.awt.Font("Lucida Sans", 1, 28)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("40");

        jLabel22.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Number of orders Placed");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping_cart_96px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout RetailerDynamicMainJPanelLayout = new javax.swing.GroupLayout(RetailerDynamicMainJPanel);
        RetailerDynamicMainJPanel.setLayout(RetailerDynamicMainJPanelLayout);
        RetailerDynamicMainJPanelLayout.setHorizontalGroup(
            RetailerDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetailerDynamicMainJPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(RetailerDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetailerDynamicMainJPanelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RetailerDynamicMainJPanelLayout.createSequentialGroup()
                        .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        RetailerDynamicMainJPanelLayout.setVerticalGroup(
            RetailerDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetailerDynamicMainJPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RetailerDynamicMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetailerDynamicMainJPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RetailerDynamicMainJPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(823, Short.MAX_VALUE))
        );

        RetailerDynamicJPanel.add(RetailerDynamicMainJPanel, "card2");

        javax.swing.GroupLayout RetailerLoginMainJPanelLayout = new javax.swing.GroupLayout(RetailerLoginMainJPanel);
        RetailerLoginMainJPanel.setLayout(RetailerLoginMainJPanelLayout);
        RetailerLoginMainJPanelLayout.setHorizontalGroup(
            RetailerLoginMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RetailerLoginMainJPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(RetailerLoginMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
                    .addComponent(RetailerDynamicJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        RetailerLoginMainJPanelLayout.setVerticalGroup(
            RetailerLoginMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetailerLoginMainJPanelLayout.createSequentialGroup()
                .addGroup(RetailerLoginMainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RetailerLoginMainJPanelLayout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(RetailerDynamicJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(RetailerLoginMainJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnItemsForSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItemsForSaleMouseClicked

        System.out.println("CLIENT"+this.client);
        RetailerProfileItemForSaleJPanel retailerItemForSale = new RetailerProfileItemForSaleJPanel(RetailerDynamicJPanel, this.ecosystem, this.client);
        CardLayout layout = (CardLayout) RetailerDynamicJPanel.getLayout();
        RetailerDynamicJPanel.add("retailForSale", retailerItemForSale);
        //
        layout.next(RetailerDynamicJPanel);
    }//GEN-LAST:event_btnItemsForSaleMouseClicked

    private void btnRetailerHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetailerHomeMouseClicked
        // TODO add your handling code here:

          RetailerProfileLoginHomeJPanel retailerHome = new RetailerProfileLoginHomeJPanel(RetailerDynamicJPanel);
          CardLayout layout = (CardLayout) RetailerDynamicJPanel.getLayout();
          RetailerDynamicJPanel.add("homeRetailer", retailerHome);
          layout.next(RetailerDynamicJPanel);
    }//GEN-LAST:event_btnRetailerHomeMouseClicked

    private void btnViewPastPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPastPurchaseMouseClicked
        // TODO add your handling code here:
        RetailerProfilePastPurchaseJPanel retailPastPurchase = new RetailerProfilePastPurchaseJPanel(RetailerDynamicJPanel, this.ecosystem, this.client);
        CardLayout layout = (CardLayout) RetailerDynamicJPanel.getLayout();
        RetailerDynamicJPanel.add("retailerPast", retailPastPurchase);
        //
        layout.next(RetailerDynamicJPanel);
    }//GEN-LAST:event_btnViewPastPurchaseMouseClicked

    private void btnRetailerLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetailerLogoutMouseClicked
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
         MainJPanel main = new MainJPanel(RetailerLoginMainJPanel);
        CardLayout layout = (CardLayout) RetailerLoginMainJPanel.getLayout();
        RetailerLoginMainJPanel.add("Home", main);

        layout.next(RetailerLoginMainJPanel);
      //  
    }//GEN-LAST:event_btnRetailerLogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RetailerDynamicJPanel;
    private javax.swing.JPanel RetailerDynamicMainJPanel;
    private javax.swing.JPanel RetailerLoginMainJPanel;
    private javax.swing.JPanel btnItemsForSale;
    private javax.swing.JPanel btnRetailerHome;
    private javax.swing.JPanel btnRetailerLogout;
    private javax.swing.JPanel btnViewPastPurchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
