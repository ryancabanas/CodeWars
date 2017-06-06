/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

/**
 *
 * @author Ryan
 */
public class Accumul {
    
    public static String accum(String s) {
     String[] strArray = s.split("");
     StringBuilder resultString = new StringBuilder();
     String result;
     
     for (int i = 0; i < strArray.length; i++) {
       //Add uppercase first letter for each array position.
       resultString.append(strArray[i].toUpperCase());
     
       //Add remaining lowercase letters, as needed, based on array position.
       for (int j = 1; j <= i; j++)
         resultString.append(strArray[i].toLowerCase());
       
       resultString.append("-");
     }
     result = resultString.toString();
     return result.substring(0, result.length() - 1);
    }
    
}