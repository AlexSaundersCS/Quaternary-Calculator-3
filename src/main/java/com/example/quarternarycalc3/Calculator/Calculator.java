package com.example.quarternarycalc3.Calculator;

import java.lang.Math.*;

public class Calculator {

    public Calculator(){
    }

    public int addition(int num1, int num2){
        return num1 + num2;
    }

    public int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public int division(int num1, int num2){
        return num1 / num2;
    }

    public int squareRoot(int num1){
        return (int) Math.sqrt(num1);
    }

    public int exponents(int num1){
        return num1 * num1;
    }


}