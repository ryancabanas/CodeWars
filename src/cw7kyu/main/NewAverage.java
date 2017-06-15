/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.DoubleStream;

public class NewAverage {
  
  public static long newAvg(double[] arr, double navg) throws IllegalArgumentException {
    double sum = DoubleStream.of(arr).sum();
    long count = DoubleStream.of(arr).count();
    long result = (long)Math.ceil((navg * (count+1)) - sum);
    if (result < 0) {
      throw new IllegalArgumentException();
    } else {
      return result;
    }
  }
}