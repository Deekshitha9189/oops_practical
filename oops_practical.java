package oop;

import java.util.Scanner;

public class oops_practical {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number (a): ");
    int a = input.nextInt();

    System.out.print("Enter second number (b): ");
    int b = input.nextInt();

    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    input.close();
  }
}


