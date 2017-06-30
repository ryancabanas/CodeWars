/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class RoboticTattooRemoval {
  public static String[][] robot(String[][] skinScan) {
    for (int i = 0; i < skinScan.length; i++) {
      for (int j = 0; j < skinScan[i].length; j++) {
        if (skinScan[i][j].equals("X")) {
          skinScan[i][j] = "*";
        }
      }
    }
    return skinScan;
  }
}
