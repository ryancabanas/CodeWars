/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class EANValidator {    
  public static boolean validate(final String eanCode) {
    int origChecksum = Integer.parseInt(eanCode.substring(12, 13));
    int sum = 0;
    int newChecksum;
    
    String[] code = eanCode.substring(0, 12).split("");
    for (int i = 0; i < code.length; i++) {
      if (i % 2 == 0) {
        sum += Integer.parseInt(code[i]);
      } else {
        sum += (Integer.parseInt(code[i]) * 3);
      }
    }
    
    newChecksum = (sum % 10 == 0) ? 0 : (10 - (sum % 10));
    return (origChecksum == newChecksum);
  }
}