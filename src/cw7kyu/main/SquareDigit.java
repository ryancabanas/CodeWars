/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

/**
 *
 * @author Ryan
 */
public class SquareDigit {

  public int squareDigits(int n) {
    String[] array = String.valueOf(n).split("");
    int length = array.length;
    int value;
    
    for (int i = 0; i < length; i++) {
      value = Integer.parseInt(array[i]);
      array[i] = Integer.toString(value * value);
    }
    
    return Integer.parseInt(String.join("", array));
  }

}
