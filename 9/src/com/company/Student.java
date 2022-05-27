package com.company;

import java.util.ArrayList;

public class Student {
    private String jmeno;
    private String prijmeni;
    private ArrayList<Integer> znamky;
    public static int pocetStudentu;

    public Student(String jmeno, String prijmeni){
        pocetStudentu += 1;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.znamky = new ArrayList<>();
    }

    public void pridatZnamku(int znamka){
        this.znamky.add(znamka);
    }

    public double prumer(){
        double temp = 0;
        for (int i = 0; i < znamky.size(); i++){
            temp += znamky.get(i);
        }

        return temp / znamky.size();
    }

    public static int getPocetStudentu(){
        return pocetStudentu;
    }
}
