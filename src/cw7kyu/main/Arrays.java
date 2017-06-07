/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Arrays {

  public static int findSmallest(final int[] numbers, final String toReturn) {
    int smallestValue = numbers[0];
    int smallestIndex = 0;

    for (int number : numbers) {
      if (number < smallestValue){
        smallestValue = number;
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == smallestValue) {
        smallestIndex = i;
        break;
      }
    }

    if (toReturn.equalsIgnoreCase("index")) {
      return smallestIndex;
    } else if (toReturn.equalsIgnoreCase("value")) {
      return smallestValue;
    } else {
      return 0;
    }
  }
}