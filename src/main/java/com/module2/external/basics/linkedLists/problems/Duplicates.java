package com.module2.external.basics.linkedLists.problems;

public class Duplicates {

  private Node head;
  private Node tail;
  int size;

  Duplicates() {
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

  protected void insertRec(int val, int index) {
    head = insertRec(val, index, head);
  }

  private Node insertRec(int val, int index, Node node) {
    if (index == 0) {
      Node temp = new Node(val, node);
      size++;
      return temp;
    }
    node.next = insertRec(val, index--, node.next);
    return node;
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
    System.out.println();
  }

  // ---------------- Remove Duplicates

  protected void duplicte() {
    Node node = head;
    while (node.next != null) {
      if (node.value == node.next.value) {
        node.next = node.next.next;
        size--;
      } else {
        node = node.next;
      }
    }
    tail = node;
    tail.next = null;
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

  public static void main(String[] args) {
    Duplicates one = new Duplicates();
    one.insertLast(25);
    one.insertLast(26);
    one.insertLast(26);
    one.insertLast(27);
    one.insertLast(28);
    one.insertLast(28);
    one.insertLast(29);
    one.display();
    one.duplicte();
    one.display();
  }
}

