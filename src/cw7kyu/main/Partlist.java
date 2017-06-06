/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Partlist {
    
  public static String[][] partlist(String[] arr) {
    String[][] result = new String[arr.length-1][2];
    StringBuilder str1 = new StringBuilder();
    StringBuilder str2 = new StringBuilder();
    
    for (int i = 0; i < arr.length-1; i++) {
      
      for (int j = 0; j <= i; j++) {
        str1.append(arr[j]).append(" ");
      }      
      for (int j = i+1; j < arr.length; j++) {
        str2.append(arr[j]).append(" ");
      }
      
      result[i][0] = str1.toString().trim();
      result[i][1] = str2.toString().trim();
      
      str1.delete(0, str1.length());
      str2.delete(0, str2.length());
    }
    
    return result;
  }
}