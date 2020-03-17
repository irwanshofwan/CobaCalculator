package com.bootcamp.alimath;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

  @Test
  public void testSubtract() {
    Subtract operation = new Subtract();
    Assert.assertEquals(2.0, operation.execute(4.0, 2), 0.01);
  }
}
