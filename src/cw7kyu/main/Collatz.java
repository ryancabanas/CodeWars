/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Collatz {
  
  public static long conjecture(long x) {
    if (x < 1) return 0;
    
    int counter = 1;
    
    while (x > 1) {
      if (x % 2 == 0) x /= 2;
      else x = (x * 3) + 1;
      counter++;
      }

    return counter;
  }
  
}