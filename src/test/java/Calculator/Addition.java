package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
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

    @Test
    void testing_Addition_Exception_Num1(){
        int result = calculator.addition(-4, 20);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Addition_Exception_Num2(){
        int result = calculator.addition(58, -1);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Addition_Exception_Result(){
        int result = calculator.addition(-59, -1);
        Assertions.assertEquals(0,result);
    }


}
