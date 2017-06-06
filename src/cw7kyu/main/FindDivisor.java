/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class FindDivisor {

  public long numberOfDivisors(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) if (n % i == 0) count++;
    return count;
  }

}