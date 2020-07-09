
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.setBackground(new java.awt.Color(51, 51, 51));
        txtUserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtUserName.setForeground(java.awt.Color.cyan);
        txtUserName.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 54, 139, 31));

        btnExit.setBackground(new java.awt.Color(51, 153, 255));
        btnExit.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 137, 90, 34));

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 255, 255));
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 95, 139, 31));

        btnSignIn.setBackground(new java.awt.Color(51, 153, 255));
        btnSignIn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 134, 143, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPhoto.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 230));

        setSize(new java.awt.Dimension(450, 230));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
      try
        {
            if (txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog( this, "Please Enter UserName","Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        String Password= String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {
            JOptionPane.showMessageDialog( this, "Please Enter Password","Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        if (Password.length()< 8) {
            JOptionPane.showMessageDialog( this, "Please Enter Password more than 8 Character !","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","mysql");
            String SQL = "select * from Users where UserName= '" + txtUserName.getText() + "' and Password ='" + Password+ "'";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(SQL);
            if (rs.next()){
                MainMenu frm=new MainMenu();
                frm.setVisible(true);
                frm.username.setText(txtUserName.getText());
                frm.UN=(txtUserName.getText());
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
                txtUserName.setForeground(Color.CYAN);
                txtPassword.setForeground(Color.CYAN);
                txtUserName.setText("");
                txtPassword.setText("");
                txtUserName.requestDefaultFocus();
            }
            con.close();
            st.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);

        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
    if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        btnSignIn.doClick();
     }        
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
