/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import Connexion.Connexion;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Calcul_Tour extends javax.swing.JFrame {

    boolean stopmotor;
    //creation instance de classe "Connector" connexion
    Connexion cnn = new Connexion();
    //transferer les requetes avec la base
    Statement stm;
    //recuperer les reponse de base
    ResultSet Rs;
    DefaultTableModel model1 = new DefaultTableModel();

   
    Thread t1 ;
      GpioController gpio= GpioFactory.getInstance(); 
     

    // provision gpio pin #01 as an output pin and turn on
      GpioPinDigitalOutput dir=gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, PinState.LOW);
      GpioPinDigitalOutput step  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, PinState.LOW);
    public Calcul_Tour() {
        
       
        initComponents();
        RemplirCombo();
        dir.setShutdownOptions(true, PinState.LOW);
        step.setShutdownOptions(true, PinState.LOW);
        System.out.println("--> GPIO state should be: ON");

        model1.addColumn("numpaire");
        model1.addColumn("numfil");
        model1.addColumn("adresse");
        model1.addColumn("couleur");
        model1.addColumn("longueur");
        model1.addColumn("pas");
        model1.addColumn("Nombre_tour");

        try {
            stm = cnn.ObtenirConnexion().createStatement();
            ResultSet Rs = stm.executeQuery("Select numarticle,numpaire,numfil,adresse,couleur,longueur,pas , tour from article,paire,fil where article.numarticle=paire.numart_fk and paire.numpaire=fil.numpaire_fk");
            while (Rs.next()) {
                model1.addRow(new Object[]{Rs.getString("numpaire"), Rs.getString("numfil"), Rs.getString("adresse"), Rs.getString("couleur"), Rs.getString("longueur"), Rs.getString("pas"), Rs.getString("tour")});
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        table_calcul_tour.setModel(model1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ComboNumArticle = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_calcul_tour = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setMaximumSize(new java.awt.Dimension(800, 460));
        setMinimumSize(new java.awt.Dimension(800, 460));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 460));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 460));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 460));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Num Article");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 50, 82, 32);

        ComboNumArticle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboNumArticleItemStateChanged(evt);
            }
        });
        ComboNumArticle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboNumArticleMouseClicked(evt);
            }
        });
        ComboNumArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNumArticleActionPerformed(evt);
            }
        });
        jPanel2.add(ComboNumArticle);
        ComboNumArticle.setBounds(320, 50, 150, 40);

        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(580, 50, 140, 40);

        table_calcul_tour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Num Paire", "Num Cable", "Adresse", "Couleur", "Longueur", "Pas", "Nombre de tour"
            }
        ));
        jScrollPane1.setViewportView(table_calcul_tour);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(110, 110, 610, 150);

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/undo.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 40, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 102));
        jButton2.setText("START");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(190, 310, 180, 60);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("STOP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(450, 310, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/10653206.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 480));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model1.setRowCount(0);
        String num = ComboNumArticle.getSelectedItem().toString();
        System.out.println(num);

        try {
            stm = cnn.ObtenirConnexion().createStatement();
            ResultSet Rs = stm.executeQuery("SELECT   numpaire,numarticle,numfil,adresse,couleur,longueur ,pas , tour FROM fil ,article,paire where article.numarticle= paire.numart_fk AND paire.numpaire = fil.numpaire_fk AND  numarticle ='" + num + "'");
            while (Rs.next()) {

                model1.addRow(new Object[]{Rs.getString("numpaire"), Rs.getString("numfil"), Rs.getString("adresse"), Rs.getString("couleur"), Rs.getString("longueur"), Rs.getString("pas"), Rs.getString("tour")});

            }

        } catch (Exception e) {
            System.err.println(e);
        }

        table_calcul_tour.setModel(model1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboNumArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNumArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNumArticleActionPerformed

    private void ComboNumArticleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboNumArticleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNumArticleMouseClicked

    private void ComboNumArticleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboNumArticleItemStateChanged

    }//GEN-LAST:event_ComboNumArticleItemStateChanged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
//        Gestion_Torsadage meriem = new Gestion_Torsadage();
//        meriem.setVisible(true);
//        this.dispose();
        
        
        
        Acceuil acc = new Acceuil();
        acc.setVisible(true);
        gpio.shutdown();
        gpio.unprovisionPin(dir);
         gpio.unprovisionPin(step);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        stopmotor = true;
        //t1.stop();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    int tours = Integer.parseInt(table_calcul_tour.getValueAt(0, 6).toString());

                    dir.high();

                    System.out.println(tours);
int j=0;
                    for ( j = 0; j < tours; j++) {
                        if (stopmotor == true) {
                            stopmotor = false;

                            break;

                        }
                        for (int i = 0; i < 400; i++) {

                            
                            
                            
                            step.high();

                            //TimeUnit.MICROSECONDS.sleep(200);
                            Thread.sleep(2);

                            step.low();

                            Thread.sleep(2);

                        }
                    }
                         
                  
                        
                        
                        
                        
                        //double arriere = (((tours * 15) / 100) * 400);
                        //int  arriere = (400*tours*15)/100;
                        //System.out.println("tour = " + tours+"arrierte est egale a "+ arriere);
                        if (j>=tours) {
                            Thread.sleep(500);
                        dir.low();
                        for (int k = 0; k < (400*tours*15)/100; k++) {

                            if (stopmotor == true) {
                                stopmotor=false;
                                break;

                            }
                            step.high();

                            //TimeUnit.MICROSECONDS.sleep(200);
                            Thread.sleep(2);

                            step.low();

                            Thread.sleep(2);

                        }
                        }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Calcul_Tour.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        t1.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void itemStateChanged(ItemEvent e) {

    }

    public void RemplirCombo() {

        try {

            String reqarticle = "select numarticle from article ";
            stm = cnn.ObtenirConnexion().createStatement();
            Rs = stm.executeQuery(reqarticle);
            while (Rs.next()) {
                ComboNumArticle.addItem(Rs.getString("numarticle"));

            }

        } catch (Exception e) {
            System.err.println(e);
        }

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
            java.util.logging.Logger.getLogger(Calcul_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcul_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcul_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcul_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcul_Tour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboNumArticle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_calcul_tour;
    // End of variables declaration//GEN-END:variables
}
