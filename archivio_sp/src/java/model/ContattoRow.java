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
public class ContattoRow {
    
    int id;
    String nome;
    String cognome;
    String email;
    String cellulare;

    public ContattoRow() {
    }

    public ContattoRow(int id, String nome, String cognome, String email, String cellulare) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.cellulare = cellulare;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }
    
    
    
}
