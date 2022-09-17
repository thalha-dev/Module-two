package com.module2.external.basics.CircularLinkedList;

public class CLL {

  Node head;
  Node tail;

  int size;

  CLL() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  protected void insert(int val) {
    Node node = new Node(val);
    if (head == null) {
      head = node;
      tail = node;
      return;
    }
    tail.next = node;
    node.next = head;
    tail = node;
    size++;
  }

  protected void delete(int value) {
    Node temp = head;

    if (temp.value == value) {
      head = head.next;
      tail.next = head;
    }

    do {
      Node n = temp.next;
      if (n.value == value) {
        temp.next = n.next;
        break;
      }
      temp = temp.next;
    } while (temp != head);
  }

  protected void display() {
    Node temp = head;
    if (head != null) {
      do {
        if (temp.next != head) {
          System.out.print(temp.value + " --> ");
        } else {
          System.out.print(temp.value + " --> END ");
        }
        temp = temp.next;
      } while (temp != head);
      System.out.println();
    }
  }

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
