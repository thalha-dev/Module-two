package com.module2.accio.assignments;

import java.util.*;

public class CompareTwoLinkedList {

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

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    Node headA, headB;
    Node tailA, tailB;

    headA = new Node(-1, null);
    headB = new Node(-1, null);
    tailA = headA;
    tailB = headB;

    for (int i = 1; i <= m; i++) {
      int data = sc.nextInt();
      tailA = addNode(tailA, data);
    }

    for (int i = 1; i <= n; i++) {
      int data = sc.nextInt();
      tailB = addNode(tailB, data);
    }

    sc.close();

    headA = headA.next;
    headB = headB.next;

    boolean isSame = true;

    if (m != n) {
      isSame = false;

    } else {
      Node pA = headA, pB = headB;

      while (pA != null) {
        if (pA.data != pB.data) {
          isSame = false;
          break;
        } else {
          pA = pA.next;
          pB = pB.next;
        }
      }
    }

    if (isSame == true) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
