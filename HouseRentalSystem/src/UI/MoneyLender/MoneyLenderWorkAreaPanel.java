/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MoneyLender;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanik
 */
    
public class MoneyLenderWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form MoneyLenderWorkAreaPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organisation organisation;
    
    public MoneyLenderWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        manageAdvertise();

    }
    
    private void manageAdvertise() {
        ViewApplications viewApplications = new ViewApplications(userProcessContainer, enterprise, account, system);
        rightworkarea.add("ViewApplications", viewApplications);
        CardLayout layout = (CardLayout) rightworkarea.getLayout();
        layout.next(rightworkarea);
    }

    private void manageProfile() {
        ManageMoneyLenderProfile manageMoneyLenderProfile = new ManageMoneyLenderProfile(userProcessContainer, system, account);
        rightworkarea.add("ManageMoneyLenderProfile", manageMoneyLenderProfile);
        CardLayout layout = (CardLayout) rightworkarea.getLayout();
        layout.next(rightworkarea);
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
        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        displayloanpanel = new javax.swing.JPanel();
        lbldisplay = new javax.swing.JLabel();
        manageprofilepanel = new javax.swing.JPanel();
        lblprofile = new javax.swing.JLabel();
        lblmoneylender = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightworkarea = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(241, 241, 242));
        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 213, 90));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayloanpanel.setBackground(new java.awt.Color(255, 255, 255));
        displayloanpanel.setToolTipText("");
        displayloanpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        displayloanpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                displayloanpanelMousePressed(evt);
            }
        });

        lbldisplay.setBackground(new java.awt.Color(255, 255, 255));
        lbldisplay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbldisplay.setText("Display Loan Applications");
        lbldisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbldisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbldisplayMousePressed(evt);
            }
        });

        javax.swing.GroupLayout displayloanpanelLayout = new javax.swing.GroupLayout(displayloanpanel);
        displayloanpanel.setLayout(displayloanpanelLayout);
        displayloanpanelLayout.setHorizontalGroup(
            displayloanpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayloanpanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbldisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        displayloanpanelLayout.setVerticalGroup(
            displayloanpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayloanpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(displayloanpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 50));

        manageprofilepanel.setBackground(new java.awt.Color(255, 255, 255));
        manageprofilepanel.setToolTipText("");
        manageprofilepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageprofilepanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageprofilepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageprofilepanelMousePressed(evt);
            }
        });

        lblprofile.setBackground(new java.awt.Color(255, 255, 255));
        lblprofile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblprofile.setText("Manage Profile");
        lblprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblprofile.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageprofilepanelLayout = new javax.swing.GroupLayout(manageprofilepanel);
        manageprofilepanel.setLayout(manageprofilepanelLayout);
        manageprofilepanelLayout.setHorizontalGroup(
            manageprofilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageprofilepanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageprofilepanelLayout.setVerticalGroup(
            manageprofilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageprofilepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(manageprofilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        lblmoneylender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblmoneylender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoneylender.setText("MONEY LENDER WORK AREA");
        lblmoneylender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lblmoneylender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 320, 20));

        rightworkarea.setBackground(new java.awt.Color(241, 241, 242));
        rightworkarea.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightworkarea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightworkarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightworkarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(systemAdminPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1338, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbldisplayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldisplayMousePressed

        manageAdvertise();
    }//GEN-LAST:event_lbldisplayMousePressed

    private void displayloanpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayloanpanelMousePressed
        // TODO add your handling code here:
       manageAdvertise();
    }//GEN-LAST:event_displayloanpanelMousePressed

    private void manageprofilepanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageprofilepanelMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageprofilepanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel displayloanpanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbldisplay;
    private javax.swing.JLabel lblmoneylender;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JPanel manageprofilepanel;
    private javax.swing.JPanel rightworkarea;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
