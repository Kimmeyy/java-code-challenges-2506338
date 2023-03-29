package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumbersTest {
  
  @Test
  void happyNumbersTest() {
    HappyNumbers happyNumbers = new HappyNumbers();
    boolean test1 = happyNumbers.isHappy(19);
    boolean test2 = happyNumbers.isHappy(4);

    boolean expected1 = true;
    boolean expected2 = false;

    Assertions.assertEquals(test1, expected1);
    Assertions.assertEquals(test2, expected2);

    Assertions.assertFalse(happyNumbers.isHappy(2));
    Assertions.assertFalse(happyNumbers.isHappy(8));

    Assertions.assertTrue(happyNumbers.isHappy(7));
    Assertions.assertTrue(happyNumbers.isHappy(10));
    Assertions.assertTrue(happyNumbers.isHappy(13));
    Assertions.assertTrue(happyNumbers.isHappy(19));
    Assertions.assertTrue(happyNumbers.isHappy(23));
    Assertions.assertTrue(happyNumbers.isHappy(28));
    Assertions.assertTrue(happyNumbers.isHappy(899));
  }
}
