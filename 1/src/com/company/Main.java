package com.company;

public class Main {

    public static void main(String[] args) {
	    MyArrayList<Integer> arrayList = new MyArrayList<>();
	    arrayList.add(30);
        arrayList.add(13);
        arrayList.add(18);
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
