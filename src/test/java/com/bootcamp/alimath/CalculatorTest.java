package com.bootcamp.alimath;

import com.bootcamp.alimath.Utilities.Input.Command;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void givenBinaryOperationisBinaryOperationReturnTrue() {
    Calculator calculator = new Calculator();
    Assert.assertTrue(calculator.isBinaryOperation(Command.ADD));
  }

  @Test
  public void givenNonUnaryOperationisUnaryOperationReturnFalse() {
    Calculator calculator = new Calculator();
    Assert.assertFalse(calculator.isUnaryOperation(Command.ADD));
  }

  @Test
  public void givenNaNAsPreviousResultExecuteWillReturnZero() {
    Calculator calculator = new Calculator();
    double result = calculator.execute(Command.DIVIDE, 0);
    Assert.assertEquals(1.0, calculator.execute(Command.ADD, 1), 0.01);
  }

  @Test
  public void givenBinaryOperationExecuteWillReturnCorrectResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(1.0, calculator.execute(Command.ADD, 1), 0.01);
  }
}
