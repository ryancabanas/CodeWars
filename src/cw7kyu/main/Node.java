/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

class Node {
  public int data;
  public Node next = null;
  
  public static int getNth(Node n, int index) throws Exception {
    return getNodeData(n, index, 0);
  }
  
  static int getNodeData(Node n, int index, int pass) {
    if (index == pass) {
      return n.data;
    }
    return getNodeData(n.next, index, pass+1);
  }
}