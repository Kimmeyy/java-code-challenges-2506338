package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {
  
  @Test
  void gameOfLifeTest() {
    GameOfLife game = new GameOfLife();
    String actual1 = game.gebeSpielfeldAus(); 
    System.out.println(actual1); 
    game.evolve();
    String actual2 = game.gebeSpielfeldAus();
    System.out.println(actual2);

    String expected1 = 
      "-----"
    + System.lineSeparator()
    + "-----"
    + System.lineSeparator()
    + "-***-"
    + System.lineSeparator()
    + "-----"
    + System.lineSeparator()
    + "-----";

    String expected2 = 
          "-----"
        + System.lineSeparator()
        + "--*--"
        + System.lineSeparator()
        + "--*--"
        + System.lineSeparator()
        + "--*--"
        + System.lineSeparator()
        + "-----";

    Assertions.assertEquals(expected2, actual2);
    Assertions.assertEquals(expected1, actual1);

  }
}
