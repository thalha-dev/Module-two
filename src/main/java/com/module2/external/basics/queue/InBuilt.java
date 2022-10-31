package com.module2.external.basics.queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuilt {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(2234);
    q.add(2235);
    q.add(2236);
    q.add(2237);
    q.add(2238);
    q.add(2239);
    q.add(2240);
    q.add(2241);
    q.add(2242);
    q.add(2243);
    q.add(2244);
    q.add(2245);
    q.add(2246);
    q.add(2247);
    q.add(2248);
    q.add(2249);
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q);
  }
}
