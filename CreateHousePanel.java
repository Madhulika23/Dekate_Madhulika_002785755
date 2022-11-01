/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.House;
import model.SystemAdmin;

/**
 *
 * @author madhulikadekate
 */
public class CreateHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHousePanel
     */
    SystemAdmin sysAdmin;
    public CreateHousePanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCommunities();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblHouseStreetAddress = new javax.swing.JLabel();
        txtHouseStreetAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHousePinCode = new javax.swing.JTextField();
        jComboBoxHouseCommunity = new javax.swing.JComboBox<>();
        lblHouseCommunity = new javax.swing.JLabel();
        btnSaveHouse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("Create House");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 61, -1, -1));

        lblHouseStreetAddress.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblHouseStreetAddress.setText("Street Address:");
        add(lblHouseStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 178, -1, -1));
        add(txtHouseStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 172, 149, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setText("Pin Code:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 243, -1, -1));
        add(txtHousePinCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 237, 149, -1));

        add(jComboBoxHouseCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 309, -1, -1));

        lblHouseCommunity.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblHouseCommunity.setText("Community:");
        add(lblHouseCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 312, -1, -1));

        btnSaveHouse.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnSaveHouse.setText("Save House");
        btnSaveHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHouseActionPerformed(evt);
            }
        });
        add(btnSaveHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 405, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/IMG6.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHouseActionPerformed
        // TODO add your handling code here:
        if(jComboBoxHouseCommunity.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Community");
            return;
        }
        Community community = (Community)jComboBoxHouseCommunity.getSelectedItem();
        House h = community.addHouse();
        String streetAddress = txtHouseStreetAddress.getText();
        String pinCode = txtHousePinCode.getText();
        if(streetAddress.length()==0 || pinCode.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        String houseId = String.valueOf(community.getHouseList().size() + Integer.parseInt("10000"));
        h.setHouseId(houseId);
        h.setStreetAddress(streetAddress);
        h.setPinCode(pinCode);
        h.setCommunity(community);
        
        txtHouseStreetAddress.setText("");
        txtHousePinCode.setText("");
        jComboBoxHouseCommunity.setSelectedItem(null);
        
        JOptionPane.showMessageDialog(this, "House Info Saved"); 
        
        
    }//GEN-LAST:event_btnSaveHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHouse;
    private javax.swing.JComboBox<Object> jComboBoxHouseCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblHouseCommunity;
    private javax.swing.JLabel lblHouseStreetAddress;
    private javax.swing.JTextField txtHousePinCode;
    private javax.swing.JTextField txtHouseStreetAddress;
    // End of variables declaration//GEN-END:variables

    private void populateCommunities() {
        
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        
    }
}
