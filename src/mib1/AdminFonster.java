/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author KarlJ
 */
public class AdminFonster extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form AdminFonster
     */
    public AdminFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registreraAgentBTN = new javax.swing.JButton();
        registreraAlienBTN = new javax.swing.JButton();
        removeAgentBTN = new javax.swing.JButton();
        removeAlienBTN = new javax.swing.JButton();
        removeUtrustningBTN = new javax.swing.JButton();
        changeOmrådesChefBTN = new javax.swing.JButton();
        registerUtrustning = new javax.swing.JButton();
        changeKontorsChefBTN = new javax.swing.JButton();
        görAdminBTN = new javax.swing.JButton();
        removeAdminBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registreraAgentBTN.setText("Registrera Agent");
        registreraAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentBTNActionPerformed(evt);
            }
        });

        registreraAlienBTN.setText("Registrera Alien");
        registreraAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAlienBTNActionPerformed(evt);
            }
        });

        removeAgentBTN.setText("Ta bort Agent");
        removeAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAgentBTNActionPerformed(evt);
            }
        });

        removeAlienBTN.setText("Ta bort Alien");
        removeAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAlienBTNActionPerformed(evt);
            }
        });

        removeUtrustningBTN.setText("Ta bort Utrustning");
        removeUtrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUtrustningBTNActionPerformed(evt);
            }
        });

        changeOmrådesChefBTN.setText("Ändra områdeschef");
        changeOmrådesChefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeOmrådesChefBTNActionPerformed(evt);
            }
        });

        registerUtrustning.setText("Registrera Utrustning");
        registerUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUtrustningActionPerformed(evt);
            }
        });

        changeKontorsChefBTN.setText("Ändra kontorschef");
        changeKontorsChefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeKontorsChefBTNActionPerformed(evt);
            }
        });

        görAdminBTN.setText("Gör agent admin");
        görAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                görAdminBTNActionPerformed(evt);
            }
        });

        removeAdminBTN.setText("Ta bort admin");
        removeAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdminBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(görAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registreraAgentBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(registreraAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registerUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeOmrådesChefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeKontorsChefBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeUtrustningBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeAgentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeAdminBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registreraAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registreraAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeUtrustningBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeOmrådesChefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeKontorsChefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(görAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registreraAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentBTNActionPerformed
        // TODO add your handling code here:
        RegistreraAgent nyAgent = new RegistreraAgent(idb);
        nyAgent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registreraAgentBTNActionPerformed

    private void registreraAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAlienBTNActionPerformed
        // TODO add your handling code here:
        agentAlien nyAlien = new agentAlien(idb);
        nyAlien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registreraAlienBTNActionPerformed

    private void removeAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAgentBTNActionPerformed
        // TODO add your handling code here:
        taBortAgent remove = new taBortAgent(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeAgentBTNActionPerformed

    private void removeAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAlienBTNActionPerformed
        // TODO add your handling code here:
        taBortAlien remove = new taBortAlien(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeAlienBTNActionPerformed

    private void removeUtrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUtrustningBTNActionPerformed
        // TODO add your handling code here:
        taBortUtrustning remove = new taBortUtrustning(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeUtrustningBTNActionPerformed

    private void registerUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUtrustningActionPerformed
        // TODO add your handling code here:
        agentUtrustning nyUtrustning = new agentUtrustning(idb);
        nyUtrustning.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_registerUtrustningActionPerformed

    private void changeKontorsChefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeKontorsChefBTNActionPerformed
        // TODO add your handling code here:
        nyKontorschef ny = new nyKontorschef(idb);
        ny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeKontorsChefBTNActionPerformed

    private void removeAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdminBTNActionPerformed
        // TODO add your handling code here:
        taBortAdmin remove = new taBortAdmin(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeAdminBTNActionPerformed

    private void görAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_görAdminBTNActionPerformed
        // TODO add your handling code here:
        görAdmin ny = new görAdmin(idb);
        ny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_görAdminBTNActionPerformed

    private void changeOmrådesChefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeOmrådesChefBTNActionPerformed
        // TODO add your handling code here:
        nyOmrådeschef ny = new nyOmrådeschef(idb);
        ny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeOmrådesChefBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFonster(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeKontorsChefBTN;
    private javax.swing.JButton changeOmrådesChefBTN;
    private javax.swing.JButton görAdminBTN;
    private javax.swing.JButton registerUtrustning;
    private javax.swing.JButton registreraAgentBTN;
    private javax.swing.JButton registreraAlienBTN;
    private javax.swing.JButton removeAdminBTN;
    private javax.swing.JButton removeAgentBTN;
    private javax.swing.JButton removeAlienBTN;
    private javax.swing.JButton removeUtrustningBTN;
    // End of variables declaration//GEN-END:variables
}
