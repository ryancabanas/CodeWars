/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.math.BigInteger;

public class Powers {
  
  public static BigInteger powers(int[] list) {
    BigInteger result = new BigInteger("2");
    return result.pow(list.length);
  }
  
}