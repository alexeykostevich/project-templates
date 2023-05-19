package com.alexeykostevich.app;

public class Main {
  public static void main(String[] args) {
    var calculator = new Calculator();

    double result = calculator.add(1, 2);

    System.out.printf("Result: %f%n", result);
  }
}
