package com.company;

public class Jidlo implements IPlaceniRestaurace{
    public double cenaBezDPH;
    public String nazev;

    public Jidlo(double cena, String nazev){
        this.cenaBezDPH = cena;
        this.nazev = nazev;
    }

    @Override
    public double vypocetDPH() {
        return this.cenaBezDPH * 1.1;
    }
}
