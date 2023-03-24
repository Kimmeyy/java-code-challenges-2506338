package com.linkedinlearning.challenges;

public class StringCalculator {

  static int add(String numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }
    String[] splittedNumbers = numbers.split(",");
    int erg = 0;
    for (String num : splittedNumbers) {
      int parseNumber = Integer.parseInt(num);
      erg = erg + parseNumber;
    }
    return erg;
  }
}
