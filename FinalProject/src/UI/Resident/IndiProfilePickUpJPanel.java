/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Resident;

import UI.CategoryDropDownUtil;
import UI.MainJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.CustomerBooking.InventoryBooking;
import models.DB4OUtil.DB4OUtil;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Customer.Resident;

/**
 *
 * @author kshitij
 */
public class IndiProfilePickUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndiProfilePickUpJPanel
     */
    JPanel jpanel7;
    EcoSystem ecosystem;
    Resident resident;
    ArrayList<HashMap<String, String>> entries;
    public IndiProfilePickUpJPanel(JPanel IndiPickUpJPanel, EcoSystem ecosystem, Resident resident) {
        initComponents();
        this.JPanelIndPickUpMain = IndiPickUpJPanel;
        this.ecosystem = ecosystem;
        this.resident = resident;
        dropdownApplianceType.removeAllItems();
        this.entries = new ArrayList<>();
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

        JPanelIndPickUpMain = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        lbldropoffheader = new javax.swing.JLabel();
        lblewasteCat = new javax.swing.JLabel();
        lblmake = new javax.swing.JLabel();
        txtemake = new javax.swing.JTextField();
        lblmodel = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        lblYearManuf = new javax.swing.JLabel();
        txtyearManuf = new javax.swing.JTextField();
        lblweight = new javax.swing.JLabel();
        txtitemweight = new javax.swing.JTextField();
        lblcondition = new javax.swing.JLabel();
        btnAddtoBookingTable = new javax.swing.JButton();
        dropdownApplianceType = new javax.swing.JComboBox<>();
        lblapplicance = new javax.swing.JLabel();
        dropdownCatEwaste = new javax.swing.JComboBox<>();
        dropdownCondition = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPickUpBooking = new javax.swing.JTable();
        btnCreateBookingPickUp = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblpickupDate = new javax.swing.JLabel();
        PickUpDateChooser = new com.toedter.calendar.JDateChooser();

        setLayout(new java.awt.CardLayout());

        JPanelIndPickUpMain.setBackground(new java.awt.Color(255, 255, 255));
        JPanelIndPickUpMain.setForeground(java.awt.Color.darkGray);
        JPanelIndPickUpMain.setPreferredSize(new java.awt.Dimension(1460, 850));

        kGradientPanel1.setkEndColor(new java.awt.Color(198, 226, 233));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(167, 190, 211));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(300, 1460));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel7.setForeground(java.awt.Color.darkGray);
        jLabel7.setText("Welcome to ReQube,");

        nameLabel.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        nameLabel.setForeground(java.awt.Color.darkGray);
        nameLabel.setText("jLabel8");

        logoutButton.setBackground(new java.awt.Color(205, 223, 245));
        logoutButton.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 51, 51));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_rounded_left_50px.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
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
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );

        lbldropoffheader.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        lbldropoffheader.setForeground(java.awt.Color.darkGray);
        lbldropoffheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldropoffheader.setText("Pick Up Booking");

        lblewasteCat.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblewasteCat.setForeground(java.awt.Color.darkGray);
        lblewasteCat.setText("E-waste Category");

        lblmake.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblmake.setForeground(java.awt.Color.darkGray);
        lblmake.setText("Item Make");

        txtemake.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtemake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemakeActionPerformed(evt);
            }
        });

        lblmodel.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblmodel.setForeground(java.awt.Color.darkGray);
        lblmodel.setText("Item Model");

        txtmodel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblYearManuf.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblYearManuf.setForeground(java.awt.Color.darkGray);
        lblYearManuf.setText("Year of manufacturing");

        txtyearManuf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblweight.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblweight.setForeground(java.awt.Color.darkGray);
        lblweight.setText("Weight Approx.(in lbs)");

        txtitemweight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));

        lblcondition.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblcondition.setForeground(java.awt.Color.darkGray);
        lblcondition.setText("Condition");

        btnAddtoBookingTable.setBackground(new java.awt.Color(205, 223, 245));
        btnAddtoBookingTable.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAddtoBookingTable.setForeground(new java.awt.Color(51, 51, 51));
        btnAddtoBookingTable.setText("Add to booking");
        btnAddtoBookingTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoBookingTableActionPerformed(evt);
            }
        });

        dropdownApplianceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblapplicance.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblapplicance.setForeground(java.awt.Color.darkGray);
        lblapplicance.setText("Type of Appliance");

        dropdownCatEwaste.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        dropdownCatEwaste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home Appliances", "Communications & IT Devices", "Home Entertainment Devices", "Electronic Utilities", "Office and Medical Equipment", "Other" }));
        dropdownCatEwaste.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropdownCatEwasteItemStateChanged(evt);
            }
        });
        dropdownCatEwaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownCatEwasteActionPerformed(evt);
            }
        });

        dropdownCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INTACT", "BROKEN" }));
        dropdownCondition.setToolTipText("");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblPickUpBooking.setAutoCreateRowSorter(true);
        tblPickUpBooking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblPickUpBooking.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        tblPickUpBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "E-Waste Cat.", "Appliance type", "Make", "Model", "Year", "Weight(lbs.)", "condition", "PickUp Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPickUpBooking.setGridColor(new java.awt.Color(255, 255, 255));
        tblPickUpBooking.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblPickUpBooking.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(tblPickUpBooking);
        if (tblPickUpBooking.getColumnModel().getColumnCount() > 0) {
            tblPickUpBooking.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(5).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(6).setPreferredWidth(10);
            tblPickUpBooking.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        btnCreateBookingPickUp.setBackground(new java.awt.Color(205, 223, 245));
        btnCreateBookingPickUp.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnCreateBookingPickUp.setForeground(new java.awt.Color(51, 51, 51));
        btnCreateBookingPickUp.setText("Submit");
        btnCreateBookingPickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateBookingPickUpActionPerformed(evt);
            }
        });

        btnDeleteItem.setBackground(new java.awt.Color(205, 223, 245));
        btnDeleteItem.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnDeleteItem.setForeground(new java.awt.Color(51, 51, 51));
        btnDeleteItem.setText("Delete Item");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backarrow.png"))); // NOI18N
        btnBack.setToolTipText("");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnBack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblpickupDate.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblpickupDate.setForeground(java.awt.Color.darkGray);
        lblpickupDate.setText("Pick Up Date");

        javax.swing.GroupLayout JPanelIndPickUpMainLayout = new javax.swing.GroupLayout(JPanelIndPickUpMain);
        JPanelIndPickUpMain.setLayout(JPanelIndPickUpMainLayout);
        JPanelIndPickUpMainLayout.setHorizontalGroup(
            JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1428, Short.MAX_VALUE)
            .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnAddtoBookingTable, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldropoffheader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelIndPickUpMainLayout.createSequentialGroup()
                                .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblmake, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemake)
                                    .addComponent(txtyearManuf)
                                    .addComponent(txtitemweight, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(lblYearManuf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblewasteCat)
                                    .addComponent(dropdownCatEwaste, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblweight))
                                .addGap(34, 34, 34)
                                .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcondition)
                                    .addComponent(lblapplicance)
                                    .addComponent(lblmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropdownApplianceType, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dropdownCondition, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtmodel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                                .addComponent(btnDeleteItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCreateBookingPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
            .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(PickUpDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblpickupDate)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelIndPickUpMainLayout.setVerticalGroup(
            JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(lbldropoffheader, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblewasteCat)
                    .addComponent(lblapplicance))
                .addGap(24, 24, 24)
                .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dropdownApplianceType, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropdownCatEwaste, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmake, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblYearManuf)
                        .addGap(18, 18, 18)
                        .addComponent(txtyearManuf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblweight)
                            .addComponent(lblcondition))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dropdownCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtitemweight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PickUpDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpickupDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnAddtoBookingTable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(JPanelIndPickUpMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelIndPickUpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateBookingPickUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(JPanelIndPickUpMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        MainJPanel main = new MainJPanel(JPanelIndPickUpMain);
        CardLayout layout = (CardLayout) JPanelIndPickUpMain.getLayout();
        JPanelIndPickUpMain.add("Home", main);

        layout.next(JPanelIndPickUpMain);
        DB4OUtil.getInstance().storeSystem(this.ecosystem);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JPanelIndPickUpMain.remove(this);
        CardLayout layout = (CardLayout) JPanelIndPickUpMain.getLayout();
        layout.previous(JPanelIndPickUpMain);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtemakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemakeActionPerformed

    private void dropdownCatEwasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownCatEwasteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownCatEwasteActionPerformed

    private void dropdownCatEwasteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropdownCatEwasteItemStateChanged
        // TODO add your handling code here:
        String selectedCat = (String) dropdownCatEwaste.getSelectedItem();
        dropdownApplianceType.removeAllItems();
        for (String subCat: CategoryDropDownUtil.getList(selectedCat)) dropdownApplianceType.addItem(subCat);
    }//GEN-LAST:event_dropdownCatEwasteItemStateChanged

    private void btnAddtoBookingTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoBookingTableActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> currentEntry = new HashMap<>();
        currentEntry.put("category", (String) dropdownCatEwaste.getSelectedItem());
        currentEntry.put("subCategory", (String) dropdownApplianceType.getSelectedItem());
        currentEntry.put("condition", (String) dropdownCondition.getSelectedItem());
        currentEntry.put("make", txtemake.getText());
        currentEntry.put("model", txtmodel.getText());
        currentEntry.put("weight", txtitemweight.getText());
        currentEntry.put("year", txtyearManuf.getText());
        currentEntry.put("pickupDate", PickUpDateChooser.getDate().toString());
        this.entries.add(currentEntry);
        this.populateTable();
        
        txtemake.setText("");
        txtmodel.setText("");
        txtitemweight.setText("");
        txtyearManuf.setText("");
    }//GEN-LAST:event_btnAddtoBookingTableActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPickUpBooking.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select an entry");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPickUpBooking.getModel();
        model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnCreateBookingPickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBookingPickUpActionPerformed
        // TODO add your handling code here:
        InventoryBooking booking = new InventoryBooking(this.resident, InventoryBooking.BookingType.PICKUP);
        for (HashMap<String, String> entry: this.entries) {
            Item item = new Item(this.resident, entry.get("category"), entry.get("subCategory"));
            item.setCondition(Item.ItemCondition.INTACT);
            item.setMake(entry.get("make"));
            item.setModel(entry.get("model"));
            item.setManufactureYear(Integer.valueOf(entry.get("year")));
            item.setWeightApprox(Float.valueOf(entry.get("weight")));
            this.ecosystem.getInventoryDirectory().addToInventory(item);
            booking.addToItems(item);
        }
        this.ecosystem.getBookingDirectory().addBooking(booking);
        
        JOptionPane.showMessageDialog(this, "Booking created");
        this.entries = new ArrayList<>();
    }//GEN-LAST:event_btnCreateBookingPickUpActionPerformed
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPickUpBooking.getModel();
        model.setRowCount(0);
        for (HashMap<String, String> entry: this.entries) {
            Object[] row = new Object[8];
            row[0] = entry.get("category");
            row[1] = entry.get("subCategory");
            row[2] = entry.get("make");
            row[3] = entry.get("model");
            row[4] = entry.get("year");
            row[5] = entry.get("weight");
            row[6] = entry.get("condition");
            row[7] = entry.get("pickupDate");
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelIndPickUpMain;
    private com.toedter.calendar.JDateChooser PickUpDateChooser;
    private javax.swing.JButton btnAddtoBookingTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateBookingPickUp;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JComboBox<String> dropdownApplianceType;
    private javax.swing.JComboBox<String> dropdownCatEwaste;
    private javax.swing.JComboBox<String> dropdownCondition;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblYearManuf;
    private javax.swing.JLabel lblapplicance;
    private javax.swing.JLabel lblcondition;
    private javax.swing.JLabel lbldropoffheader;
    private javax.swing.JLabel lblewasteCat;
    private javax.swing.JLabel lblmake;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JLabel lblpickupDate;
    private javax.swing.JLabel lblweight;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTable tblPickUpBooking;
    private javax.swing.JTextField txtemake;
    private javax.swing.JTextField txtitemweight;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtyearManuf;
    // End of variables declaration//GEN-END:variables
}
