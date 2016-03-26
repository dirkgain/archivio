/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Ingegnere
 */
@ManagedBean (name="model")
@ApplicationScoped
public class Model {
    
    public static boolean checkLogin (String username, String password) throws InstantiationException, IllegalAccessException{
        
       try {
         String driver = "com.mysql.jdbc.Driver";
         Class.forName(driver).newInstance();
         String url = "jdbc:mysql://localhost:3306/archivio_sp";
         Connection conn = DriverManager.getConnection(url,"root","");
         System.out.println("Connessione stabilita");
         Statement cmd = conn.createStatement();
 
         String qry = "SELECT * FROM utenti WHERE username = 'utente' AND password = 'utente' ";
         ResultSet res = cmd.executeQuery(qry);
         if(res.next()){
            return true;
        }
        
       // while (res.next()) {
       // System.out.println(res.getString("Nome"));
      //  System.out.println(res.getString("Colonna2"));
      //}
         res.close();
         cmd.close();
         conn.close();
    } catch (SQLException e) {
         e.printStackTrace();
    } catch (ClassNotFoundException e) {
         e.printStackTrace();
       } 
        
        
        /*
        if (username.equals("user") && password.equals("pass"))
            return true;
        */
        return false;
    }
    
    
    
    public static List<Utente> restituisciUtenti () throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
  
        
       // try {
         String driver = "com.mysql.jdbc.Driver";
         Class.forName(driver).newInstance();
         String url = "jdbc:mysql://localhost:3306/archivio_sp";
         Connection conn = DriverManager.getConnection(url,"root","");
         System.out.println("Connessione stabilita");
         Statement cmd = conn.createStatement();
 
         String qry = "SELECT * FROM utenti";
         ResultSet res = cmd.executeQuery(qry);
         System.out.println("sto qui"); 
         
        List <Utente> utenti = new ArrayList <Utente>();
        while (res.next()) {
            utenti.add(new Utente(res.getInt("id"),res.getString("nome"),res.getString("username"),res.getString("password")));
                    }

         
         return utenti;
        
       
    
}

    
    
     public static List<ContattoRow> restituisciContattiRow (){
  
        Connection conn = null;
        List <ContattoRow> contatti = null;
    try{
         String driver = "com.mysql.jdbc.Driver";
         Class.forName(driver).newInstance();
         String url = "jdbc:mysql://localhost:3306/archivio_sp";
         conn = DriverManager.getConnection(url,"root","");
 
         System.out.println("Connessione stabilita");
         Statement cmd = conn.createStatement();
 
         String qry = "SELECT id,nome,cognome,email,cellulare FROM contatti";
         ResultSet res = cmd.executeQuery(qry);
    
         
         //System.out.println("sto qui"); 
         
        contatti = new ArrayList <ContattoRow>();
        while (res.next()) {
            contatti.add(new ContattoRow(res.getInt("id"),res.getString("nome"),res.getString("cognome"),res.getString("email"),res.getString("cellulare")));
                    }
     conn.close();
    }
    catch (Exception e) {
        System.out.println(e.toString()); 
    }
    
         return contatti;
        
       
    
}
    
    
    

}