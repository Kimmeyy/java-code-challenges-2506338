package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
  
  // livingN > 3, cell = 1 -> cell = 0
  // livingN = 3, cell = 0 -> cell = 1
  // livingN = 2 || livingN = 3, cell = 1 -> cell = 1
  // livingN < 2, cell = 1 -> cell = 0

  private List<Boolean> spielfeld = new ArrayList<Boolean>();

  public GameOfLife() {
    this.spielfeld = List.of(false, false, false, false, false,
        false, false, false, false, false,
        false, true, true, true, false,
        false, false, false, false, false,
        false, false, false, false, false);
  }

  public List<Boolean> getSpielfeld() {
    return spielfeld;
  }

  void evolve() {
    List<Boolean> newSpielfeld = new ArrayList<>();
    newSpielfeld.addAll(spielfeld);
    for (int i=0; i<spielfeld.size(); i++) {
      int livingN = checkNeighbours(i);
      if (livingN > 3) {
        newSpielfeld.set(i, false);
      } else if (livingN < 2) {
        newSpielfeld.set(i, false);
      } else if (livingN == 3) {
        newSpielfeld.set(i, true);
      } 
    }
    this.spielfeld = newSpielfeld;
  }

  String gebeSpielfeldAus() {
    StringBuilder printedField = new StringBuilder();
    for (Boolean feld : spielfeld) {
      if (feld == true) {
        if (printedField.length()%5 == 0){
          printedField.append("*");
          printedField.append(System.lineSeparator());
        } else {
          printedField.append("*");
        }
      } else if (feld == false) {
        if (printedField.length() % 5 == 0) {
          printedField.append("-");
          printedField.append(System.lineSeparator());
        } else {
          printedField.append("-");
        }
      }
    }
    return printedField.toString();
  }

  int checkNeighbours(int cell) {
    ArrayList<Boolean> neighbours = new ArrayList<>();
    int numberLivingN = 0;
//    neighbours = (ArrayList<Boolean>) List.of(spielfeld.get(cell - 1), spielfeld.get(cell - 4), spielfeld.get(cell - 5),spielfeld.get(cell - 6),
//    spielfeld.get(cell + 1),spielfeld.get(cell + 4), spielfeld.get(cell + 5), spielfeld.get(cell + 6));

    List<Integer> indexes = new ArrayList<>();
    indexes = List.of(cell-1, cell-4, cell-5, cell-6, cell+1, cell+4, cell+5, cell+6);

    for (Integer integer : indexes) {
      if(integer <= 24 && integer >= 0) {
        neighbours.add(spielfeld.get(integer));
      }
    }

    for (Boolean neighbour : neighbours) {
      if (neighbour==true) {
        numberLivingN++;
      }
    }
    return numberLivingN;
  }
  

}
