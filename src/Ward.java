import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Ward extends javax.swing.JFrame {

    public Ward() {
        initComponents();
    }
private void Reset()
{
    txtWardName.setText("");
    txtCharges.setText("");
    cmbWardType.setSelectedIndex(-1);
    txtNoOfbeds.setText("");
    ADD.setEnabled(true);
    Del.setEnabled(false);
    Upd.setEnabled(false);
    txtWardName.requestDefaultFocus();
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
        txtWardName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbWardType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtNoOfbeds = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCharges = new javax.swing.JTextField();
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
        jLabel4.setText("Ward Details");

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

        txtWardName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWardName.setForeground(new java.awt.Color(51, 153, 0));
        txtWardName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWardNameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("Ward Name");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setText("Ward Type");

        cmbWardType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbWardType.setForeground(new java.awt.Color(51, 153, 0));
        cmbWardType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Special" }));
        cmbWardType.setSelectedIndex(-1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("No. Of Beds");

        txtNoOfbeds.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNoOfbeds.setForeground(new java.awt.Color(51, 153, 0));
        txtNoOfbeds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoOfbedsKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("Charges per bed");

        txtCharges.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCharges.setForeground(new java.awt.Color(51, 153, 0));
        txtCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChargesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(19, 19, 19)
                        .addComponent(txtCharges))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWardName)
                            .addComponent(txtNoOfbeds)
                            .addComponent(cmbWardType, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(440, 440, 440))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbWardType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoOfbeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 1240, 150));

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
        Ward_Record frm= new Ward_Record();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetDataActionPerformed

    private void txtWardNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWardNameKeyTyped
        String s=txtWardName.getText();
        if(s.length()==15){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtWardNameKeyTyped

    private void txtNoOfbedsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfbedsKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
        String s=txtNoOfbeds.getText();
        if(s.length()==1){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoOfbedsKeyTyped

    private void txtChargesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChargesKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
        String s=txtCharges.getText();
        if(s.length()==10){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtChargesKeyTyped

    private void UpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdActionPerformed
        try{
            if (txtWardName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Ward Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardType.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Select Ward Type","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfbeds.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter No. of Beds","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String sql= "update Ward set Wardtype='"+ cmbWardType.getSelectedItem() + "',NoOfBeds=" + txtNoOfbeds.getText() + ",Charges=" + txtCharges.getText() + " where Wardname='" + txtWardName.getText() + "'";
            Statement st = con.createStatement();
            int rowsEffected = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Data Successfully Updated","Ward Record",JOptionPane.INFORMATION_MESSAGE);
            Reset();
            con.close();
            st.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_UpdActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try
        {
            int P = JOptionPane.showConfirmDialog(this," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
                String sql= "delete from ward where wardname = '" + txtWardName.getText() + "'";
                Statement st = con.createStatement();
                int rowsEffected1= st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this,"Data Successfully Deleted","Ward Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();
                con.close();
                st.close();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_DelActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try{
            if (txtWardName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Ward Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardType.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Select Ward Type","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfbeds.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter No. of Beds","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            Statement stmt=con.createStatement();
            String sql1="Select Wardname from ward where wardname= '" + txtWardName.getText() + "'";
            ResultSet rs=stmt.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Ward Name already exists","Error", JOptionPane.ERROR_MESSAGE);
                txtWardName.setText("");
                txtWardName.requestDefaultFocus();
                return;
            }
            else{
                String Name = txtWardName.getText();
                String Wtype =(String) cmbWardType.getSelectedItem();
                int bed = Integer.parseInt(txtNoOfbeds.getText());
                int charge = Integer.parseInt(txtCharges.getText());
                String sSQL = "INSERT INTO ward(Wardname,wardType,NoOfBeds,Charges) VALUES ('"+(Name)+"', '"+(Wtype)+"', "+(bed)+", "+(charge)+")";
                int rowsEffected = stmt.executeUpdate(sSQL);
                JOptionPane.showMessageDialog(this,"Data Successfully Saved","Ward Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();
                ADD.setEnabled(false);
                con.close();
                stmt.close();
                rs.close();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        Reset();
    }//GEN-LAST:event_NewActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        Search_Ward frm= new Search_Ward();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ward().setVisible(true);
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
    public javax.swing.JComboBox cmbWardType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtCharges;
    public javax.swing.JTextField txtNoOfbeds;
    public javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables
}
