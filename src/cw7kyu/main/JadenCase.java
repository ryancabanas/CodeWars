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
public class JadenCase {

  public String toJadenCase(String phrase) {
    if (phrase != null && !"".equals(phrase)) {
      String[] words = phrase.split("\\s");
      Character firstLetter;

      for (int i = 0; i < words.length; i++) {
        firstLetter = Character.toUpperCase(words[i].charAt(0));
        words[i] = firstLetter.toString() + words[i].substring(1);
      }
      return String.join(" ", words);
    }
    return null;
  }

}
