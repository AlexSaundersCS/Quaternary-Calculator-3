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
        {
            ArrayList<Integer> result = new ArrayList<Integer>();
            if(decimalNumber ==0){
                result.add(0);
                return result;
            }

            while (decimalNumber > 0)
            {
                result.add(0, decimalNumber % 4);
                decimalNumber /= 4;
            }

            // Reverse the result
            return result;
        }
    }
}
