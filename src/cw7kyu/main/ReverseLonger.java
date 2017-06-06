/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class ReverseLonger {

  public static String shorterReverseLonger(String a, String b) {
    String longer = a.length() >= b.length() ? a : b;
    String shorter = a.length() < b.length() ? a : b;
    return shorter + reverse(longer) + shorter;
  }

  private static String reverse(String x) {
    StringBuilder result = new StringBuilder(x.length());
    for (int i = x.length() - 1; i >= 0; i--) result.append(x.charAt(i));
    return result.toString();
  }
  
}
