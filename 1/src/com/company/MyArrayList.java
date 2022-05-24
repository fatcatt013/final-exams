package com.company;


import java.util.Arrays;

public class MyArrayList<E> {

    private int position;
    private E[] array;

    public MyArrayList() {
        this.position = 0;
        this.array = (E[])(new Object[5]);
    }

    public void add(E newItem) {
        if (this.position == this.array.length) grow();
        this.array[this.position] = newItem;
        this.position++;
    }

    public void grow(){
        E[] newArray = (E[])(new Object[2 * this.array.length]);
        for (int i = 0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public E get(int index){
        if (index <= array.length - 1){
            return this.array[index];
        }
        return null;
    }

    public void remove(int index){
        E[] newArray = (E[])(new Object[this.array.length]);
        boolean decrement = false;
        for (int i = 0; i < this.array.length - 1; i++){
            if (i == index){
                decrement = true;
            }
            if (decrement){
                newArray[i] = this.array[i + 1];
            } else {
                newArray[i] = this.array[i];
            }

        }
        this.array = newArray;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "position=" + position +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
