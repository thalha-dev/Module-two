package com.module2.accio.assignments;

import java.util.*;

public class ReverseAlternateNode {

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

    Node head = new Node(0, null);
    Node tail = head;

    for (int i = 1; i <= n; i++) {
      int data = sc.nextInt();
      tail = addNode(tail, data);
    }

    sc.close();

    head = head.next;

    Node L1 = head;
    Node L2 = head.next;

    Node headL1 = L1;
    Node headL2 = L2;

    while (L1 != null || L2 != null) {
      if (L1 != null && L1.next != null) {
        L1.next = L1.next.next;
      }
      if (L2 != null && L2.next != null) {
        L2.next = L2.next.next;
      }

      if (L1 != null) {
        L1 = L1.next;
      }
      if (L2 != null) {
        L2 = L2.next;
      }
    }

    headL2 = reverse(headL2);

    Node tailL1 = headL1;
    while (tailL1.next != null) {
      tailL1 = tailL1.next;
    }

    tailL1.next = headL2;

    printList(headL1);
  }
}
