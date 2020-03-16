package com.bootcamp.math;

import com.bootcamp.math.Utilities.Input.Command;
import java.util.Objects;

public class Utilities {

  static class Input {

    Command command;
    int values;

    enum Command {EXIT, CANCEL, ADD, SUBTRACT, MULTIPLY, DIVIDE, NO_COMMAND}

    public Input(Command command, int values) {
      this.command = command;
      this.values = values;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Input input = (Input) o;
      return values == input.values && command == input.command;
    }

    @Override
    public int hashCode() {
      return Objects.hash(command, values);
    }
  }

  public static Input parseInput(String rawInput) {
    rawInput = rawInput.toUpperCase();
    var inputArray = rawInput.split(" ");

    if (inputArray[0].equals("")) {
      return new Input(Command.NO_COMMAND, 0);
    }
    var command = Command.valueOf(inputArray[0]);
    if (inputArray.length == 1) {
      return new Input(command, 0);
    } else {
      return new Input(command, Integer.parseInt(inputArray[1]));
    }
  }
}
