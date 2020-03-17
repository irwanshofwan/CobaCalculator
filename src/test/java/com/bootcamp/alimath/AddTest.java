package com.bootcamp.alimath;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {

  @Test
  public void testAdd() {
    Add operation = new Add();
    Assert.assertEquals(2.0, operation.execute(1.0, 1), 0.01);
  }
}
