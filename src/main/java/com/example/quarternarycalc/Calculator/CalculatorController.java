package com.example.quarternarycalc.Calculator;
import com.example.quarternarycalc.QuaternaryConverter.QuaternaryConverter;

import java.util.ArrayList;

public class CalculatorController {
    ArrayList<Integer> number1;
    ArrayList<Integer> number2;
    CalcOperation operation;
    ArrayList<Integer> result;
    Calculator calculator;
    QuaternaryConverter converter;

    public CalculatorController() {
        this.number1 = new ArrayList<Integer>();
        this.number2 = new ArrayList<Integer>();
        this.result = new ArrayList<Integer>();
        this.calculator = new Calculator();
        this.converter = new QuaternaryConverter();
        this.operation = null;
    }

    public void handleNumberPressed(int number){
        if(operation == null){
            this.number1.add(number);
            return;
        }
        this.number2.add(number);
        return;
    }

    public void handleBinaryOperationPressed(CalcOperation operation){
        setOperation(operation);
    }

    public void handleExponentPressed(){
        this.operation = CalcOperation.Exponent;
        int convertedNum1 =converter.toDecimal(number1);
         int result = calculator.exponents(convertedNum1);
         setResult(converter.toQuaternary(result));
    }

    public void handleSquareRootPressed(){
        this.operation = CalcOperation.Root;
        int convertedNum1 =converter.toDecimal(number1);
        int result = calculator.squareRoot(convertedNum1);
        setResult(converter.toQuaternary(result));
    }

    public void handleEqualPress(){
        int convertedNum1 = converter.toDecimal(this.number1);
        int convertedNum2 = converter.toDecimal(this.number2);

        switch (operation){
            case Add:
                var intResult = calculator.addition(convertedNum1,convertedNum2);
                System.out.println(intResult);
                setResult(converter.toQuaternary(intResult));
                break;
            case Subtract:
                intResult =calculator.subtraction(convertedNum1,convertedNum2);
                setResult(converter.toQuaternary(intResult));
                break;
            case Multiply:
                intResult =calculator.multiplication(convertedNum1,convertedNum2);
                setResult(converter.toQuaternary(intResult));
                break;
            case Divide:
                intResult =calculator.division(convertedNum1,convertedNum2);
                setResult(converter.toQuaternary(intResult));
                break;
        }

    }

    public ArrayList<Integer> getNumber1() {
        return number1;
    }

    public void setNumber1(ArrayList<Integer> number1) {
        this.number1 = number1;
    }

    public ArrayList<Integer> getNumber2() {
        return number2;
    }

    public void setNumber2(ArrayList<Integer> number2) {
        this.number2 = number2;
    }

    public CalcOperation getOperation() {
        return operation;
    }

    public void setOperation(CalcOperation operation) {
        this.operation = operation;
    }

    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }
    public  void handleClear(){
        number1 = new ArrayList<>();
        operation = null;
        number2 = new ArrayList<>();
        result = new ArrayList<>();
    }
    public  void handleDelete(){
        if(operation == null){
            this.number1 = new ArrayList<>();
            return;
        }
        this.number2 = new ArrayList<>();
        return;
    }
}
