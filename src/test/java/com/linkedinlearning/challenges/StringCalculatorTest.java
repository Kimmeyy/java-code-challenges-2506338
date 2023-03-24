package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
  @Test
  void stringCalculatorTest() {
    int actual = StringCalculator.add("1,2,3,4,5");
    int expected = 15;
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }

}
