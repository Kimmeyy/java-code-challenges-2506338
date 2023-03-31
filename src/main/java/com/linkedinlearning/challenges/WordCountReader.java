package com.linkedinlearning.challenges;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCountReader {

  private List<String> content;

  void readFile(String path) throws IOException {
    try {
      Path p = Paths.get(path);
      List<String> lines = Files.readAllLines(p);
      this.content = lines;
    } catch (NoSuchFileException e) {
      System.out.println("Die Datei existiert nicht:");
      e.printStackTrace();
    } 
  }

  int getWords() {
    int anz = 0;
    for (String string : content) {
      String[] anzWords = string.split(" ");
      anz += anzWords.length;
    }
    return anz;
  }

  int getCharacters() {
    int anz = 0;
    for (String string : content) {
      anz += string.length();
    }
    return anz;
  }

  int getCharactersExcludingSpaces() {
    int anz = 0;
    for (String string : content) {
      String noSpaces = string.replaceAll(" ", "");
      anz += noSpaces.length();
    }
    return anz;

  }
}
