/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.SystemAdmin;

/**
 *
 * @author adityaraj
 */
public class HospitalAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminPanel
     */
    CardLayout cardLayoutmain;
    CardLayout cardLayoutHospitalAdmin;
    SystemAdmin sysAdmin;
    public HospitalAdminPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        /*
        cardLayoutmain = (CardLayout)(this.getLayout());
        cardLayoutCommunityAdmin = (CardLayout)(viewPanelCommunityAdmin.getLayout());
        */
        cardLayoutmain = (CardLayout)(this.getLayout());
        cardLayoutHospitalAdmin = (CardLayout)(viewPanelHospitalAdmin.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalAdminLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHospitalAdminUsername = new javax.swing.JTextField();
        txtHospitalAdminPassword = new javax.swing.JPasswordField();
        btnHospitalAdminLogin = new javax.swing.JButton();
        jSplitPaneHospitalAdmin = new javax.swing.JSplitPane();
        controlPanelHospitalAdmin = new javax.swing.JPanel();
        btnHospitlaDirectory = new javax.swing.JButton();
        btnDoctorsDirectory = new javax.swing.JButton();
        btnPatientDirectory = new javax.swing.JButton();
        btnEncountersDirectory = new javax.swing.JButton();
        viewPanelHospitalAdmin = new javax.swing.JPanel();
        hospitalDirectoryPanel = new javax.swing.JPanel();
        jSplitPaneHospitalDirectory = new javax.swing.JSplitPane();
        controlPanelHospitalDirectory = new javax.swing.JPanel();
        btnCreateHospital = new javax.swing.JButton();
        btnViewHospital = new javax.swing.JButton();
        viewPanelHospitalDirectory = new javax.swing.JPanel();
        DoctorsDirectoryPanel = new javax.swing.JPanel();
        jSplitPaneDoctorsDirectory = new javax.swing.JSplitPane();
        controlPanelDoctorsDirectory = new javax.swing.JPanel();
        btnAddDoctor = new javax.swing.JButton();
        btnViewDoctors = new javax.swing.JButton();
        viewPanelDoctorsDirectory = new javax.swing.JPanel();
        PatientDirectoryPanel = new javax.swing.JPanel();
        jSplitPanePatientDirectory = new javax.swing.JSplitPane();
        controlPanelPatientDirectroy = new javax.swing.JPanel();
        btnAddPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        viewPanelPatientDirectroy = new javax.swing.JPanel();
        EncounterDirectoryPanel = new javax.swing.JPanel();
        jSplitPaneEncountersDirectory = new javax.swing.JSplitPane();
        controlPanelEncountersDirectory = new javax.swing.JPanel();
        btnAddEncounter = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        viewPanelEncountersDirectory = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jLabel1.setText("Hospital Admin Login");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        btnHospitalAdminLogin.setText("Login");
        btnHospitalAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hospitalAdminLoginPanelLayout = new javax.swing.GroupLayout(hospitalAdminLoginPanel);
        hospitalAdminLoginPanel.setLayout(hospitalAdminLoginPanelLayout);
        hospitalAdminLoginPanelLayout.setHorizontalGroup(
            hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalAdminUsername)
                            .addComponent(txtHospitalAdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnHospitalAdminLogin))
                    .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        hospitalAdminLoginPanelLayout.setVerticalGroup(
            hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalAdminLoginPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtHospitalAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(hospitalAdminLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtHospitalAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnHospitalAdminLogin)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        add(hospitalAdminLoginPanel, "hospitalAdminLoginPanel");

        jSplitPaneHospitalAdmin.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnHospitlaDirectory.setText("Hospital Directory");
        btnHospitlaDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitlaDirectoryActionPerformed(evt);
            }
        });

        btnDoctorsDirectory.setText("Doctors Directory");
        btnDoctorsDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsDirectoryActionPerformed(evt);
            }
        });

        btnPatientDirectory.setText("Patient Directory");
        btnPatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDirectoryActionPerformed(evt);
            }
        });

        btnEncountersDirectory.setText("Encounters Directory");
        btnEncountersDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountersDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelHospitalAdminLayout = new javax.swing.GroupLayout(controlPanelHospitalAdmin);
        controlPanelHospitalAdmin.setLayout(controlPanelHospitalAdminLayout);
        controlPanelHospitalAdminLayout.setHorizontalGroup(
            controlPanelHospitalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHospitalAdminLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnHospitlaDirectory)
                .addGap(52, 52, 52)
                .addComponent(btnDoctorsDirectory)
                .addGap(39, 39, 39)
                .addComponent(btnPatientDirectory)
                .addGap(34, 34, 34)
                .addComponent(btnEncountersDirectory)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        controlPanelHospitalAdminLayout.setVerticalGroup(
            controlPanelHospitalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelHospitalAdminLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(controlPanelHospitalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHospitlaDirectory)
                    .addComponent(btnDoctorsDirectory)
                    .addComponent(btnPatientDirectory)
                    .addComponent(btnEncountersDirectory))
                .addGap(35, 35, 35))
        );

        jSplitPaneHospitalAdmin.setTopComponent(controlPanelHospitalAdmin);

        viewPanelHospitalAdmin.setLayout(new java.awt.CardLayout());

        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnViewHospital.setText("View Hospital");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelHospitalDirectoryLayout = new javax.swing.GroupLayout(controlPanelHospitalDirectory);
        controlPanelHospitalDirectory.setLayout(controlPanelHospitalDirectoryLayout);
        controlPanelHospitalDirectoryLayout.setHorizontalGroup(
            controlPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelHospitalDirectoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateHospital)
                .addContainerGap())
            .addGroup(controlPanelHospitalDirectoryLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnViewHospital)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelHospitalDirectoryLayout.setVerticalGroup(
            controlPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHospitalDirectoryLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnCreateHospital)
                .addGap(52, 52, 52)
                .addComponent(btnViewHospital)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        jSplitPaneHospitalDirectory.setLeftComponent(controlPanelHospitalDirectory);

        javax.swing.GroupLayout viewPanelHospitalDirectoryLayout = new javax.swing.GroupLayout(viewPanelHospitalDirectory);
        viewPanelHospitalDirectory.setLayout(viewPanelHospitalDirectoryLayout);
        viewPanelHospitalDirectoryLayout.setHorizontalGroup(
            viewPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        viewPanelHospitalDirectoryLayout.setVerticalGroup(
            viewPanelHospitalDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jSplitPaneHospitalDirectory.setRightComponent(viewPanelHospitalDirectory);

        javax.swing.GroupLayout hospitalDirectoryPanelLayout = new javax.swing.GroupLayout(hospitalDirectoryPanel);
        hospitalDirectoryPanel.setLayout(hospitalDirectoryPanelLayout);
        hospitalDirectoryPanelLayout.setHorizontalGroup(
            hospitalDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneHospitalDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );
        hospitalDirectoryPanelLayout.setVerticalGroup(
            hospitalDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneHospitalDirectory))
        );

        viewPanelHospitalAdmin.add(hospitalDirectoryPanel, "hospitalDirectoryPanel");

        btnAddDoctor.setText("Add Doctor");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        btnViewDoctors.setText("View Doctors");
        btnViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelDoctorsDirectoryLayout = new javax.swing.GroupLayout(controlPanelDoctorsDirectory);
        controlPanelDoctorsDirectory.setLayout(controlPanelDoctorsDirectoryLayout);
        controlPanelDoctorsDirectoryLayout.setHorizontalGroup(
            controlPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorsDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelDoctorsDirectoryLayout.setVerticalGroup(
            controlPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorsDirectoryLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnAddDoctor)
                .addGap(49, 49, 49)
                .addComponent(btnViewDoctors)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        jSplitPaneDoctorsDirectory.setLeftComponent(controlPanelDoctorsDirectory);

        javax.swing.GroupLayout viewPanelDoctorsDirectoryLayout = new javax.swing.GroupLayout(viewPanelDoctorsDirectory);
        viewPanelDoctorsDirectory.setLayout(viewPanelDoctorsDirectoryLayout);
        viewPanelDoctorsDirectoryLayout.setHorizontalGroup(
            viewPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        viewPanelDoctorsDirectoryLayout.setVerticalGroup(
            viewPanelDoctorsDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jSplitPaneDoctorsDirectory.setRightComponent(viewPanelDoctorsDirectory);

        javax.swing.GroupLayout DoctorsDirectoryPanelLayout = new javax.swing.GroupLayout(DoctorsDirectoryPanel);
        DoctorsDirectoryPanel.setLayout(DoctorsDirectoryPanelLayout);
        DoctorsDirectoryPanelLayout.setHorizontalGroup(
            DoctorsDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorsDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneDoctorsDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        DoctorsDirectoryPanelLayout.setVerticalGroup(
            DoctorsDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorsDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneDoctorsDirectory))
        );

        viewPanelHospitalAdmin.add(DoctorsDirectoryPanel, "DoctorsDirectoryPanel");

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelPatientDirectroyLayout = new javax.swing.GroupLayout(controlPanelPatientDirectroy);
        controlPanelPatientDirectroy.setLayout(controlPanelPatientDirectroyLayout);
        controlPanelPatientDirectroyLayout.setHorizontalGroup(
            controlPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientDirectroyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPatient)
                    .addComponent(btnViewPatient))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelPatientDirectroyLayout.setVerticalGroup(
            controlPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientDirectroyLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnAddPatient)
                .addGap(64, 64, 64)
                .addComponent(btnViewPatient)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        jSplitPanePatientDirectory.setLeftComponent(controlPanelPatientDirectroy);

        javax.swing.GroupLayout viewPanelPatientDirectroyLayout = new javax.swing.GroupLayout(viewPanelPatientDirectroy);
        viewPanelPatientDirectroy.setLayout(viewPanelPatientDirectroyLayout);
        viewPanelPatientDirectroyLayout.setHorizontalGroup(
            viewPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        viewPanelPatientDirectroyLayout.setVerticalGroup(
            viewPanelPatientDirectroyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jSplitPanePatientDirectory.setRightComponent(viewPanelPatientDirectroy);

        javax.swing.GroupLayout PatientDirectoryPanelLayout = new javax.swing.GroupLayout(PatientDirectoryPanel);
        PatientDirectoryPanel.setLayout(PatientDirectoryPanelLayout);
        PatientDirectoryPanelLayout.setHorizontalGroup(
            PatientDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPanePatientDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        PatientDirectoryPanelLayout.setVerticalGroup(
            PatientDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientDirectoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPanePatientDirectory))
        );

        viewPanelHospitalAdmin.add(PatientDirectoryPanel, "PatientDirectoryPanel");

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelEncountersDirectoryLayout = new javax.swing.GroupLayout(controlPanelEncountersDirectory);
        controlPanelEncountersDirectory.setLayout(controlPanelEncountersDirectoryLayout);
        controlPanelEncountersDirectoryLayout.setHorizontalGroup(
            controlPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelEncountersDirectoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEncounter)
                    .addComponent(btnViewEncounter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelEncountersDirectoryLayout.setVerticalGroup(
            controlPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelEncountersDirectoryLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnAddEncounter)
                .addGap(71, 71, 71)
                .addComponent(btnViewEncounter)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jSplitPaneEncountersDirectory.setLeftComponent(controlPanelEncountersDirectory);

        javax.swing.GroupLayout viewPanelEncountersDirectoryLayout = new javax.swing.GroupLayout(viewPanelEncountersDirectory);
        viewPanelEncountersDirectory.setLayout(viewPanelEncountersDirectoryLayout);
        viewPanelEncountersDirectoryLayout.setHorizontalGroup(
            viewPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        viewPanelEncountersDirectoryLayout.setVerticalGroup(
            viewPanelEncountersDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jSplitPaneEncountersDirectory.setRightComponent(viewPanelEncountersDirectory);

        javax.swing.GroupLayout EncounterDirectoryPanelLayout = new javax.swing.GroupLayout(EncounterDirectoryPanel);
        EncounterDirectoryPanel.setLayout(EncounterDirectoryPanelLayout);
        EncounterDirectoryPanelLayout.setHorizontalGroup(
            EncounterDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneEncountersDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );
        EncounterDirectoryPanelLayout.setVerticalGroup(
            EncounterDirectoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneEncountersDirectory)
        );

        viewPanelHospitalAdmin.add(EncounterDirectoryPanel, "EncounterDirectoryPanel");

        jSplitPaneHospitalAdmin.setRightComponent(viewPanelHospitalAdmin);

        add(jSplitPaneHospitalAdmin, "jSplitPaneHospitalAdmin");
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalAdminLoginActionPerformed
        // TODO add your handling code here:
        /*
        String username = txtCommunityAdminUsername.getText();
        String password = txtCommunityAdminPassword.getText();
        if(username.equals("cadmin") && password.equals("12345")){
            cardLayoutmain.show(this, "jSplitPaneCommunityAdmin");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Id");
            return;
        }
        */
        String username = txtHospitalAdminUsername.getText();
        String password = txtHospitalAdminPassword.getText();
        if(username.equals("hadmin") && password.equals("12345")){
            cardLayoutmain.show(this, "jSplitPaneHospitalAdmin");
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnHospitalAdminLoginActionPerformed

    private void btnHospitlaDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitlaDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutHospitalAdmin.show(viewPanelHospitalAdmin, "hospitalDirectoryPanel");
    }//GEN-LAST:event_btnHospitlaDirectoryActionPerformed

    private void btnDoctorsDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutHospitalAdmin.show(viewPanelHospitalAdmin, "DoctorsDirectoryPanel");
    }//GEN-LAST:event_btnDoctorsDirectoryActionPerformed

    private void btnPatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutHospitalAdmin.show(viewPanelHospitalAdmin, "PatientDirectoryPanel");
    }//GEN-LAST:event_btnPatientDirectoryActionPerformed

    private void btnEncountersDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountersDirectoryActionPerformed
        // TODO add your handling code here:
        cardLayoutHospitalAdmin.show(viewPanelHospitalAdmin, "EncounterDirectoryPanel");
    }//GEN-LAST:event_btnEncountersDirectoryActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        CreateHospitalPanel createHospital = new CreateHospitalPanel(sysAdmin);
        jSplitPaneHospitalDirectory.setRightComponent(createHospital);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        ViewHospitalPanel viewHospital = new ViewHospitalPanel(sysAdmin);
        jSplitPaneHospitalDirectory.setRightComponent(viewHospital);
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorPanel createDoctor = new CreateDoctorPanel(sysAdmin);
        jSplitPaneDoctorsDirectory.setRightComponent(createDoctor);
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorsActionPerformed
        // TODO add your handling code here:
        ViewDoctorPanel viewDoctors = new ViewDoctorPanel(sysAdmin);
        jSplitPaneDoctorsDirectory.setRightComponent(viewDoctors);
    }//GEN-LAST:event_btnViewDoctorsActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        CreatePatientPanel createPatient = new CreatePatientPanel(sysAdmin);
        jSplitPanePatientDirectory.setRightComponent(createPatient);
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientPanel viewPatient = new ViewPatientPanel(sysAdmin);
        jSplitPanePatientDirectory.setRightComponent(viewPatient);
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        AddEncounterPanel addEncounter = new AddEncounterPanel(sysAdmin);
        jSplitPaneEncountersDirectory.setRightComponent(addEncounter);
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncountersPanel viewEncounters = new ViewEncountersPanel(sysAdmin);
        jSplitPaneEncountersDirectory.setRightComponent(viewEncounters);
    }//GEN-LAST:event_btnViewEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoctorsDirectoryPanel;
    private javax.swing.JPanel EncounterDirectoryPanel;
    private javax.swing.JPanel PatientDirectoryPanel;
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnDoctorsDirectory;
    private javax.swing.JButton btnEncountersDirectory;
    private javax.swing.JButton btnHospitalAdminLogin;
    private javax.swing.JButton btnHospitlaDirectory;
    private javax.swing.JButton btnPatientDirectory;
    private javax.swing.JButton btnViewDoctors;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JPanel controlPanelDoctorsDirectory;
    private javax.swing.JPanel controlPanelEncountersDirectory;
    private javax.swing.JPanel controlPanelHospitalAdmin;
    private javax.swing.JPanel controlPanelHospitalDirectory;
    private javax.swing.JPanel controlPanelPatientDirectroy;
    private javax.swing.JPanel hospitalAdminLoginPanel;
    private javax.swing.JPanel hospitalDirectoryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPaneDoctorsDirectory;
    private javax.swing.JSplitPane jSplitPaneEncountersDirectory;
    private javax.swing.JSplitPane jSplitPaneHospitalAdmin;
    private javax.swing.JSplitPane jSplitPaneHospitalDirectory;
    private javax.swing.JSplitPane jSplitPanePatientDirectory;
    private javax.swing.JPasswordField txtHospitalAdminPassword;
    private javax.swing.JTextField txtHospitalAdminUsername;
    private javax.swing.JPanel viewPanelDoctorsDirectory;
    private javax.swing.JPanel viewPanelEncountersDirectory;
    private javax.swing.JPanel viewPanelHospitalAdmin;
    private javax.swing.JPanel viewPanelHospitalDirectory;
    private javax.swing.JPanel viewPanelPatientDirectroy;
    // End of variables declaration//GEN-END:variables
}
