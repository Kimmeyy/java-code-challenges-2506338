package com.linkedinlearning.challenges;

import java.util.Collection;

public class ArithmeticMean {

  double mean(Collection<Integer> numbers) {

    int n = 0;
    for (int number : numbers) {
      n += number;
    }
    double erg = (double) n / numbers.size();
    return Math.round(erg * 100.0) / 100.0;

  }

}
