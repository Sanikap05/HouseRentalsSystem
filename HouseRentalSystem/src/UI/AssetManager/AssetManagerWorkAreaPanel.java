/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AssetManager;

import Business.Asset.Asset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UI.Customer.DisplayJobsInfoPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Kiran
 */
public class AssetManagerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssetManagerWorkAreaPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organisation organization;
    Asset asset;
    
    public AssetManagerWorkAreaPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.asset=asset;
        manageJobs();
    }
    
    private void manageJobs() {
        ViewOppurtunitiesPanel viewOppurtunitiesPanel = new ViewOppurtunitiesPanel(rightpanel,organization,network, enterprise,account, system);
        rightpanel.add("ViewOppurtunitiesPanel",viewOppurtunitiesPanel);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
    
    private void displayjobs() {
        DisplayJobsInfoPanel displayJobsInfoPanel = new DisplayJobsInfoPanel(rightpanel, account, enterprise, system, network, organization);
        rightpanel.add("DisplayJobsInfoPanel", displayJobsInfoPanel);
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.next(rightpanel);
    }
    
    private void manageProfile() {
        
        AssetManagerProfilePanel assetManagerProfilePanel = new AssetManagerProfilePanel(rightpanel, enterprise, account, system);
        rightpanel.add("AssetManagerProfilePanel", assetManagerProfilePanel);
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

        jPanel1 = new javax.swing.JPanel();
        systemAdminPanel = new javax.swing.JPanel();
        leftpanel = new javax.swing.JPanel();
        manageproPanel = new javax.swing.JPanel();
        manageProfile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblassetmanager = new javax.swing.JLabel();
        manageOppPanel = new javax.swing.JPanel();
        manageJobs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblmanageorg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rightpanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(215, 81, 81));
        jPanel1.setMinimumSize(new java.awt.Dimension(1338, 840));
        jPanel1.setPreferredSize(new java.awt.Dimension(1338, 840));
        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));

        leftpanel.setBackground(new java.awt.Color(255, 255, 255));
        leftpanel.setPreferredSize(new java.awt.Dimension(280, 148));
        leftpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageproPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageproPanel.setToolTipText("");
        manageproPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageproPanelMousePressed(evt);
            }
        });

        manageProfile.setBackground(new java.awt.Color(255, 255, 255));
        manageProfile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageProfile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manageProfile.setText("MANAGE PROFILE");
        manageProfile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageProfile.setPreferredSize(new java.awt.Dimension(115, 16));
        manageProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-organization-chart-people-48.png"))); // NOI18N

        javax.swing.GroupLayout manageproPanelLayout = new javax.swing.GroupLayout(manageproPanel);
        manageproPanel.setLayout(manageproPanelLayout);
        manageproPanelLayout.setHorizontalGroup(
            manageproPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageproPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );
        manageproPanelLayout.setVerticalGroup(
            manageproPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftpanel.add(manageproPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 40));

        lblassetmanager.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblassetmanager.setText("ASSET MANAGER");
        lblassetmanager.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        leftpanel.add(lblassetmanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        manageOppPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageOppPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOppPanelMousePressed(evt);
            }
        });

        manageJobs.setBackground(new java.awt.Color(255, 255, 255));
        manageJobs.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageJobs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manageJobs.setText("MANAGE OPPURTUNITIES");
        manageJobs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        manageJobs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageJobsMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-office-50.png"))); // NOI18N

        javax.swing.GroupLayout manageOppPanelLayout = new javax.swing.GroupLayout(manageOppPanel);
        manageOppPanel.setLayout(manageOppPanelLayout);
        manageOppPanelLayout.setHorizontalGroup(
            manageOppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOppPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        manageOppPanelLayout.setVerticalGroup(
            manageOppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOppPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftpanel.add(manageOppPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 50));

        lblmanageorg.setBackground(new java.awt.Color(255, 255, 255));
        lblmanageorg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblmanageorg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblmanageorg.setText("VIEW OPPURTUNITIES AVAILIBILITY");
        lblmanageorg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblmanageorg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmanageorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanageorgMousePressed(evt);
            }
        });
        leftpanel.add(lblmanageorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 220, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-jobs-recruitment-consultancy-providing-new-opportunities-for-freshers-24.png"))); // NOI18N
        leftpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, 30));

        rightpanel.setBackground(new java.awt.Color(241, 241, 242));
        rightpanel.setMinimumSize(new java.awt.Dimension(1058, 840));
        rightpanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightpanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, Short.MAX_VALUE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfileMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageProfileMousePressed

    private void manageproPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageproPanelMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageproPanelMousePressed

    private void manageJobsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageJobsMousePressed
        manageJobs();
    }//GEN-LAST:event_manageJobsMousePressed

    private void manageOppPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOppPanelMousePressed
        // TODO add your handling code here:
        manageJobs();
    }//GEN-LAST:event_manageOppPanelMousePressed

    private void lblmanageorgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanageorgMousePressed
        displayjobs();
    }//GEN-LAST:event_lblmanageorgMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblassetmanager;
    private javax.swing.JLabel lblmanageorg;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel manageJobs;
    private javax.swing.JPanel manageOppPanel;
    private javax.swing.JLabel manageProfile;
    private javax.swing.JPanel manageproPanel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
