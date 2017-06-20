/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class InParts {
  public static String splitInParts(String s, int partLength) {
    int beginIndex = 0;
    int endIndex = beginIndex + partLength;
    StringBuilder builder = new StringBuilder();
    
    while (endIndex <= s.length()) {
      builder.append(s.substring(beginIndex, endIndex));
      if (endIndex != s.length()) {
        builder.append(" ");        
      }
      beginIndex = endIndex;
      endIndex = beginIndex + partLength;
    }
    
    if (endIndex == s.length()) {
      return builder.toString();
    } else {
      builder.append(s.substring(beginIndex));
      return builder.toString();
    }
  }
}

class InPartsDemo {
  public static void main(String[] args) {
    int x = 3;
    String regEx = "(.{3})";
    String result;
    result = "supercalifragilisticexpialidocious".replaceAll(regEx, "$1 ");
    System.out.println("");
  }
}