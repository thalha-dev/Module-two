package com.module2.external.basics.CircularLinkedList;

public class Main {
  public static void main(String[] args) {

    CLL list = new CLL();

    list.insert(25);
    list.insert(26);
    list.insert(27);
    list.insert(28);
    list.insert(29);
    list.insert(30);
    list.insert(31);
    list.display();
    list.delete(27);
    list.display();
  }
}
