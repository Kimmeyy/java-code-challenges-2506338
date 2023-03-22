package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

  @Test
  void fibonacciTest() {
    int actual = Fibonacci.fibonacci(12);
    int expected = 144;
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }
}
