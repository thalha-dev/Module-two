package com.module2.external.basics.generics.comparing;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Students thalha = new Students(13, 46f);
    Students rahul = new Students(11, 33f);
    Students hasan = new Students(17, 51f);
    Students bilal = new Students(26, 44f);

    Students[] list = {thalha, rahul, hasan, bilal};

    if (thalha.compareTo(rahul) > 0) {
      System.out.println("thalha has more marks");
    } else if (thalha.compareTo(rahul) < 0) {
      System.out.println("rahul has more marks");
    } else {
      System.out.println("both are same");
    }
    System.out.println("");

    System.out.println(Arrays.toString(list));
    // Arrays.sort(list);
    Arrays.sort(
        list,
        new Comparator<Students>() {
          @Override
          public int compare(Students o1, Students o2) {
            return (int) (o1.marks - o2.marks);
          }
        });
    // LAMBDA EXPRESSION
    // Arrays.sort(list, (o1,o2) -> (int)(o1.marks - o2.marks));

    System.out.println(Arrays.toString(list));
  }
}
