package com.example.quarternarycalc3.Calculator;

import java.lang.Math.*;

public class Calculator {

    public Calculator(){
    }

    public int addition(int num1, int num2){
        int result = num1 + num2;
        try{
            if (num1 < 0 || num2 < 0 || result < 0) {
                throw new Exception();
            }
        } catch(Exception e){
            return 0;
        }
        return result;
    }

    public int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public int division(int num1, int num2){
        try{
            int number1 = 10;
            int number2 = 0;
            int result = number1/number2;
            System.out.println(result);
        } catch(Exception e){
            return 0;
        }
        return num1 / num2;
    }

    public int squareRoot(int num1){
        return (int) Math.sqrt(num1);
    }

    public int exponents(int num1){
        return num1 * num1;
    }


}
