package Calculator;

import com.example.quarternarycalc.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Subtraction {

    Calculator calculator = new Calculator();

    @Test
    void WhenInputIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.subtraction(-2, -4);
        });
    }

    @Test
    void WhenResultIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.subtraction(10, -20);
        });
    }
    @Test
    void testing_Subtraction_1(){
        int result = calculator.subtraction(10, 5);
        Assertions.assertEquals(5,result);
    }

    @Test
    void testing_Subtraction_2(){
        int result = calculator.subtraction(100, 69);
        Assertions.assertEquals(31,result);
    }

}
