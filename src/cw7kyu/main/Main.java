/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;


public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int result;
    result = Arrays.findSmallest(new int[]{1, 2, 3}, "index");
    System.out.println(result);
    result = Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "value");
    System.out.println(result);
    result = Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "index");
    System.out.println(result);
  }
}
