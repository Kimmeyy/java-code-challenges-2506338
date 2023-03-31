package com.linkedinlearning.challenges;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class WordCountReaderTest {
  
  @Test
  void wordCountReaderTest() throws IOException {
    WordCountReader wordCountReader = new WordCountReader();
    wordCountReader.readFile("src/test/resources/simple_words.txt");
    System.out.println(wordCountReader.getWords());
    System.out.println(wordCountReader.getCharacters());
    System.out.println(wordCountReader.getCharactersExcludingSpaces());
  }
}
