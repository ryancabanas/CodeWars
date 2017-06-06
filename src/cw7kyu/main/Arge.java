/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

/**
 *
 * @author Ryan Cabanas
 */
public class Arge {
    
  public static int nbYear(int p0, double percent, int aug, int p) {
    
    int years = 0;
    
    while(p0 < p) {
      p0 += (p0 * (percent / 100)) + aug;
      years++;
    }
    
    return years;
  }
}
