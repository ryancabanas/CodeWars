/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.*;

public class UniqueArray {
  
  public static int[] unique(int[] integers) {
    return Arrays.stream(integers).distinct().toArray();
  }
  
}