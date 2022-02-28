/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Business.Employee.Employee;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class QualityControlEnterpriseManageEmployees extends javax.swing.JPanel {

    /**
     * Creates new form QualityControlEnterpriseManageEmployees
     */
    private OrganisationDirectory organisationDirectory;
    
    public QualityControlEnterpriseManageEmployees(JPanel usrPrcCont, OrganisationDirectory organisationDirectory) {
        initComponents();
        this.organisationDirectory = organisationDirectory;
        populateTable();
        populateOrganizationEmployeeComboBox();
        populateTable();
    }
    
     public void populateOrganizationEmployeeComboBox() {
        organizationbox.removeAllItems();

        for (Organisation organisation : organisationDirectory.getOrganisationList()) {
            organizationbox.addItem(organisation);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblorganization.getModel();

        model.setRowCount(0);
        for (Organisation organisation : organisationDirectory.getOrganisationList()) {
            for (Employee employee : organisation.getEmployeeDirectory().getEmpList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = employee.getId();
                row[1] = employee.getName();
                model.addRow(row);
            }
        }
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
        lblquality = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorganization = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblemployee = new javax.swing.JLabel();
        lblorganization = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        organizationbox = new javax.swing.JComboBox();
        btnaddemployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel1.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblquality.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblquality.setForeground(new java.awt.Color(255, 255, 255));
        lblquality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquality.setText("QUALITY ASSUARANCE EMPLOYEES");
        jPanel1.add(lblquality, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 290, -1));

        tblorganization.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblorganization.setForeground(new java.awt.Color(25, 56, 82));
        tblorganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorganization.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblorganization);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 670, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(763, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1260, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblemployee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblemployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblemployee.setText("CREATE AN EMPLOYEE");
        lblemployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblorganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblorganization.setText("Organization");

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname.setText("Name");

        getname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        getname.setForeground(new java.awt.Color(25, 56, 82));
        getname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                getnameKeyPressed(evt);
            }
        });

        organizationbox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationbox.setForeground(new java.awt.Color(25, 56, 82));

        btnaddemployee.setBackground(new java.awt.Color(255, 255, 255));
        btnaddemployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaddemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-64_1.png"))); // NOI18N
        btnaddemployee.setText("ADD EMPLOYEE");
        btnaddemployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaddemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddemployeeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblorganization)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblname)
                                        .addGap(43, 43, 43)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(btnaddemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(698, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblemployee)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblorganization, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnaddemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameKeyPressed

    private void btnaddemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddemployeeActionPerformed
       if (!getname.getText().equals("")) {
            Organisation organisation = (Organisation) organizationbox.getSelectedItem();
            String name = getname.getText();
            organisation.getEmployeeDirectory().generateEmp(name);
            JOptionPane.showMessageDialog(null, "Employee Added Successfully");
            populateTable();
            getname.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnaddemployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddemployee;
    private javax.swing.JTextField getname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblemployee;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblorganization;
    private javax.swing.JLabel lblquality;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JComboBox organizationbox;
    private javax.swing.JTable tblorganization;
    // End of variables declaration//GEN-END:variables
}