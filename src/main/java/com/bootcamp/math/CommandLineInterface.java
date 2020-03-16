package com.bootcamp.math;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CommandLineInterface {

  private Scanner in;
  private String rawInput;
  private boolean isRunning;

  public CommandLineInterface(InputStream in, OutputStream out) {
    isRunning = true;
    this.in = new Scanner(in);
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

    if (userInput.command.equals("exit")) {
      isRunning = false;
    }
  }
}
