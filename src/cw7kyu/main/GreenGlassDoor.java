/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class GreenGlassDoor {
  boolean stepThroughWith(String s) {
    String text = "You can take the moon, but not the sun.\n" +
      "\n" +
      "You can take your slippers, but not your sandals.\n" +
      "\n" +
      "You can go through yelling, but not shouting.\n" +
      "\n" +
      "You can't run through fast, but you can run with speed.\n" +
      "\n" +
      "You can take a sheet, but not your blanket.\n" +
      "\n" +
      "You can wear your glasses, but not your contacts.";
    int length = s.length();
    int index = text.indexOf(s);

    return (text.charAt(index+length) == ',');
  }
}

class GreenGlassDoorDemo {
  public static void main(String[] args) {
    GreenGlassDoor test = new GreenGlassDoor();
    System.out.println(test.stepThroughWith("sandals"));    
  }
}