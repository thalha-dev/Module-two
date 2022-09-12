package com.module2.accio.lecture.linkedList;

public class LinkedListSample {

  static Node insert(Node head, int data) {
    Node new_node = new Node(data);
    if (head == null) {
      return new_node;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new_node;
    return head;
  }

  static void printList(Node head) {

    if (head == null) {
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  static int size(Node head) {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {

    Node head = null;
    head = insert(head, 10);
    head = insert(head, 20);
    head = insert(head, 26);
    head = insert(head, 36);
    head = insert(head, 37);
    head = insert(head, 52);
    head = insert(head, 60);
    head = insertAtFront(head, 70);
    // head = insertAfterValue(head, 36, 23);
    printList(head);
    System.out.println("size of LL ---> " + size(head));
  }

  // private static Node insertAfterValue(Node head, int toFind, int value) {
  //   Node new_node = new Node(value);
  //   if (head == null) {
  //     return new_node;
  //   }
  //   Node temp = head;
  //   while (temp.next != null) {
  //     if (temp.data == toFind) {
  //       Node rest = temp.next;
  //       temp.next = new_node;
  //       temp.next.next = rest;
  //       break;
  //     }
  //     temp = temp.next;
  //   }
  //
  //   Node temp2 = head;
  //
  //   while (temp2.next != null) {
  //     if (temp2.data == toFind) {
  //       break;
  //     }
  //     temp = temp.next;
  //   }
  //
  //   return head;
  // }

  public static Node insertAtFront(Node head, int data) {
    Node new_node = new Node(data);

    if (head == null) {
      return new_node;
    }

    new_node.next = head;

    return new_node;
  }
}

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    next = null;
  }
}
