/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Divisible {
  
  public static boolean isDivisible(int... i){
    for (int j = 1; j < i.length; j++) {
      if (i[j] == 0 || i[0] % i[j] != 0) {
        return false;
      }
    }
    return true;
  }
}