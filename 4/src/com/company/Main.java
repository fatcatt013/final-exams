package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> suda = new ArrayList<>();
        ArrayList<Integer> licha = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;

        while (true){
            System.out.println("Zadejte cislo:");
            num = Integer.parseInt(sc.nextLine());
            if (num == 0){
                break;
            } else if (num % 2 == 0){
                suda.add(num);
            } else {
                licha.add(num);
            }
        }
        System.out.println(suda);
        System.out.println(licha);
    }
}
