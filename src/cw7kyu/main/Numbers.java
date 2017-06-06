/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Numbers {
  
  public static double twoDecimalPlaces(double number) {
    String strNum = String.valueOf(number);
    int point = strNum.indexOf('.');
    System.out.println(point);
    return Double.parseDouble(strNum.substring(0, point+3));
  }
}