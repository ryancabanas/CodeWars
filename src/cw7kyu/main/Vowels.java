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
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    
    char[] characters = str.toLowerCase().toCharArray();
    
    for(char character: characters) {
      switch (character) {
        case 'a': case 'e': case 'i': case 'o': case 'u':
          vowelsCount++;
      }
    }
    
    return vowelsCount;
  }

}