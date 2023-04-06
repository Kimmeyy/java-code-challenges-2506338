package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Test;

public class WordWrapperTest {
  @Test
  void wordWrapperTest() {
    WordWrapper wrapper = new WordWrapper(10);
    String text = "This is a very long sentence that will be wrapped.";
    System.out.println(wrapper.wrap(text));
  }
}
