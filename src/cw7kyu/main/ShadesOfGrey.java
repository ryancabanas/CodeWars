/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class ShadesOfGrey {
  
  static String[] shadesOfGrey(int num) {
    if (num <= 0)
      return new String[0];
    if (num > 254)
      num = 254;
    
    String[] result = new String[num];
    
    for (int i = 1; i <= num; i++)
      result[i-1] = String.format("#%02x%02x%02x", i, i, i);

    return result;
  }
}