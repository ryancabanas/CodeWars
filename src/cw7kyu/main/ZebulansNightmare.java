/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class ZebulansNightmare {
  
  public static String zebulansNightmare(final String functionName) {
    String[] temp = functionName.split("");
    StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < temp.length; i++) {
      if ("_".equals(temp[i])) {
        temp[i+1] = temp[i+1].toUpperCase();
      }
    }

    for (String string : temp) {
      if (!"_".equals(string)) {
        result.append(string);
      }
    }
    
    return result.toString();
  }
}