/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.exp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * By opening a DataOuputStream, you automatically wipe the contents of the file.
 * @author Ryan Cabanas
 */
public class DataStreamTesting {
  
  public static void go() {
    File myFile = null;
    File myTempFile = null;
    File myTempFile2 = null;
    
    try {
      myFile = new File("C:\\Users\\Ryan\\Desktop\\Test10.txt");
      myTempFile = new File("C:\\Users\\Ryan\\Desktop\\Test10_temp.txt");
      myTempFile2 = new File("C:\\Users\\Ryan\\Desktop\\Test10_temp2.txt");
      
      if (!myFile.exists()) {
        myFile.createNewFile();
      }
      
      if (!myTempFile.exists()) {
        myTempFile.createNewFile();
      }
    } catch (Exception e) {
    }
    
//    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(myFile, true))) {
////      dos.writeInt(109);
//      dos.writeDouble(23.1);
//    } catch (Exception e) {
//    }
    
    try (DataInputStream dis = new DataInputStream(new FileInputStream(myFile))) {
      int counter = 0;
      System.out.println("Estimated bytes: " + dis.available());
//      while (dis.available() > 0) {
//        System.out.println("Estimated bytes: " + dis.available());
//        System.out.println("Loop count: " + ++counter);
//        System.out.println("Value: " + dis.readInt());
//        System.out.println("");
//      }
    } catch (Exception e) {
    }
  }
}
