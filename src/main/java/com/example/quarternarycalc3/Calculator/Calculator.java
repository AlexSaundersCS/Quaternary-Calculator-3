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

    public int division(int num1, int num2) {
        int result = 0;
        try {
            if(num1 < 0 || num2 < 0){
                throw new Exception("Numbers must be possible");
            }
            if (num2 == 0) {
                throw new Exception("Can not divide by zero");
            }
            result = Math.round(num1/num2);
        } catch (Exception e) {
            result=0;
        }
        return result;
    }

    public int squareRoot(int num1){
        return (int) Math.sqrt(num1);
    }

    public int exponents(int num1){
        return num1 * num1;
    }


}
