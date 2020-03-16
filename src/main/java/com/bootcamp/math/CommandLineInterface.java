package com.bootcamp.math;

import com.bootcamp.math.Utilities.Input.Command;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CommandLineInterface {

  private Scanner in;
  private String rawInput;
  private boolean isRunning;
  private PrintWriter out;
  private Calculator calculator;

  public CommandLineInterface(InputStream in, OutputStream out) {
    isRunning = true;
    this.in = new Scanner(in);
    this.out = new PrintWriter(out);
    calculator = new Calculator();
  }

  public void run() {
    while (isRunning) {
      getUserInput();
      processUserInput();
    }
  }

  public boolean isRunning() {
    return isRunning;
  }

  private void getUserInput() {
    rawInput = in.nextLine();
  }

  private void processUserInput() {
    Utilities.Input userInput = Utilities.parseInput(rawInput);

    if (userInput.command == Command.EXIT) {
      isRunning = false;
    } else if (userInput.command == Command.CANCEL) {
      out.println("0");
      out.flush();
    } else if (userInput.command == Command.ADD) {
      calculator.add(userInput.values);
      out.println(calculator);
      out.flush();
    } else if (userInput.command == Command.SUBTRACT) {
      calculator.subtract(userInput.values);
      out.println(calculator);
      out.flush();
    }
  }
}
