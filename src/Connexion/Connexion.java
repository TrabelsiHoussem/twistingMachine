/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class Connexion {
    
      Connection cn;
     public Connexion (){
         try {
             Class.forName("com.mysql.jdbc.Driver");
     }catch (ClassNotFoundException e){
         System.err.println(e);
     }
         try{
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_trosadage", "pi", "root");  
       System.out.println("hello") ;
     }catch (Exception e){System.err.println(e);}
         
     }
     //fonction pour retourner la connexion avec la base
    public Connection ObtenirConnexion(){return cn;}
    
}
