/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ingegnere
 */
public class Contatto {
 int id;
 String nome;
 String cognome;
 Date dataDiNascita;
 String comuneDiResidenza;
 String indirizzo;
 String cap;
 String provincia;
 String telefono;
 String cellulare;
 String email;
 String professione;
 String sedeDiLavoro;
 String materia;
 String note;
 
 TitoloDiStudio titoloDiStudio;
 ArrayList<RapportoDiLavoro> rapportiDiLavoro;
 

    public Contatto() {
    }

    public Contatto(int id, String nome, String cognome, Date dataDiNascita, String comuneDiResidenza, String indirizzo, String cap, String provincia, String telefono, String cellulare, String email, String professione, String sedeDiLavoro, String materia, String note, TitoloDiStudio titoloDiStudio, ArrayList<RapportoDiLavoro> rapportiDiLavoro) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.comuneDiResidenza = comuneDiResidenza;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.provincia = provincia;
        this.telefono = telefono;
        this.cellulare = cellulare;
        this.email = email;
        this.professione = professione;
        this.sedeDiLavoro = sedeDiLavoro;
        this.materia = materia;
        this.note = note;
        this.titoloDiStudio = titoloDiStudio;
        this.rapportiDiLavoro = rapportiDiLavoro;
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
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
