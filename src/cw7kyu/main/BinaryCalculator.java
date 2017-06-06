/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class BinaryCalculator {
  
  public static String calculate(final String n1, final String n2, final String o) {
    long n1Long;
    long n2Long;
    long result;
    char symbol;
    
    n1Long = Long.parseLong(n1, 2);
    n2Long = Long.parseLong(n2, 2);
    
    switch (o.toLowerCase()) {
      case "add":
        result = n1Long + n2Long;
        symbol = '+';
        break;
      case "subtract":
        result = n1Long - n2Long;
        symbol = '-';
        break;
      case "multiply":
        result = n1Long * n2Long;
        symbol = '*';
        break;
      default:
        throw new AssertionError();
    }
    
    return Long.toString(result, 2);
  }
}