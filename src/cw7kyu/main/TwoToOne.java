/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class TwoToOne {
    
  public static String longest (String s1, String s2) {
    if (s1 == null) s1 = "";
    if (s2 == null) s2 = "";
        
    String previousLetter = null;
    String[] combo = (s1 + s2).split("");
    StringBuilder results = new StringBuilder(combo.length);
    Arrays.sort(combo);
    
    for (String combo1 : combo) {
      if (!combo1.equals(previousLetter)) {
        results.append(combo1);
        previousLetter = combo1;
      }
    }
    
    return results.toString();
  }   
}