/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.Stream;

public class CC {
  
  public static int charCount(String str, char c) {
    return (int)Stream
            .of(str.toLowerCase().split(""))
            .filter((t) -> t.equals(Character.toString(c).toLowerCase()))
            .count();
  }
}