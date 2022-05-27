package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Clovek> studenti = new ArrayList<>();
        String[] hledany = new String[]{"Lionel", "Messi"};

        studenti.add(new Clovek("Adam", "Hlozek"));
        studenti.add(new Clovek("Cristiano", "Ronaldo"));
        studenti.add(new Clovek("Lionel", "Messi"));

        for (Clovek s: studenti){
            if (hledany[0] == s.jmeno && hledany[1] == s.prijmeni){
                System.out.println(s);
                System.out.println(studenti.indexOf(s));
            }
        }
    }
}
