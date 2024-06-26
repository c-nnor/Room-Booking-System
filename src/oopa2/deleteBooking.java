/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopa2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class deleteBooking extends javax.swing.JFrame {

    /**
     * Creates new form deleteBooking
     */
    public deleteBooking() {
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

        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtBookingId = new javax.swing.JTextField();
        lblBookingId = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Booking");
        setMaximumSize(new java.awt.Dimension(600, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText(" ← Back  ");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 60, 20));

        btnSearch.setText("Delete");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 137, 110, 30));
        getContentPane().add(txtBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, -1));

        lblBookingId.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblBookingId.setForeground(new java.awt.Color(255, 255, 255));
        lblBookingId.setText(" Entre Booking ID:");
        getContentPane().add(lblBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("⏏ Exit ");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/600 x 300 bg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Button allows users to navigate to previous menu
        this.setVisible(false);
        bookingMenu m = new bookingMenu();
        m.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String bookingIdTxt = txtBookingId.getText(); // gets the bookingId input
        try {
            int bookingId = Integer.parseInt(bookingIdTxt);
            int index = -1; // initalise the index at -1
            for (int i = 0; i < AppLib.bookingLst.size(); i++) {
                // loops through the list, finds the booking id and index of the object in the list
                if (AppLib.bookingLst.get(i).getBookingId() == bookingId) {
                    index = i;
                    break;
                }
            }
            // confirmation for deleting the booking from the list
            if (index != -1) {
                int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this booking?", "Alert", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    AppLib.bookingLst.remove(index);
                    JOptionPane.showConfirmDialog(rootPane, "Booking " + bookingId + " has been removed.");
                } else if (option == JOptionPane.NO_OPTION) {
                    // if user enters no in the confirmation, cancelation message prompted
                    JOptionPane.showMessageDialog(rootPane, "Okay, deletion process terminated", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                // else if the booking id not found, error message prompted
                JOptionPane.showMessageDialog(rootPane, "Booking with ID " + bookingId + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            // exception handling for incorrect values entered
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please enter a valid numeric value for the Booking ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Button method to exit the program
        // Option to confirm action
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to exit?", "Alert", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Okay, exit  terminated", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(deleteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBookingId;
    private javax.swing.JTextField txtBookingId;
    // End of variables declaration//GEN-END:variables
}
