/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class MostDigits {
  
  public static int findLongest(int[] numbers) {
    int maxLength = 0;
    int value = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (String.valueOf(Math.abs(numbers[i])).length() > maxLength) {
        maxLength = String.valueOf(Math.abs(numbers[i])).length();
        value = numbers[i];
      }
    }
    return value;
  }
}

class MostDigitsDemo {
  public static void main(String[] args) {
    System.out.println(MostDigits.findLongest(new int[] {-10, 1, 0, 1, 10}));
  }
}