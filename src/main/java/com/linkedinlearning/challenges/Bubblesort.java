package com.linkedinlearning.challenges;

public class Bubblesort {

  int[] numbers;
  
  public void sort(int[] array) {
    for (int z = 0; z<array.length-1; z++) {
      if (array[z] > array[z + 1]) {
        int kleinererWert = array[z + 1];
        int groessererWert = array[z];
        array[z] = kleinererWert;
        array[z + 1] = groessererWert;
        z = -1;
        continue;
      }
    }
    this.numbers = array;
  }
}
