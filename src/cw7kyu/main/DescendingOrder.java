/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int tempNum = num;
    int digitsLength = Integer.toString(num).length();
    Integer[] arrayDigits = new Integer[digitsLength];
    StringBuilder stringResult = new StringBuilder(digitsLength);
    
    //Populate the array with the digits of the integer number.
    for (int i = 0; i < digitsLength; i++) {
      arrayDigits[i] = tempNum % 10;
      tempNum = tempNum / 10;
    }
    
    //Sort the digits in the array.
    Arrays.sort(arrayDigits);
    
    //Revers the digit order and place results in a string.
    for (int j = digitsLength - 1; j >= 0; j--) {
      stringResult.append(arrayDigits[j]);
    }
        
    return Integer.parseInt(stringResult.toString());
  }
}
