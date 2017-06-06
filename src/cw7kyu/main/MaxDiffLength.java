/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

class MaxDiffLength {
    
  public static int mxdiflg(String[] a1, String[] a2) {
    if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0) return -1;
    
    Arrays.sort(a1, (x, y) -> x.length() < y.length() ? -1 : x.length() == y.length() ? 0 : 1);
    Arrays.sort(a2, (x, y) -> x.length() < y.length() ? -1 : x.length() == y.length() ? 0 : 1);
        
    int diff1 = Math.abs(a1[0].length() - a2[a2.length - 1].length());
    int diff2 = Math.abs(a2[0].length() - a1[a1.length - 1].length());
    
    return (diff1 <= diff2) ? diff2 : diff1;
  } 
}