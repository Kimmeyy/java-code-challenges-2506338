package com.linkedinlearning.challenges;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvParserTest {
  @Test
  void csvParserTest() throws IOException {
    CsvParser parser = new CsvParser();
    var erg = parser.parse("src/test/resources/turing.csv");
    System.out.println(erg.get(1983));
    System.out.println(erg);
    Assertions.assertEquals("Richard Hamming", erg.get(1968));
    Assertions.assertEquals(
        "Allen Newell, Herbert A. Simon", erg.get(1975));
  }
}
