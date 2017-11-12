package com;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class CalculatorRunListern extends RunListener {
    @Override
    public void testRunStarted(Description description) throws Exception {
        super.testRunStarted(description);
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        super.testRunFinished(result);
    }
}
