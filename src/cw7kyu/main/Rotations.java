/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotations {
    
  public static Boolean containAllRots(String strng, List<String> arr) {
    List<String> rotator = Arrays.asList(strng.split(""));
    int size = rotator.size();
    ArrayList<String> combos = new ArrayList<>(size);
    
    for (int i = 0; i < size; i++) {
      combos.add(String.join("", rotator.toArray(new String[0])));
      Collections.rotate(rotator, 1);
    }

    return arr.containsAll(combos);
    }
  }

class RotationsDemo {
  public static void main(String[] args) {
    Rotations.containAllRots("help", null);
  }
}