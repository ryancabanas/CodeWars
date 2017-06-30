/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.LongStream;

class Sumpowdig {
  public static long[] eqSumPowDig(long hmax, int exp) {
    return LongStream
            .rangeClosed(2, hmax)
            .filter((x) -> {
              long xCopy = x;
              long sum = 0;
              int numberLength = String.valueOf(xCopy).length();
              for (int i = 0; i < numberLength; i++) {
                sum += Math.pow(xCopy % 10, exp);
                xCopy = xCopy / 10;
              }
              return sum == x;
            })
            .toArray();
  }
}

class SumpowdigDemo {
  public static void main(String[] args) {
    long[] x = Sumpowdig.eqSumPowDig(370, 3);
    System.out.println("");
  }
}