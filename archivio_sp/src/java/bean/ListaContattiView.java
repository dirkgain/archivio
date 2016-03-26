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
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import model.Contatto;
import model.ContattoRow;
import model.Model;
import model.Utente;

/**
 *
 * @author Ingegnere
 */

@ManagedBean
//@RequestScoped
@SessionScoped
public class ListaContattiView implements Serializable{
   private List <CurrentUserBean> utenti; 

   @ManagedProperty("#{model}")
   private Model model;
   
   @ManagedProperty("#{dettaglioContatto}")
   private DettaglioContattoView dettaglioContatto;

    public void setModel(Model model) {
        this.model = model;
    }
   
      public void setDettaglioContatto(DettaglioContattoView dettaglioContatto) {
        this.dettaglioContatto = dettaglioContatto;
    }
    
    public ListaContattiView() {
    }
   
    
   
    //@PostConstruct
    public void init() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
    {
             
    }
    
    
    public List<ContattoRow> getContatti(){
      return model.restituisciContattiRow();
    }
    
    public String editSelezionato (int id){
        
        Contatto contatto = model.restituisciContatto(id);
        
        dettaglioContatto.setContatto(contatto);
                  
        return "dettaglioContatto";
    }
    
    
}
