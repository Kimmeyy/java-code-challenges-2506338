package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VATCalculatorTest {
  
  @Test
  void testRenderInvoice(){
    var vatCalculator = new VATCalculator();
    double price = 4.00;
    var expected = """
        Netto: 4.00€
        VAT(0.19): 0.76€
        Total: 4.76€""";
    var actual = vatCalculator.renderinvoice(price);
    Assertions.assertEquals(expected, actual);
    System.out.println(actual);

  }
}
