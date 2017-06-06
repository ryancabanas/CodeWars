/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Reverse {

  public String reverse(String str) {
    if (str.length() == 1) return Character.toString(str.charAt(0));
    return reverse(str.substring(1)) + Character.toString(str.charAt(0));
  }
  
}