/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class BrokenSequence {
  
  public int findMissingNumber(String sequence) {
    if (sequence == null || sequence.trim().length() == 0) {
      return 0;
    }
    
    String[] strValues = sequence.split(" ");
    int[] intValues = new int[strValues.length];
    
    try {
      for (int i = 0; i < strValues.length; i++) {
        intValues[i] = Integer.parseInt(strValues[i]);
      }      
    } catch (NumberFormatException e) {
      return 1; //Non-integer value found.
    }
    
    Arrays.sort(intValues);
    
    for (int i = 0; i < intValues.length; i++) {
      if (i+1 != intValues[i]) {
        return i+1;
      }
    }

    return 0;
  }   
}