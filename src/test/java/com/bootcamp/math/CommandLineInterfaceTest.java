package com.bootcamp.math;

import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;

public class CommandLineInterfaceTest {

  @Test
  public void testRunExit() {
    InputStream inputStream = new ByteArrayInputStream("\nexit\n".getBytes());
    CommandLineInterface cli = new CommandLineInterface(inputStream, null);
    cli.run();
    assertFalse(cli.isRunning());
  }
}
