/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Factorial {

  public int factorial(int n) {
    if (n < 0 || n >= 12) throw new IllegalArgumentException ();
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
  }
  
}