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
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        one.add(0);
        int result = quaternaryConverter.toDecimal(one);
        Assertions.assertEquals(4,result);
    }

    @Test
    void ConvertToDecimal_231(){
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(2);
        one.add(3);
        one.add(1);
        int result = quaternaryConverter.toDecimal(one);
        Assertions.assertEquals(45,result);
    }

    @Test
    void ConvertToDecimal_03120102(){
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(0);one.add(3);one.add(1);one.add(2);
        one.add(0);one.add(1);one.add(0);one.add(2);
        int result = quaternaryConverter.toDecimal(one);
        Assertions.assertEquals(13842,result);
    }
}
