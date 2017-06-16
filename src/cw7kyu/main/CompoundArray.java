/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CompoundArray {
    
  public static int[] compoundArray(int[] a, int[] b){
    int i = 0;
    ArrayList<Integer> arrayList = new ArrayList<>();
    
    while (i < a.length | i < b.length) {
      if (i < a.length) {
        arrayList.add(a[i]);
      }
      if (i < b.length) {
        arrayList.add(b[i]);
      }
      i++;
    }
    
    Integer[] array = arrayList.toArray(new Integer[0]);
    return Stream.of(array).mapToInt((x) -> x).toArray();
  }
}

class CompoundArrayDemo {
  public static void main(String[] args) {
    CompoundArray.compoundArray(new int[] {1,2,3,4,5,6}, new int[] {9,8,7,6});
  }}