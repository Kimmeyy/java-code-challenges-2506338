package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  @Test
  void testFizzBuzz(){
    FizzBuzz fizzbuzz = new FizzBuzz();
    var expected = """
        1
        2
        Fizz
        4
        Buzz
        Fizz
        7
        8
        Fizz
        Buzz
        11
        Fizz
        13
        14
        FizzBuzz
        16
        17
        """;
    var actual = fizzbuzz.fizzbuzz(17);
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }
  
}
