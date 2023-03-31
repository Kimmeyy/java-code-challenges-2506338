package com.linkedinlearning.challenges;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountReaderTest {

  @Test
  void wordCountReaderTest() throws IOException {
    WordCountReader wordCountReader = new WordCountReader();
    wordCountReader.readFile("src/test/resources/simple_words.txt");

    int actual1 = wordCountReader.getWords();
    int actual2 = wordCountReader.getCharacters();
    int actual3 = wordCountReader.getCharactersExcludingSpaces();

    System.out.println(actual1);
    System.out.println(actual2);
    System.out.println(actual3);

    int expected1 = 18;
    int expected2 = 86;
    int expected3 = 70;

    Assertions.assertEquals(actual1, expected1);
    Assertions.assertEquals(actual2, expected2);
    Assertions.assertEquals(actual3, expected3);
  }
}
