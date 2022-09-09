package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Division {

    Calculator calculator = new Calculator();

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
