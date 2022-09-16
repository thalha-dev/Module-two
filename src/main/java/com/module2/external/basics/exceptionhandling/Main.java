package com.module2.external.basics.exceptionhandling;

public class Main {
  public static void main(String[] args) {

    int a = 5;
    int b = 0;

    try {

      String name = "thalha";
      if (name.equals("thalha")) {
        throw new MyException("name is thalha");
      }

    } catch (MyException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {

      System.out.println("finally message ...........");
    }

    System.out.println();

    System.out.println(divide(a, b));
  }

  private static int divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException("don't do this :( ");
    }
    return a / b;
  }
}
