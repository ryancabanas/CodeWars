/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.List;
import java.util.ArrayList;

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
  
  public String match(List<Integer> usefulness, int months) {
    double maleValue = 0;
    double femaleGoal = 100;
    
    for (Integer value : usefulness) {
      maleValue += value;
    }
    
    for (int i = 0; i < months; i++) {
      femaleGoal = femaleGoal * (1.0 - 0.15);
    }
    
    return (femaleGoal <= maleValue) ? "Match!" : "No match!";
  }
  
  
}

class SolutionDemo {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    values.add(15);
    values.add(24);
    values.add(12);
    Solution test = new Solution();
    String result = test.match(values, 4);
    System.out.println(result);
  }
}