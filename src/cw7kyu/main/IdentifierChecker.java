/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class IdentifierChecker {
  
  public static boolean isValid(String idn) {
    boolean boo1 = false;
    boolean boo2 = true;
    
    if (idn.length() > 0) {
      boo1 = idn.substring(0, 1).matches("[a-zA-Z_$]*");
    }
  
    if (idn.length() > 1) {
      boo2 = idn.substring(1).matches("[a-zA-Z0-9_$]*");      
    }
       
    return (boo1 && boo2);
  }
}

class IdentifierCheckerDemo {
  public static void main(String[] args) {
    System.out.println(IdentifierChecker.isValid("i1"));
  }
}