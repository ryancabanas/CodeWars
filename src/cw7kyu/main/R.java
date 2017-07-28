/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class R {
  public static String removeBang(String str) {
    if (str.length() > 0) {
      String[] split = str.split(" ");
      StringBuilder sb = new StringBuilder();
      for (String string : split) {
        sb.append(R.removeBangSingleWord(string));
        sb.append(" ");
      }
      return sb.substring(0, sb.length()-1);      
    }
    return "";
  }
  
  static String removeBangSingleWord(String str) {
    int index = str.length();
    char letter;
    do {
      index--;
      letter = str.charAt(index);
    } while (letter == '!');
    return str.substring(0, ++index);
  }
}

class RDemo {
  public static void main(String[] args) {
    System.out.println(R.removeBang("! !"));
  }
}