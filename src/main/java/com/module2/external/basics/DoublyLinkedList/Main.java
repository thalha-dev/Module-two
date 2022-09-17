package com.module2.external.basics.DoublyLinkedList;

public class Main {
  public static void main(String[] args) {

    DLL list = new DLL();
    list.insertFirst(4);
    list.insertFirst(5);
    list.insertFirst(6);
    list.insertFirst(7);
    list.insertLastNoTail(8);
    list.insertLastNoTail(9);
    list.insertLast(16);
    list.insertLast(11);
    list.insert(10, 4);
    list.insert(124, 6);
    list.display();
    System.out.println("SIZE ==> " + list.size);
    System.out.println("===============");
    list.displayReverse();
    System.out.println("SIZE ==> " + list.size);
    System.out.println("===============");
    list.displayBothDirection();
    System.out.println("SIZE ==> " + list.size);
    System.out.println("===============");
  }
}
