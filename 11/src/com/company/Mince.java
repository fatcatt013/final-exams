package com.company;

public class Mince implements Comparable<Mince>{
    public int hodnota;
    public int hmotnost;

    public Mince(int hmotnost, int hodnota){
        this.hmotnost = hmotnost;
        this.hodnota = hodnota;
    }


    @Override
    public int compareTo(Mince o) {
        if (this.hodnota > o.hodnota){
            return 1;
        } else if (this.hodnota == o.hodnota){
            if (this.hmotnost > o.hmotnost){
                return 1;
            } else if (this.hmotnost == o.hmotnost){
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Mince{" +
                "hodnota=" + hodnota +
                ", hmotnost=" + hmotnost +
                '}';
    }
}
