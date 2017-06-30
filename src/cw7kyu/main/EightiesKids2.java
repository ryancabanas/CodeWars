/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class EightiesKids2 {
  public static String findSpaceship(String map) {
    int xIndex = map.indexOf("X");
    
    if (xIndex == -1) {
      return "Spaceship lost forever.";
    }
    
    String frontSubstring = map.substring(0, xIndex);
    String backSubstring = map.substring(xIndex+1);
    
    int lastNewlineInFrontSubstring = frontSubstring.lastIndexOf("\n");
    
    // Count dots before "X" position on that row only.
    int x = frontSubstring.substring(lastNewlineInFrontSubstring+1).length();
    // Count newlines found after "X" position.
    int y = backSubstring.replaceAll(".", "").length();
    
    return "[" + x + ", " + y + "]";
  }
}

class EightiesKids2Demo {
  public static void main(String[] args) {
    System.out.println(EightiesKids2.findSpaceship("X.\n..\n.."));
  }
}