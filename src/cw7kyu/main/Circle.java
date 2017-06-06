/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Circle {
  
  public static double area(double radius) throws IllegalArgumentException{
    if (radius <= 0) throw new IllegalArgumentException();
    return Math.PI * Math.pow(radius, 2);
  }
  
}