/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class SequenceSum {

  public static String showSequence(int value) {
    if (value == 0) {
      return "0=0";
    } else if (value < 0) {
      return String.valueOf(value) + "<0";
    } else {
      int sum = 0;
      StringBuilder theString = new StringBuilder(value * 2 + 1);
      for (int i = 0; i <= value; i++) {
        theString.append(i);
        if (i < value) {
          theString.append("+");
        }
        sum += i;
      }
      return theString.toString() + " = " + String.valueOf(sum);
    }
  }
}