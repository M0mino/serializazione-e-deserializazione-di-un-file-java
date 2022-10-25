package it.momo;

import java.sql.Date;

public class alunno {
    
    private String nome;
    private String cognome;
    private Date DNascita;

    public alunno() {
    }

    public alunno(String nome, String cognome, Date dNascita) {
        this.nome = nome;
        this.cognome = cognome;
        DNascita = dNascita;
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
    public Date getDNascita() {
        return DNascita;
    }
    public void setDNascita(Date dNascita) {
        DNascita = dNascita;
    }


    

}
