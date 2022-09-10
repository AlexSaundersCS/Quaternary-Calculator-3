package QuaternaryConverter;

import com.example.quarternarycalc.QuaternaryConverter.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ToDecimal {

    QuaternaryConverter quaternaryConverter = new QuaternaryConverter();

    @Test
    void WhenInputIsEmptyShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            quaternaryConverter.toDecimal(null);
        });
    }

    @Test
    void ConvertToDecimal_Zero(){
         ArrayList<Integer> zero = new ArrayList<Integer>();
         zero.add(0);
        int result = quaternaryConverter.toDecimal(zero);
        Assertions.assertEquals(0,result);
    }

    @Test
    void ConvertToDecimal_One(){
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        int result = quaternaryConverter.toDecimal(one);
        Assertions.assertEquals(1,result);
    }

    @Test
    void ConvertToDecimal_10(){
        ArrayList<Integer> four = new ArrayList<Integer>();
        four.add(1);
        four.add(0);
        System.out.println(four);
        int result = quaternaryConverter.toDecimal(four);
        Assertions.assertEquals(4,result);
    }

    @Test
    void ConvertToDecimal_231(){
        ArrayList<Integer> fortyFive = new ArrayList<Integer>();
        fortyFive.add(2);
        fortyFive.add(3);
        fortyFive.add(1);
        System.out.println(fortyFive);
        int result = quaternaryConverter.toDecimal(fortyFive);
        Assertions.assertEquals(45,result);
    }

    @Test
    void ConvertToDecimal_03120102(){
        ArrayList<Integer> bigNumber = new ArrayList<Integer>();
        bigNumber.add(0);bigNumber.add(3);bigNumber.add(1);bigNumber.add(2);
        bigNumber.add(0);bigNumber.add(1);bigNumber.add(0);bigNumber.add(2);
        int result = quaternaryConverter.toDecimal(bigNumber);
        Assertions.assertEquals(13842,result);
    }
}
