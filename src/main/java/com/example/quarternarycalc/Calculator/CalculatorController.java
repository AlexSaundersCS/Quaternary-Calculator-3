package com.example.quarternarycalc.Calculator;
import java.util.ArrayList;

public class CalculatorController {
    ArrayList<Integer> number1;
    ArrayList<Integer> number2;
    CalcOperation operation;
    ArrayList<Integer> result;
    Calculator calculator;

    public CalculatorController() {
        this.number1 = new ArrayList<Integer>();
        this.number2 = new ArrayList<Integer>();
        this.result = new ArrayList<Integer>();
        this.calculator = new Calculator();
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

    public void handleOperationPressed(CalcOperation operation){
        setOperation(operation);
    }

    public void handleEqualPress(){
        switch (operation){
            case CalcOperation.Add ->
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
}
