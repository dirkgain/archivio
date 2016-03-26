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
 String sedeDiServizio;
 String materia;
 String note;
 
 TitoloDiStudio titoloDiStudio;
 ArrayList<RapportoDiLavoro> rapportiDiLavoro;
 

    public Contatto() {
    }

    public Contatto(int id, String nome, String cognome, Date dataDiNascita, String comuneDiResidenza, String indirizzo, String cap, String provincia, String telefono, String cellulare, String email, String professione, String sedeDiServizio, String materia, String note, TitoloDiStudio titoloDiStudio, ArrayList<RapportoDiLavoro> rapportiDiLavoro) {
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
        this.sedeDiServizio = sedeDiServizio;
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

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getComuneDiResidenza() {
        return comuneDiResidenza;
    }

    public void setComuneDiResidenza(String comuneDiResidenza) {
        this.comuneDiResidenza = comuneDiResidenza;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfessione() {
        return professione;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public String getSedeDiServizio() {
        return sedeDiServizio;
    }

    public void setSedeDiServizio(String sedeDiServizio) {
        this.sedeDiServizio = sedeDiServizio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TitoloDiStudio getTitoloDiStudio() {
        return titoloDiStudio;
    }

    public void setTitoloDiStudio(TitoloDiStudio titoloDiStudio) {
        this.titoloDiStudio = titoloDiStudio;
    }

    public ArrayList<RapportoDiLavoro> getRapportiDiLavoro() {
        return rapportiDiLavoro;
    }

    public void setRapportiDiLavoro(ArrayList<RapportoDiLavoro> rapportiDiLavoro) {
        this.rapportiDiLavoro = rapportiDiLavoro;
    }
 
 
    
}
