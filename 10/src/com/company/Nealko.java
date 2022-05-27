package com.company;

public class Nealko implements IPlaceniRestaurace{
    public double cenaBezDPH;
    public String nazev;

    public Nealko(double cena, String nazev){
        this.cenaBezDPH = cena;
        this.nazev = nazev;
    }

    @Override
    public double vypocetDPH() {
        return this.cenaBezDPH * 1.1;
    }
}
