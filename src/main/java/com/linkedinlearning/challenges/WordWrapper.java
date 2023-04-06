package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class WordWrapper {
  
  private int numberOfWords;

  WordWrapper(int number) {
    this.numberOfWords = number;
  }

  public String wrap(String text) {
   /*  StringBuilder string = new StringBuilder();
    string.append(text);
    for(int i=numberOfWords; i<=text.length()-numberOfWords; i+=numberOfWords) {
      string.insert(i, System.lineSeparator());
    }
    return string.toString();
  }*/
  List<String> list = new ArrayList<>();
  int i = 0;
  while(i<text.length()) {
    list.add(text.substring(i, i+numberOfWords));
    i += numberOfWords;
  }
  StringBuilder stringBuilder = new StringBuilder();
  for (String string : list) {
    stringBuilder.append(string);
    stringBuilder.append(System.lineSeparator());
  }
  return stringBuilder.toString();
}
}
