package it.momo;

import java.util.ArrayList;

public class classe {
    private int grado=5;
    private String sezione="B";
    private String posizione="TC-09";

    ArrayList<alunno> LAlunni= new ArrayList<>();

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public ArrayList<alunno> getLAlunni() {
        return LAlunni;
    }

    public void setLAlunni(ArrayList<alunno> lAlunni) {
        LAlunni = lAlunni;
    }

    
}
