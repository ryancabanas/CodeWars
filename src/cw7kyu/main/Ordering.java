/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ordering {
  
  public String orderWord(String s){
    if (s == null || s.length() <= 0) {
      return "Invalid String!";
    }

    String[] letters = s.split("");
    return Stream.of(letters).sorted().collect(Collectors.joining());
  }
}