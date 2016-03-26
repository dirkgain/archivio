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
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import model.ContattoRow;
import model.Model;
import model.Utente;

/**
 *
 * @author Ingegnere
 */

@ManagedBean
@ViewScoped
public class ListaContattiView implements Serializable{
   private List <CurrentUserBean> utenti; 
  // CurrentUserBean utente;
   @ManagedProperty("#{model}")
   private Model model;

    public ListaContattiView() {
    }
   
    
   
    //@PostConstruct
    public void init() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
    {
             
    }
    
    
    public List<ContattoRow> getContatti(){
      return model.restituisciContattiRow();
    }
    
}
