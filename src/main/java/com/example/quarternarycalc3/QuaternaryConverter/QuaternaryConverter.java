package com.example.quarternarycalc3.QuaternaryConverter;
public class QuaternaryConverter {
    public QuaternaryConverter() {

    }
    public int toDecimal(int[] quaternaryNumber){
        int quaternaryPower = quaternaryNumber.length - 1;
        int decimalNumber = 0;

        for (int digit : quaternaryNumber) {
            decimalNumber += digit * (4 ^ quaternaryPower);
            quaternaryPower -= 1;
        }

            return decimalNumber;
    }



    public int[] toQuaternary(int decimalNumber){
        return new int[]{1};
    }
}
