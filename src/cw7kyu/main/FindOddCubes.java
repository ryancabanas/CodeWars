/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.IntStream;

public class FindOddCubes {
 public static int cubeOdd(int arr[]) {
   return IntStream
           .of(arr)
           .map(x -> (int) Math.pow(x, 3))
           .filter(x -> (x & 1) == 1)
           .sum();
  }
}

class FindOddCubesDemo {
  public static void main(String[] args) {
    int result = FindOddCubes.cubeOdd(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    System.out.println(result);
  }
}