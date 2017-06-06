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
public class DnaStrand {
  
  public static String makeComplement(String dna) {
    String[] characters = dna.split("");
    
    for (int i = 0; i < characters.length; i++)
      characters[i] = dnaLetterInvert(characters[i]);
    
    return String.join("", characters);
  }
  
  private static String dnaLetterInvert(String s) {
    switch (s.toUpperCase()) {
      case "A":
        return "T";
      case "T":
        return "A";
      case "C":
        return "G";
      case "G":
        return "C";
      default:
        return s;
    }
  }
  
}