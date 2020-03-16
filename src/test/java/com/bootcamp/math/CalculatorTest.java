package com.bootcamp.math;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calculator = new Calculator();
    calculator.add(1);
    Assert.assertEquals("1.0", calculator.toString());
  }

  @Test
  public void testSubtract() {
    Calculator calculator = new Calculator();
    calculator.subtract(1);
    Assert.assertEquals("-1.0", calculator.toString());
  }

  @Test
  public void testMultiply() {
    Calculator calculator = new Calculator();
    calculator.add(1);
    calculator.multiply(2);
    Assert.assertEquals("2.0", calculator.toString());
  }
}
