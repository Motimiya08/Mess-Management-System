
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author Fahim MuntasirAkib
 */
public class HomePage extends javax.swing.JFrame {
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        signup_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        email_take = new javax.swing.JTextField();
        password_take = new javax.swing.JPasswordField();
        email_lb = new javax.swing.JLabel();
        password_lb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 520));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(88, 24, 69));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("____________________________________________");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 30));

        signup_button.setBackground(new java.awt.Color(88, 24, 69));
        signup_button.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N
        signup_button.setForeground(new java.awt.Color(255, 255, 51));
        signup_button.setText("Sign Up");
        signup_button.setActionCommand("signup_button");
        signup_button.setBorder(null);
        signup_button.setContentAreaFilled(false);
        signup_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_buttonMouseClicked(evt);
            }
        });
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(signup_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 366, 70, 30));

        login_button.setBackground(new java.awt.Color(88, 24, 69));
        login_button.setFont(new java.awt.Font("Ekushey Durga", 1, 18)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-login-34.png")); // NOI18N
        login_button.setText("Log In");
        login_button.setActionCommand("login_button");
        login_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        login_button.setContentAreaFilled(false);
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 130, 30));

        email_take.setBackground(new java.awt.Color(88, 24, 69));
        email_take.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        email_take.setForeground(new java.awt.Color(255, 255, 255));
        email_take.setText("Enter Email here.");
        email_take.setBorder(null);
        email_take.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_takeActionPerformed(evt);
            }
        });
        jPanel1.add(email_take, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 210, 30));

        password_take.setBackground(new java.awt.Color(88, 24, 69));
        password_take.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        password_take.setForeground(new java.awt.Color(255, 255, 255));
        password_take.setText("pass");
        password_take.setBorder(null);
        jPanel1.add(password_take, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 30));

        email_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email_lb.setForeground(new java.awt.Color(255, 255, 255));
        email_lb.setText("Email");
        jPanel1.add(email_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 153, 41, 20));

        password_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_lb.setForeground(new java.awt.Color(255, 255, 255));
        password_lb.setText("Password");
        jPanel1.add(password_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 66, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("____________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8_Account_50px.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 50, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8_Secure_50px.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Do'nt have a account?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jPanel3.setBackground(new java.awt.Color(25, 111, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MESS MANAGER");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 24, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-homepage-38.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 70));

        jLabel8.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LOGIN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 100, 70, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 60, 450, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("==========");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\logo.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 101, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SignupFrame().setVisible(true);
    }//GEN-LAST:event_signup_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
     
        String user_email = email_take.getText();
        String user_password = String.valueOf(password_take.getText());
        String dbPassword="";
        
        String query = "select * from user_login where email = '"+user_email+"'";
        
        try{
            ResultSet rs = DBUTILS.queryExecute(query);
            if(rs.next()){
                dbPassword = rs.getString("password");
            }
        }catch(Exception e){
           // System.out.println("not connected");
        }
        
        if(dbPassword!="" && user_password.equals(dbPassword)){
            JOptionPane.showMessageDialog(this,"Login successful!");
            this.setVisible(false);
            new DashBoard().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this,"Login failed! \n Please try again. ");
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void email_takeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_takeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_takeActionPerformed

    private void signup_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_buttonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email_lb;
    private javax.swing.JTextField email_take;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel password_lb;
    private javax.swing.JPasswordField password_take;
    private javax.swing.JButton signup_button;
    // End of variables declaration//GEN-END:variables
}
