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
public class XO {
  
  public static boolean getXO (String str) {
    String xValues = str.replaceAll("[^xX]", "");
    String oValues = str.replaceAll("[^oO]", "");
    
    return xValues.length() == oValues.length();
  }
  
}
