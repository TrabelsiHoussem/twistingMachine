/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;

import Connexion.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Gestion_Torsadage extends javax.swing.JFrame {

     //creation instance de classe "Connector" connexion
   Connexion cnn =new Connexion();
   //transferer les requetes avec la base
     Statement stm;
     //recuperer les reponse de base
     ResultSet Rs;
     DefaultTableModel model=new DefaultTableModel();
    //variable globale de tour
     int VGtour=0;
      int tourfrombase;
      //variable globale de pas de fil
      int VGPas;
    
    public Gestion_Torsadage() {
        initComponents();
      //les boutons disabled
      btnAjouter.setEnabled(false);
      btnValider.setEnabled(false);
        
         model.addColumn("numarticle");
         model.addColumn("numpaire");
         model.addColumn("numfil");
         model.addColumn("adresse");
         model.addColumn("couleur");
         model.addColumn("longueur");
         model.addColumn("pas");
        try{
             stm=cnn.ObtenirConnexion().createStatement();
             ResultSet Rs=stm.executeQuery("Select numarticle,numpaire,numfil,adresse,couleur,longueur,pas from article,paire,fil where article.numarticle=paire.numart_fk and paire.numpaire=fil.numpaire_fk");
             while (Rs.next()){
                 model.addRow(new Object[]{Rs.getString("numarticle"),Rs.getString("numpaire"),Rs.getString("numfil"),Rs.getString("adresse"),Rs.getString("couleur"),Rs.getString("longueur"),Rs.getString("couleur"),Rs.getString("pas")});
             }
         }catch(Exception e) {System.err.println(e);}
table_art.setModel(model);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArticle = new javax.swing.JTextField();
        txtNumPaire = new javax.swing.JTextField();
        txtNumFil = new javax.swing.JTextField();
        txtCouleur = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        txtPAS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLongueur = new javax.swing.JTextField();
        btnSuivant = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnValider = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        Numart_RECH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_art = new javax.swing.JTable();
        btnRechercher = new javax.swing.JButton();
        btnAffichertout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 460));
        setMinimumSize(new java.awt.Dimension(800, 460));
        setPreferredSize(new java.awt.Dimension(800, 460));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 460));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(141, 195, 217));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Num Article");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 100, 110, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Num Paire");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Num Fil");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 170, 57, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Couleur");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 250, 62, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Adresse");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 66, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Longueur");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 290, 76, 17);
        jPanel1.add(txtArticle);
        txtArticle.setBounds(160, 90, 135, 31);
        jPanel1.add(txtNumPaire);
        txtNumPaire.setBounds(160, 130, 135, 29);
        jPanel1.add(txtNumFil);
        txtNumFil.setBounds(160, 170, 135, 29);

        txtCouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCouleurActionPerformed(evt);
            }
        });
        jPanel1.add(txtCouleur);
        txtCouleur.setBounds(160, 250, 135, 29);
        jPanel1.add(txtAdresse);
        txtAdresse.setBounds(160, 210, 135, 29);
        jPanel1.add(txtPAS);
        txtPAS.setBounds(160, 330, 135, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Pas");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 330, 28, 17);
        jPanel1.add(txtLongueur);
        txtLongueur.setBounds(160, 290, 135, 29);

        btnSuivant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSuivant.setText("Suivant");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuivant);
        btnSuivant.setBounds(160, 380, 112, 25);

        btnAjouter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });
        jPanel1.add(btnAjouter);
        btnAjouter.setBounds(280, 380, 112, 25);

        btnValider.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });
        jPanel1.add(btnValider);
        btnValider.setBounds(660, 380, 112, 25);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(530, 380, 112, 25);

        btnModifier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        jPanel1.add(btnModifier);
        btnModifier.setBounds(400, 380, 112, 25);

        btnSupprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        jPanel1.add(btnSupprimer);
        btnSupprimer.setBounds(40, 380, 112, 25);
        jPanel1.add(Numart_RECH);
        Numart_RECH.setBounds(540, 90, 188, 33);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 500));

        table_art.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NumArticle", "NumPaire", "NumFil", "Adresse", "Couleur", "Longueur", "Pas"
            }
        ));
        table_art.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_artMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_art);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 210, 470, 150);

        btnRechercher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });
        jPanel1.add(btnRechercher);
        btnRechercher.setBounds(370, 90, 160, 33);

        btnAffichertout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAffichertout.setText("Afficher Tout");
        btnAffichertout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAffichertoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnAffichertout);
        btnAffichertout.setBounds(370, 140, 160, 32);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Voir Nombre de tour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 140, 190, 32);

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/undo.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 11, 30, 32);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Torsadage ");
        jLabel6.setMaximumSize(new java.awt.Dimension(60, 15));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(340, 20, 210, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/connexion-dominos-electrique-fil-section-6-mm2.jpg"))); // NOI18N
        jLabel10.setMinimumSize(new java.awt.Dimension(1030, 600));
        jLabel10.setPreferredSize(new java.awt.Dimension(800, 480));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
        // TODO add your handling code here:
        try{
     
      String NumArticle=txtArticle.getText();
      String NumPaire=txtNumPaire.getText();
      String NumFil=txtNumFil.getText();
      String Adresse=txtAdresse.getText();
      String Couleur=txtCouleur.getText();
      String Longueur=txtLongueur.getText();
      String Pas=txtPAS.getText();
      //String tour =txttour.getText();
      
      
         // VGtour=Integer.parseInt(Longueur);
          //System.out.println("longueur1"+VGtour);
          
          
          
        //variable globale qui porte la valeur du pas d'un seul fil
        //VGPas=Integer.parseInt(Pas);
        //System.out.println("pas1"+VGPas);
        
        
        String sql="select numfil from fil where numfil = '"+NumFil+"'";   
        ResultSet resultat = stm.executeQuery(sql);
          int count=0;
        //ceci pour verisier l'existance d'email 
    	 while(resultat.next()){
             count=count+1;}
     
         
            if(count==1){
                JOptionPane.showMessageDialog(null,"numfil Exist déjà");
                    //les boutons disabled
      btnAjouter.setEnabled(false);
      btnValider.setEnabled(false);
      txtNumFil.setText("");
            }
             
            
        else
        {
    String reqarticle="insert into article(numarticle)VALUES('"+NumArticle+"')";
    String reqpaire="insert into paire(numpaire,tour,numart_fk)VALUES('"+NumPaire+"',"+VGtour+",'"+NumArticle+"')";
    String reqfil="insert into fil(numfil,numpaire_fk,adresse,couleur,longueur,pas)VALUES("+NumFil+",'"+NumPaire+"','"+Adresse+"','"+Couleur+"',"+Longueur+","+Pas+")";
     
                
        //executeUpdate :requete insert et requete update.....executeQuery: requete select
        stm.executeUpdate(reqarticle);
        stm.executeUpdate(reqpaire);
        stm.executeUpdate(reqfil);
        
       
        JOptionPane.showMessageDialog(null, "l'article d'un seul fil  est bien ajouter");
        btnSuivant.setEnabled(false);
      btnValider.setEnabled(false);
      btnAjouter.setEnabled(true);
      
      txtArticle.setEnabled(false);
      txtNumPaire.setEnabled(false);
      txtNumFil.setText("");
      txtAdresse.setText("");
      txtCouleur.setText("");
      txtLongueur.setText("");
      txtPAS.setText("");}
    
}
        
    catch (Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
    afficher();
    

    
    
      
    }//GEN-LAST:event_btnSuivantActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
        
      int longueur1=0;  
      int longueur2;
      
      int pas1=0;
      int pas2;
        
       
        
        
        try{
            
      String NumArticle=txtArticle.getText();
      String NumPaire=txtNumPaire.getText();
      String NumFil=txtNumFil.getText();
      String Adresse=txtAdresse.getText();
      String Couleur=txtCouleur.getText();
      String Longueur=txtLongueur.getText();
      String Pas=txtPAS.getText();
     
      
       String sql="select numfil from fil where numfil = '"+NumFil+"'";    
       
        ResultSet resultat = stm.executeQuery(sql);  
          int count=0;
        //ceci pour verisier l'existance d'email 
    	 while(resultat.next()){
             count=count+1;}
     
         
            if(count==1){
                JOptionPane.showMessageDialog(null,"numfil Exist déjà");
               
                txtNumFil.setText("");
                btnAjouter.setEnabled(true);
                btnSuivant.setEnabled(false);
                btnValider.setEnabled(false);
            }
            
        else
        {
            
            
            
            
       //recuperer longueur from database     
            
            
      try{
             stm=cnn.ObtenirConnexion().createStatement();
             ResultSet Rs=stm.executeQuery("Select numpaire,longueur from paire , fil  where paire.numpaire=fil.numpaire_fk and numpaire = '"+NumPaire+"'");    
             while (Rs.next()){
                 longueur1=Rs.getInt("longueur");
                System.out.println("longueur1"+longueur1);
            }
         }catch(Exception e) {System.err.println(e);
          }
      
       longueur2=longueur1+Integer.parseInt(Longueur);
       System.out.println("longueur2"+longueur2);
       
       
       
             //recuperer longueur from database     
            
            
      try{
             stm=cnn.ObtenirConnexion().createStatement();
             ResultSet Rs=stm.executeQuery("Select numpaire,pas from paire , fil  where paire.numpaire=fil.numpaire_fk and numpaire = '"+NumPaire+"'");    
             while (Rs.next()){
                 pas1=Rs.getInt("pas");
                System.out.println("pas1"+pas1);
            }
         }catch(Exception e) {System.err.println(e);
          }
      
       pas2=pas1+Integer.parseInt(Pas);
       System.out.println("pas2"+pas2);
      
       
       int nb_tour=((longueur2*pas2)/1000);
       System.out.println("nb_tour           "+nb_tour);
       
       
       
       
       
       
       
       
       
       
       //String querytour="insert into paire (tour) VALUES ("+VGtour+"') WHERE numpaire '"+NumPaire+"'";  
        String reqfil="insert into fil(numfil,numpaire_fk,adresse,couleur,longueur,pas)VALUES("+NumFil+",'"+NumPaire+"','"+Adresse+"','"+Couleur+"',"+Longueur+","+Pas+")";
     String querytour = "UPDATE paire SET tour="+nb_tour+" WHERE numpaire = ? " ;
     PreparedStatement preparedStmt = cnn.ObtenirConnexion().prepareStatement(querytour);
      preparedStmt.setString(1, NumPaire);
      preparedStmt.execute(); 
      
          
            stm.executeUpdate(reqfil);
        
        JOptionPane.showMessageDialog(null, "l'article avec deux fils  est bien ajouter");
         txtArticle.setEnabled(false);
          txtNumPaire.setEnabled(true);
          txtNumPaire.setText("");
          txtNumFil.setText("");
          txtAdresse.setText("");
          txtCouleur.setText("");
          txtPAS.setText("");
          txtLongueur.setText("");
          
         btnAjouter.setEnabled(false);
         btnSuivant.setEnabled(false);
         btnValider.setEnabled(true);
        }}
        
        
        
        
        catch (Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());
        
        
        
        }
        
         afficher();
         
         
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
        
        
        try{
        
      String NumArticle=txtArticle.getText();
      String NumPaire=txtNumPaire.getText();
      String NumFil=txtNumFil.getText();
      String Adresse=txtAdresse.getText();
      String Couleur=txtCouleur.getText();
      String Longueur=txtLongueur.getText();
      String Pas=txtPAS.getText();
      int tour=Integer.parseInt(Longueur);
      
      
      
         String sql="select numfil from fil where numfil = '"+NumFil+"'";    
        ResultSet resultat = stm.executeQuery(sql);
          int count=0;
        //ceci pour verisier l'existance d'email 
    	 while(resultat.next()){
             count=count+1;}
     
         
            if(count==1){
                JOptionPane.showMessageDialog(null,"numfil Exist déjà");
                txtArticle.setEnabled(false);
                txtNumPaire.setEnabled(false);
                txtNumFil.setText("");
                btnAjouter.setEnabled(false);
                btnSuivant.setEnabled(false);
                btnValider.setEnabled(true);
                 
            }
            
        else
        {
        
        
         String reqpaire="insert into paire(numpaire,tour,numart_fk)VALUES('"+NumPaire+"',"+tour+",'"+NumArticle+"')";
         String reqfil="insert into fil(numfil,numpaire_fk,adresse,couleur,longueur,pas)VALUES("+NumFil+",'"+NumPaire+"','"+Adresse+"','"+Couleur+"',"+Longueur+","+Pas+")";
     
        stm.executeUpdate(reqpaire);
        stm.executeUpdate(reqfil);
        
         JOptionPane.showMessageDialog(null, "l'article avec un paire de fils  est bien ajouter");
          
          txtArticle.setEnabled(false);
          txtNumPaire.setEnabled(false);
          txtNumFil.setText("");
          txtAdresse.setText("");
          txtCouleur.setText("");
          txtLongueur.setText("");
          txtPAS.setText("");
          
         btnAjouter.setEnabled(true);
         btnSuivant.setEnabled(false);
         btnValider.setEnabled(false);
       
        }}

         catch (Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
        
         afficher();
        
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        
          txtArticle.setText("");
          txtNumPaire.setText("");
          txtNumFil.setText("");
          txtAdresse.setText("");
          txtCouleur.setText("");
          txtLongueur.setText("");
          txtPAS.setText("");
          
           //les boutons disabled
         btnAjouter.setEnabled(false);
            btnSuivant.setEnabled(true);
         btnValider.setEnabled(false);
         txtArticle.setEnabled(true);
         txtNumPaire.setEnabled(true);
         txtNumFil.setEnabled(true);
         
         
         
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        
        
        try{
            
          
            
            
      String NumArticle=txtArticle.getText();
      String NumPaire=txtNumPaire.getText();
      String NumFil=txtNumFil.getText();
      
      
        int row =table_art.getSelectedRow();
        int col = 0; // ID is the first Column
       if (JOptionPane.showConfirmDialog(null,"confirmer la modification","modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
       {
       stm.executeUpdate("UPDATE fil SET adresse='"+txtAdresse.getText()+"',Couleur='"+txtCouleur.getText()+"',longueur='"+txtLongueur.getText()+"',pas='"+txtPAS.getText()+"' WHERE numfil = "+NumFil           );
        
        }}
        
        catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!"+e.getMessage());
   System.err.println(e);}
         afficher();
        
        
          txtArticle.setText("");
          txtNumPaire.setText("");
          txtNumFil.setText("");
          txtAdresse.setText("");
          txtCouleur.setText("");
          txtLongueur.setText("");
          txtPAS.setText("");
        
         btnAjouter.setEnabled(false);
         btnValider.setEnabled(false);
         btnSuivant.setEnabled(true);
         
        txtArticle.setEnabled(true);
        txtNumPaire.setEnabled(true);
        txtNumFil.setEnabled(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnModifierActionPerformed

    private void table_artMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_artMouseClicked
        // TODO add your handling code here:
        
        try {
            
    int i=table_art.getSelectedRow();
    deplace(i);
}
catch (Exception e){JOptionPane.showMessageDialog(null, "erreur de deplacement"+e.getLocalizedMessage());}
           
            btnSuivant.setEnabled(false);
            txtArticle.setEnabled(false);
            txtNumPaire.setEnabled(false);
            txtNumFil.setEnabled(false);
    }//GEN-LAST:event_table_artMouseClicked

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
        
       try {
           String NumArticle=txtArticle.getText();
             if(JOptionPane.showConfirmDialog(null,"Voulez vous confirmer la suppression de l'article"+" "+NumArticle
                     ,"supprimer l'article",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(NumArticle.length() != 0){
        String query=("Delete From article where numarticle = ?");
        PreparedStatement preparedStmt = cnn.ObtenirConnexion().prepareStatement(query);
      preparedStmt.setString(1, NumArticle);
      preparedStmt.execute();
      
      
          txtArticle.setText("");
          txtNumPaire.setText("");
          txtNumFil.setText("");
          txtAdresse.setText("");
          txtCouleur.setText("");
          txtLongueur.setText("");
          txtPAS.setText("");
          
           //les boutons disabled
         btnAjouter.setEnabled(false);
            btnSuivant.setEnabled(true);
         btnValider.setEnabled(false);
         txtArticle.setEnabled(true);
         txtNumPaire.setEnabled(true);
         txtNumFil.setEnabled(true);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   // cnn.ObtenirConnexion().close();
      afficher();
             }
            else { JOptionPane.showMessageDialog(null,"veuillez SVP remplire le champ numarticle !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprimer \n"+e.getMessage());}  
        
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        // TODO add your handling code here:
       // model.getDataVector().removeAllElements();
       
        
       model.setRowCount(0);// pour vider la list des etudient
      /* String NumArticle=Numart_RECH.getText();
        try {
       
       stm=cnn.ObtenirConnexion().createStatement();
       Rs = stm.executeQuery("Select numarticle,numpaire,numfil,adresse,couleur,longueur from article,paire,fil where article.numarticle=paire.numart_fk and paire.numpaire=fil.numpaire_fk and numarticle= '"+txtArticle.getText()+"'");
       while (Rs.next()){
       
       model.addRow(new Object[]{Rs.getString("numarticle"),Rs.getString("numpaire"),Rs.getString("numfil"),Rs.getString("adresse"),Rs.getString("couleur"),Rs.getString("longueur")});
       } 
       
       
   if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun article");
       
       } else{ 
           
          
           
          table_art.setModel(model);
       }
       
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }*/
        
         //il faut vider le table avant le recherche
           model.setRowCount(0);
           String NumArticle=Numart_RECH.getText();
           System.out.println(NumArticle);
          
       
        
         try{
            
             
             stm=cnn.ObtenirConnexion().createStatement();
             //retourner tous les commandes en utilisant la requete select 
             ResultSet Rs=stm.executeQuery("SELECT numarticle,numpaire,numfil,adresse,longueur,couleur ,pas FROM fil ,article,paire where article.numarticle= paire.numart_fk AND paire.numpaire = fil.numpaire_fk AND  numarticle ='"+NumArticle+"'");
             while (Rs.next()){
                 
                 model.addRow(new Object[]{Rs.getString("numarticle"),Rs.getString("numpaire"),Rs.getString("numfil"),Rs.getString("adresse"),Rs.getString("longueur"),Rs.getString("couleur"),Rs.getString("pas")});
                
               }
              if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun etudiant");
        
       }
        else{ int i=0;
       deplace(i);
       }   
       
         }catch(Exception e) {System.err.println(e);}
        table_art.setModel(model);
      
      
        
    }//GEN-LAST:event_btnRechercherActionPerformed

    private void btnAffichertoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAffichertoutActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
         Numart_RECH.setText(""); 
         txtArticle.setText("");
          txtNumPaire.setText("");
          txtNumFil.setText("");
          txtAdresse.setText("");
          txtCouleur.setText("");
          txtLongueur.setText("");
          txtPAS.setText("");
        try{
             stm=cnn.ObtenirConnexion().createStatement();
             ResultSet Rs=stm.executeQuery("Select numarticle,numpaire,numfil,adresse,couleur,longueur,pas from article,paire,fil where article.numarticle=paire.numart_fk and paire.numpaire=fil.numpaire_fk");
             while (Rs.next()){
                 model.addRow(new Object[]{Rs.getString("numarticle"),Rs.getString("numpaire"),Rs.getString("numfil"),Rs.getString("adresse"),Rs.getString("couleur"),Rs.getString("longueur"),Rs.getString("pas")});
             }
         }catch(Exception e) {System.err.println(e);}
table_art.setModel(model);

        
    }//GEN-LAST:event_btnAffichertoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Calcul_Tour ct=new Calcul_Tour();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCouleurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCouleurActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Choix meriem =new Choix();
        meriem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
   
    private void deplace (int i){
    
    txtArticle.setText(model.getValueAt(i,0).toString());
    txtNumPaire.setText(model.getValueAt(i,1).toString());
    txtNumFil.setText(model.getValueAt(i,2).toString());
    txtAdresse.setText(model.getValueAt(i,3).toString());
    txtCouleur.setText(model.getValueAt(i,4).toString());
    txtLongueur.setText(model.getValueAt(i,5).toString());
    txtPAS.setText(model.getValueAt(i,6).toString());
  
try {}catch( Exception e){System.err.println(e);
JOptionPane.showMessageDialog(null,"erreur de deplacement (function deplace)"+e.getLocalizedMessage());
}
    }
    
    private int  sommepas(){
        
         String NumArticle=txtArticle.getText();
      String NumPaire=txtNumPaire.getText();
      String NumFil=txtNumFil.getText();
      String Adresse=txtAdresse.getText();
      String Couleur=txtCouleur.getText();
      String Longueur=txtLongueur.getText();
      String Pas=txtPAS.getText();
      VGtour=Integer.parseInt(Longueur);
     int pas = 0;
     try{
             stm=cnn.ObtenirConnexion().createStatement();
             ResultSet Rs=stm.executeQuery("Select numpaire_fk ,SUM (pas) as somme,  numpaire from fil , paire where  paire.numpaire=fil.numpaire_fk and numpaire= '"+NumPaire+"'");    
             while (Rs.next()){
                 pas =Rs.getInt("somme");
                System.out.println("pas_somme"+pas);
            }
         }catch(Exception e) {System.err.println(e);
          }
    return pas;
    
    }
  private void afficher() {
  try {
  model.setRowCount(0);
stm=cnn.ObtenirConnexion().createStatement();
ResultSet Rs=stm.executeQuery("Select numarticle,numpaire,numfil,adresse,couleur,longueur,pas from article,paire,fil where article.numarticle=paire.numart_fk and paire.numpaire=fil.numpaire_fk");
while(Rs.next()){
 model.addRow(new Object[]{Rs.getString("numarticle"),Rs.getString("numpaire"),Rs.getString("numfil"),Rs.getString("adresse"),Rs.getString("couleur"),Rs.getString("longueur"),Rs.getString("pas")});

}
}catch(Exception e){System.err.println(e);}

table_art.setModel(model);
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
            java.util.logging.Logger.getLogger(Gestion_Torsadage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Torsadage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Torsadage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Torsadage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Torsadage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Numart_RECH;
    private javax.swing.JButton btnAffichertout;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnValider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_art;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtArticle;
    private javax.swing.JTextField txtCouleur;
    private javax.swing.JTextField txtLongueur;
    private javax.swing.JTextField txtNumFil;
    private javax.swing.JTextField txtNumPaire;
    private javax.swing.JTextField txtPAS;
    // End of variables declaration//GEN-END:variables
}
