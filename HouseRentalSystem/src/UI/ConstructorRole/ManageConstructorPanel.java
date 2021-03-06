/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ConstructorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kiran
 */
public class ManageConstructorPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageConstructorPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    public ManageConstructorPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        populateRequestTable();
    }
    
    public void populateRequestTable() {
        getname.setText(userAccount.getName());
        getcost.setText(userAccount.getCost());
        getcityname.setText(userAccount.getCity());
        getavail.setText(userAccount.getAvail());
        getzip.setText(userAccount.getZip());
        getaddress.setText(userAccount.getAddress());
        getmailid.setText(userAccount.getMailId());
        getcontactno.setText(userAccount.getContactnumber());
        getstatename.setText(userAccount.getState());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblcontactnium = new javax.swing.JLabel();
        getcontactno = new javax.swing.JTextField();
        lbladd = new javax.swing.JLabel();
        getaddress = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        getcityname = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstatename = new javax.swing.JTextField();
        lblmailid = new javax.swing.JLabel();
        getmailid = new javax.swing.JTextField();
        lblzip = new javax.swing.JLabel();
        getzip = new javax.swing.JTextField();
        lblavail = new javax.swing.JLabel();
        getavail = new javax.swing.JTextField();
        lblcharge = new javax.swing.JLabel();
        getcost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(241, 241, 242));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1242, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(44, 68, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64.png"))); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 160, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(803, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 70));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name:");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("BUILDER PROFILE");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblcontactnium.setBackground(new java.awt.Color(255, 255, 255));
        lblcontactnium.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcontactnium.setText("Phone:");

        getcontactno.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcontactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcontactnoActionPerformed(evt);
            }
        });

        lbladd.setBackground(new java.awt.Color(255, 255, 255));
        lbladd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbladd.setText("Address:");

        getaddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcity.setBackground(new java.awt.Color(255, 255, 255));
        lblcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcity.setText("City:");

        getcityname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcityname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcitynameActionPerformed(evt);
            }
        });

        lblstate.setBackground(new java.awt.Color(255, 255, 255));
        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstate.setText("State:");

        getstatename.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblmailid.setBackground(new java.awt.Color(255, 255, 255));
        lblmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblmailid.setText("Mail Id:");

        getmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblzip.setBackground(new java.awt.Color(255, 255, 255));
        lblzip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzip.setText("Zipcode:");

        getzip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblavail.setBackground(new java.awt.Color(255, 255, 255));
        lblavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblavail.setText("Availibility:");

        getavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcharge.setBackground(new java.awt.Color(255, 255, 255));
        lblcharge.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcharge.setText("Price:");

        getcost.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcostActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-worker-beard-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbladd)
                                    .addComponent(lblcity)
                                    .addComponent(lblstate)
                                    .addComponent(lblmailid)
                                    .addComponent(lblzip)
                                    .addComponent(lblavail)
                                    .addComponent(lblcharge)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(lblcontactnium)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getcontactno)
                                    .addComponent(getaddress)
                                    .addComponent(getcityname)
                                    .addComponent(getstatename)
                                    .addComponent(getmailid)
                                    .addComponent(getzip)
                                    .addComponent(getavail)
                                    .addComponent(getcost, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(589, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontactnium)
                    .addComponent(getcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladd)
                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcity)
                    .addComponent(getcityname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstate)
                    .addComponent(getstatename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblzip)
                    .addComponent(getzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmailid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavail)
                    .addComponent(getavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcharge)
                    .addComponent(getcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1280, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getcontactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactnoActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
       if (system.isVoid(getname.getText()) || system.isVoid(getcost.getText()) || system.isVoid(getcityname.getText())
                || system.isVoid(getavail.getText()) || system.isVoid(getzip.getText()) || system.isVoid(getaddress.getText())
                || system.isVoid(getmailid.getText()) || system.isVoid(getcontactno.getText()) || system.isVoid(getstatename.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        } else if (!system.isDouble(getcost.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter valid charge!");
            return;
        } else if (!system.isInt(getzip.getText()) || getzip.getText().length() != 5) {
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        } else if (!system.verifyContactFormat(getcontactno.getText())) {
            return;
        } else if (!system.verifyMailFormat(getmailid.getText())) {
            return;
        } else if (!system.verifySameMail(getmailid.getText(), userAccount.getUserName())) {
            return;
        } else if (!system.verifySameContact(getcontactno.getText(), userAccount.getUserName())) {
            return;
        }
        userAccount.setName(getname.getText());
        userAccount.setCost(getcost.getText());
        userAccount.setCity(getcityname.getText());
        userAccount.setAvail(getavail.getText());
        userAccount.setZip(getzip.getText());
        userAccount.setAddress(getaddress.getText());
        userAccount.setMailId(getmailid.getText());
        userAccount.setContactnumber(getcontactno.getText());
        userAccount.setState(getstatename.getText());
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void getcitynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcitynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcitynameActionPerformed

    private void getcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getavail;
    private javax.swing.JTextField getcityname;
    private javax.swing.JTextField getcontactno;
    private javax.swing.JTextField getcost;
    private javax.swing.JTextField getmailid;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getstatename;
    private javax.swing.JTextField getzip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lblcharge;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontactnium;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblmailid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzip;
    // End of variables declaration//GEN-END:variables
}
