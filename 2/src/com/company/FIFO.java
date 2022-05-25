package com.company;

import java.util.ArrayList;

public class FIFO {
    private ArrayList<Double> arr;

    public FIFO(){
        this.arr = new ArrayList<>();
    }

    public void push(double num){
        this.arr.add(num);
    }

    public void pop(){
        this.arr.remove(0);
    }

    @Override
    public String toString() {
        return "FIFO{" +
                "arr=" + arr +
                '}';
    }
}
