/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

public class Movie {
    
  public static int movie(int card, int ticket, double perc) {
    int ticketCount = 0;
    int fullPrice;
    double discountPrice = card;
    
    do {
      ticketCount++;
      fullPrice = ticket * ticketCount;
      discountPrice += ticket * Math.pow(perc, ticketCount);
    } while ((int) Math.ceil(discountPrice) >= fullPrice);
    
    return ticketCount;
  }
}

class MovieDemo {
  public static void main(String[] args) {
    System.out.println(Movie.movie(500, 15, 0.9));
  }
}