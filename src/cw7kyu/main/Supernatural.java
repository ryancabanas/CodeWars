/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Supernatural {
  
  public static String bob(String beast) {
    String result;
    switch (beast.toLowerCase()) {
      case "werewolf":
        result = "Silver knife or bullet to the heart";
        break;
      case "vampire":
        result = "Behead it with a machete";
        break;
      case "wendigo":
        result = "Burn it to death";
        break;
      case "shapeshifter":
        result = "Silver knife or bullet to the heart";
        break;
      case "angel":
        result = "Use the angelic blade";
        break;
      case "demon":
        result = "Use Ruby's knife, or some Jesus-juice";
        break;
      case "ghost":
        result = "Salt and iron, and don't forget to burn the corpse";
        break;
      case "dragon":
        result = "You have to find the excalibur for that";
        break;
      case "djinn":
        result = "Stab it with silver knife dipped in a lamb's blood";
        break;
      case "pagan god":
        result = "It depends on which one it is";
        break;
      case "leviathan":
        result = "Use some Borax, then kill Dick";
        break;
      case "ghoul":
        result = "Behead it";
        break;
      case "jefferson starship":
        result = "Behead it with a silver blade";
        break;
      case "reaper":
        result = "If it's nasty, you should gank who controls it";
        break;
      case "rugaru":
        result = "Burn it alive";
        break;
      case "skinwalker":
        result = "A silver bullet will do it";
        break;
      case "phoenix":
        result = "Use the colt";
        break;
      case "witch":
        result = "They are humans";
        break;
      default:
        result = "I have friggin no idea yet";
        break;
    }
    
    return result + ", idjits!";
  }
}