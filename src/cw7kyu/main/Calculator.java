/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Calculator {
  
  public static Double calculate(
          final double numberOne, final String operation, final double numberTwo) {
    Double result;
    
    switch (operation) {
      case "+":
        result = numberOne + numberTwo;
        break;
      case "-":
        result = numberOne - numberTwo;
        break;
      case "*":
        result = numberOne * numberTwo;
        break;
      case "/":
        if (numberTwo == 0)
          return null;
        result = numberOne / numberTwo;
        break;
      default:
        return null;
    }
    return (result == -0.0) ? 0 : result; 
  }
}