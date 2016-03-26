/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Model;

/**
 *
 * @author Ingegnere
 */

@ManagedBean
@ViewScoped
public class ListaContattiView implements Serializable{
   private List <UtenteBean> utenti; 
   UtenteBean utente;
   ResultSet resUtente;
   Model modello;

    public ListaContattiView() {
    }
   
    /**
     *
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
   
   
   
    //@PostConstruct
    public void init() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
    {
        resUtente = Model.restituisciUtenti();
        utente.nome=resUtente.getString("nome");
        
    }
}
