/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;

public class MaxRotate {
    
  public static long maxRot (long n) {
    String number = String.valueOf(n);
    String[] strNumArray = number.split("");
    String movingValue;
    ArrayList<Long> combos = new ArrayList<>();
    
    combos.add(n);
    
    for (int i = 0; i < strNumArray.length-1; i++) {
      movingValue = strNumArray[i];
      for (int j = i+1; j < strNumArray.length; j++) {
        strNumArray[j-1] = strNumArray[j];
        if (j == strNumArray.length-1) {
          strNumArray[j] = movingValue;
          combos.add(stringArrayToLong(strNumArray));
        }
      }
    }
    
    combos.sort(null);
    int size = combos.size();
    return combos.get(size-1);
  }
  
  static long stringArrayToLong(String[] array) {
    StringBuilder sb = new StringBuilder();
    for (String string : array) {
      sb.append(string);
    }
    return Long.parseLong(sb.toString());
  }
}
