/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

class MinMax {
  
  public static int[] minMax(int[] arr) {
    Arrays.sort(arr);
     return new int[] {arr[0], arr[arr.length - 1]};
  }
    
}