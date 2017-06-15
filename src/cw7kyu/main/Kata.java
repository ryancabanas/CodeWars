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
}

class TestId {
  public static void main(String[] args) {
    System.out.println(Kata.rakeGarden("gravel gravel gravel gravel gravel gravel gravel gravel "
            + "gravel rock slug ant gravel gravel snail rock gravel gravel gravel gravel gravel "
            + "gravel gravel slug gravel ant gravel gravel gravel gravel rock slug gravel gravel "
            + "gravel gravel gravel snail gravel gravel rock gravel snail slug gravel gravel "
            + "spider gravel gravel gravel gravel gravel gravel gravel gravel moss gravel gravel "
            + "gravel snail gravel gravel gravel ant gravel gravel moss gravel gravel gravel "
            + "gravel snail gravel gravel gravel gravel slug gravel rock gravel gravel rock "
            + "gravel gravel gravel gravel snail gravel gravel rock gravel gravel gravel gravel "
            + "gravel spider gravel rock gravel gravel"));
  }
}