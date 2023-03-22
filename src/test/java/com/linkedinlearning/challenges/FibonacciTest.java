package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
  
  @Test
  void fibonacciTest(){
    Fibonacci fibonacci = new Fibonacci();
    int actual = fibonacci.fibonacci(12);
    int expected = 144;
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }
}
