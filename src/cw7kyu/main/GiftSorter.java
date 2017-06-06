/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class GiftSorter {

  public String sortGiftCode(String code) {
    if (code != null) {
      StringBuilder result = new StringBuilder(26);
      
      char[] array = code.toCharArray();
      Arrays.sort(array);
      
      for (char c : array) {
        result.append(c);
      }
      
      return result.toString();
    }
    
    return "";
  }
  
}