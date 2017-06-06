/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Evaporator { 
	
  public static int evaporator(double content, double evap_per_day, double threshold) {
    int count = 0;
    double numerator = content;
    double remaining = (numerator / content) * 100;
    
    while (remaining >= threshold) {
      numerator = (numerator * (1.0 - (evap_per_day / 100)));
      remaining = (numerator / content) * 100;
      count++;
    }
    
    return count;
  }
    
}