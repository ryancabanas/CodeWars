/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.HashMap;

public class CharacterCounter {

  public static boolean validateWord(String word) {
    String[] letters = word.toLowerCase().split("");
    HashMap<String, Integer> tracker = new HashMap<>();
    int value;
    
    for (String letter : letters) {
      if (tracker.get(letter) != null) {
        value = tracker.get(letter);
        tracker.put(letter, value+1);
      } else {
        tracker.put(letter, 1);
      }
    }
    
    return (tracker.values().stream().distinct().count() == 1);
  }
}

class CharacterCounterDemo {
  public static void main(String[] args) {
    CharacterCounter.validateWord("abcabc");
  }
}