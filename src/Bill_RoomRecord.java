import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bill_RoomRecord extends javax.swing.JFrame {

    public Bill_RoomRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        GetData = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        New = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 670, 160, 50));

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 670, 180, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bill Room Records");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Patient Id", "Patient Name", "Gender", "Blood Group", "Disease", "Admit Date", "Room No", "Doctor Id", "Doctor Name", "Discharge Date", "Room Charges", "NoOfDays", "TotalRoomCharges", "Service Charges", "Billing Date", "Payment Mode", "Payment Mode Details", "Total Charges", "Charge Paid", "Due Charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1240, 280));

        Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 160, 50));

        Del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png"))); // NOI18N
        Del.setText("Delete");
        Del.setEnabled(false);
        jPanel2.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 160, 50));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save.png"))); // NOI18N
        ADD.setText("Save");
        ADD.setEnabled(false);
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 670, 160, 50));

        New.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New.png"))); // NOI18N
        New.setText("New");
        New.setEnabled(false);
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 660));

        jLabel2.setBackground(new java.awt.Color(211, 219, 238));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1390, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1375, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
        Bill_Room frm = new Bill_Room();
        frm.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql = "select * from Bill_Room where BillNo !=0 order by BillNo";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
                int s1 = Integer.parseInt(rs.getString("BillNo"));
                int s2 = Integer.parseInt(rs.getString("PatientID"));
                String s3 = rs.getString("Patientname");
                String s4 = rs.getString("Gender");
                String s5 = rs.getString("BloodGroup");
                String s6 = rs.getString("Disease");
                String s7 = rs.getString("AdmitDate");
                String s8 = rs.getString("RoomNo");                
                int s9 = Integer.parseInt(rs.getString("DoctorID"));
                String s10 = rs.getString("Doctorname");
                String s11 = rs.getString("DischargeDate");
                String s12 = rs.getString("RoomCharges");
                String s13 = rs.getString("NoOfDays");
                String s14 = rs.getString("TotalRoomCharges");
                String s15 = rs.getString("ServiceCharges");
                String s16 = rs.getString("BillingDate");
                String s17 = rs.getString("PaymentMode");
                String s18 = rs.getString("PaymentModeDetails");
                String s19 = rs.getString("TotalCharges");
                String s20 = rs.getString("ChargesPaid");
                String s21 = rs.getString("DueCharges");
                model.addRow(new Object[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_GetDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql = "select * from Bill_Room where BillNo = '" + table_click + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                this.hide();
                Bill_Room frm = new Bill_Room();
                frm.setVisible(true);
                frm.Del.setEnabled(true);
                frm.Upd.setEnabled(true);
                frm.ADD.setEnabled(false);
                String add1=rs.getString("BillNo");
                frm.txtBillNo.setText(add1);
                String add2=rs.getString("PatientID");
                frm.PatientID.setText(add2);
                String add3=rs.getString("PatientName");
                frm.txtPatientName.setText(add3);
                String add4=rs.getString("Gender");
                frm.txtGender.setText(add4);
                String add5=rs.getString("BloodGroup");
                frm.txtBloodGroup.setText(add5);
                String add6=rs.getString("Disease");
                frm.txtDisease.setText(add6);
                String add7=rs.getString("AdmitDate");
                frm.txtAdmitDate.setText(add7);
                String add8=rs.getString("RoomNo");
                frm.txtRoomNo.setText(add8);
                String add9=rs.getString("DoctorID");
                frm.txtDoctorID.setText(add9);
                String add10=rs.getString("Doctorname");
                frm.txtDoctorName.setText(add10);
                String add11=rs.getString("DischargeDate");
                frm.txtDischargeDate.setText(add11);
                String add12=rs.getString("RoomCharges");
                frm.txtRoomCharges.setText(add12);
                String add13=rs.getString("NoOfDays");
                frm.txtNoOfDays.setText(add13);
                String add14=rs.getString("TotalRoomCharges");
                frm.txtTotalRoomCharges.setText(add14);
                String add15=rs.getString("ServiceCharges");
                frm.txtServiceCharges.setText(add15);
                String add16=rs.getString("BillingDate");
                frm.txtBillingDate.setText(add16);
                String add17=rs.getString("PaymentMode");
                frm.cmbPaymentMode.setSelectedItem(add17);
                String add18=rs.getString("PaymentModeDetails");
                frm.txtPaymentModeDetails.setText(add18);
                String add19=rs.getString("TotalCharges");
                frm.txtTotalCharges.setText(add19);
                String add20=rs.getString("ChargesPaid");
                frm.txtTotalPaid.setText(add20);
                String add21=rs.getString("DueCharges");
                frm.txtDueCharges.setText(add21);
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
    }//GEN-LAST:event_RefreshActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_RoomRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton Back;
    private javax.swing.JButton Del;
    private javax.swing.JButton GetData;
    private javax.swing.JButton New;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
