package com.bootcamp.math;

public class Calculator {

  private double result;

  public void add(int number) {
    result += number;
  }

  public void subtract(int number) {
    result -= number;
  }

  public void multiply(int number) {
    result *= number;
  }

  @Override
  public String toString() {
    if (result == 0) {
      return "0";
    }
    return String.valueOf(result);
  }
}
