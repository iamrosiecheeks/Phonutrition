/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrition;

import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {
    
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static Statement s = null;

   
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        currentDate();
        unamelabel.setVisible(false);
        passlabel.setVisible(false);
    }

    
     public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
       // txt_date.setText((month+1)+"/"+day+"/"+year);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemclosebutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        systemclosebutton1 = new javax.swing.JButton();
        usernametxt = new javax.swing.JTextField();
        loginbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JPasswordField();
        unamelabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();

        systemclosebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png"))); // NOI18N
        systemclosebutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        systemclosebutton.setBorderPainted(false);
        systemclosebutton.setContentAreaFilled(false);
        systemclosebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        systemclosebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemclosebuttonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));
        setName("LOGIN"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 254, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 18, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 254, 247));
        jLabel1.setText("LOGin");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        systemclosebutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png"))); // NOI18N
        systemclosebutton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        systemclosebutton1.setBorderPainted(false);
        systemclosebutton1.setContentAreaFilled(false);
        systemclosebutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        systemclosebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemclosebutton1ActionPerformed(evt);
            }
        });
        jPanel3.add(systemclosebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        usernametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 50)));
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 270, 40));

        loginbutton.setBackground(new java.awt.Color(0, 18, 50));
        loginbutton.setForeground(new java.awt.Color(0, 18, 50));
        loginbutton.setText("Login");
        loginbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginbutton.setContentAreaFilled(false);
        loginbutton.setDefaultCapable(false);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 270, 40));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        passwordtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 18, 50)));
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 270, 40));

        unamelabel.setForeground(new java.awt.Color(255, 0, 0));
        unamelabel.setText("jLabel4");
        unamelabel.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(unamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 270, -1));

        passlabel.setForeground(new java.awt.Color(204, 0, 0));
        passlabel.setText("jLabel4");
        jPanel1.add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void systemclosebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemclosebuttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_systemclosebuttonActionPerformed

    private void systemclosebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemclosebutton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_systemclosebutton1ActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
  
        // TODO add your handling code here:
        
     
    try{
           if (usernametxt.getText().isEmpty() && passwordtxt.getText().length()==0 || usernametxt.getText().isEmpty() ||  passwordtxt.getText().length()==0)
           {  
               if(usernametxt.getText().isEmpty())
               {     
                   unamelabel.setVisible(true);
                   unamelabel.setText("Enter your username!");
                   usernametxt.setText("");
               }
               
               else if(!usernametxt.getText().isEmpty())
               { unamelabel.setVisible(false);}
               
               if(passwordtxt.getText().length()==0)
               {
               passlabel.setVisible(true);
               passlabel.setText("Enter your password!");
               passwordtxt.setText("");
              
               }
               
               else if(passwordtxt.getText().length()!=0)
               {passlabel.setVisible(false);}
            }
            
           
           else
           {
             login();  
              unamelabel.setVisible(false);
              passlabel.setVisible(false);
           }
     
     }catch(Exception e)
     
     {JOptionPane.showMessageDialog(null,e);}
 
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    /**
     * @param args the command line arguments
     */
    
    void login()
    {
  
       classDbcon.dbconnect();
        try
         {
             String pass= passwordtxt.getText(); 
             s = classDbcon.conn.createStatement();
             rs = s.executeQuery("SELECT * FROM users WHERE username='" + usernametxt.getText() + "' AND password='" + pass  + "'");
             
             if(rs.next())
             {JOptionPane.showMessageDialog(null,"Welcome user!","Access Recognized",JOptionPane.INFORMATION_MESSAGE);           
             SaveLogs();
             mainform w = new mainform();
             w.setVisible(true);
             this.dispose();
             
             }
             
            
             else{
             JOptionPane.showMessageDialog(null,"Invalid username or password","Access Denied",JOptionPane.ERROR_MESSAGE);
               unamelabel.setVisible(true);
               unamelabel.setText("Enter your username!");
               passlabel.setVisible(true);
               passlabel.setText("Enter your password!");
               usernametxt.setText("");
               passwordtxt.setText("");
             }
             
             s.close();
         }catch(Exception e)
         {System.err.print(e);}
    
    
    }/*login verification*/
    
    public  void SaveLogs()
    {
    
    
    }//this will save the activities of the current user using the system
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel passlabel;
    private javax.swing.JPasswordField passwordtxt;
    public javax.swing.JButton systemclosebutton;
    public javax.swing.JButton systemclosebutton1;
    private javax.swing.JLabel unamelabel;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables

    
}


