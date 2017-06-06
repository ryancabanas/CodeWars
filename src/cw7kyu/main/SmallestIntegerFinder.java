/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class SmallestIntegerFinder {
  
  public static int findSmallestInt(int[] args) {
    Arrays.sort(args);
    return args[0];
  }
    
}
