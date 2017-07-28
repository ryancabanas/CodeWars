/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Codewars {
  public static String oddOrEven (int[] array) {
    if (array.length > 0) {
      int sum = 0;
      for (int i : array) {
        sum += i;
      }
      if ((sum & 1) == 1) {
        return "odd";
      }
    }
    return "even";
  }
}
