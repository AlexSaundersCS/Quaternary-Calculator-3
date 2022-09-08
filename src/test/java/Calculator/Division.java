package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Division {

    Calculator calculator = new Calculator();

    @Test
    void WhenInputIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.division(-12, -4);
        });
    }

    @Test
    void WhenResultIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.division(32, -4);
        });
    }

    @Test
    void WhenSecondInputIsZeroShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.division(40, 0);
        });
    }

    @Test
    void WhenResultIsFloatShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.division(40, 7);
        });
    }

    @Test
    void testing_Division_1(){
        int result = calculator.division(81, 9);
        Assertions.assertEquals(9,result);
    }

    @Test
    void testing_Division_2(){
        int result = calculator.division(36, 6);
        Assertions.assertEquals(6,result);
    }
}
