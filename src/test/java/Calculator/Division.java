package Calculator;

import com.example.quarternarycalc.Calculator.Calculator;
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

    @Test
    void testing_Division_Exception_Num1(){
        int result = calculator.division(-8, 4);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Division_Exception_Num2(){
        int result = calculator.division(46, -2);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Division_Exception_Result(){
        int result = calculator.division(-60, 15);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Division_Exception_DivideBy_0(){
        int result = calculator.division(120, 0);
        Assertions.assertEquals(0,result);
    }

    @Test
    void testing_Division_Float_Result(){
        int result = calculator.division(100, 9);
        Assertions.assertEquals(11,result);
    }


}
