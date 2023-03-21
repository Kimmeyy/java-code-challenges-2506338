package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberFinderTest {

  @Test
  void primeNumberFinderTest() {
    PrimeNumberFinder finder = new PrimeNumberFinder();
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(11);
    expected.add(13);
    expected.add(17);
    expected.add(19);
    List<Integer> actual = finder.findPrimeNumbersInInterval(10, 20);
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }
}
