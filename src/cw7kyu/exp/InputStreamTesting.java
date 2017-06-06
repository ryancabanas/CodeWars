/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fileName, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import cw7kyu.exphelpers.Input;

/**
 *
 * @author Ryan Cabanas
 */
public class InputStreamTesting {
  
  public static String ReadFile() {
    String fileName, inputString;
    FileInputStream inFileStream;
    
    System.out.print("Enter the path and name of the file to open: ");
    fileName = Input.getInput(); //Get the filename from the console.

    try {
      inFileStream = new FileInputStream(fileName); //Try to open the file.
      inputString = Input.getInput(inFileStream); //Get data from the file.
      return inputString;
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    
    return null;
  }
}
