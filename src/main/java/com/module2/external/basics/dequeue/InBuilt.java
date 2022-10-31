package com.module2.external.basics.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuilt {
  public static void main(String[] args) {
    Deque<Integer> dq = new ArrayDeque<>();
    dq.add(2234);
    dq.add(2235);
    dq.add(2236);
    dq.add(2237);
    dq.add(2238);
    dq.add(2239);
    dq.add(2240);
    dq.add(2241);
    dq.add(2242);
    dq.add(2243);
    dq.add(2244);
    dq.add(2245);
    dq.add(2246);
    dq.add(2247);
    dq.add(2248);
    dq.add(2249);
    System.out.println(dq.peek());
    System.out.println(dq.remove());
    System.out.println(dq.remove());
    System.out.println(dq);
  }
}
