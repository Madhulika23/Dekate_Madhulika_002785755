/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author madhulikadekate
 */
public class AddEncounterPanelDoctor extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounterPanelDoctor
     */
    SystemAdmin sysAdmin;
    Doctor d;
    public AddEncounterPanelDoctor(SystemAdmin sysAdmin,Doctor d) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.d = d;
        populatePatients();
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
        btnAddEncounter = new javax.swing.JButton();
        txtEncounterDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Encounter");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 37, 640, -1));

        btnAddEncounter.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });
        add(btnAddEncounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));
        add(txtEncounterDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 256, 293, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setText("Patient:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 183, -1, -1));

        add(jComboBoxPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 180, 293, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Date of Encounter:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 262, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/IMG6.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        
        
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();

        String date = txtEncounterDate.getText();
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher matcher = datePattern.matcher(date);
        if(matcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Encounter Date: MM/DD/YYYY");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().addEncounter();
        String eid =  String.valueOf(sysAdmin.getEncounterHistory().encounterCount() + Integer.parseInt("100000000"));
        e.setDoctor(d);
        e.setPatient(p);
        e.setDate(date);
        e.setEncounterId(eid);

        JOptionPane.showMessageDialog(this, "Encounter Info Saved");

        txtEncounterDate.setText("");
        
        jComboBoxPatient.setSelectedItem(null);
    }//GEN-LAST:event_btnAddEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JComboBox<Object> jComboBoxPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEncounterDate;
    // End of variables declaration//GEN-END:variables

    private void populatePatients() {
        PatientDirectory patient = sysAdmin.getPatientDirectory();
        List<Patient> pl = patient.getPatientDirectory();
        for(Patient p : pl){
            jComboBoxPatient.addItem(p);
        }
    }
}
