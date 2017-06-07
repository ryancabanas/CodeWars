/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.IntStream;

public class Arrays {

  public static int findSmallest(final int[] numbers, final String toReturn) {
    IntStream daStream = java.util.Arrays.stream(numbers);
    int smallestValue = 0;
    int smallestIndex = 0;
    try {
      smallestValue = daStream.min().getAsInt();
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == smallestValue) {
          smallestIndex = i;
          break;
        }
      }
    } catch (Exception e) {
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