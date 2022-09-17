package com.module2.external.basics.DoublyLinkedList;

public class DLL {

  Node head;
  Node tail;

  int size;

  DLL() {
    this.size = 0;
  }

  protected void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    node.prev = null;
    if (head != null) {
      head.prev = node;
    }
    if (head == null) {
      head = node;
      tail = head;
    } else {
      head = node;
    }
    size++;
  }

  protected void insertLastNoTail(int value) {
    Node node = new Node(value);
    if (head == null) {
      head = node;
      node.prev = null;
      node.next = null;
      head = node;
      tail = head;
      size++;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = node;
    node.prev = last;
    node.next = null;
    tail = node;
    size++;
  }

  protected void insertLast(int value) {
    Node node = new Node(value);
    if (tail == null) {
      head = node;
      node.prev = null;
      node.next = null;
      head = node;
      tail = head;
      size++;
      return;
    }

    tail.next = node;
    node.prev = tail;
    node.next = null;
    tail = node;
    size++;
  }

  protected void insert(int value, int index) {
    if (index == 0) {
      insertFirst(value);
      return;
    }
    if (index >= size) {
      insertLastNoTail(value);
      return;
    }

    Node prevNode = head;
    for (int i = 0; i <= index - 2; i++) {
      prevNode = prevNode.next;
    }

    Node node = new Node(value, prevNode.next, prevNode);
    prevNode.next.prev = node;
    prevNode.next = node;
    size++;
  }

  protected void display() {
    Node node = head;
    while (node != null) {
      if (node.prev == null) {
        System.out.print(" 🐬 -> " + node.value + " --> ");
      } else if (node.next == null) {
        System.out.print(node.value + " --> 🎯");
      } else {
        System.out.print(node.value + " --> ");
      }
      node = node.next;
    }
    System.out.println();
  }

  protected void displayBothDirection() {
    Node node = head;
    Node last = null;
    while (node != null) {
      if (node.prev == null) {
        System.out.print(" 🐬 -> " + node.value + " --> ");
      } else if (node.next == null) {
        System.out.print(node.value + " --> 🎯");
      } else {
        System.out.print(node.value + " --> ");
      }
      last = node;
      node = node.next;
    }
    System.out.println();
    while (last != null) {
      if (last.next == null) {
        System.out.print(" 🐬 -> " + last.value + " --> ");
      } else if (last.prev == null) {
        System.out.print(last.value + " --> 🎯");
      } else {
        System.out.print(last.value + " --> ");
      }
      last = last.prev;
    }
    System.out.println();
  }

  protected void displayReverse() {
    Node node = tail;
    while (node != null) {
      if (node.next == null) {
        System.out.print(" 🐬 -> " + node.value + " --> ");
      } else if (node.prev == null) {
        System.out.print(node.value + " --> 🎯");
      } else {
        System.out.print(node.value + " --> ");
      }
      node = node.prev;
    }
    System.out.println();
  }

  private class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}
