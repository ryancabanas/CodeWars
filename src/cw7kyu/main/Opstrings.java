/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

class Opstrings {
    
  public static String vertMirror (String strng) {
    String[] array = strng.split("\\n");
    for (int i = 0; i < array.length; i++) {
      array[i] = new StringBuffer(array[i]).reverse().toString();
    }
    return String.join("\n", array);
  }

  public static String horMirror (String strng) {
    String[] array = strng.split("\\n");
    int maxIndex = array.length-1;
    String temp;
    for (int i = 0; i < array.length/2; i++) {
      temp = array[i];
      array[i] = array[maxIndex-i];
      array[maxIndex-i] = temp;      
    }
    return String.join("\n", array);
  }

  public static String oper(Mirror operator, String s) {
    return operator.doIt(s);
  }

  @FunctionalInterface
  interface Mirror {
    String doIt(String strng);
  }
}

class OpstringsDemo {
  public static void main(String[] args) {
    String result = Opstrings.oper(Opstrings::horMirror, "abc\ndef\nhij");
    System.out.println("");
  }
}