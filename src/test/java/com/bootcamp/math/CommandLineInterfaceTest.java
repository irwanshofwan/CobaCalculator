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

  @Test
  public void testRunDivide() {
    InputStream inputStream = new ByteArrayInputStream("add 6\ndivide 2\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("6.0\n3.0\n", outputStream.toString());
  }

  @Test
  public void testRunDivideByZero() {
    InputStream inputStream = new ByteArrayInputStream("divide 0\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("NaN\n", outputStream.toString());
  }

  @Test
  public void testHandleRandomCommand() {
    InputStream inputStream = new ByteArrayInputStream("something very random\nexit\n".getBytes());
    OutputStream outputStream = new ByteArrayOutputStream();
    CommandLineInterface cli = new CommandLineInterface(inputStream, outputStream);
    cli.run();
    assertEquals("Invalid Command\n", outputStream.toString());
  }
}
