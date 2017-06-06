/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Money {
  
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    if (desired > principal) {
      int years = 0;
      double sum = principal;
      
      while (sum < desired) {
        sum += (sum * interest) * (1 - tax);
        years++;
      }
      
      return years;
    }
    
    return 0;
  }
  
}