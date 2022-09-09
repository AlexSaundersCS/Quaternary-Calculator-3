package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Subtraction {

    Calculator calculator = new Calculator();

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
