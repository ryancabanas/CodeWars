/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.exp;

import cw7kyu.exphelpers.Input;

/**
 *
 * @author Ryan Cabanas
 */
public class Polly {
  
  public static void PlayWithHim() {
    String input;

    System.out.println("Play with Polly the parrot.");
    System.out.println("");
    
    while (true) {
      input = Input.getInput();
      
      if ("bang".equals(input.toLowerCase())) {
        System.out.println("Poor polly. Program ended.");
        System.out.println("");
        break;
      }
      
      System.out.println("Sqwock! " + input);
      System.out.println("");
    }
  }
  }
