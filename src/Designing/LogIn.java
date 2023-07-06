
package Designing;

import db.DBConnection;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 60)); // NOI18N
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, -1, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 470, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel3.setText("User-Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 150, 50));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel4.setText("User-Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 100, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 130, 40));

        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "Faculty", "Student" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 240, 40));

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 240, 40));

        jPasswordField1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 240, 40));

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jButton1.setText("LogIn");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lbg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 990));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String utype = (String) jComboBox1.getSelectedItem();
            String uid = jTextField1.getText();
            String pswd = jPasswordField1.getText();
            if (utype.equals("") || uid.equals("") || pswd.equals("")) {
                JOptionPane.showMessageDialog(this, "Please Fill all the Field...");
                return;
            }

            DBConnection db = new DBConnection();
           
            db.pstmt = db.con.prepareStatement("select User from login where User=? and Pswd=? and Type=?");
            db.pstmt.setString(1, uid);
            db.pstmt.setString(2, pswd);
            db.pstmt.setString(3, utype);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                if (utype.equalsIgnoreCase("Student")) {
                    new Student(db.rst.getString(1)).setVisible(true);
                    this.setVisible(false);
                } else if (utype.equalsIgnoreCase("admin")) {
                    new Admin(db.rst.getString(1)).setVisible(true);
                    this.setVisible(false);
                } else if (utype.equalsIgnoreCase("faculty")) {
                    new Faculty(db.rst.getString(1)).setVisible(true);
                    this.setVisible(false);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter Correct details");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
