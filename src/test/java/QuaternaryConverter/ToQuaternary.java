package QuaternaryConverter;

import com.example.quarternarycalc.QuaternaryConverter.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ToQuaternary {
    QuaternaryConverter quaternaryConverter = new QuaternaryConverter();

    @Test
    void ConvertToQuaternary_Zero(){
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(0);
        ArrayList<Integer> zero = new ArrayList<>();
        zero.add(0);
        Assertions.assertArrayEquals(result.toArray(), zero.toArray());
    }

    @Test
    void ConvertToQuaternary_One(){

        ArrayList<Integer> result = quaternaryConverter.toQuaternary(1);
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        Assertions.assertArrayEquals(result.toArray(), one.toArray());
    }

    @Test
    void ConvertToQuaternary_Four(){
        ArrayList<Integer> four = new ArrayList<>();
        four.add(1);
        four.add(0);

        ArrayList<Integer> result = quaternaryConverter.toQuaternary(4);
        Assertions.assertArrayEquals(result.toArray(), four.toArray());
    }
//
    @Test
    void ConvertToQuaternary_BigNumber4(){
        ArrayList<Integer> bigNumber = new ArrayList<>();
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(1);

        ArrayList<Integer> result = quaternaryConverter.toQuaternary(349525);
        Assertions.assertArrayEquals(result.toArray(), bigNumber.toArray());
    }

    @Test
    void ConvertToQuaternary_BigNumber3(){
        ArrayList<Integer> bigNumber = new ArrayList<>();
        bigNumber.add(1);
        bigNumber.add(0);
        bigNumber.add(3);
        bigNumber.add(3);
        bigNumber.add(3);
        bigNumber.add(0);
        bigNumber.add(1);
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(5105);
        Assertions.assertArrayEquals(result.toArray(), bigNumber.toArray());
    }
//
    @Test
    void ConvertToQuaternary_BigNumber(){
        ArrayList<Integer> bigNumber = new ArrayList<>();
        bigNumber.add(3);
        bigNumber.add(2);
        bigNumber.add(1);
        bigNumber.add(0);
        bigNumber.add(1);
        bigNumber.add(2);
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(3654);
        Assertions.assertArrayEquals(result.toArray(), bigNumber.toArray());
    }

    @Test
    void ConvertToQuaternary_BigNumber_2(){
        ArrayList<Integer> bigNumber = new ArrayList<>();
        bigNumber.add(1);
        bigNumber.add(1);
        bigNumber.add(2);
        bigNumber.add(2);
        bigNumber.add(3);
        bigNumber.add(3);
        bigNumber.add(0);
        bigNumber.add(0);
        ArrayList<Integer> result = quaternaryConverter.toQuaternary(23280);
        Assertions.assertArrayEquals(result.toArray(), bigNumber.toArray());
    }

}
