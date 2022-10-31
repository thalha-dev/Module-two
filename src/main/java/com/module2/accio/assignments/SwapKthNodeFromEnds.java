package com.module2.accio.assignments;

import java.util.*;

public class SwapKthNodeFromEnds {

  private static class Node {
    int data;
    Node next;

    Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  private static Node addNode(Node tail, int data) {

    Node newNode = new Node(data, null);
    tail.next = newNode;
    return newNode;
  }

  private static Node reverse(Node head) {
    Node previous = null;
    Node current = head;
    Node next = null;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    return previous;
  }

  private static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    Node head = new Node(0, null);
    Node tail = head;

    for (int i = 1; i <= n; i++) {
      int data = sc.nextInt();
      tail = addNode(tail, data);
    }

    sc.close();

    head = head.next;

    Node p2 = head;
    Node p1 = head;
    Node pp1 = null, pp2 = null, np1 = null, np2 = null;

    for (int i = 1; i <= k - 1; i++) {
      pp1 = p1;
      p1 = p1.next;
    }

    for (int i = 1; i <= n - k; i++) {
      pp2 = p2;
      p2 = p2.next;
    }
    np1 = p1.next;
    np2 = p2.next;

    pp1.next = p2;
    if (p2 != np1) {
      p2.next = np1;
    }
    if (p1 != pp2) {
      pp2.next = p1;
    }
    p1.next = np2;

    if (p1 == pp2) {
      p2.next = p1;
    }

    printList(head);
  }
}
