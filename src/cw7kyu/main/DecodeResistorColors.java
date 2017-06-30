/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.text.DecimalFormat;
import java.util.HashMap;

public class DecodeResistorColors {
  public static String decodeResistorColors(String bands) {
    HashMap<String, String> daMap = new HashMap<>();
    
    daMap.put("black", "0");
    daMap.put("brown", "1");
    daMap.put("red", "2");
    daMap.put("orange", "3");
    daMap.put("yellow", "4");
    daMap.put("green", "5");
    daMap.put("blue", "6");
    daMap.put("violet", "7");
    daMap.put("gray", "8");
    daMap.put("white", "9");
    daMap.put("gold", "5%");
    daMap.put("silver", "10%");

    String[] bandColors = bands.split(" ");
    StringBuilder result = new StringBuilder();
    
    String bandOne = daMap.get(bandColors[0]);
    String bandTwo = daMap.get(bandColors[1]);
    String bandThree = daMap.get(bandColors[2]);
    
    int bandThreeMultiplier = (int) Math.pow(10.0, Double.parseDouble(bandThree));
    long resistance = Long.parseLong(bandOne.concat(bandTwo)) * bandThreeMultiplier;
    
    DecimalFormat formatter = new DecimalFormat("#.#");
    
    if (resistance < 1000) {
      result.append(String.valueOf(resistance));
    } else if (resistance >= 1000 && resistance < 1000000) {
      result.append(formatter.format((double) resistance / 1000));
      result.append("k");
    } else if (resistance >= 1000000) {
      result.append(formatter.format((double) resistance / 1000000));
      result.append("M");
    }
    
    result.append(" ohms, ");
    
    if (bandColors.length == 4) {
      result.append(daMap.get(bandColors[3]));
    } else {
      result.append("20%");
    }
    
    return result.toString();
  }
}

class DecodeResistorColorsDemo {
  public static void main(String[] args) {
    String test = DecodeResistorColors.decodeResistorColors("brown black green silver");
    System.out.println(test);
  }
}