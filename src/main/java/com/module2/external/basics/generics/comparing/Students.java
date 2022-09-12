package com.module2.external.basics.generics.comparing;

public class Students implements Comparable<Students> {
  int rolling;
  float marks;

  public Students(int rolling, float marks) {
    this.rolling = rolling;
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "[marks=" + marks + ", rolling=" + rolling + "] ";
  }

  @Override
  public int compareTo(Students o) {
    return (int) (this.marks - o.marks);
  }
}
