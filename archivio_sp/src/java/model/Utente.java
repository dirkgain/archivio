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
public class Utente {
    
    
            
    int id;
    String nome;
    String username;
    String password;

    public Utente() {
    }

    public Utente(int id, String nome, String username, String password) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.password = password;
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
    
    
    
    
}
