/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class CountDig {
    
  public static int nbDig(int n, int d) {
    StringBuilder x = new StringBuilder();
    for (int i = 0; i <= n; i++) x.append((int) Math.pow(i, 2));
    char[] chArray = x.toString().toCharArray();
    Arrays.sort(chArray);
    x.delete(0, x.length()).append(chArray);
    return (x.indexOf(Integer.toString(d)) == -1) ? 0 : x.lastIndexOf(Integer.toString(d))
                                                        - x.indexOf(Integer.toString(d)) + 1;
  }
    
}