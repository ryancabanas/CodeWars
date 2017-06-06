/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class EmailObfuscator {
    
  public static String obfuscate(String email) {
    return email.replace("@", " [at] ").replace(".", " [dot] ");
  }
}