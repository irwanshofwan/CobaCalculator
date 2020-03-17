package com.bootcamp.alimath;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

  @Test
  public void testMultiply() {
    Multiply multiplyOperation = new Multiply();
    Assert.assertEquals(1.0, multiplyOperation.execute(1.0, 1), 0.01);
  }
}
