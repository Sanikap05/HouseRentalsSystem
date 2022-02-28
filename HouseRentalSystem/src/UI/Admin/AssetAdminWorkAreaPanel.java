/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

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
public class AssetAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssetEnterpriseWorkArea
     */
    JPanel userPrcCont;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount usrAccount;
    Organisation organisation;
    
    public AssetAdminWorkAreaPanel(JPanel userPrcCont, UserAccount usrAccount, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userPrcCont = userPrcCont;
        this.usrAccount = usrAccount;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        manageOrganisation();
    }
    
     private void manageOrganisation(){
        
        AssetEnterpriseManageOrganisation assetEnterpriseManageOrganisation = new AssetEnterpriseManageOrganisation(enterprise.getOrganisationDirectory());
        rightpanel.add("AssetEnterpriseManageOrganisation", assetEnterpriseManageOrganisation);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
     
     private void manageEmployee(){
        
        AssetEnterpriseManageEmployees assetEnterpriseManageEmployees = new AssetEnterpriseManageEmployees(rightpanel, enterprise.getOrganisationDirectory());
        rightpanel.add("AssetEnterpriseManageEmployees", assetEnterpriseManageEmployees);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
    private void manageUsers(){
       
        AssetEnterpriseUseraccount assetEnterpriseUseraccount = new AssetEnterpriseUseraccount(rightpanel, enterprise, system, organisation);
        rightpanel.add("PropertyEntUserAccounts", assetEnterpriseUseraccount);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
    private void manageDemands(){
       
        AssetEnterpriseWorkRequest assetEnterpriseWorkRequest = new AssetEnterpriseWorkRequest(rightpanel, usrAccount, enterprise, network, system);
        rightpanel.add("PropertyEntWorkRequestJPanel", assetEnterpriseWorkRequest);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
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
        jPanel1 = new javax.swing.JPanel();
        systemAdminPanel = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        manageorgPanel = new javax.swing.JPanel();
        manageorglbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageempPanel = new javax.swing.JPanel();
        manageEmplbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        manageuserPanel = new javax.swing.JPanel();
        manageUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Assetpagelbl = new javax.swing.JLabel();
        managedemandsPanel = new javax.swing.JPanel();
        managedemands = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rightpanel = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        leftpanel.setBackground(new java.awt.Color(255, 255, 255));
        leftpanel.setMinimumSize(new java.awt.Dimension(280, 840));
        leftpanel.setPreferredSize(new java.awt.Dimension(280, 840));
        leftpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageorgPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageorgPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageorgPanel.setToolTipText("");
        manageorgPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageorgPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageorgPanelMousePressed(evt);
            }
        });

        manageorglbl.setBackground(new java.awt.Color(255, 255, 255));
        manageorglbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageorglbl.setText("MANAGE ORGANIZATION");
        manageorglbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageorglblMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-organization-chart-people-48.png"))); // NOI18N

        javax.swing.GroupLayout manageorgPanelLayout = new javax.swing.GroupLayout(manageorgPanel);
        manageorgPanel.setLayout(manageorgPanelLayout);
        manageorgPanelLayout.setHorizontalGroup(
            manageorgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageorgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageorglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        manageorgPanelLayout.setVerticalGroup(
            manageorgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageorgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageorglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftpanel.add(manageorgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 60));

        manageempPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageempPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageempPanel.setToolTipText("");
        manageempPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageempPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        manageempPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageempPanelMousePressed(evt);
            }
        });

        manageEmplbl.setBackground(new java.awt.Color(255, 255, 255));
        manageEmplbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageEmplbl.setText("MANAGE EMPLOYEE");
        manageEmplbl.setAutoscrolls(true);
        manageEmplbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmplblMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout manageempPanelLayout = new javax.swing.GroupLayout(manageempPanel);
        manageempPanel.setLayout(manageempPanelLayout);
        manageempPanelLayout.setHorizontalGroup(
            manageempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageempPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        manageempPanelLayout.setVerticalGroup(
            manageempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageempPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageEmplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftpanel.add(manageempPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 60));

        manageuserPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageuserPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageuserPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageuserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageuserPanelMousePressed(evt);
            }
        });

        manageUser.setBackground(new java.awt.Color(255, 255, 255));
        manageUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageUser.setText("MANAGE USER");
        manageUser.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-64.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout manageuserPanelLayout = new javax.swing.GroupLayout(manageuserPanel);
        manageuserPanel.setLayout(manageuserPanelLayout);
        manageuserPanelLayout.setHorizontalGroup(
            manageuserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageuserPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(manageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageuserPanelLayout.setVerticalGroup(
            manageuserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageuserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftpanel.add(manageuserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, 60));

        Assetpagelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Assetpagelbl.setText("ASSET");
        Assetpagelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        leftpanel.add(Assetpagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 50, -1));

        managedemandsPanel.setBackground(new java.awt.Color(255, 255, 255));
        managedemandsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        managedemandsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managedemandsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                managedemandsPanelMousePressed(evt);
            }
        });

        managedemands.setBackground(new java.awt.Color(255, 255, 255));
        managedemands.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        managedemands.setText("MANAGE DEMANDS");
        managedemands.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-give-60.png"))); // NOI18N

        javax.swing.GroupLayout managedemandsPanelLayout = new javax.swing.GroupLayout(managedemandsPanel);
        managedemandsPanel.setLayout(managedemandsPanelLayout);
        managedemandsPanelLayout.setHorizontalGroup(
            managedemandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managedemandsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(managedemands, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        managedemandsPanelLayout.setVerticalGroup(
            managedemandsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managedemandsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managedemands, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(managedemandsPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftpanel.add(managedemandsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 270, 70));

        rightpanel.setBackground(new java.awt.Color(241, 241, 242));
        rightpanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightpanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 851, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageorglblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageorglblMousePressed
       manageOrganisation();
    }//GEN-LAST:event_manageorglblMousePressed

    private void manageorgPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageorgPanelMousePressed
        // TODO add your handling code here:
       manageOrganisation();
    }//GEN-LAST:event_manageorgPanelMousePressed

    private void manageEmplblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmplblMousePressed
        manageEmployee();
    }//GEN-LAST:event_manageEmplblMousePressed

    private void manageempPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageempPanelMousePressed
        // TODO add your handling code here:
        manageEmployee();
    }//GEN-LAST:event_manageempPanelMousePressed

    private void manageuserPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserPanelMousePressed
        manageUsers();
    }//GEN-LAST:event_manageuserPanelMousePressed

    private void managedemandsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managedemandsPanelMousePressed
        // TODO add your handling code here:
       manageDemands();
    }//GEN-LAST:event_managedemandsPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Assetpagelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel manageEmplbl;
    private javax.swing.JLabel manageUser;
    private javax.swing.JLabel managedemands;
    private javax.swing.JPanel managedemandsPanel;
    private javax.swing.JPanel manageempPanel;
    private javax.swing.JPanel manageorgPanel;
    private javax.swing.JLabel manageorglbl;
    private javax.swing.JPanel manageuserPanel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
