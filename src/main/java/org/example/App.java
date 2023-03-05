package org.example;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplication(4, 2);
        System.out.println(calculator.getResult());
        calculator.division(10, 1.4);
        System.out.println(calculator.getDivisionResult());

        //Ex.3
        int seven = 7;
        while (seven <= 98) {
            System.out.println(seven);
            seven = seven + 7;
        }
        //Ex.4
        final int SIZE = 20;
        int[] newArray = new int[SIZE];
        int sum = 0;
        Random rd = new Random();
        for (int i = 0; i < SIZE; i++) {
            newArray[i] = rd.nextInt();
            sum = sum + newArray[i];
        }
        System.out.println("The average number is " + sum / SIZE);
        //Ex.5
        int[] tenNumbers = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            tenNumbers[i] = rd.nextInt();
        }
        int max = tenNumbers[0];
        for (int j = 0; j < 10; j++) {
            if (tenNumbers[j] > max) {
                max = tenNumbers[j];
            }
        }
        System.out.println("The maximal number is " + max);
        int min = tenNumbers[0];
        for (int k = 0; k < 10; k++) {
            if (tenNumbers[k] < min) {
                min = tenNumbers[k];
            }


        }
        System.out.println("The minimal number is " + min);
    }
}

