package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multiplication {

    Calculator calculator = new Calculator();


    @Test
    void WhenInputIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.multiplication(-6, -4);
        });
    }

    @Test
    void WhenResultIsNegativeShouldRaiseException(){
        Assertions.assertThrows(Exception.class,()->{
            calculator.multiplication(8, -4);
        });
    }
    @Test
    void testing_Multiplication_1(){
        int result = calculator.multiplication(4, 5);
        Assertions.assertEquals(20,result);
    }

    @Test
    void testing_Multiplication_2(){
        int result = calculator.multiplication(9, 9);
        Assertions.assertEquals(81,result);
    }
}
