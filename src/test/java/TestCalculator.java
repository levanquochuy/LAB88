package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {
    private Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @BeforeMethod
    public void resetBeforeEachTest() {
        calculator.reset();
    }

    @Test
    public void testAddition() {
        calculator.plus(10);
        Assert.assertEquals(calculator.getResult(), 10, "Addition failed");
    }

    @Test
    public void testSubtraction() {
        calculator.plus(10);
        calculator.minus(5);
        Assert.assertEquals(calculator.getResult(), 5, "Subtraction failed");
    }

    @Test
    public void testMultiplication() {
        calculator.plus(10);
        calculator.mul(0);
        Assert.assertEquals(calculator.getResult(), 0, "Multiplication failed");
    }

    @Test
    public void testDivisionByZeroShouldReset() {
        calculator.plus(100);
        calculator.div(0);
        Assert.assertEquals(calculator.getResult(), 0, "Division by zero should reset result");
    }

    @Test
    public void testNullInputShouldReset() {
        calculator.plus(null);
        Assert.assertEquals(calculator.getResult(), 0, "Null input should reset result");
    }
}
