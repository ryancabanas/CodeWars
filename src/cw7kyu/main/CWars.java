/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

class CWars {
  public static String initials(String name){ 
    String[] names = name.split(" ");
    int i = 0;
    
    for (; i < names.length-1; i++) {
      names[i] = names[i].substring(0, 1).toUpperCase() + ".";
    }
    
    names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
    return String.join("", names);
  }
}

class CWarsDemo {
  public static void main(String[] args) {
    System.out.println(CWars.initials("Barack Hussain obama"));
  }
}