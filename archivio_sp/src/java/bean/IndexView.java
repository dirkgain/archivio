/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.*;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.Model;

/**
 *
 * @author Ingegnere
 */

@ManagedBean
@RequestScoped
public class IndexView implements Serializable {
    
    String username;
    String password;

    public IndexView() {
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String doLogin () throws InstantiationException, IllegalAccessException{
        
        if (Model.checkLogin(username,password)) 
        {
            UtenteBean utenteBean= new UtenteBean(username,"test",true);
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().getSessionMap().put("utenteBean", utenteBean);
            return "elencoContatti";
        }
        
        
        username="";
        password="";
        return "index";
    }
    
    
}
