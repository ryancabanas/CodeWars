/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw7kyu.main;

import java.util.function.Function;

public class FunctionalProgramming {
  public static Function<Student, Boolean> f = (s) -> "John Smith".equals(s.getFullName())
          && "js123".equals(s.studentNumber);
}

class Student {
  private final String firstName;
  private final String lastName;
  public final String studentNumber;
  
  Student(String firstName, String lastName, String studentNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentNumber = studentNumber;
  }
  
  public String getFullName() {
    return firstName + " " + lastName;
  }
  
  public String getCommaName() {
    return lastName + ", " + firstName;
  }
}

class Demo {
  public static void main(String[] args) {
    Student jSmith = new Student("John", "Smith", "js123");
    System.out.println(FunctionalProgramming.f.apply(jSmith));
  }
}