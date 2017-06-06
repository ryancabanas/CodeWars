/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.exphelpers;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Ryan Cabanas
 */
public class Input {
  /**
   * Get input from the console.
   * @return Returns a String minus the '\n' at the end.
   */
  public static String getInput() {
    int next, length;
    StringBuilder feed = new StringBuilder();
    
    try {
      do {
        next = System.in.read();
        if (next == 92) next = 47;
        feed.append((char) next);
      } while ((char) next != '\n');
    } catch (IOException e) {
      System.out.println(e);
    }
    
    length = feed.length();
    return feed.toString().substring(0, length-1); //Remove the '\n' at the end of the string.
  }
  
/**
   * Get input from a FileInputStream.
   * @param in A FileInputStream.
   * @return Returns a String minus the '\n' at the end.
   */
  public static String getInput(FileInputStream in) {
    int next, length;
    StringBuilder feed = new StringBuilder();
    
    try {
      do {
        next = in.read();
        feed.append((char) next);
      } while (next != -1);
    } catch (IOException e) {
      System.out.println(e);
    }
    
    length = feed.length();
    return feed.toString().substring(0, length-1); //Remove the '\n' at the end of the string.
  }
}
