package com.bootcamp.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.junit.Test;

public class CommandLineInterfaceTest {

  @Test
  public void testRunExit() {
    InputStream inputStream = new ByteArrayInputStream("\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertFalse(cli.isRunning());
  }

  @Test
  public void testRunCancel() {
    InputStream inputStream = new ByteArrayInputStream("cancel\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("0\n", outputStream.toString());
  }

  @Test
  public void testRunAdd() {
    InputStream inputStream = new ByteArrayInputStream("add 1\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("1.0\n", outputStream.toString());
  }

  @Test
  public void testRunSubtract() {
    InputStream inputStream = new ByteArrayInputStream("subtract 1\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("-1.0\n", outputStream.toString());
  }

  @Test
  public void testRunMultiply() {
    InputStream inputStream = new ByteArrayInputStream("add 1\nmultiply 2\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("1.0\n2.0\n", outputStream.toString());
  }
}
