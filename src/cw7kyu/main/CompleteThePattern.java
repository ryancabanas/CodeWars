/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class CompleteThePattern {
  
  public static String pattern(int n) {
    if (n < 1) return "";
    
    StringBuilder result = new StringBuilder();
    
    for (int i = 1; n >= i; i++) {
      for (int j = n; j >= i; j--) result.append(j);
      if (i != n) result.append("\n");
    }
    
    return result.toString();
  }
    
}