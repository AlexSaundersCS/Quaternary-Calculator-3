package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exponents {

    Calculator calculator = new Calculator();

    @Test
    void testing_Exponents_1(){
        int result = calculator.exponents(4);
        Assertions.assertEquals(16,result);
    }

    @Test
    void testing_Exponents_2(){
        int result = calculator.exponents(10);
        Assertions.assertEquals(100,result);
    }

    @Test
    void testing_Exponents_Exception_Num1(){
        int result = calculator.exponents(-5);
        Assertions.assertEquals(0,result);
    }
}
