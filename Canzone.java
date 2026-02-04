package org.example;

public class Canzone {
    private String titolo;
    private int durata;
    public Canzone(String titolo,  int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }
    public Canzone(){};
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public String toString() {
        return titolo + " " + durata;
    }
}
