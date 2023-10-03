/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.employee;
import model.employeeHistory;

/**
 *
 * @author manognapalla
 */
public class createJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createJPanel
     */
    employeeHistory history;
    
    public createJPanel(employeeHistory history) {
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

        Iblname = new javax.swing.JLabel();
        IblemployeeID = new javax.swing.JLabel();
        IblAge = new javax.swing.JLabel();
        Iblgender = new javax.swing.JLabel();
        Iblstartdate = new javax.swing.JLabel();
        Ibllevel = new javax.swing.JLabel();
        lblteaminfo = new javax.swing.JLabel();
        lblposition = new javax.swing.JLabel();
        lblcellphonenumber = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblemployeedetails = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemployeeid = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtstartdate = new javax.swing.JTextField();
        txtlevel = new javax.swing.JTextField();
        txtteaminfo = new javax.swing.JTextField();
        txtpositiontitle = new javax.swing.JTextField();
        txtcellphonenumber = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();

        Iblname.setText("Name:");

        IblemployeeID.setText("EmployeeID:");

        IblAge.setText("Age:");

        Iblgender.setText("Gender:");

        Iblstartdate.setText("Start Date:");

        Ibllevel.setText("Level:");

        lblteaminfo.setText("Team Info:");

        lblposition.setText("PositionTitle:");

        lblcellphonenumber.setText("Cell Phone Number:");

        lblemail.setText("                    Email:");

        lblemployeedetails.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblemployeedetails.setText("                                               Employee Details");
        lblemployeedetails.setSize(new java.awt.Dimension(42, 25));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        txtstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstartdateActionPerformed(evt);
            }
        });

        txtpositiontitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpositiontitleActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblcellphonenumber)
                                        .addComponent(lblposition)
                                        .addComponent(lblteaminfo)
                                        .addComponent(Ibllevel)
                                        .addComponent(Iblstartdate)
                                        .addComponent(Iblgender)
                                        .addComponent(IblAge)
                                        .addComponent(IblemployeeID))))
                            .addComponent(Iblname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcellphonenumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(txtpositiontitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtteaminfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlevel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstartdate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemployeeid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblemployeedetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblemployeedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Iblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IblemployeeID)
                    .addComponent(txtemployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IblAge)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Iblgender)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Iblstartdate)
                    .addComponent(txtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ibllevel)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblteaminfo)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblposition)
                    .addComponent(txtpositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcellphonenumber)
                    .addComponent(txtcellphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsave)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtstartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstartdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstartdateActionPerformed

    private void txtpositiontitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpositiontitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpositiontitleActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtname.getText();
        int employeeID = Integer.parseInt(txtemployeeid.getText());
        int age = Integer.parseInt(txtage.getText());
        String gender = txtgender.getText();
        String startdate = txtstartdate.getText();
        String level = txtlevel.getText();
        String teaminfo = txtteaminfo.getText();
        String positiontitle = txtpositiontitle.getText();
        String cellphone = txtcellphonenumber.getText();
        String email = txtemail.getText();
        
        employee emp = history.addNewEmployee();
        
        emp.setName(name);
        emp.setEmployeeID(employeeID);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setStartDate(startdate);
        emp.setTeaminfo(teaminfo);
        emp.setPositiontitle(positiontitle);
        emp.setCellPhone(cellphone);
        emp.setEmail(email);
        
        JOptionPane.showMessageDialog(this, "New Employee Details Added.");
        
        txtname.setText("");
        txtemployeeid.setText("");
        txtage.setText("");
        txtgender.setText("");
        txtstartdate.setText("");
        txtlevel.setText("");
        txtteaminfo.setText("");
        txtpositiontitle.setText("");
        txtcellphonenumber.setText("");
        txtemail.setText("");
   
    }//GEN-LAST:event_btnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IblAge;
    private javax.swing.JLabel IblemployeeID;
    private javax.swing.JLabel Iblgender;
    private javax.swing.JLabel Ibllevel;
    private javax.swing.JLabel Iblname;
    private javax.swing.JLabel Iblstartdate;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel lblcellphonenumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemployeedetails;
    private javax.swing.JLabel lblposition;
    private javax.swing.JLabel lblteaminfo;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcellphonenumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemployeeid;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpositiontitle;
    private javax.swing.JTextField txtstartdate;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables
}