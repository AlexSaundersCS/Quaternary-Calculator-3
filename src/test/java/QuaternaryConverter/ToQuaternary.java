package QuaternaryConverter;

import com.example.quarternarycalc3.QuaternaryConverter.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ToQuaternary {
    QuaternaryConverter quaternaryConverter = new QuaternaryConverter();


    @Test
    void ConvertToQuaternary_Zero(){
        int[] result = quaternaryConverter.toQuaternary(0);
        Assertions.assertArrayEquals(result, new int[]{0});
    }

    @Test
    void ConvertToQuaternary_One(){
        int[] result = quaternaryConverter.toQuaternary(4);
        Assertions.assertArrayEquals(result, new int[]{1, 0});
    }

    @Test
    void ConvertToQuaternary_Two(){
        int[] result = quaternaryConverter.toQuaternary(4896);
        Assertions.assertArrayEquals(result, new int[]{1, 0, 3, 0, 2, 0, 0});
    }

    @Test
    void ConvertToQuaternary_Three(){
        int[] result = quaternaryConverter.toQuaternary(349525);
        Assertions.assertArrayEquals(result, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
    }

    @Test
    void ConvertToQuaternary_Four(){
        int[] result = quaternaryConverter.toQuaternary(5105);
        Assertions.assertArrayEquals(result, new int[]{1, 0, 3, 3, 3, 0, 1});
    }

    @Test
    void ConvertToQuaternary_Five(){
        int[] result = quaternaryConverter.toQuaternary(3654);
        Assertions.assertArrayEquals(result, new int[]{3, 2, 1, 0, 1, 2});
    }

    @Test
    void ConvertToQuaternary_Six(){
        int[] result = quaternaryConverter.toQuaternary(23280);
        Assertions.assertArrayEquals(result, new int[]{1, 1, 2, 2, 3, 3, 0, 0});
    }




}
