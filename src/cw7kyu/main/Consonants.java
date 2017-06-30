/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Consonants {
  public static int getCount(String str) {
    String regEx = "[^b-dB-Df-hF-Hj-nJ-Np-tP-Tv-zV-Z]";
    return str.replaceAll(regEx, "").length();
  }
}