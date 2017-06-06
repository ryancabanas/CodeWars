/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Sequence {
  
  public static int nthterm(int first, int n, int c) {
    int result = first;
    for (int i = 1; i <= n; i++) result += c;
    return result;
  }
  
}