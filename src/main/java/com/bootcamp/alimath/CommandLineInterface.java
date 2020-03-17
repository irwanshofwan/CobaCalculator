package com.bootcamp.alimath;

import com.bootcamp.alimath.Utilities.Input.Command;
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
    } else {
      doCalculatorOperations(userInput);
    }
  }

  private void doCalculatorOperations(Utilities.Input userInput) {
    Command command = userInput.command;
    int value = userInput.values;
    if (calculator.isBinaryOperation(command) || calculator.isUnaryOperation(command)) {
      double result = calculator.execute(command, value);
      out.println(result);
    } else {
      out.println("Invalid Command");
    }
    out.flush();
  }
}
