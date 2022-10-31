package com.module2.external.basics.queue;

public class Main {
  public static void main(String[] args) throws Exception {
    CustomQueue q = new CustomQueue(5);
    q.insert(3);
    q.insert(4);
    q.insert(5);
    q.insert(6);
    q.insert(7);
    q.insert(8);
    q.insert(9);
    q.insert(10);
    q.insert(11);
    q.insert(12);
    q.insert(13);
    q.display();
    q.remove();
    q.remove();
    q.remove();
    q.display();
  }
}
