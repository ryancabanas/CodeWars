/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.List;

public class BinaryArrayToNumber {

  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    int size = binary.size();
    int result = 0;
    
    for (int i = size - 1, j = 0; i >= 0; i--, j++)
        result += binary.get(i) * Math.pow(2, j);
    
    return result;
  }

}