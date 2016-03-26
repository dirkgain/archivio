/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ingegnere
 */
public class TitoloDiStudio {
    int id;
    String titolo;

    public TitoloDiStudio(int id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
    
    
    
    
}

