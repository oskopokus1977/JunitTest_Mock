package com;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(JUnit4ClassRunner.class)
public class CalculatorTest {

    @Test
    public void testCalcAddMethod(){
        int number1 = 10;
        int number2 = 20;

        Calculator calculator = new Calculator();
        int sum = calculator.add(number1,number2);
        assert sum == 30;
    }
}
