/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author Ingegnere
 */
@ManagedBean
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
    
    
    
    public static ResultSet restituisciUtenti () throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
  
        
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
         return res;
        
        
        
       // while (res.next()) {
       // System.out.println(res.getString("Nome"));
      //  System.out.println(res.getString("Colonna2"));
      //}
         //res.close();
         //cmd.close();
         //conn.close();
    //} catch (SQLException e) {
    //     e.printStackTrace();
   // } catch (ClassNotFoundException e) {
    //     e.printStackTrace();
    //   } 
   
       
    
}


}