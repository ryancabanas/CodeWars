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
public class NumberFun {
  public static long findNextSquare(long sq) {
    if (Math.sqrt(sq) - (int) Math.sqrt(sq) != 0)
      return -1;
    
    double nextValue = Math.sqrt(sq) + 1;
    
    return (long) (nextValue * nextValue);
  }
}