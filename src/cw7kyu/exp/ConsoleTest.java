/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.exp;

/**
 *
 * @author Ryan Cabanas
 */
public class ConsoleTest {
  
  public static void getPassword() {
    java.io.Console cons = null;
    cons = System.console();
    char[] passwd = null;
    
    try {
      if (cons != null) {
        System.out.println("We have console!");
        passwd = cons.readPassword("[%s]", "Password:");
      } else {
        System.out.println("We have no console");
      }
    } catch (Exception e) {
    }
    
    if ((cons != null) && (passwd != null)) {
      for (char c : passwd) {
        System.out.print(c);
      }
      
      java.util.Arrays.fill(passwd, 'x');
      System.out.println("");
      System.out.println("Password array cleared.");
      
      for (char c : passwd) {
        System.out.print(c);
      }
    }
  }
}
