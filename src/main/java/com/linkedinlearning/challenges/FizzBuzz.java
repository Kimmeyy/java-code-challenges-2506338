package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FizzBuzz {

  public String fizzbuzz(int end) {

    var erg = new ArrayList<String>();

    for (int i = 1; i <= end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        erg.add("FizzBuzz");
      } else if (i % 3 == 0) {
        erg.add("Fizz");
      } else if (i % 5 == 0) {
        erg.add("Buzz");
      } else {
        erg.add(Integer.toString(i));
        // ODER:
        // erg.add(i+"");
      }
    }

    String ergebnis = erg.stream().collect(Collectors.joining("\n", "", "\n"));
    return ergebnis;
  }

}
