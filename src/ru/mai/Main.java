package ru.mai;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        typesExample();
//        arraysExample();
//        exceptionsExampleInt();
        exceptionsExampleFloat();
    }

    /**
     * Arrays and foreach example
     */
    private static void arraysExample() {
        int[] array = new int[10];
        Arrays.fill(array, 1000);

        int[] array2 = Arrays.copyOf(array, 20);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

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

    private static void typesExample() {
        char ch = '9';
        int chInt = Character.getNumericValue(ch);
        int chInt10 = Character.digit(ch, 10);
        int chInt8 = Character.digit(ch, 8);
        System.out.println(ch);
        System.out.println(chInt);
        System.out.println(chInt10);
        System.out.println(chInt8);
    }

    private static void exceptionsExampleInt() {
        int a = 10, b = 0, res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Ошибка деления на 0");
            System.out.println(e.getMessage());
        }
        System.out.println(res);
    }

    private static void exceptionsExampleFloat() {
        float a = -1, b = 0, res = 0;

        try {
            res = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Ошибка деления на 0");
            System.out.println(e.getMessage());
        }
        System.out.println(res);
        System.out.println(res + 10);
        System.out.println(res + 100000000);
        System.out.println(res * 0);
        System.out.println((res + 1.0) / 0);
    }

}
