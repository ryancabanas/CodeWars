/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class NthSeries {
	
  public static String seriesSum(int n) {
    double sum = 0;
    
    for (int i = 0; i < n; i++) {
      sum += 1.0 / ((i * 3) + 1);
    }
    
    return String.format("%.2f", sum);
  }
  
}