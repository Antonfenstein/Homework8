package org.example;

public class Calculator {
    private double result, divisionResult;

    public double multiplication(double a, double b) {
        result = a * b;
        return result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double division(double c, double d) {
        divisionResult = c / d;
        return divisionResult;
    }

    public double getDivisionResult() {
        return divisionResult;
    }

    public void setDivisionResult(double divisionResult) {
        this.divisionResult = divisionResult;
    }
}
