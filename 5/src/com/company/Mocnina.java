package com.company;

import java.util.Arrays;

public class Mocnina {

    public static int mocnina(int num){
        return num * num;
    }

    public static void mocnina(int[] data){
        //data [base, exp, temp] or [base, exp]
        int base = data[0];
        int exp = data[1];
        int temp = 1;
        if (data.length == 3){
            temp = data[2];
        }
        temp = temp * base;
        exp--;
        if (exp == 0){
            System.out.println(temp);
        } else {
            mocnina(new int[]{base, exp, temp});
        }
    }
}

