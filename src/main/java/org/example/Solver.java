package org.example;

public class Solver {
    int d;
    int number;

    public int numberOfRoots(int a, int b, int c) {
        d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("There is no roots of the equation");
            number = 0;

        } else if (d == 0) {
            System.out.println("There is one root");
            number = 1;
        } else number = 2;
        System.out.println("There are 2 roots");
        return number;

    }
}
