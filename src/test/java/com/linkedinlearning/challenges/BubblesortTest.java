package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BubblesortTest {
  
  @Test
  void bubblesortTest() {
    Bubblesort bubblesort = new Bubblesort();
    int[] array = {4,1,7,1};
    bubblesort.sort(array);
    StringBuilder erg = new StringBuilder();
    for (int z = 0; z<bubblesort.numbers.length; z++) {
      erg.append(bubblesort.numbers[z]);
    }
    System.out.println(erg);
    Assertions.assertEquals("1147", erg.toString());
  }
}
