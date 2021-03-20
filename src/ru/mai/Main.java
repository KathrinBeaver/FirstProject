package ru.mai;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Arrays and foreach
        int[] array = new int[10];
        Arrays.fill(array, 1000);

        for(int el : array) {
            System.out.println(el);
            System.out.println(el * 5);
            el *= 5;
            System.out.println(el);
        }

        int[] smallArray = Arrays.copyOf(array, 5);
        System.out.println("\n New small array length = " + smallArray.length);
        for(int el : smallArray) {
            System.out.println(el);
        }
    }

}
