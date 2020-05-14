/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author KarlJ
 */
public class huvudFonster extends javax.swing.JFrame {
    private static InfDB idb;
    public static String id;
    public boolean inloggad;    /**
     * Creates new form huvudFonster
     */

    /**
     * Creates new form huvudFonster
     * @param idb
     */
    public huvudFonster(InfDB idb) {
        initComponents();
        inloggad = false;
        try{
        idb = new InfDB("C:\\db\\mibdb.fdb");    
        this.idb = idb;
        
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "N�got gick fel");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameAgent = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        PasswordAgent = new javax.swing.JPasswordField();
        userAlien = new javax.swing.JTextField();
        PasswordAlien = new javax.swing.JPasswordField();
        loginAlien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameAgentActionPerformed(evt);
            }
        });

        login.setText("Login Agent");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        PasswordAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordAgentActionPerformed(evt);
            }
        });

        userAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAlienActionPerformed(evt);
            }
        });

        loginAlien.setText("Login Alien");
        loginAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAlienActionPerformed(evt);
            }
        });

        jLabel1.setText("Anv�ndarnamn");

        jLabel2.setText("L�senord");

        jLabel3.setText("Anv�ndarnamn");

        jLabel4.setText("L�senord");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N

        jLabel5.setText("Agent");

        jLabel6.setText("Alien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PasswordAgent)
                        .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernameAgent, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordAlien, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(userAlien, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel6))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(loginAlien))
                .addGap(92, 92, 92))
            .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameAgentActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        //Skapar lokala variabler som �r v�rdena av f�lten som anv�ndaren skriver in
        String user = usernameAgent.getText();
        String pass = PasswordAgent.getText();
        
        
            try{
                //H�mtar in den n�dv�ndiga datan fr�n databasen f�r att kunna validera anv�ndaruppgifter
                String Username = idb.fetchSingle("Select Namn from agent where Namn = " +"'"  + user + "'");
                String password1 = idb.fetchSingle("Select Losenord from agent where Namn = " + "'" + user +  "'");
                String admin = idb.fetchSingle("Select Administrator from agent where Namn = " +"'" + user + "'");
                String adminpriv = idb.fetchSingle("Select Administrator from agent");
                
                //Om anv�ndaren skr�ver in korrekta uppgifter och �r admin s� blir de skickade till AdminFonster
                if(user.equals(Username) && pass.equals(password1) && admin.equals(adminpriv)){
                    id = Username;
                    inloggad = true;
                    AdminFonster adminInlogg = new AdminFonster(idb);
                    adminInlogg.setVisible(true);
                    adminInlogg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    this.dispose();
                    
                    

                }
                //Om anv�ndaren skriver in korrekta uppgifter s� blir de vidareskickade till AgentInloggad f�nstret
                else if(user.equals(Username) && pass.equals(password1)){
                    id = Username;
                    inloggad = true;
                    AgentInloggad inne = new AgentInloggad(idb);
                    inne.setVisible(true);
                    inne.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    this.dispose();
                    
                    
                    
                    
                    
                }
                // Om anv�ndaren skriver in felaktiga uppgifter
                else{
                    JOptionPane.showMessageDialog(null, "Felaktigt anv�ndarnamn eller l�senord");
                }
                
            }
            // Om n�got g�r fel med kopplingen till databasen s� k�rs denna catch
            catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Ett fel skedde");
                    System.out.println(e.getMessage());
            }
        
            
    }//GEN-LAST:event_loginActionPerformed

    private void PasswordAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordAgentActionPerformed

    private void userAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAlienActionPerformed

    private void loginAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAlienActionPerformed
        // TODO add your handling code here:
        String user = userAlien.getText();
        String pass = PasswordAlien.getText();
        
        try{
        //H�mtar in n�dv�ndig data fr�n databasen f�r att hantera validering av anv�ndaruppgifter
        String username = idb.fetchSingle("Select Namn from Alien where Namn = " + "'" + user + "'");
        String password = idb.fetchSingle("Select Losenord from Alien where Namn = " + "'" + user + "'");
        
        //Om aliens anv�ndaruppgifter �r korrekta s� loggas den in i systemet och kommer till AlienInloggad f�nstret
        if(user.equals(username) && pass.equals(password)){
            inloggad = true;
            id = username;
            AlienInloggad Alieninne = new AlienInloggad(idb);
            Alieninne.setVisible(true);
            this.dispose();
        }
        // Om anv�ndaruppgifterna inte st�mmer
        else{
            JOptionPane.showMessageDialog(null, "Felaktigt anv�ndarnamn eller l�senord");
        }
        
        }
        //Om n�got g�r fel med kopplingen till databasen
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "N�got gick fel med databasen, F�rs�k igen");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_loginAlienActionPerformed
    // Enkel getmetod s� att andra klasser kan komma �t id p� inloggad anv�ndare
    public static String hamtaID(){
        return id;
        
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
            java.util.logging.Logger.getLogger(huvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(huvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(huvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(huvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new huvudFonster(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordAgent;
    private javax.swing.JPasswordField PasswordAlien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JButton loginAlien;
    private javax.swing.JTextField userAlien;
    private javax.swing.JTextField usernameAgent;
    // End of variables declaration//GEN-END:variables
}
