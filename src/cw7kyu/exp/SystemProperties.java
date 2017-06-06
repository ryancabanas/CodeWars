/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.exp;

import java.util.TreeMap;

/**
 * Class to get the properties of the computer system that this JVM is installed on.
 * @author Ryan Cabanas
 */
public class SystemProperties {
  /**
   * Get the properties of this computer system.
   */
  public static void getProperties() {
    TreeMap<String, String> treeMap = new TreeMap(System.getProperties());
    treeMap.forEach((x, y) -> System.out.printf("Key: %-30s Value: %-30s%n", x, y));
  }
}
