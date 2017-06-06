/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NotVisibleCubes {
  
  public Long notVisibleCubes(Long n) {
    if (n == 0 || n == 1 || n == 2)
      return 0L;
    
    BigInteger bigIntN = new BigInteger(String.valueOf(n));
    BigDecimal bigDecN = new BigDecimal(n);
    BigDecimal bigDec2 = new BigDecimal(2);
    BigDecimal bigDec4 = new BigDecimal(4);
    
    BigDecimal bigDecNPow2 = new BigDecimal(bigIntN.multiply(bigIntN));
    BigDecimal bigDecNm2 = bigDecN.subtract(bigDec2);
    BigDecimal bigDecNx4m4 = bigDecN.multiply(bigDec4).subtract(bigDec4);
    
    System.out.println(bigDecNm2.longValue());
    System.out.println(bigDecNx4m4.longValue());
    
    return bigDecNPow2
            .subtract(bigDecNx4m4)
            .multiply(bigDecNm2)
            .longValue();
  }	
}