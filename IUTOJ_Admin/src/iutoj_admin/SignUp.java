/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iutoj_admin;

import com.sun.prism.paint.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author KAWSAR
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SignUp() {
        initComponents();
        txtStudentID.setFocusable(true);
    
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        RightPanel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        SignUpButton = new javax.swing.JButton();
        AlreadyAccButton = new javax.swing.JButton();
        leftSeparator = new javax.swing.JSeparator();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        StudentIDLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(0, 181, 204));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IUTLogo.png"))); // NOI18N
        logoLabel.setText("jLabel1");
        LeftPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 250, 420));

        getContentPane().add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 560));

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 38)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(0, 181, 204));
        WelcomeLabel.setText("Sign up As An Admin");
        RightPanel.add(WelcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 400, 70));

        closeLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(0, 181, 204));
        closeLabel.setText("x");
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        RightPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 20));

        minimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(0, 181, 204));
        minimizeLabel.setText("_");
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        RightPanel.add(minimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 30, 40));

        txtStudentID.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        txtStudentID.setForeground(new java.awt.Color(102, 102, 102));
        txtStudentID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtStudentID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStudentIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStudentIDFocusLost(evt);
            }
        });
        txtStudentID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtStudentIDMouseReleased(evt);
            }
        });
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        RightPanel.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 270, 50));

        SignUpButton.setBackground(new java.awt.Color(0, 181, 204));
        SignUpButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(0, 181, 204));
        SignUpButton.setText("Sign Up");
        SignUpButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 181, 204)));
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        RightPanel.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 90, 40));

        AlreadyAccButton.setBackground(new java.awt.Color(0, 181, 204));
        AlreadyAccButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        AlreadyAccButton.setForeground(new java.awt.Color(0, 181, 204));
        AlreadyAccButton.setText("Already have an account?");
        AlreadyAccButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 181, 204)));
        AlreadyAccButton.setContentAreaFilled(false);
        AlreadyAccButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AlreadyAccButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AlreadyAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlreadyAccButtonButtonActionPerformed(evt);
            }
        });
        RightPanel.add(AlreadyAccButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 270, 40));
        RightPanel.add(leftSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 390, 20));

        ConfirmPasswordField.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        ConfirmPasswordField.setForeground(new java.awt.Color(102, 102, 102));
        ConfirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ConfirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordFieldActionPerformed(evt);
            }
        });
        RightPanel.add(ConfirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 200, 30));

        ConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(0, 181, 204));
        ConfirmPasswordLabel.setText("Confirm Password");
        RightPanel.add(ConfirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 180, 30));

        StudentIDLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        StudentIDLabel.setForeground(new java.awt.Color(0, 181, 204));
        StudentIDLabel.setText("Username");
        RightPanel.add(StudentIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, 30));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 181, 204));
        PasswordLabel.setText("Password");
        RightPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, 30));

        PasswordField.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(102, 102, 102));
        PasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        RightPanel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 237, 270, 30));

        getContentPane().add(RightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 530, 560));

        setSize(new java.awt.Dimension(954, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void AlreadyAccButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlreadyAccButtonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlreadyAccButtonButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_closeLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);      // TODO add your handling code here:
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void txtStudentIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStudentIDFocusGained
        if(txtStudentID.getText().equals("Enter Student ID")) 
        {
            txtStudentID.setText("");
        }
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDFocusGained

    private void txtStudentIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStudentIDFocusLost
        if(txtStudentID.getText().equals("")) 
        {
            txtStudentID.setText("Enter Student ID");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDFocusLost

    private void txtStudentIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStudentIDMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDMouseReleased

    private void ConfirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlreadyAccButton;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel StudentIDLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JSeparator leftSeparator;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
