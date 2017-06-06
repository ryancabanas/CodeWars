/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

class DivSeven {
    
  public static long[] seven(long m) {
    int count = 0;
    int remainder;
    long front;

    while (String.valueOf(m).length() > 2) {
      count++;
      remainder = (int) m % 10;
      front = m / 10;
      m = front - (2 * remainder);
    }
    
    return new long[]{m, count};
  }
}