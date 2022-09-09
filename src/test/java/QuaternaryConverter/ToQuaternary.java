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
        String result = quaternaryConverter.toQuaternary(0);
        Assertions.assertTrue("0".equals( result ) );
    }

    @Test
    void ConvertToQuaternary_One(){
        String result = quaternaryConverter.toQuaternary(4);
        Assertions.assertTrue("10".equals( result ) );
    }

    @Test
    void ConvertToQuaternary_Two(){
        int[] result = quaternaryConverter.toQuaternary(4896);
        Assertions.assertTrue("1030200".equals( result ) );
    }

    @Test
    void ConvertToQuaternary_Three(){
        String result = quaternaryConverter.toQuaternary(349525);
        Assertions.assertTrue("1111111111".equals( result ) );
    }

    @Test
    void ConvertToQuaternary_Four(){
        String result = quaternaryConverter.toQuaternary(5105);
        Assertions.assertTrue("1033301".equals( result ) );
    }

    @Test
    void ConvertToQuaternary_Five(){
        String result = quaternaryConverter.toQuaternary(3654);
        Assertions.assertTrue("321012".equals( result ) );
    }

    @Test
    void ConvertToQuaternary_Six(){
        String result = quaternaryConverter.toQuaternary(23280);
        Assertions.assertTrue("11223300".equals( result ) );
    }




}
