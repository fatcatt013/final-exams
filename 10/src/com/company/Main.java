package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IPlaceniRestaurace> objednavka= new ArrayList<>();
        objednavka.add(new Alko(45, "pivo"));
        objednavka.add(new Jidlo(120, "Pizza"));
        objednavka.add(new Alko(45, "pivo"));
        objednavka.add(new Nealko(30, "Coca Cola"));

        double celkovaCena = 0;
        for (var zbozi: objednavka){
            celkovaCena += zbozi.vypocetDPH();
        }

        System.out.println(objednavka);
        System.out.println(celkovaCena);
    }
}
