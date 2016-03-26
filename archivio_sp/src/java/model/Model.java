/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
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
public class Model implements Serializable{
    
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
    
    
    
    public  List<Utente> restituisciUtenti () throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
  
        
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

    
    
     public  List<ContattoRow> restituisciContattiRow (){
  
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
    
    
    public  Contatto restituisciContatto (int id){
  
        Connection conn = null;
        Contatto contatto = null;
        
    try{
         String driver = "com.mysql.jdbc.Driver";
         Class.forName(driver).newInstance();
         String url = "jdbc:mysql://localhost:3306/archivio_sp";
         conn = DriverManager.getConnection(url,"root","");
 
         System.out.println("Connessione stabilita");
         Statement cmd = conn.createStatement();
 
         String qry = "SELECT * FROM contatti WHERE id="+id;
         ResultSet res = cmd.executeQuery(qry);
    
         
         //System.out.println("sto qui"); 
         
        
        while (res.next()) {
            contatto = new Contatto (id, res.getString("nome"), res.getString("cognome"), (java.util.Date)res.getTimestamp("data_di_nascita"), res.getString("comune_di_residenza"),res.getString("indirizzo"), res.getString("cap"), res.getString("provincia"), res.getString("telefono"), res.getString("cellulare"), res.getString("email"), res.getString("professione"), res.getString("sede_di_servizio"), res.getString("materia"), res.getString("note"), null, null);
                    }
     conn.close();
    }
    catch (Exception e) {
        System.out.println(e.toString()); 
    }
    
         return contatto;
        
       
    
}

    
    public  boolean aggiornaContatto (Contatto contatto){
  
        Connection conn = null;
       int idContatto = contatto.getId();
        
    try{
         String driver = "com.mysql.jdbc.Driver";
         Class.forName(driver).newInstance();
         String url = "jdbc:mysql://localhost:3306/archivio_sp";
         conn = DriverManager.getConnection(url,"root","");
 
         System.out.println("Connessione stabilita");
         Statement cmd = conn.createStatement();
 
         String qry = "UPDATE contatti SET nome='"+contatto.getNome()+"' WHERE id="+idContatto;
         cmd.executeUpdate(qry);
    
         
        
     conn.close();
    }
    catch (Exception e) {
        System.out.println(e.toString()); 
    }
    
         return true;
        
       
    
}
    
    
    
}