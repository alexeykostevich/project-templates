package com.alexeykostevich.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void add() {
    var calculator = new Calculator();

    double result = calculator.add(1, 2);

    Assertions.assertEquals(result, 3.0);
  }
}
