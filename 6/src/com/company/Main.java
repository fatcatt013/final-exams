package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidInputException {
        String input1 = firstInput();
        String input2 = secondInput();

        System.out.println(input1);
        System.out.println(input2);
    }

    public static String firstInput() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte retezec, ktery ma cislo na prvnim miste: ");
        String input = sc.nextLine();

        if (input == ""){
            throw new InvalidInputException("Retezec je prazdny");
        }

        try {
            Integer.parseInt(input.substring(0,1));
        } catch (Exception e) {
            throw new InvalidInputException("Na prvnim miste neni cislice");
        }
        return input;
    }

    public static String secondInput() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cislo od 1 do 10: ");
        String input = sc.nextLine();
        int intInput;

        if (input == ""){
            throw new InvalidInputException("Retezec je prazdny");
        }

        try {
            intInput = Integer.parseInt(input);
        } catch (Exception e) {
            throw new InvalidInputException("Zadana hodnota neni cislem");
        }

        if (intInput < 0 || intInput > 10){
            throw new InvalidInputException("Cislo je bud mensi nez 0 nebo vetsi nez 10");
        }

        return input;
    }
}
