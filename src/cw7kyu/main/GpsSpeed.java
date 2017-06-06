/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.Arrays;

public class GpsSpeed {
    
  public static int gps(int s, double[] x) {
    if (x.length <= 1) return 0;
    
    double[] calcs = new double[x.length-1];

    for (int i = 0; i < x.length-1; i++) {
      calcs[i] = (3600 * (x[i+1] - x[i])) / s;
    }
    
    return (int) Math.floor(Arrays.stream(calcs).max().getAsDouble());
  }
}