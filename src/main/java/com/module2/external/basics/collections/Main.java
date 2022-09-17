package com.module2.external.basics.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();
    List<Integer> vector = new Vector<>();

    list.add(38);
    list.add(39);
    list.add(40);
    list.add(41);
    list.add(42);
    list.add(43);
    System.out.println(list);
    vector.add(38);
    vector.add(39);
    vector.add(40);
    vector.add(41);
    vector.add(42);
    vector.add(43);
    System.out.println(vector);
  }
}
