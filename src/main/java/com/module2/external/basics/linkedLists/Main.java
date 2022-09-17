package com.module2.external.basics.linkedLists;

public class Main {
  public static void main(String[] args) {

    LL list = new LL();
    list.insertFirst(4);
    list.insertFirst(5);
    list.insertFirst(6);
    list.insertFirst(7);
    list.insertLast(8);
    list.insertLast(9);
    list.insert(283, 3);
    list.insert(312, 9);
    list.display();
    System.out.println();
    System.out.println("SIZE ==> " + list.size);
    System.out.println(list.deleteFirst());
    list.display();
    System.out.println();
    System.out.println("SIZE ==> " + list.size);
    System.out.println(list.deleteLast());
    list.display();
    System.out.println();
    System.out.println("SIZE ==> " + list.size);
    System.out.println(list.deleteLast());
    list.display();
    System.out.println();
    System.out.println("SIZE ==> " + list.size);
    System.out.println(list.delete(2));
    list.display();
    System.out.println();
    System.out.println("SIZE ==> " + list.size);
  }
}
