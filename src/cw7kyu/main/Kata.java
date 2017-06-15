/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
  
  public static long[] NumbersWithDigitInside(long x, long d) {
    ArrayList<Long> valuesList = new ArrayList();
    long[] results = new long[3];
    int count;
    long sum = 0;
    long product;
    
    
    for (long i = 0; i < x; i++) {
      if (String.valueOf(i+1).contains(String.valueOf(d))) {
        valuesList.add(i+1);
      }
    }
    
    count = valuesList.size();
    product = (count > 0) ? 1 : 0;  //Set product to 1 if at least one value in list.

    for (int i = 0; i < count; i++) {
      sum += valuesList.get(i);
      product *= valuesList.get(i);
    }
    
    results[0] = (long) count;
    results[1] = sum;
    results[2] = product;
        
    return results;
  }
  
  public static String rakeGarden(String garden) {
    String[] array = garden.split(" ");
    
    return Stream.of(array).map((t) -> {
      if (!t.toLowerCase().equals("gravel") & !t.toLowerCase().equals("rock")) {
        return "gravel";
      }
      return t;
    }).collect(Collectors.joining(" "));
  }
  
  static String toLeetSpeak(final String speak) {
    StringBuilder result = new StringBuilder();
    String[] array = speak.split("");
    
    for (String s : array) {
      switch (s) {
        case "A":
          result.append("@");
          break;
        case "B":
          result.append("8");
          break;
        case "C":
          result.append("(");
          break;
        case "D":
          result.append("D");
          break;
        case "E":
          result.append("3");
          break;
        case "F":
          result.append("F");
          break;
        case "G":
          result.append("6");
          break;
        case "H":
          result.append("#");
          break;
        case "I":
          result.append("!");
          break;
        case "J":
          result.append("J");
          break;
        case "K":
          result.append("K");
          break;
        case "L":
          result.append("1");
          break;
        case "M":
          result.append("M");
          break;
        case "N":
          result.append("N");
          break;
        case "O":
          result.append("0");
          break;
        case "P":
          result.append("P");
          break;
        case "Q":
          result.append("Q");
          break;
        case "R":
          result.append("R");
          break;
        case "S":
          result.append("$");
          break;
        case "T":
          result.append("7");
          break;
        case "U":
          result.append("U");
          break;
        case "V":
          result.append("V");
          break;
        case "W":
          result.append("W");
          break;
        case "X":
          result.append("X");
          break;
        case "Y":
          result.append("Y");
          break;
        case "Z":
          result.append("2");
          break;
        case " ":
          result.append(" ");
          break;
      }
    }

    return result.toString();
  }
}

class KataDemo {
  public static void main(String[] args) {
     Kata.toLeetSpeak("HELLO WORLD");
  }
}