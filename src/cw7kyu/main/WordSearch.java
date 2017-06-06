/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;

class WordSearch {
  
  static String[] findWord(String x, String[] y) {
    ArrayList<String> result = new ArrayList();
    int index = 0;
        
    for (String string : y) {
      if (string.toLowerCase().contains(x.toLowerCase())) {
        result.add(string);
      }
    }
    
    return (result.isEmpty()) ? new String[]{"Empty"} : result.toArray(new String[result.size()]);
  }
}