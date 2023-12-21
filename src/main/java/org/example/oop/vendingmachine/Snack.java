package org.example.oop.vendingmachine;

public class Snack {
    private int pret;
    private String nume;
    private int cantitate;

    public Snack(int pret, String nume, int cantitate) {
        this.pret = pret;
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public void scadeCantitate() {
        cantitate--;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
