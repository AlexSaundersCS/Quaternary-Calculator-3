package Calculator;

import com.example.quarternarycalc.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRoot {

    Calculator calculator = new Calculator();

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

    @Test
    void testing_Exponents_Exception_Num1(){
        int result = calculator.squareRoot(-5);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Exponents_Float_Result(){
        int result = calculator.squareRoot(2);
        Assertions.assertEquals(1,result);
    }
}
