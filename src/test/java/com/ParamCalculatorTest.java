package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCalculatorTest {

    @Parameterized.Parameter(0)
    public int number1;

    @Parameterized.Parameter(1)
    public int number2;

    @Parameterized.Parameter(2)
    public int number3;

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{{1, 1, 2}, {34, 26, 60}, {7, 5, 12}};
    }

    @Test
    public void addMethodTest(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(number1,number2);
        Assert.assertSame(sum, number3);
    }

}
