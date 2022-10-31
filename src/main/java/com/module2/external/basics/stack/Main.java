package com.module2.external.basics.stack;

public class Main {
  public static void main(String[] args) throws StackException {
    // IamStack stack = new IamStack(5);
    IamStack stack = new IamDynamicStack(5);

    stack.push(24);
    stack.push(25);
    stack.push(26);
    stack.push(26);
    stack.push(26);
    stack.push(26);
    stack.push(26);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
