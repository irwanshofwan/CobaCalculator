package com.bootcamp.alimath;

import com.bootcamp.alimath.Utilities.Input.Command;
import java.util.HashMap;

public class Calculator {

  private double result;
  private HashMap<Command, BinaryOperation> binaryOperations = new HashMap<>();
  private HashMap<Command, UnaryOperation> unaryOperations = new HashMap<>();

  public Calculator() {
    initBinaryOperation();
    initUnaryOperation();
  }

  private void initBinaryOperation() {
    binaryOperations.put(Command.ADD, new Add());
    binaryOperations.put(Command.SUBTRACT, new Subtract());
    binaryOperations.put(Command.MULTIPLY, new Multiply());
    binaryOperations.put(Command.DIVIDE, new Divide());
  }

  private void initUnaryOperation() {
    unaryOperations.put(Command.CANCEL, new Cancel());
  }

  public boolean isBinaryOperation(Command command) {
    return binaryOperations.containsKey(command);
  }

  public boolean isUnaryOperation(Command command) {
    return unaryOperations.containsKey(command);
  }

  public double execute(Command command, int operand) {
    if (Double.isNaN(result)) {
      result = 0;
    }
    if (isBinaryOperation(command)) {
      result = binaryOperations.get(command).execute(result, operand);
    } else {
      result = unaryOperations.get(command).execute(result);
    }
    return result;
  }
}
