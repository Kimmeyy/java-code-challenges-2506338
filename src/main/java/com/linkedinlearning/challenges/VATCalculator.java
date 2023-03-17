package com.linkedinlearning.challenges;

import java.util.Scanner;

public class VATCalculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Geben Sie einen Netto-Betrag ein: ");
    Double eingabe = scanner.nextDouble();
    scanner.close();

    var calc = new VATCalculator();
    System.out.println(calc.renderinvoice(eingabe));

  }

  final double MWST = 0.19;
  final String CURRENCY = "€";

  public String renderinvoice(double price) {
    double mwstAnteil = price * MWST;
    double brutto = price + mwstAnteil;
    String ergebnis = "Netto: " + price + CURRENCY + "\n" + "VAT(" + MWST + "): " + mwstAnteil + CURRENCY + "\n"
        + "Total: "
        + brutto + CURRENCY;
    return ergebnis;
  }
}
