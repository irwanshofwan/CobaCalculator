package com.bootcamp.alimath;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {

  @Test
  public void testDivision() {
    Divide operation = new Divide();
    Assert.assertEquals(2.0, operation.execute(4.0, 2), 0.01);
  }
}
