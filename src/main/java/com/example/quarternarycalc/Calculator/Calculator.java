package com.example.quarternarycalc.Calculator;

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
        int result = num1 - num2;
        try{
            if (num1 < 0 || num2 < 0 || result < 0) {
                throw new Exception();
            }
        } catch(Exception e){
            return 0;
        }
        return result;
    }

    public int multiplication(int num1, int num2){
        int result = num1 * num2;
        try{
            if (num1 < 0 || num2 < 0 || result < 0) {
                throw new Exception();
            }
        } catch(Exception e){
            return 0;
        }
        return result;
    }

    public int division(int num1, int num2){
        int result;
        try{
            if (num1 < 0 || num2 <= 0) {
                throw new Exception();
            }
            result = num1 / num2;
        } catch(Exception e){
            return 0;
        }
        return (int) Math.round(result);
    }

    public int squareRoot(int num1){
        int result = (int) Math.sqrt(num1);
        try{
            if (num1 < 0 || result < 0) {
                throw new Exception();
            }
        } catch(Exception e){
            return 0;
        }
        return Math.round(result);
    }

    public int exponents(int num1){
        int result = num1 * num1;
        try{
            if (num1 < 0 || result < 0) {
                throw new Exception();
            }
        } catch(Exception e){
            return 0;
        }
        return result;
    }
}
