/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class FunReverse {
    
  public static String funReverse(String s) {
    String[] values = s.split("");
    StringBuilder string = new StringBuilder(values.length);
    int i = 0;
    int j = values.length-1;
    
    while (j >= i) {
      string.append(values[j--]);
      if (i <= j) {
        string.append(values[i++]);
      }
    }
    
    return string.toString();
  }
}

class FunReverseDemo {
  public static void main(String[] args) {
    FunReverse.funReverse("012");
  }
}