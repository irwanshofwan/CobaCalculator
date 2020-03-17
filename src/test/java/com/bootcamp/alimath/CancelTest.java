package com.bootcamp.alimath;

import org.junit.Assert;
import org.junit.Test;

public class CancelTest {

  @Test
  public void testCance() {
    Cancel operation = new Cancel();
    Assert.assertEquals(0.0, operation.execute(1.0), 0.01);
  }
}
