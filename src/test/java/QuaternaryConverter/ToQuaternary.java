package QuaternaryConverter;

import com.example.quarternarycalc3.QuaternaryConverter.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        int[] result = quaternaryConverter.toQuaternary(0);
        assertArrayEquals(new int[]{0},result);
    }

    @Test
    void ConvertToQuaternary_One(){
        int[] result = quaternaryConverter.toQuaternary(1);
        assertArrayEquals(new int[]{1},result);
    }

    @Test
    void ConvertToQuaternary_Four(){
        int[] result = quaternaryConverter.toQuaternary(4);
        assertArrayEquals(new int[]{1},result);
    }

    @Test
    void ConvertToQuaternary_Seven(){
        int[] result = quaternaryConverter.toQuaternary(7);
        assertArrayEquals(new int[]{1},result);
    }

    @Test
    void ConvertToQuaternary_Thirteen(){
        int[] result = quaternaryConverter.toQuaternary(13);
        assertArrayEquals(new int[]{1,3},result);
    }

    @Test
    void ConvertToQuaternary_TwentyTwo(){
        int[] result = quaternaryConverter.toQuaternary(22);
        assertArrayEquals(new int[]{1,1,2},result);
    }

    @Test
    void ConvertToQuaternary_OneHundredAndFive(){
        int[] result = quaternaryConverter.toQuaternary(105);
        assertArrayEquals(new int[]{1221},result);
    }

    @Test
    void ConvertToQuaternary_FiveHundredSeventyFive(){
        int[] result = quaternaryConverter.toQuaternary(105);
        assertArrayEquals(new int[]{1221},result);
    }




}
