package QuaternaryConverter;

import com.example.quarternarycalc.QuaternaryConverter.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ToQuaternary {
    QuaternaryConverter quaternaryConverter = new QuaternaryConverter();

    @Test
    void WhenInputIsNegativeShouldRaiseException(){
    Assertions.assertThrows(Exception.class,()->{
        quaternaryConverter.toQuaternary(-51);
    });
    }

    @Test
    void ConvertToQuaternary_Zero(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(0);
        ArrayList<Integer> testValue = new ArrayList<Integer>();
        testValue.add(0);
        assertArrayEquals(testValue.toArray(),result.toArray());
    }

    @Test
    void ConvertToQuaternary_One(){
        ArrayList<Integer>result = quaternaryConverter.toQuaternary(1);
        ArrayList<Integer> testValue = new ArrayList<Integer>();
        testValue.add(1);
        assertArrayEquals(testValue.toArray(),result.toArray());
    }

    @Test
    void ConvertToQuaternary_Four(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(4);
        ArrayList<Integer> testValue = new ArrayList<Integer>();
        testValue.add(1);
        testValue.add(0);
        assertArrayEquals(testValue.toArray(),result.toArray());
    }

    @Test
    void ConvertToQuaternary_Seven(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(7);
        ArrayList<Integer> testValue = new ArrayList<Integer>();
        testValue.add(1);
        testValue.add(3);
        assertArrayEquals(testValue.toArray(),result.toArray());
    }

    @Test
    void ConvertToQuaternary_Thirteen(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(13);
        assertArrayEquals(new int[]{1,3},result);
    }

    @Test
    void ConvertToQuaternary_TwentyTwo(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(22);
        assertArrayEquals(new int[]{1,1,2},result);
    }

    @Test
    void ConvertToQuaternary_OneHundredAndFive(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(105);
        assertArrayEquals(new int[]{1221},result);
    }

    @Test
    void ConvertToQuaternary_FiveHundredSeventyFive(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(105);
        assertArrayEquals(new int[]{1221},result);
    }




}
