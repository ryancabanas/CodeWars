/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

/**
 *
 * @author Ryan
 */
public class Triangular {
  public static int triangular(int n) {
    if (n <= 0)
      return 0;
    
    //formula = ((a + b) * (b - a + 1)) / 2
    return ((1 + n) * (n)) / 2;
  }
}
