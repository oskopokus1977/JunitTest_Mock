package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCalculatorTest {

    @Parameterized.Parameter(0)
     int number1;
    @Parameterized.Parameter(1)
     int number2;
    @Parameterized.Parameter(2)
     int result;

    public static Object[][] getData() {
        return new Object[][]{{1, 1, 2}, {34, 26, 60}, {7, 5, 13}};
    }

    @Test
    public void addMethodTest(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(number1,number2);
        Assert.assertSame(sum, result);
    }

}
