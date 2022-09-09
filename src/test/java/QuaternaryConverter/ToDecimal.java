package QuaternaryConverter;

import com.example.quarternarycalc3.QuaternaryConverter.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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
        int result = quaternaryConverter.toDecimal(new int[]{0});
        Assertions.assertEquals(0,result);
    }

    @Test
    void ConvertToDecimal_One(){
        int result = quaternaryConverter.toDecimal(new int[]{1});
        Assertions.assertEquals(1,result);
    }
}
