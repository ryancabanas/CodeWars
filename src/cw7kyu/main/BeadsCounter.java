/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class BeadsCounter {
  public static int countRedBeads(final int nBlue) {
    int sum = 0;
    
    if (nBlue >= 2) {
      sum = (nBlue - 1) * 2;
    }
    
    return sum;
  }
}