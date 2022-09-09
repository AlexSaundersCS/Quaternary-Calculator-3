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

            // string to display to user
            String quatResult = "";

            // tracks whether or not the first digit has been decided
            boolean firstDigitFound = false;

            // check for quaternary digits
            for (int i = 9; i > -1; i--) {

                // check if number is greater than or equal to the base-4 number
                if ( ( integer / ( (int)Math.pow(4, i) ) ) >= 1 ) {

                    // add a digit to the result string corresponding to the absolute value quotient below
                    quatResult = quatResult + Integer.toString( integer / (int)Math.pow(4, i) );




                    // set integer to remainder of base-4 number
                    integer = integer % (int)Math.pow(4, i);



                    // now in the middle of the number and must track for zeros
                    firstDigitFound = true;

                }
                // tracks for zeros in number
                else if (firstDigitFound == true && integer / ( (int)Math.pow(4, i) ) < 1) {
                    quatResult = quatResult + "0";
                }

            }

            // if the given integer was zero
            if (quatResult.equals("")) {
                quatResult = quatResult + "0";
            }

            // repackage String into integer array
            int[] packagedResult = new int[quatResult.length()];

            for (int j = 0; j < quatResult.length(); j++) {
                char newDigit = quatResult.charAt(j);

                packagedResult[j] = Character.getNumericValue(newDigit);
            }

            return packagedResult;

    }


}
