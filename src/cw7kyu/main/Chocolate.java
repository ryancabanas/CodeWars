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
public class Chocolate {
  public static int breakChocolate(int n, int m) {
    if (n <=0 || m <= 0)
      return 0;
    
    int smallest = (n <= m) ? n : m;
    int largest = (smallest == n) ? m : n;
    
    return (smallest - 1) + (smallest * (largest - 1));
  }
}
