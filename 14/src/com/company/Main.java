package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(sifra("Jedu si takhle taborit"));
    }

    public static String sifra(String text){
        String[] slova = text.split(" ");
        String output = "";

        for (int i = 0; i < slova.length; i++){
            String temp = slova[i];
            for (int y = 0; y < temp.length(); y++){
                int tempChar = temp.charAt(y);
                output += "*" + tempChar;
            }
            output += "* ";
        }

        return output;
    }
}
