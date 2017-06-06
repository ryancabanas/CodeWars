/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

class ArithmeticFunction {
  
  public static int arithmetic(int a, int b, String operator) {
    switch (operator.toLowerCase()) {
      case "add":
        return a + b;
      case "subtract":
        return a - b;
      case "multiply":
        return a * b;
      case "divide":
        return b == 0 ? 0 : a / b;
      default:
        return 0;
    }
  }
}