package com.bootcamp.alimath;

public class Divide implements BinaryOperation {

  public double execute(double firstOperand, int secondOperand) {
    if (secondOperand == 0) {
      return Double.NaN;
    }
    return firstOperand / secondOperand;
  }
}
