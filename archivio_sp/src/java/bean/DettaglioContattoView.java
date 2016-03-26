/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Contatto;

/**
 *
 * @author Ingegnere
 */

@ManagedBean(name = "dettaglioContatto")
@RequestScoped
public class DettaglioContattoView {
    
    Contatto contatto;

    public DettaglioContattoView() {
    }

 
    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }
    
    
    
}
