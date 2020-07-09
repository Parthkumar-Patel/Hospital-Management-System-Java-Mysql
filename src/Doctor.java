import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Doctor extends javax.swing.JFrame {

    public Doctor() {
        initComponents();
        setdata();
    }

    private void setdata()
{
    try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql= "select max(DoctorID+1) as'DoctorID' from Doctor;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
                String add=rs.getString("DoctorID");
                txtDoctorID.setText(add);
        }
            con.close();
            st.close();
            rs.close();   
        }catch(Exception ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
}
private void Reset()
{
    setdata();
    txtDoctorName.setText("");
    txtFathername.setText("");
    txtContactNo.setText("");
    txtAddress.setText("");
    txtQualifications.setText("");
    txtEmailID.setText("");
    txtSpecialisation.setText("");
    txtDateOfJoining.setText("");
    cmbBloodGroup.setSelectedIndex(-1);
    cmbGender.setSelectedIndex(-1);
    ADD.setEnabled(true);
    Upd.setEnabled(false);
    Del.setEnabled(false);    
    txtDoctorID.requestDefaultFocus();

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
        jLabel3 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFathername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQualifications = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSpecialisation = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cmbBloodGroup = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDateOfJoining = new javax.swing.JFormattedTextField();
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
        jLabel4.setText("Doctor Details");

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("ID");

        txtDoctorID.setEditable(false);
        txtDoctorID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDoctorID.setForeground(new java.awt.Color(51, 153, 0));
        txtDoctorID.setDisabledTextColor(new java.awt.Color(51, 153, 0));
        txtDoctorID.setDoubleBuffered(true);
        txtDoctorID.setEnabled(false);
        txtDoctorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDoctorIDKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("Name");

        txtDoctorName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDoctorName.setForeground(new java.awt.Color(51, 153, 0));
        txtDoctorName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDoctorNameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setText("Father's Name");

        txtFathername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFathername.setForeground(new java.awt.Color(51, 153, 0));
        txtFathername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFathernameKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("Address");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(51, 153, 0));
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("Contact No.");

        txtContactNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtContactNo.setForeground(new java.awt.Color(51, 153, 0));
        txtContactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactNoFocusLost(evt);
            }
        });
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setText("Email ID");

        txtEmailID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmailID.setForeground(new java.awt.Color(51, 153, 0));
        txtEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailIDKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setText("Qualifications");

        txtQualifications.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtQualifications.setForeground(new java.awt.Color(51, 153, 0));
        txtQualifications.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQualificationsKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setText("Specialization");

        txtSpecialisation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSpecialisation.setForeground(new java.awt.Color(51, 153, 0));
        txtSpecialisation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSpecialisationKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("Gender");

        cmbGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbGender.setForeground(new java.awt.Color(51, 153, 0));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cmbGender.setSelectedIndex(-1);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setText("Blood Group");

        cmbBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbBloodGroup.setForeground(new java.awt.Color(51, 153, 0));
        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbBloodGroup.setSelectedIndex(-1);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("Date Of Joining");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 255));
        jLabel22.setText("(DD/MM/YYYY)");

        txtDateOfJoining.setForeground(new java.awt.Color(51, 153, 0));
        txtDateOfJoining.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDateOfJoining.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDateOfJoining.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateOfJoiningKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDoctorName)
                                .addComponent(txtFathername)
                                .addComponent(txtDoctorID)
                                .addComponent(txtAddress)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel14)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSpecialisation, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(txtEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(txtQualifications, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(cmbGender, 0, 194, Short.MAX_VALUE)
                                .addComponent(cmbBloodGroup, 0, 194, Short.MAX_VALUE)
                                .addComponent(txtDateOfJoining)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1240, 390));

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
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 660, 1400, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1379, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        Doctor_Record frm = new Doctor_Record();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetDataActionPerformed

    private void txtDoctorIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorIDKeyTyped
        String s = txtDoctorID.getText();
        if (s.length() == 5) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDoctorIDKeyTyped

    private void txtDoctorNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorNameKeyTyped
        String s = txtDoctorName.getText();
        if (s.length() == 15) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDoctorNameKeyTyped

    private void txtFathernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFathernameKeyTyped
        String s = txtFathername.getText();
        if (s.length() == 15) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtFathernameKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        String s = txtAddress.getText();
        if (s.length() == 50) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
        String s = txtContactNo.getText();
        if (s.length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
        
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtContactNoKeyTyped

    private void txtEmailIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailIDKeyTyped
        String s = txtEmailID.getText();
        if (s.length() == 25) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailIDKeyTyped

    private void txtQualificationsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQualificationsKeyTyped
        String s = txtQualifications.getText();
        if (s.length() == 15) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtQualificationsKeyTyped

    private void txtSpecialisationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpecialisationKeyTyped
        String s = txtSpecialisation.getText();
        if (s.length() == 25) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtSpecialisationKeyTyped

    private void txtDateOfJoiningKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfJoiningKeyTyped
        String s = txtDateOfJoining.getText();
        if (s.length() == 10) {
            getToolkit().beep();
            evt.consume();
        }         
    }//GEN-LAST:event_txtDateOfJoiningKeyTyped

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
        try {
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Doctor Id", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Doctor Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtFathername.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Father's Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtContactNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Contact No.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String s = txtContactNo.getText();
            if (s.length() < 10) {
                JOptionPane.showMessageDialog( this, "Please Enter Contact No. of 10 Character !","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtQualifications.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Qualifications", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtSpecialisation.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Specialization", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbGender.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbBloodGroup.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Blood Group", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDateOfJoining.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Joining Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql = "update Doctor set Doctorname='" + txtDoctorName.getText() + "',FatherName='" + txtFathername.getText() + "',Email='" + txtEmailID.getText() + "',ContactNo='" + txtContactNo.getText() + "',Qualifications='" + txtQualifications.getText() + "',Specialization='" + txtSpecialisation.getText() + "',Gender='" + cmbGender.getSelectedItem() + "',BloodGroup='" + cmbBloodGroup.getSelectedItem() + "',DateOfJoining='" + txtDateOfJoining.getText() + "',Address='" + txtAddress.getText() + "' where DoctorID='" + txtDoctorID.getText() + "'";
            Statement st = con.createStatement();
            int rowsEffected = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data Successfully Updated", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);
            txtDoctorID.setText("");
            Reset();
            con.close();
            st.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_UpdActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try {
            int P = JOptionPane.showConfirmDialog(this, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (P == 0) {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
                String sql = "delete from Doctor where DoctorID = '" + txtDoctorID.getText() + "'";
                Statement st = con.createStatement();
                int rowsEffected = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Deleted", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);
                txtDoctorID.setText("");
                Reset();
                con.close();
                st.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_DelActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try {
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Doctor Id", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Doctor Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtFathername.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Father's Name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtContactNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Contact No.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String s = txtContactNo.getText();
            if (s.length() < 10) {
                JOptionPane.showMessageDialog( this, "Please Enter Contact No. of 10 Character !","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtQualifications.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Qualifications", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtSpecialisation.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Specialization", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbGender.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbBloodGroup.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Blood Group", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDateOfJoining.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Joining Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            Statement stmt = con.createStatement();
            String sql1 = "Select DoctorID from Doctor where DoctorID= " + txtDoctorID.getText() + "";
            ResultSet rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Doctor ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                txtDoctorID.setText("");
                txtDoctorID.requestDefaultFocus();
                return;
            } else {
                String sql = "insert into Doctor(DoctorID,Doctorname,FatherName,Email,ContactNo,Qualifications,Specialization,Gender,BloodGroup,DateOfJoining,Address)values('" + txtDoctorID.getText() + "','" + txtDoctorName.getText() + "','" + txtFathername.getText() + "','" + txtEmailID.getText() + "','" + txtContactNo.getText() + "','" + txtQualifications.getText() + "','" + txtSpecialisation.getText() + "','" + cmbGender.getSelectedItem() + "','" + cmbBloodGroup.getSelectedItem() + "','" + txtDateOfJoining.getText() + "','" + txtAddress.getText() + "')";
                int rowsEffected = stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Saved", "Doctor Record", JOptionPane.INFORMATION_MESSAGE);
                txtDoctorID.setText("");
                Reset();
                ADD.setEnabled(false);
            }
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
        Search_Doctor frm = new Search_Doctor();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void txtContactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactNoFocusLost
        String s = txtContactNo.getText();
        if (s.length() < 10) {
            JOptionPane.showMessageDialog( this, "Please Enter Contact No. of 10 Character !","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_txtContactNoFocusLost

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ADD;
    public static javax.swing.JButton Back;
    public static javax.swing.JButton Del;
    public static javax.swing.JButton GetData;
    public static javax.swing.JButton New;
    private javax.swing.JButton Search;
    public static javax.swing.JButton Upd;
    public javax.swing.JComboBox cmbBloodGroup;
    public javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtContactNo;
    public javax.swing.JFormattedTextField txtDateOfJoining;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtEmailID;
    public javax.swing.JTextField txtFathername;
    public javax.swing.JTextField txtQualifications;
    public javax.swing.JTextField txtSpecialisation;
    // End of variables declaration//GEN-END:variables
}
