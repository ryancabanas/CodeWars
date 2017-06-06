/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

class RowSumOddNumbers {
  
  public static int rowSumOddNumbers(int n) {
    int start = n * (n - 1) + 1;
    int sum = 0;
    
    for (int i = 0; i < n; i++)
      sum += start + (i * 2);
    
    return sum;
  }
    
}