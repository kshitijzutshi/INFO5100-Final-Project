/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class ManageRefurbishedItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRefurbishedItemsJPanel
     */
    JPanel jpanel8;
    public ManageRefurbishedItemsJPanel(JPanel manageRefurb) {
        this.ManageRefurbJPanel = manageRefurb;
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

        ManageRefurbJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setText("REFURBISH HERE");

        javax.swing.GroupLayout ManageRefurbJPanelLayout = new javax.swing.GroupLayout(ManageRefurbJPanel);
        ManageRefurbJPanel.setLayout(ManageRefurbJPanelLayout);
        ManageRefurbJPanelLayout.setHorizontalGroup(
            ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        ManageRefurbJPanelLayout.setVerticalGroup(
            ManageRefurbJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRefurbJPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        add(ManageRefurbJPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageRefurbJPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
