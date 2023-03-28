package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondTest {

  @Test
  void diamondTest() {
    Diamond diamond = new Diamond('D');
    String actual = diamond.renderDiamond();
    String expected = System.lineSeparator()
        + "    A    "
        + System.lineSeparator()
        + "   B B   "
        + System.lineSeparator()
        + "  C   C  "
        + System.lineSeparator()
        + " D     D "
        + System.lineSeparator()
        + "  C   C  "
        + System.lineSeparator()
        + "   B B   "
        + System.lineSeparator()
        + "    A    "
        + System.lineSeparator();
    Assertions.assertEquals(expected, actual);
  }
}
