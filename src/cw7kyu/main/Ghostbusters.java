/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Ghostbusters {
  
  public static String ghostBusters(String building) {
    if (building.contains(" ")) {
      return building.replaceAll(" ", "");      
    }
    return "You just wanted my autograph didn't you?";
  }
}