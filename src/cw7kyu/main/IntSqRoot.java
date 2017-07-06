/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class  IntSqRoot {
  public static long IntRac(long n, long guess)  {
    long prevGuess;
    long newGuess = guess;
    long count = 0;
    
    do {
      prevGuess = newGuess;
      newGuess = (long) Math.floor((prevGuess + n / prevGuess) / 2);
      count++;
  } while (Math.abs(newGuess - prevGuess) > 1);
    
    return count;
  }
}

class IntSqRootDemo {
  public static void main(String[] args) {
    long result = IntSqRoot.IntRac(125348981764L, 356243L);
    System.out.println(result);
  }
}
