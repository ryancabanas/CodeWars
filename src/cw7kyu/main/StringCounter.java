/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.stream.Stream;

class StringCounter {
  
  public static int stringCounter(String inputS, char charS){
    return (int)Stream
            .of(inputS.split(""))
            .filter((t) -> t.equals(Character.toString(charS)))
            .count();
  }
}