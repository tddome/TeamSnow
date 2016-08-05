/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamsnow;

/**
 *
 * @author Troy
 */

public class QuarterProject245 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public QuarterProject245() {
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

      SplashPage = new javax.swing.JPanel();
      ProjectTitle = new javax.swing.JLabel();
      TeamName = new javax.swing.JLabel();
      MainMenu = new javax.swing.JPanel();
      PlayButton = new javax.swing.JButton();
      HighScoresButton = new javax.swing.JButton();
      CreditsButton = new javax.swing.JButton();
      TeamLogo = new javax.swing.JLabel();
      CreditsMenu = new javax.swing.JPanel();
      jButton1 = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      HighScoresMenu = new javax.swing.JPanel();
      jButton2 = new javax.swing.JButton();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      PlayMenu = new javax.swing.JPanel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setAutoRequestFocus(false);
      setBackground(new java.awt.Color(255, 255, 255));
      setPreferredSize(new java.awt.Dimension(600, 400));
      getContentPane().setLayout(new java.awt.CardLayout());

      ProjectTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
      ProjectTitle.setText("   CS 245 Project: Summer 2016");

      TeamName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      TeamName.setText("By: Team Snow");

      javax.swing.GroupLayout SplashPageLayout = new javax.swing.GroupLayout(SplashPage);
      SplashPage.setLayout(SplashPageLayout);
      SplashPageLayout.setHorizontalGroup(
         SplashPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(SplashPageLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(ProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
         .addGroup(SplashPageLayout.createSequentialGroup()
            .addGap(229, 229, 229)
            .addComponent(TeamName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(232, 232, 232))
      );
      SplashPageLayout.setVerticalGroup(
         SplashPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(SplashPageLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(ProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
            .addGap(78, 78, 78)
            .addComponent(TeamName, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
            .addGap(110, 110, 110))
      );

      getContentPane().add(SplashPage, "card0");

      PlayButton.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
      PlayButton.setText("Play");
      PlayButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            PlayButtonActionPerformed(evt);
         }
      });

      HighScoresButton.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
      HighScoresButton.setText("High Scores");
      HighScoresButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            HighScoresButtonActionPerformed(evt);
         }
      });

      CreditsButton.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
      CreditsButton.setText("Credits");
      CreditsButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            CreditsButtonActionPerformed(evt);
         }
      });

      TeamLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/teamlogo.png"))); // NOI18N
      TeamLogo.setText("jLabel1");

      javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
      MainMenu.setLayout(MainMenuLayout);
      MainMenuLayout.setHorizontalGroup(
         MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(MainMenuLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                  .addComponent(TeamLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                  .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(HighScoresButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(CreditsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
      );
      MainMenuLayout.setVerticalGroup(
         MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(MainMenuLayout.createSequentialGroup()
            .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(MainMenuLayout.createSequentialGroup()
                  .addGap(241, 241, 241)
                  .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(MainMenuLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(TeamLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(HighScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CreditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      getContentPane().add(MainMenu, "card1");

      jButton1.setText("Back");

      jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
      jLabel1.setText("CREDITS");

      jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel2.setText("Troy Dome, 009572849");

      jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel3.setText("Daniel");

      javax.swing.GroupLayout CreditsMenuLayout = new javax.swing.GroupLayout(CreditsMenu);
      CreditsMenu.setLayout(CreditsMenuLayout);
      CreditsMenuLayout.setHorizontalGroup(
         CreditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(CreditsMenuLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jButton1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreditsMenuLayout.createSequentialGroup()
            .addGap(0, 236, Short.MAX_VALUE)
            .addGroup(CreditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addGap(206, 206, 206))
      );
      CreditsMenuLayout.setVerticalGroup(
         CreditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(CreditsMenuLayout.createSequentialGroup()
            .addGap(84, 84, 84)
            .addComponent(jLabel1)
            .addGap(42, 42, 42)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
            .addComponent(jButton1)
            .addContainerGap())
      );

      getContentPane().add(CreditsMenu, "card2");

      jButton2.setText("Back");

      jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
      jLabel4.setText("HIGH SCORES");

      jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      jLabel5.setText("Implementing Soon...");

      javax.swing.GroupLayout HighScoresMenuLayout = new javax.swing.GroupLayout(HighScoresMenu);
      HighScoresMenu.setLayout(HighScoresMenuLayout);
      HighScoresMenuLayout.setHorizontalGroup(
         HighScoresMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HighScoresMenuLayout.createSequentialGroup()
            .addGroup(HighScoresMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(HighScoresMenuLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jButton2))
               .addGroup(HighScoresMenuLayout.createSequentialGroup()
                  .addGap(171, 171, 171)
                  .addGroup(HighScoresMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel4))))
            .addContainerGap(178, Short.MAX_VALUE))
      );
      HighScoresMenuLayout.setVerticalGroup(
         HighScoresMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(HighScoresMenuLayout.createSequentialGroup()
            .addGap(88, 88, 88)
            .addComponent(jLabel4)
            .addGap(34, 34, 34)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addContainerGap())
      );

      getContentPane().add(HighScoresMenu, "card3");

      javax.swing.GroupLayout PlayMenuLayout = new javax.swing.GroupLayout(PlayMenu);
      PlayMenu.setLayout(PlayMenuLayout);
      PlayMenuLayout.setHorizontalGroup(
         PlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 600, Short.MAX_VALUE)
      );
      PlayMenuLayout.setVerticalGroup(
         PlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 409, Short.MAX_VALUE)
      );

      getContentPane().add(PlayMenu, "card4");

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
      // TODO add your handling code here:
      //Play
      
   }//GEN-LAST:event_PlayButtonActionPerformed

   private void HighScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighScoresButtonActionPerformed
      // TODO add your handling code here:
      //High scores
      
   }//GEN-LAST:event_HighScoresButtonActionPerformed

   private void CreditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsButtonActionPerformed
      // TODO add your handling code here:
      // Credits
      // Displays panel over main menu
      
   }//GEN-LAST:event_CreditsButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(QuarterProject245.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuarterProject245.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuarterProject245.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuarterProject245.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuarterProject245().setVisible(true);
            }
        });
    }
    
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton CreditsButton;
   private javax.swing.JPanel CreditsMenu;
   private javax.swing.JButton HighScoresButton;
   private javax.swing.JPanel HighScoresMenu;
   private javax.swing.JPanel MainMenu;
   private javax.swing.JButton PlayButton;
   private javax.swing.JPanel PlayMenu;
   private javax.swing.JLabel ProjectTitle;
   private javax.swing.JPanel SplashPage;
   private javax.swing.JLabel TeamLogo;
   private javax.swing.JLabel TeamName;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   // End of variables declaration//GEN-END:variables
}
