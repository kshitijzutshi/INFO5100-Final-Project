/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManagementDivision;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.EcoSystem;
import models.Inventory.Item;
import models.User.Employee.OperationsManager;

/**
 *
 * @author kshitij
 */
public class ManageRefurbishedItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRefurbishedItemsJPanel
     */
    JPanel jpanel8;
    EcoSystem ecosystem;
    OperationsManager manager;
    ArrayList<Item> items = new ArrayList<>();
    Item selectedItem;
    public ManageRefurbishedItemsJPanel(JPanel manageRefurb, EcoSystem ecosystem, OperationsManager manager) {
        this.ManageRefurbJPanel = manageRefurb;
        initComponents();
        this.ecosystem = ecosystem;
        this.manager = manager;
        for (Item item: this.ecosystem.getInventoryDirectory().getInventoryByStatus(Item.ItemStatus.READY_FOR_PRICING)) {
            if (item.getType() == Item.ItemType.REFURB) this.items.add(item);
        }
        this.populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageRefurbJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrefurbished = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        setPriceText = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        ManageRefurbJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tblrefurbished.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        tblrefurbished.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "E-Waste Category", "Appliance Type", "Make", "Model", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblrefurbished.setGridColor(new java.awt.Color(255, 255, 255));
        tblrefurbished.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tblrefurbished);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Refurbished Items");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Refurbished Item Price:");

        txtprice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(205, 223, 245)));
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/repaire.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        setPriceText.setBackground(new java.awt.Color(205, 223, 245));
        setPriceText.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        setPriceText.setText("Set Price");
        setPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageRefurbJPanelLayout = new javax.swing.GroupLayout(ManageRefurbJPanel);
        ManageRefurbJPanel.setLayout(ManageRefurbJPanelLayout);
        ManageRefurbJPanelLayout.setHorizontalGroup(
            ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageRefurbJPanelLayout.createSequentialGroup()
                        .addComponent(setPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageRefurbJPanelLayout.createSequentialGroup()
                        .addGroup(ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );
        ManageRefurbJPanelLayout.setVerticalGroup(
            ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(setPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        add(ManageRefurbJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void setPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceTextActionPerformed
        // TODO add your handling code here:
        int price = 0;
        if (!this.hasSelectedEntry()) return;
        try {
            price = Integer.valueOf(this.txtprice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a valid price");
        }
        this.selectedItem.setPrice(price);
        this.selectedItem.setStatus(Item.ItemStatus.READY_FOR_SALE);
        JOptionPane.showMessageDialog(this, "Price " + price + " set for item " + this.selectedItem.getId());
        this.items.remove(this.selectedItem);
        this.selectedItem = null;
        this.populateTable();
        
        txtprice.setText("");
        
    }//GEN-LAST:event_setPriceTextActionPerformed
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblrefurbished.getModel();
        model.setRowCount(0);
        for (Item item: this.items) {
            Object[] row = new Object[6];
            row[0] = item;
            row[1] = item.getCategory();
            row[2] = item.getSubCategory();
            row[3] = item.getMake();
            row[4] = item.getModel();
            row[5] = item.getManufactureYear();
            model.addRow(row);
        }
    }
    
    private boolean hasSelectedEntry() {
        int selectedRowIndex = tblrefurbished.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select an entry");
            return false;
        }
        DefaultTableModel model = (DefaultTableModel) tblrefurbished.getModel();
        this.selectedItem = (Item) model.getValueAt(selectedRowIndex, 0);
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageRefurbJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton setPriceText;
    private javax.swing.JTable tblrefurbished;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
