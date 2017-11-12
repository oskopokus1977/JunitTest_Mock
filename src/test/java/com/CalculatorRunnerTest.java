package com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class CalculatorRunnerTest {
    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.addListener(new CalculatorRunListern());
        Result result = jUnitCore.run(CalculatorTest.class);
        List<Failure> failures = result.getFailures();

        for (Failure f : failures) {
            System.out.println(f.getException());
        }
    }
}
