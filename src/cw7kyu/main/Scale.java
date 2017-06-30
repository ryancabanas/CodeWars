/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scale {
  public static String scale(String string, int h, int v) {
    if (string.length() == 0) {
      return "";
    }
    String result = Stream
            .of(string.split("\n"))
            .map((a) -> Scale.duplicateHorizontal(a, h))
            .map((b) -> Scale.duplicateVertical(b, v))
            .collect(Collectors.joining());
    return result.substring(0, result.length()-1);    
  }
  
  static String duplicateVertical(String string, int count) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < count; i++) {
      builder.append(string);
      builder.append("\n");
    }
    return builder.toString();
  }

  static String duplicateHorizontal(String string, int count) {
    return Stream
            .of(string.split(""))
            .map((s) -> Scale.duplicateLetter(s, count))
            .collect(Collectors.joining());
  }

  static String duplicateLetter(String s, int count) {
    StringBuilder builder = new StringBuilder(count);
    for (int i = 0; i < count; i++) {
      builder.append(s);
    }
    return builder.toString();
  }
}

class ScaleDemo {
  public static void main(String[] args) {
    String test = Scale.scale("abc\ndef", 3, 4);
    System.out.println("");
  }
}