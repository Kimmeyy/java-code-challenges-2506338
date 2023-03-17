package com.linkedinlearning.challenges;

import java.text.DecimalFormat;
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
    DecimalFormat f = new DecimalFormat("#0.00");
    double mwstAnteil = price * MWST;
    double brutto = price + mwstAnteil;
    return "Netto: " + f.format(price) + CURRENCY + "\n" + "VAT(" + MWST + "): " + f.format(mwstAnteil) + CURRENCY
        + "\n"
        + "Total: "
        + f.format(brutto) + CURRENCY;
  }
}
