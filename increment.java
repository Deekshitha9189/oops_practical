package oop;

import java.util.Scanner;

public class increment{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number (a): ");
    int a = input.nextInt();

    System.out.print("Enter second number (b): ");
    int b = input.nextInt();

    int preInc = ++a;
    int preDec = --b;

    System.out.println("After pre-increment (++a), a = " + preInc);
    System.out.println("After pre-decrement (--b), b = " + preDec);

    input.close();
  }
}


