/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class Sum {
  public int GetSum(int a, int b) {
   int difference = (a >= b) ? (a - b + 1) : (b - a + 1);
   int smallest = (a < b) ? a : b;
   int[] intArray = new int[difference];

   for (int i = 0; i < difference; i++)
     intArray[i] = smallest + i;

   return Arrays.stream(intArray).sum();
  }
}