/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Covfefe {
  public static String covfefe(String tweet) {
    String newTweet = tweet.replaceAll("coverage", "covfefe");
    return (tweet.equals(newTweet)) ? tweet + " covfefe" : newTweet;
  }
}