/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopa2;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class viewBooking extends javax.swing.JFrame {
// JFrame class for viewing bookings
    
    /**
     * Creates new form viewBooking
     */
    public viewBooking() {
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

        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContactPerson = new javax.swing.JTextField();
        lblContactPerson = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtRoomId = new javax.swing.JTextField();
        lblRoomId = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtBookingId = new javax.swing.JTextField();
        lblBookingId = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Booking");
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPhone.setEditable(false);
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 200, -1));

        lblPhone.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Phone No:");
        getContentPane().add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        lblEmail.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        txtEmail.setEditable(false);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 200, -1));

        txtContactPerson.setEditable(false);
        getContentPane().add(txtContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 200, -1));

        lblContactPerson.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblContactPerson.setForeground(new java.awt.Color(255, 255, 255));
        lblContactPerson.setText("Full Name:");
        getContentPane().add(lblContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        lblTime.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time:");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        lblDate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        txtTime.setEditable(false);
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 200, -1));

        txtRoomId.setEditable(false);
        getContentPane().add(txtRoomId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 200, -1));

        lblRoomId.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblRoomId.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomId.setText("Room ID:");
        getContentPane().add(lblRoomId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

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
        getContentPane().add(txtBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 120, -1));

        lblBookingId.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblBookingId.setForeground(new java.awt.Color(255, 255, 255));
        lblBookingId.setText(" Enter Booking ID:");
        getContentPane().add(lblBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtDate.setEditable(false);
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 163, 790, 10));

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

        bgimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pg bg.png"))); // NOI18N
        bgimage.setText("jLabel1");
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

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
        // Get the text entered in the room ID text field
        String bookingIdTxt = txtBookingId.getText();

        // Check if the text field is empty
        if (bookingIdTxt.isEmpty()) {
            clearFields(); // clears fields incase there are some filled from a previous succesful search
            // error message prompt
            JOptionPane.showMessageDialog(rootPane, "Booking ID Entry is empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }

        // Convert the booking ID text to an integer
        int bookingId;
        try {
            bookingId = Integer.parseInt(bookingIdTxt);
        } catch (NumberFormatException e) {
            // if the booking id cannot be converted to int, error prompted
            clearFields();
            txtBookingId.setText("");
            JOptionPane.showMessageDialog(rootPane, "Invalid booking ID format: " + bookingIdTxt, "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }

        boolean bookingFound = false; // track if booking is found

        // for loop to find the booking in the list
        for (booking obj : AppLib.bookingLst) {
            if (obj.getBookingId() == bookingId) {
                // Populate the fields with the booking details
                txtRoomId.setText(obj.getRoomId());
                txtDate.setText(obj.getDate());
                txtTime.setText(obj.getTime());
                txtContactPerson.setText(obj.getContactPerson());
                txtEmail.setText(obj.getContactEmail());
                txtPhone.setText(String.valueOf(obj.getContactPhone()));

                bookingFound = true; // value changed to true
                break; // Exit loop once booking is found
            }
        }

        // Error message if booking is not found
        if (!bookingFound) {
            clearFields();
            txtBookingId.setText("");
            JOptionPane.showMessageDialog(rootPane, "Booking ID not found: " + bookingId, "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewBooking().setVisible(true);
            }
        });
    }

    // method that clears fields from previous searches
    public void clearFields() {
        txtRoomId.setText("");
        txtDate.setText("");
        txtTime.setText("");
        txtContactPerson.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBookingId;
    private javax.swing.JLabel lblContactPerson;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRoomId;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtBookingId;
    private javax.swing.JTextField txtContactPerson;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRoomId;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
