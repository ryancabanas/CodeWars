/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class GreetMe{
  
  public static String greet(String name){
    return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase()+ "!";
  }
  
}