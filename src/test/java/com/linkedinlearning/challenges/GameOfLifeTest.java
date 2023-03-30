package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Test;

public class GameOfLifeTest {
  
  @Test
  void gameOfLifeTest() {
    GameOfLife game = new GameOfLife();
    System.out.println(game.gebeSpielfeldAus()); 
    System.out.println(game.getSpielfeld().size()); 
    game.evolve();
    System.out.println(game.gebeSpielfeldAus());
    game.evolve();
    System.out.println(game.gebeSpielfeldAus());
    String actual = game.gebeSpielfeldAus();
    System.out.println(actual);
  }
}
