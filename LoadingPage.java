/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.BookIs.view;
import javax.swing.Timer;
/**
 *
 * @author ajita
 */
public class LoadingPage extends javax.swing.JFrame {

    /**
     * Creates new form LoadingPage
     */
    public LoadingPage() {
        initComponents();
        simulateLoading();
    }
    

 private void simulateLoading() {
        // Create a Timer that will update the progress bar every 50 milliseconds
        Timer timer = new Timer(50, e -> {
            int currentProgress = progressbar.getValue();
            if (currentProgress < 100) {
                progressbar.setValue(currentProgress + 1); // Increase progress by 1
            } else {
                // Hide the LoadingPage and show LoginPage once the progress reaches 100
                ((Timer) e.getSource()).stop();  // Stop the timer
                setVisible(false);  // Hide the loading page
                new LoginPage().setVisible(true);  // Show the login page
            }
        });
        
        
        // Start the timer
        timer.start();
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        lblHeadingwelcome = new javax.swing.JLabel();
        lblPleasewait = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        lblLogo = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        pnlMainScreen.setBackground(new java.awt.Color(153, 153, 255));

        lblHeadingwelcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHeadingwelcome.setText("WELCOME TO KAFKAKLUB, A LITERAL HEAVEN FOR BOOK ENTHUSIASTS!");

        lblPleasewait.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPleasewait.setText("PLEASE WAIT..........");

        progressbar.setBackground(new java.awt.Color(153, 0, 0));
        progressbar.setForeground(new java.awt.Color(153, 0, 0));

        lblLogo.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        lblLogo.setText("kafkaklub");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookis/resources/LoadingPageimg.png"))); // NOI18N
        lblImage.setText("jLabel5");

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainScreenLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeadingwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainScreenLayout.createSequentialGroup()
                            .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPleasewait))
                            .addGap(447, 447, 447))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainScreenLayout.createSequentialGroup()
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(257, 257, 257)))))
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addGroup(pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainScreenLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblHeadingwelcome))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImage)
                .addGap(40, 40, 40)
                .addComponent(lblPleasewait, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(pnlMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblHeadingwelcome;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPleasewait;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables
}
