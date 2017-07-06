/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class GreenGlassDoor {
  boolean stepThroughWith(String s) {
    int length = s.length();
    for (int i = 1; i < length; i++) {
      if (s.charAt(i) == s.charAt(i-1)) {
        return true;
      }
    }
    return false;
  }
}

class GreenGlassDoorDemo {
  public static void main(String[] args) {
    GreenGlassDoor test = new GreenGlassDoor();
    System.out.println(test.stepThroughWith("sandaals"));    
  }
}