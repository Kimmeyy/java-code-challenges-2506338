package com.linkedinlearning.challenges;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordCountReader {

  private String content;

  void readFile(String path) throws IOException {
    try {
      File file = new File(path);
      FileInputStream fileStream = new FileInputStream(file);

      fileStream.close();
    } catch (FileNotFoundException e) {
      System.out.println("Die Datei existiert nicht:");
      e.printStackTrace();
    }
  }

  int getWords() {
    String[] anzWords = content.split(" ");
    return anzWords.length;
  }

  int getCharacters() {
    return content.length();
  }

  int getCharactersExcludingSpaces() {
    String noSpaces = content.replaceAll(" ", "");
    return noSpaces.length();
  }
}
