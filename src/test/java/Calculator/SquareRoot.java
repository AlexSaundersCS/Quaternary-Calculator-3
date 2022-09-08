package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRoot {

    Calculator calculator = new Calculator();
    @Test
    void WhenInputIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.squareRoot(-4);
        });
    }

    @Test
    void WhenResultIsFloatShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.division(40, 7);
        });
    }

    @Test
    void testing_SquareRoot_1(){
        int result = calculator.squareRoot(16);
        Assertions.assertEquals(4,result);
    }

    @Test
    void testing_SquareRoot_2(){
        int result = calculator.squareRoot(100);
        Assertions.assertEquals(10,result);
    }
}
