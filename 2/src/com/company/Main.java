package com.company;

public class Main {

    public static void main(String[] args) {
	    FIFO fifo = new FIFO();
	    fifo.push(1);
        fifo.push(2.01);
        fifo.push(3.5);
        fifo.push(4.09);
        fifo.push(5);
        System.out.println(fifo);

        for (int i = 0; i < 3; i++){
            fifo.pop();
            System.out.println(fifo);
        }
    }
}
