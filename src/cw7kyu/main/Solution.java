/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    return ((m * (m + 1)) / 2) * ((n * (n + 1)) / 2);
  }
  
  public static String isSortedAndHow(int[] array) {
    boolean asc = true;
    boolean desc = true;
    
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i-1]) {
        desc = false;
      }
      if (array[i] < array[i-1]) {
        asc = false;
      }
      if (!desc & !asc) {
        break;
      }
    }
    
    return (!asc & !desc) ? "no" : (asc) ? "yes, ascending" : "yes, descending";
  }
}

class TestIt {
  public static void main(String[] args) {
    System.out.println(Solution.isSortedAndHow(new int[] {15, 7, 3, -8}));
  }
}