/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Data;
import model.Product;

/**
 *
 * @author madhulikadekate
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
       Data history;
      
    public CreateJPanel(Data history) {
        initComponents();
        this.history = history;
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IbITitle = new javax.swing.JLabel();
        IbIname = new javax.swing.JLabel();
        IbIempId = new javax.swing.JLabel();
        IbIage = new javax.swing.JLabel();
        IbIgender = new javax.swing.JLabel();
        IbIdate = new javax.swing.JLabel();
        IbIlevel = new javax.swing.JLabel();
        IbIteam = new javax.swing.JLabel();
        IbIposition = new javax.swing.JLabel();
        IbInumber = new javax.swing.JLabel();
        IbIemail = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtempId = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtlevel = new javax.swing.JTextField();
        txtteam = new javax.swing.JTextField();
        txtposition = new javax.swing.JTextField();
        txtnumber = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();

        IbITitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        IbITitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbITitle.setText("Create");

        IbIname.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIname.setText("Name:");

        IbIempId.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIempId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIempId.setText("Employee ID:");

        IbIage.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIage.setText("Age:");

        IbIgender.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIgender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIgender.setText("Gender:");

        IbIdate.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIdate.setText("Start Date:");

        IbIlevel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIlevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIlevel.setText("Level:");

        IbIteam.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIteam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIteam.setText("Team:");

        IbIposition.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIposition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIposition.setText("Position Title:");

        IbInumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbInumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbInumber.setText("Cell Number:");

        IbIemail.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        IbIemail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IbIemail.setText("Email:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtempId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempIdActionPerformed(evt);
            }
        });

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        txtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenderActionPerformed(evt);
            }
        });

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        txtlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlevelActionPerformed(evt);
            }
        });

        txtteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteamActionPerformed(evt);
            }
        });

        txtposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpositionActionPerformed(evt);
            }
        });

        txtnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumberActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IbITitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IbIemail)
                    .addComponent(IbInumber)
                    .addComponent(IbIposition)
                    .addComponent(IbIteam)
                    .addComponent(IbIlevel)
                    .addComponent(IbIdate)
                    .addComponent(IbIgender)
                    .addComponent(IbIage)
                    .addComponent(IbIempId)
                    .addComponent(IbIname))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(txtnumber, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtposition, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtteam, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlevel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtempId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addGap(262, 262, 262))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(IbITitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIempId)
                    .addComponent(txtempId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIage)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IbIgender)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IbIdate)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIlevel)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIteam)
                    .addComponent(txtteam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIposition)
                    .addComponent(txtposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbInumber)
                    .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbIemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnsave)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtage, txtdate, txtemail, txtempId, txtgender, txtlevel, txtname, txtnumber, txtposition, txtteam});

    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtempIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempIdActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenderActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlevelActionPerformed

    private void txtteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteamActionPerformed

    private void txtpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpositionActionPerformed

    private void txtnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:


        String name = txtname.getText();
        String empId = txtempId.getText();
        String age = txtage.getText();
        String gender = txtgender.getText();
        String sDate = txtdate.getText();
        String level = txtlevel.getText();
        String tInfo = txtposition.getText();
        String pTitle = txtteam.getText();
        String num = txtnumber.getText();
        String email = txtemail.getText();
        
        
        Product vs = history.addNewData();
        
        vs.setName(name);
        vs.setEmpId(empId);
        vs.setAge(age);
        vs.setGender(gender);
        vs.setsDate(sDate);
        vs.setLevel(level);
        vs.settInfo(tInfo);
        vs.setpTitle(pTitle);
        vs.setNum(num);
        vs.setEmail(email);
        
        JOptionPane.showMessageDialog(this, "Information Saved.");    
        
        txtname.setText("");
        txtempId.setText("");
        txtage.setText("");
        txtgender.setText("");
        txtdate.setText("");
        txtlevel.setText("");
        txtteam.setText("");
        txtposition.setText("");
        txtnumber.setText("");
        txtemail.setText(""); 
        
        
        
        
        
      
        
    }//GEN-LAST:event_btnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbITitle;
    private javax.swing.JLabel IbIage;
    private javax.swing.JLabel IbIdate;
    private javax.swing.JLabel IbIemail;
    private javax.swing.JLabel IbIempId;
    private javax.swing.JLabel IbIgender;
    private javax.swing.JLabel IbIlevel;
    private javax.swing.JLabel IbIname;
    private javax.swing.JLabel IbInumber;
    private javax.swing.JLabel IbIposition;
    private javax.swing.JLabel IbIteam;
    private javax.swing.JButton btnsave;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempId;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtposition;
    private javax.swing.JTextField txtteam;
    // End of variables declaration//GEN-END:variables
}
