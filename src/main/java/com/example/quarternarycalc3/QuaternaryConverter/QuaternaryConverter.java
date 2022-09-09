package com.example.quarternarycalc3.QuaternaryConverter;

public class QuaternaryConverter {
    public QuaternaryConverter() {

    }
    public int toDecimal(String quaternaryNumber){
        char[] digitsList = quaternaryNumber.toCharArray(); //list of digits in input string
        int quaternaryPower = quaternaryNumber.length() - 1;
        int decimalNumber = 0;

        for (char digit : digitsList) {
            decimalNumber += Character.getNumericValue(digit) * (4 ^ quaternaryPower);
            quaternaryPower -= 1;
        }

            return decimalNumber;
    }



    public int[] toQuaternary(int decimalNumber){
        return new int[]{1};
    }
}
