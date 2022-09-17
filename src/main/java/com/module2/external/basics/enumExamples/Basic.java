package com.module2.external.basics.enumExamples;

public class Basic {
  enum Week {
    // everyone is public static and final
    // can't create child enum
    // type is Week
    // can implement Interfaces
    // abstract are not allowed
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    Week() {
      System.out.println(this + "   <---------from constructor");
      // only private or default. don't wanna create new objects
    }
  }

  public static void main(String[] args) {
    Week week;
    week = Week.Monday;
    System.out.println(week);
    System.out.println();

    for (Week var : Week.values()) {
      System.out.println(var);
    }

    System.out.println(Week.valueOf("Monday"));

    // ordinal will give the position of given enum
    System.out.println(week.ordinal());
  }
}
