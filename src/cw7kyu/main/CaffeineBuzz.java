/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class CaffeineBuzz {
  
  public static String caffeineBuzz(int n){
    String threeFour = "";
    String even = "";
        
    if (n % 3 == 0) {
      if (n % 4 == 0) { threeFour = "Coffee"; }
      else { threeFour = "Java"; }
    }
    if (!threeFour.equals("") && n % 2 == 0) even = "Script";

    if (!threeFour.equals("")) return threeFour + even;
    return "mocha_missing!";
  }
  
}
