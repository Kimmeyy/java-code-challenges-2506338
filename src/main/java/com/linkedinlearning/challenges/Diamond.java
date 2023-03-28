package com.linkedinlearning.challenges;

public class Diamond {

  private char buchstabe = 0;

  public Diamond(char buchstabe) {
    this.buchstabe = buchstabe;
  }

  public String renderDiamond() {
    StringBuilder erg = new StringBuilder();

    if (this.buchstabe == 'A') {
      return "A";
    }

    int anzahl = 1;
    int zaehler = 1;

    for (char b = 'B'; b <= this.buchstabe; b++) {
      anzahl += 1;
    }

    for (char a = 'A'; a <= this.buchstabe; a++) {
      if (a == 'A') {
        erg.append(System.lineSeparator());
        erg.append(getLeerzeichen(anzahl));
        erg.append("A");
        erg.append(getLeerzeichen(anzahl));
        erg.append(System.lineSeparator());

      } else {
        erg.append(getLeerzeichen(anzahl - 1));
        erg.append(a);
        erg.append(getLeerzeichen(zaehler));
        erg.append(a);
        erg.append(getLeerzeichen(anzahl - 1));
        anzahl--;
        zaehler += 2;
        if (a != this.buchstabe) {
          erg.append(System.lineSeparator());
        }
      }

    }

    StringBuilder ergebnis = new StringBuilder();
    ergebnis.append(erg);
    ergebnis.append(erg.reverse().delete(0, erg.indexOf("\n")));

    return ergebnis.toString();
  }

  private String getLeerzeichen(int anz) {
    StringBuilder leerzeichen = new StringBuilder();
    for (int i = 0; i < anz; i++) {
      leerzeichen.append(" ");
    }
    return leerzeichen.toString();
  }

}