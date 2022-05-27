package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mince> arr = new ArrayList<>();

        arr.add(new Mince(10, 5));
        arr.add(new Mince(50, 54));
        arr.add(new Mince(20, 26));
        arr.add(new Mince(200, 97));
        arr.add(new Mince(1000, 10));
        arr.add(new Mince(56, 26));
        arr.add(new Mince(30, 1));

        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
