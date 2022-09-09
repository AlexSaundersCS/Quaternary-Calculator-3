package Calculator;

import com.example.quarternarycalc3.Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multiplication {

    Calculator calculator = new Calculator();

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

    @Test
    void testing_Multiplication_Exception_Num1(){
        int result = calculator.multiplication(-9, 9);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Multiplication_Exception_Num2(){
        int result = calculator.multiplication(15, -1);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Multiplication_Exception_Result(){
        int result = calculator.multiplication(-16, 1);
        Assertions.assertEquals(0,result);
    }

}
