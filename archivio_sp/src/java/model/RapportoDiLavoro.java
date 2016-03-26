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
public class RapportoDiLavoro {
    int id;
    String nomeAzienda;
    String mansione;

    public RapportoDiLavoro() {
    }

    public RapportoDiLavoro(int id, String nomeAzienda, String mansione) {
        this.id = id;
        this.nomeAzienda = nomeAzienda;
        this.mansione = mansione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getMansione() {
        return mansione;
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }
 
    
    
}
