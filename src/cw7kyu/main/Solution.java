/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Solution {
  
  public static int numberOfRectangles(int m, int n) {
    return ((m * (m + 1)) / 2) * ((n * (n + 1)) / 2);
  }  
}