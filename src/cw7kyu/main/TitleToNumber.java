/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class TitleToNumber {
  public static long titleToNumber(String title) {
    StringBuilder reversed = new StringBuilder(title).reverse();
    char[] array = reversed.toString().toUpperCase().toCharArray();
    long sum = array[0] - 64;
    
    for (int i = 1; i < array.length; i++) {
      sum += (array[i] - 64) * Math.pow(26, i);      
    }
    
    return sum;
  }
}

class TitleToNumberDemo {
  public static void main(String[] args) {
    System.out.println(TitleToNumber.titleToNumber("BA"));
  }
}