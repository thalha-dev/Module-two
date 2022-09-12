package com.module2.external.basics.packagess;


/** Hello world! */
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    Strudents thalha;
    thalha = new Strudents(20, "thalha", 222);
    System.out.println(thalha.name);
    System.out.println(thalha.rno);
    System.out.println(thalha.marks);
    Strudents m = new Strudents();
    System.out.println(m.name);

  }
}

/** Strudents */
class Strudents {

  int rno;
  String name = "THALHA";
  float marks;

  Strudents() {}


  Strudents(int rno, String name, float marks) {
    this.name = name;
    this.rno = rno;
    this.marks = marks;
  }
}
