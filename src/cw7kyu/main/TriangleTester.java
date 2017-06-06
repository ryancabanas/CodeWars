/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

/**
 *
 * @author Ryan
 */
class TriangleTester {
  public static boolean isTriangle(int a, int b, int c) {
    if (a != 0 && b != 0 && c != 0) {    
      double cosinedNumber = ((a * a) + (b * b) - (c * c)) / (2 * a * b);
      double acosinedNumber = Math.acos(cosinedNumber);
      return (acosinedNumber > 0 && acosinedNumber < Math.PI);
    }
    return false;
  }
}
