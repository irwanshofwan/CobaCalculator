package com.bootcamp.math;

import java.util.Objects;

public class Utilities {

  static class Input {

    String command;
    int values;

    public Input(String command, int values) {
      this.command = command;
      this.values = values;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Input input = (Input) o;
      return values == input.values &&
          Objects.equals(command, input.command);
    }

    @Override
    public int hashCode() {
      return Objects.hash(command, values);
    }
  }

  public static Input parseInput(String rawInput) {
    if (rawInput.equals("exit")) {
      return new Input("exit", 0);
    }
    return new Input("", 0);
  }
}
