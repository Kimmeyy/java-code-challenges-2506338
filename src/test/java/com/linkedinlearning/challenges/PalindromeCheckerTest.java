package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
  
  @Test
  void palindromeCheckerTest() {
    Assertions.assertTrue(PalindromeChecker.isPalindrome("level"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("racecar"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("otto"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("a"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("live on time, emit no evil"));

    Assertions.assertFalse(PalindromeChecker.isPalindrome("hund"));
    Assertions.assertFalse(PalindromeChecker.isPalindrome("windbeutel"));
  }
}
