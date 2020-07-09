import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatientDischarge_Ward extends javax.swing.JFrame {

    public PatientDischarge_Ward() {
        initComponents();
        Get_Data();        
        fillcombo();
        cmbWardName.setSelectedIndex(-1);
    }
public void Reset()
{
    
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    PatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    cmbWardName.setSelectedIndex(-1);
    txtRemarks.setText("");
    txtDischargeDate.setText(""); 
    cmbWardName.requestDefaultFocus();
    ADD.setEnabled(true);
    Upd.setEnabled(false);
    Del.setEnabled(false);
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
    fillcombo();
    Get_Data();
    }
public void Get_Data(){
          
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql="Select * from AdmitPatient_Ward where PatientID != 0  order by PatientID";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
                int s1 = Integer.parseInt(rs.getString("PatientID"));
                String s2 = rs.getString("PatientName");
                String s3 = rs.getString("Gender");
                String s4 = rs.getString("BloodGroup");
                String s5 = rs.getString("Disease");
                String s6 = rs.getString("AdmitDate");
                String s7 = rs.getString("Wardname");
                int s8 = Integer.parseInt(rs.getString("DoctorID"));
                String s9 = rs.getString("DoctorName");
                String s10 = rs.getString("AP_Remarks");
                model.addRow(new Object[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10});
            }
                con.close();
                st.close();
                rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } 
          
}
public void fillcombo()
{
     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql= "select distinct Wardname from Ward where Wardname != 'Ward name'  order by Wardname";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);   
      while(rs.next()){
          String add=rs.getString("Wardname");
          cmbWardName.addItem(add);          
         }
                con.close();
                st.close();
                rs.close();
        }catch(Exception ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
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
        jLabel8 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAdmitDate = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbWardName = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDischargeDate = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Upd = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Search = new javax.swing.JButton();
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
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 670, 160, 50));

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 670, 180, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 52)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Patient Discharge Ward Details");

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("Patient ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        PatientID.setEditable(false);
        PatientID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PatientID.setForeground(new java.awt.Color(51, 153, 0));
        PatientID.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        PatientID.setEnabled(false);
        jPanel1.add(PatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 226, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setText("Patient Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPatientName.setForeground(new java.awt.Color(51, 153, 0));
        txtPatientName.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        txtPatientName.setEnabled(false);
        jPanel1.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 226, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtGender.setForeground(new java.awt.Color(51, 153, 0));
        txtGender.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        txtGender.setEnabled(false);
        jPanel1.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 226, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("Blood Group");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtBloodGroup.setEditable(false);
        txtBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtBloodGroup.setForeground(new java.awt.Color(51, 153, 0));
        txtBloodGroup.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        txtBloodGroup.setEnabled(false);
        jPanel1.add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 226, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("Disease");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtDisease.setEditable(false);
        txtDisease.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDisease.setForeground(new java.awt.Color(51, 153, 0));
        txtDisease.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiseaseKeyTyped(evt);
            }
        });
        jPanel1.add(txtDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 226, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setText("Admit Date");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtAdmitDate.setEditable(false);
        txtAdmitDate.setForeground(new java.awt.Color(51, 153, 0));
        txtAdmitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtAdmitDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAdmitDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdmitDateKeyTyped(evt);
            }
        });
        jPanel1.add(txtAdmitDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 20));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 255));
        jLabel22.setText("(DD/MM/YYYY)");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 20));

        cmbWardName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbWardName.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(cmbWardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 225, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("Ward Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 255));
        jLabel16.setText("Doctor ID");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtDoctorID.setEditable(false);
        txtDoctorID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDoctorID.setForeground(new java.awt.Color(51, 153, 0));
        txtDoctorID.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        txtDoctorID.setEnabled(false);
        jPanel1.add(txtDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 226, 20));

        txtDoctorName.setEditable(false);
        txtDoctorName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDoctorName.setForeground(new java.awt.Color(51, 153, 0));
        txtDoctorName.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        txtDoctorName.setEnabled(false);
        jPanel1.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 226, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setText("Doctor Name");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 255));
        jLabel18.setText("Discharge Date");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtDischargeDate.setForeground(new java.awt.Color(51, 153, 0));
        txtDischargeDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDischargeDate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(txtDischargeDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 140, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 255));
        jLabel23.setText("(DD/MM/YYYY)");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, 20));

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRemarks.setForeground(new java.awt.Color(51, 153, 0));
        txtRemarks.setRows(5);
        txtRemarks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemarksKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtRemarks);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 226, 160));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setText("Remarks");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Gender", "Blood Group", "Disease", "Admit Date", "Ward Name", "Doctor ID", "Doctor Name", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 810, 460));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1240, 480));

        Upd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Upd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        Upd.setText("Update");
        Upd.setEnabled(false);
        Upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdActionPerformed(evt);
            }
        });
        jPanel2.add(Upd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, 160, 50));

        Del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png"))); // NOI18N
        Del.setText("Delete");
        Del.setEnabled(false);
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        jPanel2.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 160, 50));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save.png"))); // NOI18N
        ADD.setText("Save");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, 160, 50));

        New.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 160, 50));

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 660));

        jLabel2.setBackground(new java.awt.Color(211, 219, 238));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 660, 1390, 64));

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
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        PatientDischarge_WardRecord frm = new PatientDischarge_WardRecord();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetDataActionPerformed

    private void txtDiseaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiseaseKeyTyped
        String s = txtDisease.getText();
        if (s.length() == 15) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDiseaseKeyTyped

    private void txtAdmitDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdmitDateKeyTyped
        String s = txtAdmitDate.getText();
        if (s.length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAdmitDateKeyTyped

    private void txtRemarksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemarksKeyTyped
        String s = txtRemarks.getText();
        if (s.length() == 50) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtRemarksKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql = "Select * from AdmitPatient_Ward where  PatientID='" + table_click + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String add1 = rs.getString("DoctorID");
                txtDoctorID.setText(add1);
                String add2 = rs.getString("Doctorname");
                txtDoctorName.setText(add2);
                String add3 = rs.getString("PatientID");
                PatientID.setText(add3);
                String add5 = rs.getString("PatientName");
                txtPatientName.setText(add5);
                String add6 = rs.getString("Gender");
                txtGender.setText(add6);
                String add7 = rs.getString("BloodGroup");
                txtBloodGroup.setText(add7);
                String add9 = rs.getString("Disease");
                txtDisease.setText(add9);
                String add11 = rs.getString("AdmitDate");
                txtAdmitDate.setText(add11);
                String add14 = rs.getString("Wardname");
                cmbWardName.setSelectedItem(add14);
                String add15 = rs.getString("AP_Remarks");
                txtRemarks.setText(add15);

            }
            con.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
        try {
            if (PatientID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Patient ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Patient Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtBloodGroup.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Blood Group", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardName.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Ward Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Disease", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Admit Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Doctor Id", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Doctor Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDischargeDate.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Discharge Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            Statement stmt1 = con.createStatement();
            String sql1 = "update DischargePatient_Ward set PatientID=" + PatientID.getText() + ",PatientName='" + txtPatientName.getText() + "',Gender='" + txtGender.getText() + "',BloodGroup='" + txtBloodGroup.getText() + "',Disease='" + txtDisease.getText() + "',AdmitDate='" + txtAdmitDate.getText() + "',Wardname='" + cmbWardName.getSelectedItem() + "',DoctorID=" + txtDoctorID.getText() + ",DoctorName='" + txtDoctorName.getText() + "',DischargeDate='" + txtDischargeDate.getText() + "',DP_Remarks='" + txtRemarks.getText() + "' where PatientID= " + PatientID.getText() + "";
            int rowsEffected1 = stmt1.executeUpdate(sql1);
            /*Statement stmt2 = con.createStatement();
            String sql2 = " update DischargePatient_WardMain set  PatientID=" + PatientID.getText() + ",PatientName='" + txtPatientName.getText() + "',Gen='" + txtGender.getText() + "',BG='" + txtBloodGroup.getText() + "',Disease='" + txtDisease.getText() + "',AdmitDate='" + txtAdmitDate.getText() + "',Wardname='" + cmbWardName.getSelectedItem() + "',DoctorID=" + txtDoctorID.getText() + ",DoctorName='" + txtDoctorName.getText() + "',DischargeDate='" + txtDischargeDate.getText() + "',AP_Remarks='" + txtRemarks.getText() + "' where PatientID= " + PatientID.getText() + "";
            int rowsEffected2 = stmt2.executeUpdate(sql2);*/
            JOptionPane.showMessageDialog(this, "Data Successfully Updated", "Patient Discharge Ward Record", JOptionPane.INFORMATION_MESSAGE);
            Reset();
            con.close();
            stmt1.close();
            //stmt2.close();
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_UpdActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try {
            int P = JOptionPane.showConfirmDialog(this, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
                Statement stmt = con.createStatement();
                String sql = "delete from DischargePatient_Ward where PatientID = " + PatientID.getText() + "";
                int rowsEffected = stmt.executeUpdate(sql);
                /*Statement stmt1 = con.createStatement();
                String sql1 = "delete from DischargePatient_WardMain where PatientID = " + PatientID.getText() + "";
                int rowsEffected1 = stmt1.executeUpdate(sql1);*/
                JOptionPane.showMessageDialog(this, "Data Successfully Deleted", "Patient Discharge Ward Record", JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
                stmt.close();
                //stmt1.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_DelActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try {
            if (PatientID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Patient ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Patient Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtBloodGroup.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Blood Group", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardName.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Ward Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Disease", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Admit Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Doctor Id", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Doctor Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDischargeDate.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Discharge Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            Statement stmt = con.createStatement();
            String sql = "Select PatientID from DischargePatient_Ward where PatientID= " + PatientID.getText() + "";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Record already exists", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                Statement stmt2 = con.createStatement();
                String sql2 = "insert into DischargePatient_Ward(PatientID,PatientName,Gender,BloodGroup,Disease,AdmitDate,Wardname,DoctorID,DoctorName,DischargeDate,DP_Remarks)values(" + PatientID.getText() + ",'" + txtPatientName.getText() + "','" + txtGender.getText() + "','" + txtBloodGroup.getText() + "','" + txtDisease.getText() + "','" + txtAdmitDate.getText() + "','" + cmbWardName.getSelectedItem() + "'," + txtDoctorID.getText() + ",'" + txtDoctorName.getText() + "','" + txtDischargeDate.getText() + "','" + txtRemarks.getText() + "')";
                int rowsEffected2 = stmt2.executeUpdate(sql2);
                /*Statement stmt3 = con.createStatement();
                String sql3 = "insert into DischargePatient_WardMain(PatientID,PatientName,Gen,BG,Disease,AdmitDate,Wardname,DoctorID,DoctorName,DischargeDate,AP_Remarks)values(" + PatientID.getText() + ",'" + txtPatientName.getText() + "','" + txtGender.getText() + "','" + txtBloodGroup.getText() + "','" + txtDisease.getText() + "','" + txtAdmitDate.getText() + "','" + cmbWardName.getSelectedItem() + "'," + txtDoctorID.getText() + ",'" + txtDoctorName.getText() + "','" + txtDischargeDate.getText() + "','" + txtRemarks.getText() + "')";
                int rowsEffected3 = stmt3.executeUpdate(sql3);*/
                Statement stmt4 = con.createStatement();
                String sql4 = "update Ward set NoOfBeds=NoOfBeds+1 where Wardname='" + cmbWardName.getSelectedItem() + "'";
                int rowsEffected4 = stmt4.executeUpdate(sql4);
                stmt2.close();
               // stmt3.close();
                stmt4.close();
            }
            JOptionPane.showMessageDialog(this, "Data Successfully Saved", "Patient Discharge Ward Record", JOptionPane.INFORMATION_MESSAGE);
            Reset();
            con.close();
            stmt.close();
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        Reset();
    }//GEN-LAST:event_NewActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        Search_DischargePatient_Ward frm = new Search_DischargePatient_Ward();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDischarge_Ward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ADD;
    public static javax.swing.JButton Back;
    public static javax.swing.JButton Del;
    public static javax.swing.JButton GetData;
    public static javax.swing.JButton New;
    public javax.swing.JTextField PatientID;
    private javax.swing.JButton Search;
    public static javax.swing.JButton Upd;
    public static javax.swing.JComboBox cmbWardName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JFormattedTextField txtAdmitDate;
    public javax.swing.JTextField txtBloodGroup;
    public javax.swing.JFormattedTextField txtDischargeDate;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables
}
