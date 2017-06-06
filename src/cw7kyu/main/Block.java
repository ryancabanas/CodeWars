/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Block {
 
  private final int length, width, height;

  public Block(int[] blockDimensions) {
    length = blockDimensions[1];
    width = blockDimensions[0];
    height = blockDimensions[2];
  }

  public int getLength() {
    return length;
  }
  
  public int getWidth() {
    return width;
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getVolume() {
    return length * width * height;
  }
  
  public int getSurfaceArea() {
    return (length * width * 2) + (width * height * 2) + (height * length * 2);
  }
}