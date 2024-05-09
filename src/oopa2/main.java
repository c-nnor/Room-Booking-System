package oopa2;


public class main {
    public static void main(String[] args) {
       // Set the look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Create and show the splash screen
        splashscreen sp = new splashscreen();
        sp.setVisible(true);
        sp.startLoading(); // Call the loading method
        

        
        
    }
}