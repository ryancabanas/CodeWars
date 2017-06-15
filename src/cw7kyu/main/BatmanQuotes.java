/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class BatmanQuotes{
  
  public static String getQuote(String[] quotes, String hero){
    String heroName = "";
    String[] heroChars = hero.split("");
    int index = -1;
    
    switch (hero.toUpperCase().charAt(0)) {
      case 'B':
        heroName = "Batman: ";
        break;
      case 'J':
        heroName = "Joker: ";
        break;
      case 'R':
        heroName = "Robin: ";
        break;
    }

    for (String nameChar : heroChars) {
      try {
        index = Integer.parseInt(nameChar);
        break;
      } catch (Exception e) {
      }
    }
    
    return (index >= 0) ? heroName + quotes[index] : "Error";
  }
}

class RunIt {
  public static void main(String[] args) {
    String[] quotes = {"Quote Hidden in example test",
      "Holy haberdashery, Batman!",
      "Quote Hidden in example test"
    };

    System.out.println(BatmanQuotes.getQuote(quotes, "Rob1n"));
  }
}
