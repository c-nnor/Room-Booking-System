/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopa2;

import java.awt.Color;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class addBooking extends javax.swing.JFrame {
// JFrame Class for users to add a booking
    private Random random = new Random();

    /**
     * Creates new form addBooking
     */
    public addBooking() {
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
        lblBookingId = new javax.swing.JLabel();
        lblRoomId = new javax.swing.JLabel();
        lblDateSlash1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtRoomId = new javax.swing.JTextField();
        txtBookingId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        lblContactPerson = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        comboTime = new javax.swing.JComboBox<>();
        txtContactPerson = new javax.swing.JTextField();
        btnAddBooking = new javax.swing.JButton();
        txtDateYear = new javax.swing.JTextField();
        txtDateMonth = new javax.swing.JTextField();
        txtDateDay = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblDateSlash2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Booking");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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

        lblBookingId.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblBookingId.setForeground(new java.awt.Color(255, 255, 255));
        lblBookingId.setText(" Booking ID:");
        getContentPane().add(lblBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        lblRoomId.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblRoomId.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomId.setText("Room ID:");
        getContentPane().add(lblRoomId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblDateSlash1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblDateSlash1.setForeground(new java.awt.Color(255, 255, 255));
        lblDateSlash1.setText("/");
        getContentPane().add(lblDateSlash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 210, 10, -1));

        lblTime.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time:");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        txtRoomId.setNextFocusableComponent(txtDateDay);
        getContentPane().add(txtRoomId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, -1));

        txtBookingId.setEditable(false);
        getContentPane().add(txtBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 200, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 30, 420));

        txtEmail.setNextFocusableComponent(txtPhone);
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 200, -1));

        lblContactPerson.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblContactPerson.setForeground(new java.awt.Color(255, 255, 255));
        lblContactPerson.setText("Full Name:");
        getContentPane().add(lblContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        lblPhone.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Phone No:");
        getContentPane().add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        lblEmail.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        txtPhone.setNextFocusableComponent(btnAddBooking);
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 200, -1));

        comboTime.setMaximumRowCount(7);
        comboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 11:00", "11:00 - 13:00", "13:00 - 15:00", "15:00 - 17:00", "09:00 - 13:00 (Morning)", "13:00 - 17:00 (Afternoon)", "09:00 - 17:00 (All day)" }));
        comboTime.setNextFocusableComponent(txtContactPerson);
        getContentPane().add(comboTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, -1));

        txtContactPerson.setNextFocusableComponent(txtEmail);
        getContentPane().add(txtContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 200, -1));

        btnAddBooking.setBackground(new java.awt.Color(242, 242, 242));
        btnAddBooking.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        btnAddBooking.setText("Add Booking");
        btnAddBooking.setBorder(null);
        btnAddBooking.setFocusable(false);
        btnAddBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookingActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 140, 60));

        txtDateYear.setForeground(new java.awt.Color(153, 153, 153));
        txtDateYear.setText("Year");
        txtDateYear.setNextFocusableComponent(comboTime);
        txtDateYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateYearFocusLost(evt);
            }
        });
        getContentPane().add(txtDateYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 50, -1));

        txtDateMonth.setForeground(new java.awt.Color(153, 153, 153));
        txtDateMonth.setText("Month");
        txtDateMonth.setNextFocusableComponent(txtDateYear);
        txtDateMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateMonthFocusLost(evt);
            }
        });
        txtDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateMonthActionPerformed(evt);
            }
        });
        getContentPane().add(txtDateMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 210, 50, -1));

        txtDateDay.setForeground(new java.awt.Color(153, 153, 153));
        txtDateDay.setText("Day");
        txtDateDay.setToolTipText("day");
        txtDateDay.setNextFocusableComponent(txtDateMonth);
        txtDateDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateDayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateDayFocusLost(evt);
            }
        });
        getContentPane().add(txtDateDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, -1));

        lblDate.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        lblDateSlash2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblDateSlash2.setForeground(new java.awt.Color(255, 255, 255));
        lblDateSlash2.setText("/");
        getContentPane().add(lblDateSlash2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 10, -1));

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

    private void btnAddBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookingActionPerformed
        try {
            // creating an instance of room & booking to access exception handling methods
            booking bookingObject = new booking();
            room roomObj = new room();
            
            // grabing text values and assigning them to variables
            int bookingId = Integer.valueOf(txtBookingId.getText());
            int year = Integer.parseInt(txtDateYear.getText());
            int month = Integer.parseInt(txtDateMonth.getText());
            int day = Integer.parseInt(txtDateDay.getText());
            String roomId = txtRoomId.getText();
            String date = String.format("%02d/%02d/%d", day, month, year); // Format the date with zeros for month and day
            String time = comboTime.getSelectedItem().toString();
            String contactPerson = txtContactPerson.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
           

            // Check if the room ID entered exists in the list
            if (!roomObj.isValidRoom(roomId)) {
                JOptionPane.showMessageDialog(rootPane, "Room with ID " + roomId + " does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the room ID does not exist
            }

            // Check if the email is valid (contains '@' and is more than 5 characters long)
            if (!email.contains("@") && email.length() < 5) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the email is not valid
            }

            // Check if there is already a booking for the same room, date, and time period, to prevent a booking conflict
            if (bookingObject.isBookingConflict(roomId, date, time)) {
                JOptionPane.showMessageDialog(rootPane, "There is already a booking for Room " + roomId + " at " + time + " on " + date + ".", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if there is a booking conflict
            }
            
            // Check if the entered name only contains valid characters and is long enough to be a valid name
            if (!contactPerson.matches("[a-zA-Z ]+") || contactPerson.length() < 5) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a valid Full Name.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exits the method 
            }

            // Check if the phone number contains only digits
            if (!phone.matches("[0-9+]+")) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a valid phone number containing only digits or area codes", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the phone number is not valid
            }
            
            // date input exception handling
            if (!date.matches("[0-9/]+")) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a valid date", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the date is not valid
            }
            
            // checks the year isnt a previous year
            if (year < 2024) {
                JOptionPane.showMessageDialog(rootPane, "Entered date must be current or future", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the date is not valid
            }
            // checks that the booking isnt being created too far in advance
            if (year > 2026) {
                JOptionPane.showMessageDialog(rootPane, "Room bookings can only be made for 2 years or less in advance ", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the date is not valid
            }
            // checks for valid date input
            if (month > 12) {
                JOptionPane.showMessageDialog(rootPane, "Month entered cannot exeed 12", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the date is not valid
            }
            if (day > 31) {
                JOptionPane.showMessageDialog(rootPane, "Day entered cannot exeed the amount of days in a month", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the date is not valid
            }
            
            // booking object is created, text fields filled and passed into the Booking List to access elsewhere
            booking bookingObj = new booking(bookingId, roomId, date, time, contactPerson, email, phone);
            AppLib.bookingLst.add(bookingObj);

            // Success message prompted with the choice to continue or return to menu
            int option = JOptionPane.showConfirmDialog(rootPane, "Booking Successful! Do you want to add another booking?", "Success", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                // If user chooses to add another room, clear the fields for adding another room
                txtBookingId.setText(generateBookingId());
                txtRoomId.setText("");
                txtDateDay.setText("Day");
                txtDateDay.setForeground(new Color(153, 153, 153));
                txtDateMonth.setText("Month");
                txtDateMonth.setForeground(new Color(153, 153, 153));
                txtDateYear.setText("Year");
                txtDateYear.setForeground(new Color(153, 153, 153));
                txtEmail.setText("");
                txtContactPerson.setText("");
                txtPhone.setText("");
            } else {
                // If user chooses not to add another room, navigate back to the previous menu
                this.setVisible(false);
                bookingMenu bm = new bookingMenu();
                bm.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddBookingActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Generate a random booking ID
        String bookingId = generateBookingId();

        // Set the generated booking ID in the text field
        txtBookingId.setText(bookingId);
    }//GEN-LAST:event_formWindowOpened

    private void txtDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateMonthActionPerformed

    private void txtDateDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateDayFocusGained
        // whilst user clicks on the day text field, the hint text gets removed
        if (txtDateDay.getText().contains("Day")) {
            txtDateDay.setText("");
            txtDateDay.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDateDayFocusGained

    private void txtDateDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateDayFocusLost
        // if the user moves on from the textfield, the text goes back to the hint text if unchanged
        if (txtDateDay.getText().equals("")) {
            txtDateDay.setText("Day");
            txtDateDay.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDateDayFocusLost

    private void txtDateMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateMonthFocusGained
        // whilst user clicks on the month text field, the hint text gets removed
        if (txtDateMonth.getText().contains("Month")) {
            txtDateMonth.setText("");
            txtDateMonth.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDateMonthFocusGained

    private void txtDateMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateMonthFocusLost
        // if the user moves on from the textfield, the text goes back to the hint text if unchanged
        if (txtDateMonth.getText().equals("")) {
            txtDateMonth.setText("Month");
            txtDateMonth.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDateMonthFocusLost

    private void txtDateYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateYearFocusGained
        // whilst user clicks on the year text field, the hint text gets removed
        if (txtDateYear.getText().contains("Year")) {
            txtDateYear.setText("");
            txtDateYear.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDateYearFocusGained

    private void txtDateYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateYearFocusLost
        // if the user moves on from the textfield, the text goes back to the hint text if unchanged
        if (txtDateYear.getText().equals("")) {
            txtDateYear.setText("Year");
            txtDateYear.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDateYearFocusLost

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

    // Method to generate a random booking ID
    private String generateBookingId() {
        // Generate a random number 

        int randomId = random.nextInt(9000) + 1000;

        // Convert the random number to a string
        return Integer.toString(randomId);
    }

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
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage;
    private javax.swing.JButton btnAddBooking;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> comboTime;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBookingId;
    private javax.swing.JLabel lblContactPerson;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateSlash1;
    private javax.swing.JLabel lblDateSlash2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRoomId;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtBookingId;
    private javax.swing.JTextField txtContactPerson;
    private javax.swing.JTextField txtDateDay;
    private javax.swing.JTextField txtDateMonth;
    private javax.swing.JTextField txtDateYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRoomId;
    // End of variables declaration//GEN-END:variables
}
