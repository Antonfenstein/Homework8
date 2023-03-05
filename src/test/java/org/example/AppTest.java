package org.example;

import org.junit.*;

import static jdk.nashorn.internal.objects.Global.Infinity;

import static org.junit.Assert.*;

public class AppTest {
    Calculator calculator;

    @Before
    public void setupEachTest() {
        calculator = new Calculator();
    }

    @Test
    public void regularMultiplication() {
        double result = calculator.multiplication(1.5, 10.5);
        assertEquals(15.75, result, 0.01);
    }

    @Test
    public void multiplicationNegatives() {
        double result = calculator.multiplication(-1.5, -10.5);
        assertEquals(15.75, result, 0.01);
    }

    @Test
    public void multiplicationZero() {
        double result = calculator.multiplication(1.5, 0);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void regularDivision() {
        double result = calculator.division(2.7, 1.4);
        assertEquals(1.9285, result, 0.01);
    }

    @Test
    public void zeroDivision() {
        double result = calculator.division(0, 1.4);
        assertEquals(0, result, 0.01);
    }
    @Test
    public void divisionOfZero() {
        double result = calculator.division(1.5, 0);
        assertEquals(Infinity, result, 0.01);
    }
    @Test
    public void divisionOfNegatives() {
        double result = calculator.division(-2.7, -1.4);
        assertEquals(1.9285, result, 0.01);
}}