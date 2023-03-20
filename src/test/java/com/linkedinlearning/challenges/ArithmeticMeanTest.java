package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticMeanTest {

  @Test
  void testArithmeticMean() {

    Collection<Integer> collection = new ArrayList<Integer>();
    collection.add(2);
    collection.add(4);
    collection.add(8);
    ArithmeticMean arithmetic = new ArithmeticMean();

    var expected = 4.67;
    var actual = arithmetic.mean(collection);
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);

  }

}
