/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import model.Contatto;
import model.Model;

/**
 *
 * @author Ingegnere
 */

@ManagedBean(name = "dettaglioContatto")
@RequestScoped
//@SessionScoped
public class DettaglioContattoView {
    
    Contatto contatto;
    
     @ManagedProperty("#{model}")
     private Model model;

      public void setModel(Model model) {
        this.model = model;
    }
      
    public DettaglioContattoView() {
    }

 
    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }
    
    public String aggiornaContatto (){
        
        model.aggiornaContatto(contatto);
        
        return "listaContatti";
    }
    
}
