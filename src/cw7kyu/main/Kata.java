/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;
import java.util.List;
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
  
  public static String[] lineupStudents(String students) {     
    String[] array = students.split(" ");
    
    return Stream
            .of(array)
            .sorted((String a, String b) -> {
              if (a.length() < b.length()) {
                return 1;
              } else if (a.length() > b.length()) {
                return -1;
              } else {
                for (int i = 0; i < a.length(); i++) {
                  if (a.charAt(i) < b.charAt(i)) {
                    return 1;
                  } else if (a.charAt(i) > b.charAt(i)) {
                    return -1;
                  }
                }
                return 0;
              }
            })
            .toArray(String[]::new);
  }
  
  static String alternateCase(final String string) {
    if (string.length() == 0) {
      return string;
    }
    
    String[] array = string.split("");
    for (int i = 0; i < array.length; i++) {
      if (Character.isLowerCase(string.charAt(i))) {
        array[i] = array[i].toUpperCase();
      } else {
        array[i] = array[i].toLowerCase();
      }
    }
    return String.join("", array);
  }

  public static String longestWord(String wordString) {
    String[] words = wordString.split(" ");
    String result = "";
    for (String word : words) {
      if (word.length() >= result.length()) {
        result = word;
      }
    }
    return result;
  }
  
  public static int maxDiff(int[] lst) {
    if (lst.length == 0) {
      return 0;
    }
    
    int maxVal = lst[0];
    int minVal = lst[0];
    for (int i = 1; i < lst.length; i++) {
      if (lst[i] > maxVal) {
        maxVal = lst[i];
      }
      if (lst[i] < minVal) {
        minVal = lst[i];
      }      
    }
    return maxVal - minVal;
  }
  
  public static String describeList(final List list) {
    return (list.isEmpty()) ? "empty" : (list.size() == 1) ? "singleton" : "longer";
  }
  
  public static String[] sortCards (String[] cards) {
    return Stream
            .of(cards)
            .mapToInt((x) -> {
              switch (x.toUpperCase()) {
                case "A": return 1;
                case "T": return 10;
                case "J": return 11;
                case "Q": return 12;
                case "K": return 13;
                default: return Integer.parseInt(x);
              }
            })
            .sorted()
            .mapToObj((x) -> {
              switch (x) {
                case 1: return "A";
                case 10: return "T";
                case 11: return "J";
                case 12: return "Q";
                case 13: return "K";
                default: return String.valueOf(x);
              }
            })
            .toArray(String[]::new);
  }
  
  public static int fusc(int n) {
    if (n == 0 || n == 1) {
      return n;
    } else if ((n > 0) && (n & 1) == 0) {
      return fusc(n / 2);
    } else if ((n > 0) && (n & 1) == 1) {
      return fusc((n - 1) / 2) + fusc((n + 1) / 2);      
    } else {
      return 0;
    }
  }
  
  public static int[][] cartesianNeighbor(int x, int y) {
    int altX = x - 1;
    int altY = y - 1;
    
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
      if (i != 4) {
        List<Integer> coordinate = new ArrayList<>();
        coordinate.add(altX + (i / 3));
        coordinate.add(altY + (i % 3));
        list.add(coordinate);
      }
    }
    
    int[][] result = new int[8][2];
    for (int i = 0; i < result.length; i++) {
      result[i][0] = list.get(i).get(0);
      result[i][1] = list.get(i).get(1);      
    }
    
    return result;
  }
  
  public static int findDeletedNumber(int[] arr, int[] mixedArr) {
    if (arr.length != mixedArr.length) {
      List<Integer> list = new ArrayList<>();
      for (int i : mixedArr) {
        list.add(i);
      }
      if (arr.length > 0) {
        for (int i : arr) {
          if (!list.contains(i)) {
            return i;
          }
        }
      }
    }
    return 0;
  }
  
  
}
class KataDemo {
  public static void main(String[] args) {
    int result = Kata.findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{3,2,4,6,7,8,1,9});
    System.out.println(result);
  }
}