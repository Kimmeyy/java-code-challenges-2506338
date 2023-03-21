package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

  List<Integer> findPrimeNumbersInInterval(int start, int end) {
    List<Integer> erg = new ArrayList<Integer>();
    boolean isPrimeNumber;
    for (int i = start; i <= end; i++) {
      isPrimeNumber = true;
      for (int j = 2; j <= (i / 2); j++) {
        if (i % j == 0) {
          isPrimeNumber = false;
          break;
        }
      }
      if (isPrimeNumber) {
        erg.add(i);
      }
    }
    return erg;
  }
}
