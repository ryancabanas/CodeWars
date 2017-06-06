/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Printer {
    
  public static String printerError(String s) {
    int num;
    int denom = s.length();
    
    num = denom - s.replaceAll("[^a-m]", "").length();
    return String.format("%1$d/%2$d", num, denom);
  }
    
}