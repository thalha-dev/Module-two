package com.module2.external.basics.linkedLists;

public class LL {

  private Node head;
  private Node tail;
  int size;

  LL() {
    this.size = 0;
  }

  protected int deleteFirst() {
    System.out.println("deleteFirst()");
    int value = head.value;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return value;
  }

  protected int deleteLast() {
    System.out.println("deleteLast()");
    if (size <= 1) {
      return deleteFirst();
    }
    Node secondLast = get(size - 2);
    int value = tail.value;
    tail = secondLast;
    tail.next = null;
    size--;
    return value;
  }

  protected int delete(int index) {
    System.out.println(String.format("delete index - %d ", index));
    if (index == 0) {
      return deleteFirst();
    }
    if (index == size - 1) {
      return deleteLast();
    }

    Node previous = get(index - 1);
    int value = previous.next.value;
    previous.next = previous.next.next;
    return value;
  }

  protected Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  protected Node get(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  protected void insert(int value, int index) {
    if (index == 0) {
      insertFirst(value);
      return;
    }
    if (index >= size) {
      insertLast(value);
      return;
    }

    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }

    Node node = new Node(value, temp.next);
    temp.next = node;
    size++;
  }

  protected void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size += 1;
  }

  protected void insertLast(int value) {
    if (tail == null) {
      insertFirst(value);
      return;
    }
    Node node = new Node(value);
    tail.next = node;
    tail = node;
    size++;
  }

  protected void display() {
    if (head == null) {
      System.out.println("head is null : returning");
      return;
    }
    Node temp = head;
    while (temp != null) {
      if (temp.next != null) {
        System.out.print(temp.value + " --> ");
      } else {
        System.out.print(temp.value);
      }
      temp = temp.next;
    }
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
