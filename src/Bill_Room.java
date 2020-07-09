import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Bill_Room extends javax.swing.JFrame {

    public Bill_Room() {
        initComponents();
        Get_Data1();
        setdata();
    }
private void setdata()
{
    try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql= "select max(BillNo+1)as'BillNo' from Bill_Room;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
        if(rs.next()){
                String add=rs.getString("BillNo");
                txtBillNo.setText(add);
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
       
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    PatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    txtRoomNo.setText("");
    txtServiceCharges.setText("");
    txtRoomCharges.setText("");
    txtPaymentModeDetails.setText("");
    txtTotalCharges.setText("");
    txtTotalPaid.setText("");
    txtDueCharges.setText("");
    txtBillingDate.setText("");
    cmbPaymentMode.setSelectedIndex(-1);
    txtDischargeDate.setText("");
    txtNoOfDays.setText("");
    txtTotalRoomCharges.setText("");
    ADD.setEnabled(true);
    Upd.setEnabled(false);
    Del.setEnabled(false);
    txtNoOfDays.requestDefaultFocus();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
    setdata();
    Get_Data1();
    }
 private void Get_Data1(){
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql="select PatientID as 'PatientID', PatientName as 'PatientName',sum(serviceCharges) as 'ServiceCharges' from Services  group by PatientID having PatientID !=0 order by PatientID";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                int s1=Integer.parseInt(rs.getString("PatientID"));
                String s2=rs.getString("PatientName");  
                String s3=rs.getString("ServiceCharges"); 
                model.addRow(new Object[]{s1,s2,s3});
            }
                con.close();
                st.close();
                rs.close();
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);          
            }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ADD = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        Upd = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        GetData = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtAdmitDate = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDischargeDate = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        btnNew2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtRoomCharges = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNoOfDays = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTotalRoomCharges = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtServiceCharges = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBillingDate = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbPaymentMode = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtPaymentModeDetails = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTotalCharges = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTotalPaid = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDueCharges = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save.png"))); // NOI18N
        ADD.setText("Save");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 727, 160, 50));

        New.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jPanel2.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 727, 160, 50));

        Del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png"))); // NOI18N
        Del.setText("Delete");
        Del.setEnabled(false);
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        jPanel2.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 727, 160, 50));

        Upd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Upd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh.png"))); // NOI18N
        Upd.setText("Update");
        Upd.setEnabled(false);
        Upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdActionPerformed(evt);
            }
        });
        jPanel2.add(Upd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 727, 160, 50));

        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 727, 160, 50));

        GetData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GetData.png"))); // NOI18N
        GetData.setText("Get Data");
        GetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataActionPerformed(evt);
            }
        });
        jPanel2.add(GetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 727, 180, 50));

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 727, 160, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bill Room Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 1220, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Patient Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Unicode", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("Patient ID");

        PatientID.setEditable(false);
        PatientID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PatientID.setForeground(new java.awt.Color(51, 153, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setText("Patient Name");

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPatientName.setForeground(new java.awt.Color(51, 153, 0));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 255));
        jLabel29.setText("Gender");

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtGender.setForeground(new java.awt.Color(51, 153, 0));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 255));
        jLabel27.setText("Blood Group");

        txtBloodGroup.setEditable(false);
        txtBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBloodGroup.setForeground(new java.awt.Color(51, 153, 0));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 255));
        jLabel31.setText("Disease");

        txtDisease.setEditable(false);
        txtDisease.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDisease.setForeground(new java.awt.Color(51, 153, 0));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 255));
        jLabel32.setText("Admit Date");

        txtAdmitDate.setEditable(false);
        txtAdmitDate.setForeground(new java.awt.Color(51, 153, 0));
        txtAdmitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        txtAdmitDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 255));
        jLabel30.setText("(DD/MM/YYYY)");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 255));
        jLabel33.setText("Room No.");

        txtRoomNo.setEditable(false);
        txtRoomNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRoomNo.setForeground(new java.awt.Color(51, 153, 0));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 255));
        jLabel34.setText("Doctor ID");

        txtDoctorID.setEditable(false);
        txtDoctorID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDoctorID.setForeground(new java.awt.Color(51, 153, 0));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 255));
        jLabel35.setText("Doctor Name");

        txtDoctorName.setEditable(false);
        txtDoctorName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDoctorName.setForeground(new java.awt.Color(51, 153, 0));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("Discharge Date");

        txtDischargeDate.setEditable(false);
        txtDischargeDate.setForeground(new java.awt.Color(51, 153, 0));
        txtDischargeDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDischargeDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 255));
        jLabel36.setText("(DD/MM/YYYY)");

        btnNew2.setBackground(new java.awt.Color(0, 255, 102));
        btnNew2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNew2.setText(">");
        btnNew2.setBorderPainted(false);
        btnNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setText("Bill No.");

        txtBillNo.setEditable(false);
        txtBillNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBillNo.setForeground(new java.awt.Color(51, 153, 0));
        txtBillNo.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel29)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PatientID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel9)
                    .addComponent(jLabel31)
                    .addComponent(jLabel27)
                    .addComponent(jLabel32))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnNew2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel30))))
                .addGap(101, 101, 101)
                .addComponent(jLabel6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel36))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Payment Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Unicode", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setText("Room Charges");

        txtRoomCharges.setEditable(false);
        txtRoomCharges.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRoomCharges.setForeground(new java.awt.Color(51, 153, 0));
        txtRoomCharges.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 255));
        jLabel16.setText("No. Of Days");

        txtNoOfDays.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNoOfDays.setForeground(new java.awt.Color(51, 153, 0));
        txtNoOfDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfDaysActionPerformed(evt);
            }
        });
        txtNoOfDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoOfDaysKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setText("Total Room Charges");

        txtTotalRoomCharges.setEditable(false);
        txtTotalRoomCharges.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalRoomCharges.setForeground(new java.awt.Color(51, 153, 0));
        txtTotalRoomCharges.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setText("Service Charges");

        txtServiceCharges.setEditable(false);
        txtServiceCharges.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtServiceCharges.setForeground(new java.awt.Color(51, 153, 0));
        txtServiceCharges.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("Billing Date");

        txtBillingDate.setForeground(new java.awt.Color(51, 153, 0));
        txtBillingDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtBillingDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBillingDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBillingDateKeyTyped(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 255));
        jLabel37.setText("(DD/MM/YYYY)");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setText("Payment Mode");

        cmbPaymentMode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbPaymentMode.setForeground(new java.awt.Color(51, 153, 0));
        cmbPaymentMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by Cash", "by DD", "by Check", "by Credit Card", "by Debit Card" }));
        cmbPaymentMode.setSelectedIndex(-1);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("Payment Mode Details");

        txtPaymentModeDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPaymentModeDetails.setForeground(new java.awt.Color(51, 153, 0));
        txtPaymentModeDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentModeDetailsKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 255));
        jLabel18.setText("Total Charges");

        txtTotalCharges.setEditable(false);
        txtTotalCharges.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalCharges.setForeground(new java.awt.Color(51, 153, 0));
        txtTotalCharges.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setText("Total Paid");

        txtTotalPaid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalPaid.setForeground(new java.awt.Color(51, 153, 0));
        txtTotalPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPaidActionPerformed(evt);
            }
        });
        txtTotalPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPaidKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 255));
        jLabel20.setText("Due Charges");

        txtDueCharges.setEditable(false);
        txtDueCharges.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDueCharges.setForeground(new java.awt.Color(51, 153, 0));
        txtDueCharges.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtPaymentModeDetails))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(txtTotalCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel19)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDueCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(651, 651, 651)
                                        .addComponent(jLabel17))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(800, 800, 800)
                                .addComponent(txtTotalRoomCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRoomCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(17, 17, 17)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNoOfDays, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBillingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmbPaymentMode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addGap(327, 327, 327))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(txtTotalRoomCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(17, 17, 17)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtBillingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(txtRoomCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cmbPaymentMode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPaymentModeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalCharges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel20)
                        .addComponent(txtDueCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txtTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Service Charges"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 1220, 620));

        jLabel2.setBackground(new java.awt.Color(211, 219, 238));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 720, 1400, 64));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGGG.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 780));

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

        setSize(new java.awt.Dimension(1379, 823));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void GetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataActionPerformed
        this.dispose();
        Bill_RoomRecord frm= new Bill_RoomRecord();
        frm.setVisible(true);
    }//GEN-LAST:event_GetDataActionPerformed

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
        try{
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
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Disease", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Admit Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtRoomNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Room No.", "Error", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "Please Retrieve Discharge Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtRoomCharges.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Room Charges", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfDays.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter No. of Days","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalRoomCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Total Room Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Service Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtBillingDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Billing Date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbPaymentMode.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Payment Mode", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPaymentModeDetails.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Payment Mode Details","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Total Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalPaid.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Total Paid","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDueCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Due Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double add1 = Double.parseDouble(txtTotalCharges.getText());
            double add2 = Double.parseDouble(txtTotalPaid.getText());
            if (add2 > add1) {
                JOptionPane.showMessageDialog( this, "Total Paid is more than Total Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            Statement st = con.createStatement();
            String sql= "update Bill_Room set BillNo="+ txtBillNo.getText() + ",PatientID="+ PatientID.getText() + ",PatientName='"+ txtPatientName.getText() + "',Gender='"+ txtGender.getText() + "',BloodGroup='"+ txtBloodGroup.getText() + "',Disease='"+ txtDisease.getText() + "',AdmitDate='"+ txtAdmitDate.getText() + "',RoomNo="+ txtRoomNo.getText() + ",DoctorID="+ txtDoctorID.getText() + ",DoctorName='"+ txtDoctorName.getText() + "',DischargeDate='"+ txtDischargeDate.getText() + "',BillingDate='"+ txtBillingDate.getText() + "',RoomCharges="+ txtRoomCharges.getText() + ",ServiceCharges="+ txtServiceCharges.getText() + ",PaymentMode='" + cmbPaymentMode.getSelectedItem()+ "',PaymentModeDetails='" + txtPaymentModeDetails.getText() + "',ChargesPaid="+ txtTotalPaid.getText() + ",DueCharges="+ txtDueCharges.getText() + ",TotalCharges="+ txtTotalCharges.getText() + ",NoOfDays="+ txtNoOfDays.getText() +",TotalRoomCharges=" + txtTotalRoomCharges.getText() + " where BillNo= " + txtBillNo.getText() +"";
            int rowsEffected = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Data Successfully Updated","Bill Room Record",JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        } 
    }//GEN-LAST:event_UpdActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try {
            int P = JOptionPane.showConfirmDialog(this, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
                Statement stmt = con.createStatement();
                String sql= "delete from Bill_Room where BillNo = " + txtBillNo.getText() + "";
                int rowsEffected = stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data Successfully Deleted", "Bill Room Record", JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
                stmt.close();
                
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
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Disease", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Admit Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtRoomNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Room No.", "Error", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "Please Retrieve Discharge Date", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtRoomCharges.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Retrieve Room Charges", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfDays.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter No. of Days","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalRoomCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Total Room Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Service Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtBillingDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Billing Date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbPaymentMode.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Select Payment Mode", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPaymentModeDetails.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Payment Mode Details","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Total Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtTotalPaid.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Total Paid","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDueCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Retrieve Due Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double add1 = Double.parseDouble(txtTotalCharges.getText());
            double add2 = Double.parseDouble(txtTotalPaid.getText());
            if (add2 > add1) {
                JOptionPane.showMessageDialog( this, "Total Paid is more than Total Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            Statement stmt = con.createStatement();
            String sql="Select BillNo from Bill_Room where BillNo=" + txtBillNo.getText() + "";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Record already exists", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            else {
                
                    Statement stmt3 = con.createStatement();
                    String sql3= "insert into Bill_Room(BillNo,PatientID,PatientName,Gender,BloodGroup,Disease,AdmitDate,RoomNo,DoctorID,DoctorName,DischargeDate,RoomCharges,NoOfDays,TotalRoomCharges,ServiceCharges,BillingDate,PaymentMode,PaymentModeDetails,TotalCharges,ChargesPaid,DueCharges) values ("+txtBillNo.getText()+","+ PatientID.getText() + ",'"+ txtPatientName.getText() + "','"+ txtGender.getText() + "','"+ txtBloodGroup.getText() + "','"+ txtDisease.getText() + "','"+ txtAdmitDate.getText() + "',"+ txtRoomNo.getText() + ","+ txtDoctorID.getText() + ",'"+ txtDoctorName.getText() + "','"+ txtDischargeDate.getText() + "',"+ txtRoomCharges.getText() + ","+ txtNoOfDays.getText() + "," + txtTotalRoomCharges.getText() +","+ txtServiceCharges.getText() + ",'"+ txtBillingDate.getText() + "','" + cmbPaymentMode.getSelectedItem()+ "','" + txtPaymentModeDetails.getText() + "',"+ txtTotalPaid.getText() + ","+ txtTotalCharges.getText() +","+ txtDueCharges.getText() + ");";
                    int rowsEffected3 = stmt3.executeUpdate(sql3);
                    JOptionPane.showMessageDialog(this, "Data Successfully Saved", "Bill Room Record", JOptionPane.INFORMATION_MESSAGE);
                    stmt3.close();
                    
                }

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
        Search_Bill_Room frm = new Search_Bill_Room();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void btnNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew2ActionPerformed
        this.dispose();
        PatientDischarge_RoomRecord1 frm = new PatientDischarge_RoomRecord1();
        frm.setVisible(true);
    }//GEN-LAST:event_btnNew2ActionPerformed

    private void txtNoOfDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfDaysActionPerformed
        double add1 = Double.parseDouble(txtRoomCharges.getText());
        double add = Double.parseDouble(txtNoOfDays.getText());
        double add2= add * add1;
        String add3= Double.toString(add2);
        txtTotalRoomCharges.setText(add3);
        double add4=Double.parseDouble(txtTotalRoomCharges.getText());
        double add5 = Double.parseDouble(txtServiceCharges.getText());
        double add6= add4 + add5;
        String add7= Double.toString(add6);
        txtTotalCharges.setText(add7);
    }//GEN-LAST:event_txtNoOfDaysActionPerformed

    private void txtNoOfDaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfDaysKeyTyped
        String s=txtNoOfDays.getText();
        if(s.length()==15){
            getToolkit().beep();
            evt.consume();
        }
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoOfDaysKeyTyped

    private void txtBillingDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillingDateKeyTyped
        String s=txtBillingDate.getText();
        if(s.length()==10){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBillingDateKeyTyped

    private void txtPaymentModeDetailsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentModeDetailsKeyTyped
        String s=txtPaymentModeDetails.getText();
        if(s.length()==25){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPaymentModeDetailsKeyTyped

    private void txtTotalPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPaidActionPerformed
        double add1 = Double.parseDouble(txtTotalCharges.getText());
        double add = Double.parseDouble(txtTotalPaid.getText());
        double add2= add1 - add;
        String add3= Double.toString(add2);
        txtDueCharges.setText(add3);
    }//GEN-LAST:event_txtTotalPaidActionPerformed

    private void txtTotalPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPaidKeyTyped
        String s=txtTotalPaid.getText();
        if(s.length()==10){
            getToolkit().beep();
            evt.consume();
        }
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalPaidKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql="select PatientID , PatientName,sum(serviceCharges) as 'ServiceCharges' from Services  group by PatientID,PatientName having PatientID = '" + table_click + "' order by PatientID";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String add1 = rs.getString("ServiceCharges");
                txtServiceCharges.setText(add1);
            }
            con.close();
            st.close();
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ADD;
    public static javax.swing.JButton Back;
    public static javax.swing.JButton Del;
    public static javax.swing.JButton GetData;
    public static javax.swing.JButton New;
    public static javax.swing.JTextField PatientID;
    private javax.swing.JButton Search;
    public static javax.swing.JButton Upd;
    public static javax.swing.JButton btnNew2;
    public static javax.swing.JComboBox cmbPaymentMode;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JFormattedTextField txtAdmitDate;
    public static javax.swing.JTextField txtBillNo;
    public static javax.swing.JFormattedTextField txtBillingDate;
    public static javax.swing.JTextField txtBloodGroup;
    public static javax.swing.JFormattedTextField txtDischargeDate;
    public static javax.swing.JTextField txtDisease;
    public static javax.swing.JTextField txtDoctorID;
    public static javax.swing.JTextField txtDoctorName;
    public static javax.swing.JTextField txtDueCharges;
    public static javax.swing.JTextField txtGender;
    public static javax.swing.JTextField txtNoOfDays;
    public static javax.swing.JTextField txtPatientName;
    public static javax.swing.JTextField txtPaymentModeDetails;
    public static javax.swing.JTextField txtRoomCharges;
    public static javax.swing.JTextField txtRoomNo;
    public static javax.swing.JTextField txtServiceCharges;
    public static javax.swing.JTextField txtTotalCharges;
    public static javax.swing.JTextField txtTotalPaid;
    public static javax.swing.JTextField txtTotalRoomCharges;
    // End of variables declaration//GEN-END:variables
}
