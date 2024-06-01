/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_assignment1;
import java.io.*;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author themi
 */
public class Board extends javax.swing.JFrame {
    private static String bestPlayer = "";
    private static int bestTime = Integer.MAX_VALUE;
    
    /**
     * Creates new form Board
     */
    public Board() {
        
        initComponents();

    }

 
    
   /*
    public void ranks(){
        List<LeaderboardManager.LeaderboardNum> entries = leaderboardManager.getLeaderboardNum();
        for (LeaderboardManager.LeaderboardNum entry : entries) {
             space.setText(entry.getName() + ": " + entry.getTotalTimeInSeconds() + " seconds.\n");
        }
        
 
        
    }*/
        public static void NewSong() {
            System.out.println("stopping");
        OOP_Assignment1.StopMusic();
        OOP_Assignment1.PlayMusic("wav/SCNB3LA-winning.wav");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        space = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        space2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 725));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You Won !!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 240, 270, 80);

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jButton1.setText("Next");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(690, 640, 140, 40);

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Congratulations!!!!!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 190, 430, 60);

        jButton2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton2.setText("check best player");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 310, 150, 40);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("All Players:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 430, 130, 40);

        space.setEditable(false);
        space.setBackground(new java.awt.Color(231, 242, 246));
        space.setColumns(20);
        space.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        space.setRows(1);
        space.setTabSize(7);
        space.setText("Best Time in Seconds:\nBest Player Name:");
        jScrollPane2.setViewportView(space);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(450, 360, 380, 70);

        space2.setEditable(false);
        space2.setBackground(new java.awt.Color(231, 242, 246));
        space2.setColumns(10);
        space2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        space2.setRows(400);
        space2.setWrapStyleWord(true);
        jScrollPane1.setViewportView(space2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 460, 380, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/congratz2.jpeg"))); // NOI18N
        jLabel1.setText("p7B");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Again a = new Again();
             
             a.show();
             
                     space.setText("  ");
                     
                     
    OOP_Assignment1.StopMusic();
    
    OOP_Assignment1.PlayMusic("wav/no_copyright_music_cute_background_music_funny_Pick!!128k.wav");

                                 dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
  

  
    // read from the file
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\themi\\Documents\\NetBeansProjects\\OOP_Assignment1\\t1.txt"))) {
        String line;
        StringBuilder allPlayersText = new StringBuilder(); // StringBuilder to store all players' information

        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                // Skip empty lines

                continue;
            }
            System.out.println("Line read from file: " + line);
                        allPlayersText.append(line).append("\n"); 

          //  space2.setText(""+ line);

            String[] parts = line.split(":");
            if (parts.length == 2) {
                String name = parts[1].trim();
                String timeStr = parts[0].trim();
                try {
                    int timeInSeconds = Integer.parseInt(timeStr);
                    if (timeInSeconds < bestTime) {
                        bestTime = timeInSeconds;
                        bestPlayer = name;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Invalid time value encountered for line: " + line);
                }
            }

        }
                space2.setText(allPlayersText.toString());

        space.setText("Best time in seconds: " + bestTime + "seconds."+"\nBest Player Name: " + bestPlayer);
    } catch (IOException e) {
        System.err.println("An error occurred while reading the file.");
    }


    OOP_Assignment1.StopMusic();
    OOP_Assignment1.PlayMusic("wav/SCNB3LA-winning.wav");

    
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                

                new Board().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea space;
    private javax.swing.JTextArea space2;
    // End of variables declaration//GEN-END:variables
}
