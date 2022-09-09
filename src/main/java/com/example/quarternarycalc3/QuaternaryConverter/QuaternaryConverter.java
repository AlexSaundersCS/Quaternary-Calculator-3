package com.example.quarternarycalc3.QuaternaryConverter;

public class QuaternaryConverter {
    public QuaternaryConverter() {

    }
    public int toDecimal(int[] quaternaryNumber){
        int quaternaryPower = quaternaryNumber.length - 1;
        int decimalNumber = 0;

        for (int digit : quaternaryNumber)
        {
            decimalNumber += Math.pow(digit, quaternaryPower);
            quaternaryPower -= 1;
        }
            return decimalNumber;
    }
    public int[] toQuaternary(int integer){
        return new int[]{1};
    }
}
