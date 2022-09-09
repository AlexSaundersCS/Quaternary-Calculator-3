package Calculator;

import com.example.quarternarycalc.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Addition {

    Calculator calculator = new Calculator();
    
    @Test
    void testing_Addition_1(){
        int result = calculator.addition(3, 3);
        Assertions.assertEquals(6,result);
    }

    @Test
    void testing_Addition_2(){
        int result = calculator.addition(14, 81);
        Assertions.assertEquals(95,result);
    }
}
