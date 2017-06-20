/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        default:
          result.append(s);
      }
    }

    return result.toString();
  }
  
  public static Object[] mean(char[] lst) {
    int sum = 0;
    StringBuilder string = new StringBuilder(10);
    
    for (char c : lst) {
      if (Character.isDigit(c)) {
        sum += Integer.parseInt(String.valueOf(c));
      } else {
        string.append(c);
      }
    }
    
    return new Object[] {((double)sum) / 10, string.toString()};
  }
  
  public static String replaceNth(String text, int n, char oldValue, char newValue) {
    char[] array = text.toCharArray();
    
    int ovCount = (int)Stream
            .of(text.split(""))
            .filter((t) -> t.equals(Character.toString(oldValue)))
            .count();
    
    if (n <= 0 || n > ovCount) {
      return text;
    }
    
    for (int i = 0, count = 0; i < array.length; i++) {
      if (array[i] == oldValue) {
        count++;
        if (count % n == 0) {
          array[i] = newValue;
        }
      }
    }
    
    return String.valueOf(array);
  }
  
  public static int mod256WithoutMod(int number) {
    boolean negative = (number < 0);
    number = Math.abs(number);
    while (number >= 256) {
      number -= 256;
    }
    return (negative) ? -number : number;
  }
  
  public static int[] sortByValueAndIndex(int[] array) {
    int[] results = new int[array.length];
    ArrayList<ArrayList<Integer>> outside = new ArrayList<>();
    
    for (int i = 0; i < array.length; i++) {
      ArrayList<Integer> inside = new ArrayList<>();
      inside.add(array[i]);
      inside.add((i+1)*array[i]);
      outside.add(inside);
    }
    
    outside.sort((ArrayList<Integer> a, ArrayList<Integer> b) -> {
      if (a.get(1) < b.get(1)) {
        return -1;
      } else if (Objects.equals(a.get(1), b.get(1))) {
        return 0;
      } else {
        return 1;
      }
    });
    
    for (int i = 0; i < results.length; i++) {
      results[i] = outside.get(i).get(0);
    }
    
    return results;
  }

  public static int sumTriangularNumbers(int n) {
  int result = 0;
    
    if (n > 0) {
      for (int i = 1; i <= n; i++) {
        result += sumToN(i);
      }
    }
    
    return result;
  }
  
  private static int sumToN(int n) {
    int result = 0;
    
    if (n > 0) {
      for (int i = 1; i <= n; i++) {
        result += i;
      }
    }
    
    return result;
  }
  
  public static int lostSheeps(
          int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
    return sheepsTotal
            - IntStream.of(fridayNightCounting).sum()
            - IntStream.of(saturdayNightCounting).sum();
  }
  
}

class KataDemo {
  public static void main(String[] args) {
    System.out.println(Kata.sumTriangularNumbers(4));
  }
}