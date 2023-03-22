package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

  public int fibonacci(int n) {
    List<Integer> fibonacciList = new ArrayList<Integer>();
    fibonacciList.add(0);
    fibonacciList.add(1);
    for (int i = 1; i <= (n - 1); i++) {
      int zahl1 = fibonacciList.get(i);
      int zahl2 = fibonacciList.get(i - 1);
      fibonacciList.add(i + 1, (zahl1 + zahl2));
    }
    // int erg = fibonacciList.stream().reduce(0, Integer::sum);
    int erg = fibonacciList.get(n);
    return erg;
  }
}
