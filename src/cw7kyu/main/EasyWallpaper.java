/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class EasyWallpaper {
  public String wallpaper(double l, double w, double h) {
    if (l == 0 || w == 0 || h == 0) {
      return "zero";
    }
    final double ROLL_AREA_METERS = (52.0 / 100.0) * 10.0;
    double wallsAreaMeters = (l * h * 2) + (w * h * 2);
    double paperAreaNeededMeters = wallsAreaMeters * 1.15;
    int rollsNeeded;
    
    rollsNeeded = (int) Math.ceil(paperAreaNeededMeters / ROLL_AREA_METERS);

    switch (rollsNeeded) {
      case 1: return "one";
      case 2: return "two";
      case 3: return "three";
      case 4: return "four";
      case 5: return "five";
      case 6: return "six";
      case 7: return "seven";
      case 8: return "eight";
      case 9: return "nine";
      case 10: return "ten";
      case 11: return "eleven";
      case 12: return "twelve";
      case 13: return "thirteen";
      case 14: return "fourteen";
      case 15: return "fifteen";
      case 16: return "sixteen";
      case 17: return "seventeen";
      case 18: return "eighteen";
      case 19: return "nineteen";
      case 20: return "twenty";
      default: return "";
    }
  }
}

class EasyWallpaperDemo {
  public static void main (String[] args) {
    EasyWallpaper test = new EasyWallpaper();
    System.out.println(test.wallpaper(4, 3.5, 3));
  }
}
