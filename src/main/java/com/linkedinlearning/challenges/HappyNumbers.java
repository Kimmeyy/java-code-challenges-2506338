package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

  private boolean isHappyNumber;

  boolean isHappy(int n) {
    List<Integer> list = setList(n);
    int sum = sumNumbers(list);
    List<Integer> seen = new ArrayList<>();
    this.isHappyNumber = false;

    while (!seen.contains(sum)) {
      if (sum == 1) {
        this.isHappyNumber = true;
        break;
      }
      if (sum == n) {
        this.isHappyNumber = false;
        break;
      } else {
        seen.add(sum);
        list = setList(sum);
        sum = sumNumbers(list);
      }
    }
    return isHappyNumber;
  }

  List<Integer> setList(int numbers) {
    List<Integer> intList = new ArrayList<Integer>();

    while (numbers > 0) {
      intList.add(numbers % 10);
      numbers = numbers / 10;
    }
    return intList;
  }

  int sumNumbers(List<Integer> list) {
    int sum = 0;

    for (Integer integer : list) {
      sum += integer * integer;
    }
    return sum;
  }
}
