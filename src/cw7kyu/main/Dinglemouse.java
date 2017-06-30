/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dinglemouse {
  public static String histogram(final int results[]) {
    StringBuilder result = new StringBuilder();
    for (int i = results.length-1; i >= 0; i--) {
      String poundSymbolsString = Stream
              .generate(() -> "#")
              .limit(results[i])
              .collect(Collectors.joining());
      int poundSymbolCount = poundSymbolsString.length();
      
      result.append(i+1);
      result.append("|");
      result.append(poundSymbolsString);
      if (poundSymbolCount > 0) {
        result.append(" ");
        result.append(poundSymbolCount);        
      }
      result.append("\n");
    }
    return result.toString();
  }
}

class DinglemouseDemo {
  public static void main(String[] args) {
    System.out.println(Dinglemouse.histogram(new int[] {7,3,10,1,0,5}));
  }
}