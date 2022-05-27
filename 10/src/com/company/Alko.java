package com.company;

public class Alko implements IPlaceniRestaurace{
    public double cenaBezDPH;
    public String nazev;
    public Alko(double cena, String nazev){
        this.cenaBezDPH = cena;
        this.nazev = nazev;
    }

    @Override
    public double vypocetDPH() {
        return this.cenaBezDPH * 1.21;
    }
}
