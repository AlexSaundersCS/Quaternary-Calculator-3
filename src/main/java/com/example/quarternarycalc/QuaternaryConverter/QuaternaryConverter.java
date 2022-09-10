package com.example.quarternarycalc.QuaternaryConverter;

import java.util.ArrayList;

public class QuaternaryConverter {
    public QuaternaryConverter() {

    }
    public int toDecimal(ArrayList<Integer> quaternaryNumber){
        int quaternaryPower = quaternaryNumber.size() - 1;
        int decimalNumber = 0;

        for (int digit : quaternaryNumber) {
            decimalNumber += digit * Math.pow(4,quaternaryPower);
            quaternaryPower -= 1;
        }
            return decimalNumber;
    }



    public ArrayList<Integer> toQuaternary(int decimalNumber){
        return new ArrayList<Integer>();
    }
}
